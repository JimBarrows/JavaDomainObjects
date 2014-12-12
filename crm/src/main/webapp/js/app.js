App = Ember.Application.create();

$.ajaxSetup({
	contentType : "application/json"
});

App.Router.map(function() {
	this.resource('customers', function() {
		this.route('create', {
			path : "/new"
		});
	});
});

App.IndexRoute = Ember.Route.extend({
	model : function() {
		return $.getJSON("/crm/api/customers")
	}
});

App.AlertController = Ember.Controller.extend({
	alert : false,
	observeAlert : function() {
		if (this.alert != false) {
			$('#flash').addClass(
					'alert alert-' + this.alert[0] + ' alert-dismissable');
			$('#flash span').text(this.alert[1]);
			$('#flash').fadeIn();
		} else {
			$('#flash').hide();
		}
	}.observes('alert')
});

App.CustomersCreateController = Ember.Controller.extend({
	name : '',
	firstName : '',
	lastName : '',
	partyType :'jdo.party.model.Person',
	needs : [ 'alert' ],
	partyTypeList : ['jdo.party.model.Company', 'jdo.party.model.LegalOrganization', 'jdo.party.model.Organization', 'jdo.party.model.Person'  ],
	errors : {},
	actions : {
		save : function() {
			var thisController = this;
			var data =  JSON.stringify({
					'partyType' : this.partyType,
					'name' : this.name,
					'firstName' : this.firstName,
					'lastName' : this.lastName
					});
			var promise = $.ajax({
				"type" : "POST",
				"dataType":"json",
				"url" : "/crm/api/customers", 
				"data" :data,
				"success":function(data) {
				
				}
			});

			promise.fail(function(jqXHR, textStatus, errorThrown) {
				var alertController = thisController.get('controllers.alert');				
				thisController.set('errors', jqXHR.responseJSON.errors);				
			});
			return promise;
		}
	},
	isPerson : function() {
		return this.partyType === "jdo.party.model.Person";
	}.property('partyType')
});

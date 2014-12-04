App = Ember.Application.create();

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
	alert: false,
	observeAlert: function() {
		if(this.alert != false){
			$('#flash').addClass('alert alert-' + this.alert[0] + ' alert-dismissable');
			$('#flash span').text(this.alert[1]);
			$('#flash').fadeIn();
		} else {
			$('#flash').hide();
		}
	}.observes('alert')
});

App.CustomersCreateController = Ember.Controller.extend({
	name : '',
	needs : ['alert'],
	actions : {
		save : function() {
			var thisController = this;
			var promise = $.post("/crm/api/customers", {type: 'Organization',
											name: this.name});
			promise.fail(function( jqXHR, textStatus, errorThrown ) {
				var alertController = thisController.get('controllers.alert'); 
				alertController.set('alert', ['danger', 'Could not save customer because ' + errorThrown]);
			});
			return promise;
		}
	}
});

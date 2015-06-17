/**
 * 
 */

App.AlertController = Ember.Controller.extend({
	alertMessage : false,
	alertType: 'info',
	observeAlert : function() {
		if (this.alertMessage == false) {
			$('#flash').hide();			
		} else {
			$('#flash').addClass(
					'alert alert-' + this.get('alertType') + ' alert-dismissable');
			$('#flash span').text(this.get('alertMessage'));
			$('#flash').fadeIn();
		}
	}.observes('alertMessage')
});

App.CustomersCreateController = Ember.Controller.extend({
	needs : [ 'alert' ],
	partyTypeList : [],
	alertMessage: Ember.computed.alias('controllers.alert.alertMessage'),
	alertType:Ember.computed.alias('controllers.alert.alertType'),
	actions : {
		save : function() {
			controller = this;
			return this.model.save().then(function(){
				controller.set('alertType', 'success');
				controller.set('alertMessage', "New customer added.");
				controller.transitionToRoute('index');
			}, function(reason) {
				controller.set('alertType', 'danger');
				controller.set('alertMessage', reason.statusText);
			});
		}
	}
});

App.CustomersEditController = Ember.Controller.extend({
	needs : [ 'alert' ],
	partyTypeList : [],
	actions : {
		save : function() {
			return this.model.save().then(function(){
				  route.transitionTo('customers');
			}, function() {
			  // Couldn't save, do nothing about it.
			});
		}
	}
});
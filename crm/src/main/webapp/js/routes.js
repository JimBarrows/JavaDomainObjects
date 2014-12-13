/**
 * 
 */
App.IndexRoute = Ember.Route.extend({
	model : function() {
		return this.store.find('customer');
	}
});

App.CustomersCreateRoute = Ember.Route.extend({
	model : function() {
		return this.store.createRecord('customer')
	},
	
	 setupController: function(controller, model) {
		    controller.set('model', model);
		    controller.set('partyTypeList', this.store.find('partyType'));
		  }
});
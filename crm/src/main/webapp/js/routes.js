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

	setupController : function(controller, model) {
		controller.set('model', model);
		controller.set('partyTypeList', this.store.find('partyType'));
	}
});

App.CustomersEditRoute = Ember.Route.extend({
	model : function(params) {
		return this.store.find('customer', params.customer_id)
	},

	setupController : function(controller, model) {
		controller.set('model', model);
		controller.set('partyTypeList', this.store.find('partyType'));
	}
});
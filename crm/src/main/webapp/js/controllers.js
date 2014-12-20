/**
 * 
 */

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
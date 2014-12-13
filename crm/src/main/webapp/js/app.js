App = Ember.Application.create();

App.ApplicationAdapter = DS.RESTAdapter.extend({
	namespace : 'crm/api',
	ajaxError : function(jqXHR) {

		var error = this._super(jqXHR);

		if (jqXHR && jqXHR.status === 422) {
			var response = Ember.$.parseJSON(jqXHR.responseText), errors = {};

			if (response.errors !== undefined) {
				var jsonErrors = response.errors;

				Ember.EnumerableUtils.forEach(Ember.keys(jsonErrors), function(
						key) {

					errors[Ember.String.camelize(key)] = jsonErrors[key];
				});
			}
			return new DS.InvalidError(errors);
		} else {
			return error;
		}
	}
});

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

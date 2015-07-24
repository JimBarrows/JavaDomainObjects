var crmApp = angular.module('CrmApp', [ 'ngRoute', 'customerControllers' ]);

crmApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/customers', {
		templateUrl : 'customers/index.html',
		controller : 'CustomerListCtrl'
	}).when('/customers/new', {
		templateUrl : 'customers/form.html',
		controller : 'CustomerFormCtrl'
	}).when('/customers/:customerId', {
		templateUrl : 'customers/view.html',
		controller : 'CustgomerDetailCtrl'
	}).otherwise({
		redirectTo : '/customers'
	});
} ]);
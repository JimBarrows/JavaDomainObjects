var crmApp = angular.module('CrmApp', [ 'ngRoute', 'customerControllers' ]);

crmApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/customers', {
		templateUrl : 'partials/customerList.html',
		controller : 'CustomerListCtrl'
	}).when('/customers/:customerId', {
		templateUrl : 'partials/customerDetail.html',
		controller : 'CustgomerDetailCtrl'
	}).otherwise({
		redirectTo : '/customers'
	});
} ]);
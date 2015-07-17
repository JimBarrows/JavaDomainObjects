var crmApp = angular.module('CrmApp', []);

crmApp.controller('CustomerListCtrl', function($scope, $http) {
	$scope.customers = $http.get('api/customers').success(function(data)
	{
		$scope.customers = data.customers;
	})
});
var customerControllers = angular.module('customerControllers', []);

customerControllers.controller('CustomerListCtrl', ['$scope', '$http', function($scope, $http) {
	$scope.customers = $http.get('api/customers').success(function(data)
	{
		$scope.customers = data.customers;
	});
}]);

customerControllers.controller('CustomerDetailCtrl', ['$scope', '$routeParams', '$http', function($scope, $routeParams, $http) {
	$scope.customers = $http.get('api/customers/' + $routeParams.customerId).success(function(data)
	{
		$scope.customer = data.customer;
	});
}]);
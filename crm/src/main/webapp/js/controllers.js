var customerControllers = angular.module('customerControllers', []);

customerControllers.controller('CustomerListCtrl', ['$scope', '$http', function($scope, $http) {
	$scope.customers = $http.get('api/customers').success(function(data, status, headers, config)
	{
		$scope.customers = data.customers;
	});
}]);

customerControllers.controller('CustomerDetailCtrl', ['$scope', '$routeParams', '$http', function($scope, $routeParams, $http) {
	$scope.customers = $http.get('api/customers/' + $routeParams.customerId).success(function(data, status, headers, config)
	{
		$scope.customer = data.customer;
	});
}]);

customerControllers.controller('CustomerFormCtrl', ['$scope', '$routeParams', '$http', '$location', function($scope, $routeParams, $http, $location) {
	$scope.save = function() {
		$http.post('api/customers', {customer: $scope.customer})
		.success(function(data, status, headers, config) {
			 $location.path('/customers');
		})
		.error( function( data, status, headers, config){
			if( status === 400) {
				$scope.error = data;
			}
		});
	}
}]);
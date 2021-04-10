var month = angular.module('month', ['ngRoute', 'week']);

month.config(['$routeProvider', function($routeProvider){

  $routeProvider
    .when('/monthView', {
        templateUrl: 'views/monthView.html',
        controller: 'monthController'
    })
    .when('/weekView',{
        templateUrl: 'views/weekView.html',
        controller: 'weekController'
    }).otherwise({
        redirectTo: '/monthView'
    });
}]);

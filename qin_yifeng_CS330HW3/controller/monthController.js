angular.module('month')
  .controller('monthController', ['$scope', '$http', function($scope, $http){

  $scope.removeWeather = function(ninja){
    var removeNinja = $scope.weathers.indexOf(ninja);
    $scope.weathers.splice(removeNinja, 1);
  };

  $scope.addWeather = function(){
      $scope.weathers.push({
        weekDay: $scope.newWeather.weekDay,
        low: parseInt($scope.newWeather.low),
        high: parseInt($scope.newWeather.high),
        conditions: $scope.newWeather.conditions,
        precip:parseInt($scope.newWeather.precip),
        humidity:parseInt($scope.newWeather.humidity)
      });

      $scope.newWeather.weekDay ="";
      $scope.newWeather.low ="";
      $scope.newWeather.high ="";
      $scope.newWeather.conditions ="";
      $scope.newWeather.precip ="";
      $scope.newWeather.humidity ="";

      $http.delete('data/data_test.json').then(function(response){
             if (response.status) {
                //success
              }
        });
      var blob = new Blob([angular.toJson($scope.weathers)], {type: "text/plain;charset=utf-8"});
      saveAs(blob, "data.json");
  };

  $http.get('data/data.json')
    .then(function(response){
    $scope.weathers = response.data;
  });

}]);

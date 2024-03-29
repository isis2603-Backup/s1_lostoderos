(function (ng) {
    var mod = ng.module("pagosModule");
    mod.constant("pagosContext", "api/pagos");
    mod.controller('pagosNewCtrl', ['$scope', '$http', 'pagosContext', '$state', '$rootScope',
        function ($scope, $http,pagosContext, $state, $rootScope) {
            $rootScope.edit = false;

            $scope.data = {};
          
            $scope.createPago = function () {
                $http.post(pagosContext, $scope.data).then(function (response) {
                    
                    $state.go('pagosList', {pagoId: response.data.id}, {reload: true});
                });
            };
            $scope.createPago = function () {
                console.log($rootScope.currentId);
                $scope.data.factura = {id: $rootScope.currentId};
                
                $http.post(pagosContext, $scope.data).then(function (response) {
                    $state.go('pagosList', {pagoId: response.data.id}, {reload: true});
                });
                
            };
        }
    ]);
}
)(window.angular);


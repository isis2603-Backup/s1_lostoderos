(function (ng) {
    
    var mod = ng.module("facturasModule", ['ui.router']);
    
    mod.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
            
            var basePath = 'src/modules/facturas/';
            
            $urlRouterProvider.otherwise("/facturasList");
            
            $stateProvider.state('facturas', {
                url: '/facturas',
                abstract:true,
                 views: {
                    'mainView': {
                        templateUrl: basePath + 'facturas.html',
                        controller: 'facturasCtrl',
                        controllerAs: 'ctrl'
                    }
                },
                data: {
                    requireLogin: false,
                    roles: []
                }
            }).state('facturasList', {
                url: '/list',
                parent:'facturas',
                 views: {
                    'listView':{
                        templateUrl:basePath+'facturas.list.html'
                    }
                },
                data: {
                    requireLogin: false,
                    roles: []
                }
            }).state('facturasDetail',{
                url: '/{facturaId:int}/detail',
                parent:'facturas',
                param: {facturaId: null},
                views:{
                    'listView': {
                        templateUrl: basePath + 'facturas.list.html'
                        
                    },
                    'detailView':{
                        templateUrl: basePath + 'facturas.detail.html',
                        controller: 'facturasDetailCtrl',
                        controllerAs: 'ctrl'
                    }
                },
                data: {
                    requireLogin: false,
                    roles: []
                }
            }).state('createFacturas',{
                url:'/create',
                parent:'facturas',
                views:{
                    
                    
                    'createFacturasView':{
                        templateUrl:basePath+'facturas.create.html',
                        controller: 'facturasNewCtrl',
                        controllerAs:'ctrl'
                    }
                },
                data: {
                    requireLogin: false,
                    roles: []
                }
            }).state('facturasInfo',{
                url:'info',
                parent:'facturasDetail',
                views:{
                    'listView': {
                        templateUrl: basePath + 'facturas.list.html'
                        
                    },
                    'detailView':{
                        templateUrl: basePath + 'facturas.detail.html'
                    },
                    'infoFacturasView':{
                        templateUrl:basePath+'facturas.detail.info.html',
                        controller: 'facturasCtrl',
                        controllerAs:'ctrl'
                    }
                },
                data: {
                    requireLogin: false,
                    roles: []
                }
            });
            
        }
    ]);
})(window.angular);


Ext.namespace('Namespace');
Namespace.AnExtension = Ext.extend(Ext.Panel, {

//    ,constructor:function(config) {
//        // constructor pre-processing - configure listeners here
//        config = config || {};
//        config.listeners = config.listeners || {};
//        Ext.applyIf(config.listeners, {
//             expand:{scope:this, fn:function() {
//            }}
//            ,collapse:{scope:this, fn:function() {
//            }}
//        });
//
//        
//        Namespace.AnExtension.superclass.constructor.apply(this, arguments);
//
//        // constructor post-processing
//
//    }, 

	initComponent: function() {

 		var config = {};

		// apply config
		Ext.apply(this, config);
		Ext.apply(this.initialConfig, config);

		Namespace.AnExtension.superclass.initComponent.apply(this, arguments);

		// after parent code here, e.g. install event handlers
		// this.on('beforerender', function(dis) {
		// alert('before render');
		// });
	}

	,onRender: function() {

		Namespace.AnExtension.superclass.onRender.apply(this, arguments);

	}

	// any other added/overrided methods
});

Ext.reg('Namespace.AnExtension', Namespace.AnExtension);

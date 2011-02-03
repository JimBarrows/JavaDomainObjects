Ext.namespace('BizOnDemand.Party');
BizOnDemand.Party.PartyForm = Ext.extend(BizOnDemand.Utils.BaseForm, {

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
//        BizOnDemand.Party.PartyForm.superclass.constructor.apply(this, arguments);
//
//        // constructor post-processing
//
//    }, 

	initComponent: function() {

 		var config = {
 			items: [
 				{
 					xtype:'label'
 					,text: 'Name'
 				}
 			]
 		};

		// apply config
		Ext.apply(this, config);
		Ext.apply(this.initialConfig, config);

		BizOnDemand.Party.PartyForm.superclass.initComponent.apply(this, arguments);

		// after parent code here, e.g. install event handlers
		// this.on('beforerender', function(dis) {
		// alert('before render');
		// });
	}

	,onRender: function() {

		BizOnDemand.Party.PartyForm.superclass.onRender.apply(this, arguments);

	}

	// any other added/overrided methods
});

Ext.reg('BizOnDemand.Party.PartyForm', BizOnDemand.Party.PartyForm);

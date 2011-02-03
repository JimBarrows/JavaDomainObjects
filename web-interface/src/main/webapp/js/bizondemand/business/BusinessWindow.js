Ext.namespace('BizOnDemand.Business');
BizOnDemand.Business.BusinessWindow = Ext.extend(Ext.Window, {

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
//        BizOnDemand.Business.BusinessWindow.superclass.constructor.apply(this, arguments);
//
//        // constructor post-processing
//
//    }, 

	
	initComponent: function() {
		dis = this
		var config = {
      layout: 'border'
      ,width: 700
      ,height: 300
			,title: 'Business'
      ,items: [{
				region:'center'
				,xtype:'treepanel'
				,useArrows: true
				,autoScroll: true
				,animate: true
				,enableDD: true
				,containerScroll: true
				,border: false
				,loader: new Ext.tree.TreeLoader()
				,rootVisible: false
				,root: new Ext.tree.AsyncTreeNode(
					{
						text: 'Business Organization' 
					}
				)
				,tbar: {
					items:[
						{
							text:'Add'
							,iconCls: 'add'
						}
						,'-'
						,{
							text:'Delete'
							,iconCls: 'delete'
						}
					]
				}
			}]
		};

		// apply config
		Ext.apply(this, config);
		Ext.apply(this.initialConfig, config);

		BizOnDemand.Business.BusinessWindow.superclass.initComponent.apply(this, arguments);

		// after parent code here, e.g. install event handlers
		// this.on('beforerender', function(dis) {
		// alert('before render');
		// });
	}

  ,onRender: function() {

		BizOnDemand.Business.BusinessWindow.superclass.onRender.apply(this, arguments);

	}

	,beforeshow: function( ) {

	}

    // any other added/overrided methods
});

Ext.reg('BizOnDemand.Business.BusinessWindow', BizOnDemand.Business.BusinessWindow);

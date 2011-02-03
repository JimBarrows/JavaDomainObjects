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
				xtype:'treepanel'
				,region : 'center'
				,useArrows: true
				,autoScroll: true
				,animate: true
				,enableDD: true
				,width: 200
				,loader: new Ext.tree.TreeLoader()				
				,root: new Ext.tree.AsyncTreeNode({
					expanded: true
					,children: [{
							text:'Menu option 1'
							,leaf: false
							,children: [{text: 'suboption 1'}]
						},{
							text: 'Menu option2'
							,leaf:false
							,children: [{text: 'suboption 2'}]
						}]
				})
				,rootVisible: true
				,listeners: {
					click: function(n){
						Ext.Msg.alert('Navigation Tree Click','you clicked');
					}
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

    // any other added/overrided methods
});

Ext.reg('BizOnDemand.Business.BusinessWindow', BizOnDemand.Business.BusinessWindow);

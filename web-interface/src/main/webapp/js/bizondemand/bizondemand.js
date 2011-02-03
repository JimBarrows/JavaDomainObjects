Ext.namespace('BizOnDemand');
BizOnDemand.Desktop = Ext.extend(Ext.Viewport, {

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
//        BizOnDemand.Desktop.superclass.constructor.apply(this, arguments);
//
//        // constructor post-processing
//
//    }, 

    initComponent: function() {

        var config = {
        	layout: 'border'
        	,items: [{
        		region: 'center'
        		,xtype: 'panel'
        		,tbar: {
        			xtype: 'toolbar'
        			,items: [ 
        				{
									xtype: 'tbbutton'
									,text: 'Products'
									,menu: [
										{
											text:'Inventory'
											,handler: function( item, event) {
 			       						alert('Click')
 			       					}
										},{
											text:'Goods'
											,handler: function( item, event) {
												var goodWindow = new BizOnDemand.Products.ProductsWindow()
												goodWindow.show()
											}
										},{
											text:'Services'
											,handler: function( item, event) {
												alert('Click')
											}
 			       				}
 		       				]
        				}
        				,'->'
        				,{
	        				xtype: 'tbbutton'
 		       				,text: 'Business'
 		       				,handler: function() {
										var businessWindow = new BizOnDemand.Business.BusinessWindow()
										businessWindow.show()
 		       				}
 		       			}
        				,{
	        				xtype: 'tbbutton'
 		       				,text: 'Party Form'
 		       				,handler: function() {
										var w = new Ext.Window( {
											layout:'fit'
											,width: 700
											,height: 300
											,title: 'Temp Party'
											,items: [
												{ 
													xtype: 'BizOnDemand.Party.PartyForm'
												}
											]
										})
										w.show()
 		       				}
 		       			}
 		       		]
        		}
        	}]
        };

        // apply config
        Ext.apply(this, config);
        Ext.apply(this.initialConfig, config);

        BizOnDemand.Desktop.superclass.initComponent.apply(this, arguments);

        // after parent code here, e.g. install event handlers
        // this.on('beforerender', function(dis) {
        // alert('before render');
        // });
    }

    ,
    onRender: function() {

        BizOnDemand.Desktop.superclass.onRender.apply(this, arguments);

    }

    // any other added/overrided methods
});

Ext.reg('BizOnDemand.Desktop', BizOnDemand.Desktop);

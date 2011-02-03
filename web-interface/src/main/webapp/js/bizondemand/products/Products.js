Ext.namespace('BizOnDemand.Products');
BizOnDemand.Products.ProductsWindow = Ext.extend(Ext.Window, {

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
//        BizOnDemand.Products.ProductsWindow.superclass.constructor.apply(this, arguments);
//
//        // constructor post-processing
//
//    }, 

	
	productStore: new Ext.data.ArrayStore({
		fields: [
			{name: 'name'}
			,{name:'introduction_date',type:'date', dateFormat: Date.patterns.ISO8601Short}
			,{name:'sales_discontinuation_date',type:'date', dateFormat: Date.patterns.ISO8601Short}
			,{name:'support_discontinuation_date',type:'date', dateFormat: Date.patterns.ISO8601Short}
			,{name:'manufactured_by'}
		]
		,data: [
			['Product 1','2001-01-01','2001-01-01','2003-01-01','Someone']
		]
	})

	,initComponent: function() {
		dis = this
		var filters = new Ext.ux.grid.GridFilters({
			// encode and local configuration options defined previously for easier reuse
			encode: false // json encode the filter query
			,local: true   // defaults to false (remote filtering)
			,filters: [
				{
					type: 'string'
					,dataIndex: 'name'
				}
				,{
					type: 'date'
					,dataIndex: 'introduction_date'
				}
				,{
					type: 'date'
					,dataIndex: 'sales_discontinuation_date'
				}
				,{
					type: 'date'
					,dataIndex: 'support_discontinuation_date'
				}
				,{
					type: 'string'
					,dataIndex: 'manufactured_by'
				}
			]
    })
		var config = {
      layout: 'border'
      ,width: 700
      ,height: 300
			,title: 'Products'
      ,items: [{
				region:'center'
				,xtype:'grid'
				,loadMask:true
				,store: dis.productStore 
				,stripeRows:true
				,autoExpandColumn:'name'
				,plugins: [ filters]
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
				,bbar: {
					xtype: 'paging'
					,pageSize:25
					,store: dis.productStore 
					,displayInfo: true
					,displayMsg: 'Displaying products {0} - {1} of {2}'
					,emptyMsg: 'No products to display'
					,items: [
						'-', 
						{
							pressed:true
							,enableToggle: true
							,text: 'Show Preview'
							,cls: 'x-btn-text-icon details'
							,toggleHandler: function(btn, pressed){
								var view = grid.getView()
								view.showPreview = pressede
								view.referesh()
							}
						}
					]
				}
				,columns: [
					{ 
						id: 'name'
						,header: 'Name'
						,sortable: true
						,dataIndex: 'name'
						,filterable: true
					}
					,{
						id: 'introduction_date'
						,header: 'Introduction Date'
						,sortable: true
						,dataIndex: 'introduction_date'
						,filterable: true
					}
					,{
						id: 'sales_discontinuation_date'
						,header: 'Sales Discontinuation Date'
						,sortable: true
						,dataIndex: 'sales_discontinuation_date'
						,filterable: true
					}
					,{
						id: 'support_discontinuation_date'
						,header: 'Support Discontinuation Date'
						,sortable: true
						,dataIndex: 'support_discontinuation_date'
					}
					,{
						id: 'manufactured_by'
						,header: 'Manufactured By'
						,sortable: true
						,dataIndex: 'manufactured_by'
					}
				]
			}]
		};

		// apply config
		Ext.apply(this, config);
		Ext.apply(this.initialConfig, config);

		BizOnDemand.Products.ProductsWindow.superclass.initComponent.apply(this, arguments);

		// after parent code here, e.g. install event handlers
		// this.on('beforerender', function(dis) {
		// alert('before render');
		// });
	}

  ,onRender: function() {

		BizOnDemand.Products.ProductsWindow.superclass.onRender.apply(this, arguments);

	}

	,beforeshow: function( ) {

		this.productStore.load({params:{start:0, limit:25}})
	}

    // any other added/overrided methods
});

Ext.reg('BizOnDemand.Products.ProductsWindow', BizOnDemand.Products.ProductsWindow);

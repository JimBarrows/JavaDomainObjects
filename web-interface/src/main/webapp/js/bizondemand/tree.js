Ext.onReady( function(){
var tree = new Ext.tree.TreePanel({
    		renderTo: 'tree-div',
    		useArrows: true,
    		autoScroll: true,
    		animate: true,
    		enableDD: true,
    		containerScroll: true,
    		border: false,
    		// auto create TreeLoader
    		//dataUrl: 'http://localhost:8080/organization.json',
 
    		root: {
        	nodeType: 'async',
        	text: 'Ext JS',
        	draggable: false,
        	id: 'source'
        	,children: [{
                text: 'Menu Option 1',
                leaf: true
            }, {
                text: 'Menu Option 2',
                leaf: true
            }, {
                text: 'Menu Option 3',
                leaf: true
            }]
 
    		}
			});
 
		
			tree.getRootNode().expand();
		});
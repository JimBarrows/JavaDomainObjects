Ext.namespace('BizOnDemand.Utils');
BizOnDemand.Utils.BaseForm = Ext.extend(Ext.FormPanel, {
 
    initComponent: function() {
 
        var config = {};
 
        // apply config
        Ext.apply(this, config);
        Ext.apply(this.initialConfig, config);
 
        BizOnDemand.Utils.BaseForm.superclass.initComponent.apply(this, arguments);
 
        // after parent code here, e.g. install event handlers
        // this.on('beforerender', function(dis) {
        // alert('before render');
        // });
    }
 
    ,onRender: function() {
 
        BizOnDemand.Utils.BaseForm.superclass.onRender.apply(this, arguments);
 
	}
 
	,submit : function(url, scope, waitMsg) {
    	this.getForm().submit({
    		url: url
    		,scope: scope
    		,waitMsg: waitMsg
    		,success: this.onSuccess
    		,failure: this.onFailure
    	})
    }
 
    ,onSuccess: function(form, action) {
    	Ext.Msg.show({
            title: 'Success'
            ,msg: 'Success!'
            ,modal: true
            ,icon: Ext.Msg.INFO
            ,buttons: Ext.Msg.OK            
        });
    }
 
    ,onFailure: function(form, action) {
		switch (action.failureType) {
	    	case Ext.form.Action.CLIENT_INVALID:
	            onClientInvalid( form,action);
	        break;
	        case Ext.form.Action.CONNECT_FAILURE:
	            onConnectionFailure(form,action);
	        break;
	        case Ext.form.Action.SERVER_INVALID:
	        	onServerInvalid(form,action);
	        break;	        
        };
    }
 
    ,onClientInvalid: function(form,action) {
   		Ext.Msg.alert('Failure', 'Form fields may not be submitted with invalid values'); 	
    }
 
    ,onConnectionFailure: function(form,action) {
    	Ext.Msg.alert('Failure', 'Ajax communication failed');
    }
 
    ,onServerInvalid: function(form,action) {
    	Ext.Msg.alert('Failure', action.result.msg);
    }
});
 
Ext.reg('BizonDemand.Utils.BaseForm', BizOnDemand.Utils.BaseForm);

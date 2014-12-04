<div class="container">
  <div class="page-header">
    <h1>Add Customer</h1>
  </div>
  <form class="form-horizontal" role="form">
    <div class="form-group">
      <label for="name" class="col-sm-2 control-label">Name</label>
      <div class="col-sm-10">
      {{input type="text" value=name class="form-control" placeholder="Customer Name"}}
      {{#if errors.name}}
	<span class="glyphicon glyphicon-remove form-control-feedback"></span>
	<span class="help-block">
	  {{#each errors.name}}
	    {{message}}
	  {{/each}}
	</span>
      {{/if}}
      </div>
    </div>
    <button 
      {{action 'save'}}
      class="btn btn-sm btn-primary" role="button">
      Save
    </button> 
  </form>
</div>
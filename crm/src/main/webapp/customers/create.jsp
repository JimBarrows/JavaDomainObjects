<div class="container">
	<div class="page-header">
		<h1>Add Customer</h1>
	</div>
	<form class="form-horizontal" role="form">
		<div {{bind-attr class=":form-group model.errors.partyType:has-error" }}>
			<label for="name" class="col-sm-2 control-label">Type</label>
			<div class="col-sm-10">
				{{view "select" content=partyTypeList optionValuePath="content.id"  optionLabelPath="content.name" selection=model.partyType class="form-control" prompt="Please select a customer type"}} 
				{{#if model.errors.partyType}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						<ul>
							<li>{{#each model.errors.partyType}} {{message}} {{/each}}</li>
						</ul> 
					</span> 
				{{/if}}
			</div>
		</div>
		{{#if model.isPerson}}
		<div class="form-group has-feedback">
			<label for="name" class="col-sm-2 control-label">First Name</label>
			<div class="col-sm-10">
				{{input type="text" value=model.firstName class="form-control" placeholder="First Name"}} 
				{{#if model.errors.firstName}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						{{#each model.errors.firstName}} {{message}} {{/each}} 
					</span> 
				{{/if}}
			</div>
		</div>
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Last Name</label>
			<div class="col-sm-10">
				{{input type="text" value=model.lastName class="form-control" placeholder="First Name"}} 
				{{#if model.errors.lastName}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						{{#each model.errors.lastName}} {{message}} {{/each}} 
					</span> 
				{{/if}}
			</div>
		</div>
		{{else}}
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Name</label>
			<div class="col-sm-10">
				{{input type="text" value=model.name class="form-control" placeholder="Customer Name"}} 
				{{#if model.errors.name}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						{{#each model.errors.name}} {{message}} {{/each}} 
					</span> 
				{{/if}}
			</div>
		</div>
		{{/if}}
		<button {{action 'save'}} class="btn btn-sm btn-primary" role="button">Save</button>
	</form>
</div>
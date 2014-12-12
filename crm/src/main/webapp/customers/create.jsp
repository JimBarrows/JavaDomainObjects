<div class="container">
	<div class="page-header">
		<h1>Add Customer</h1>
	</div>
	<form class="form-horizontal" role="form">
		<div {{bind-attr class=":form-group errors.partyType:has-error" }}>
			<label for="name" class="col-sm-2 control-label">Type</label>
			<div class="col-sm-10">
				{{view "select" content=partyTypeList value=partyType selection=partyType class="form-control" }} 
				{{#if errors.partyType}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						<ul>
							<li>{{#each message in errors.partyType}} {{message}} {{/each}}</li>
						</ul> 
					</span> 
				{{/if}}
			</div>
		</div>
		{{#if isPerson}}
		<div class="form-group has-feedback">
			<label for="name" class="col-sm-2 control-label">First Name</label>
			<div class="col-sm-10">
				{{input type="text" value=firstName class="form-control" placeholder="First Name"}} 
				{{#if errors.firstName}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						{{#each errors.firstName}} {{message}} {{/each}} 
					</span> 
				{{/if}}
			</div>
		</div>
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Last Name</label>
			<div class="col-sm-10">
				{{input type="text" value=lastName class="form-control" placeholder="First Name"}} 
				{{#if errors.lastName}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						{{#each errors.lastName}} {{message}} {{/each}} 
					</span> 
				{{/if}}
			</div>
		</div>
		{{else}}
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">Name</label>
			<div class="col-sm-10">
				{{input type="text" value=name class="form-control" placeholder="Customer Name"}} 
				{{#if errors.name}} 
					<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
					<span class="help-block"> 
						{{#each errors.name}} {{message}} {{/each}} 
					</span> 
				{{/if}}
			</div>
		</div>
		{{/if}}
		<button {{action 'save'}} class="btn btn-sm btn-primary" role="button">Save</button>
	</form>
</div>
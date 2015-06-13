<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://javadomainobjects.org/tags/ember" prefix="ember"%>
 
<div class="container">
	<div class="page-header">
		<h2>Add Customer</h2>
	</div>
	<form class="form-horizontal" role="form">		
		<div {{bind-attr class=":form-group model.errors.partyType:has-error" }}>
			<label for="type" class="col-sm-2 control-label">Type</label>
			<div class="col-sm-10">
				{{view "select" 
				name="type"
					content=partyTypeList 
					optionValuePath="content.id"  
					optionLabelPath="content.name" 
					selection=model.partyType 
					class="form-control" 
					prompt="Please select a customer type"}} 
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
		<ember:TextField label="First Name" field="firstName" placeHolder="Sarah Jane"/>		
		<ember:TextField label="Last Name" field="lastName" placeHolder="Smith"/>		
		{{else}}
		<ember:TextField label="Name" field="name" placeHolder="Thingmaker"/>		
		{{/if}}
		<button id="saveCustomer" {{action 'save'}} class="btn btn-sm btn-primary" role="button">Save</button>
	</form>
</div>
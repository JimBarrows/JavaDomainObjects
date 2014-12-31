<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ attribute name="label" required="true" %>
<%@ attribute name="field" required="true" %>
<%@ attribute name="placeHolder" required="true" %>

<div {{bind-attr class=":form-group model.errors.${field}:has-error"}}>
	<label for="${name}" class="col-sm-2 control-label">${label}</label>
	<div class="col-sm-10">
		{{input type="text" name="${name}" value=model.${field} class="form-control" placeholder="${placeHolder}"}} 
		{{#if model.errors.${field} }} 
			<span class="glyphicon glyphicon-remove form-control-feedback"></span> 
			<span class="help-block">
				<ul>
					<li>{{#each model.errors.${field} }} {{message}} {{/each}}</li>
				</ul>
			</span> 
		{{/if}}
	</div>
</div>

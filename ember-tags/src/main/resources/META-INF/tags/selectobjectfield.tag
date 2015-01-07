<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ attribute name="label" required="true"%>
<%@ attribute name="field" required="true"%>
<%@ attribute name="list" required="true"%>

<div {{bind-attr class=":form-group model.errors.${field}:has-error"}}>
	<label for="era" class="col-sm-2 control-label">${label }</label>
	<div class="col-sm-10">
		{{view "select" content=${list } optionValuePath="content.id"
		optionLabelPath="content.name" selectionBinding="model.${field }.content"
		class="form-control" }} {{#if model.errors.${field }}} <span
			class="glyphicon glyphicon-remove form-control-feedback"></span> <span
			class="help-block">
			<ul>
				<li>{{#each error in model.errors.${field }}} {{error.message}}
					{{/each}}</li>
			</ul>
		</span> {{/if}}
	</div>
</div>

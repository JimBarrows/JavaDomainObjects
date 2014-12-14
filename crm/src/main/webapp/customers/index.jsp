{{#link-to "customers.create" class="btn btn-default"}}Add{{/link-to}}
<ul>
	{{#each customer in model}}
	<li>{{#if customer.name}} 
		{{#link-to 'customers.edit' customer}}{{customer.name}}{{/link-to}}  
		{{else}} 
		{{#link-to 'customers.edit' customer}}{{customer.firstName}} {{customer.lastName}}{{/link-to}} {{/if}}</li> {{else}}
	<p>You have no customers! You need to fill your sales funnel!</p>
	{{/each}}
</ul>
{{#link-to "customers.create" class="btn btn-default"}}Add{{/link-to}}
<ul>
	{{#each item in model}}
	<li>{{#if item.isPerson}}{{item.firstName}} {{item.lastName}} {{else}} {{item.name}} {{/if}}</li> {{else}}
	<p>You have no customers! You need to fill your sales funnel!</p>
	{{/each}}
</ul>
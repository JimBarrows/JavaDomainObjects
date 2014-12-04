{{#link-to "customers.create" class="btn btn-default"}}Add{{/link-to}}
<ul>
	{{#each item in model}}
	<li>{{item.id}}</li> {{else}}
	<p>You have no customers! You need to fill your sales funnel!</p>
	{{/each}}
</ul>
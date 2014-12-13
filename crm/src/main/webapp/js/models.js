/**
 * 
 */

App.PartyType = DS.Model.extend({
	name:DS.attr('string')
});


App.Customer = DS.Model.extend({
	firstName : DS.attr('string'),
	lastName : DS.attr('string'),
	name : DS.attr('string'),
	partyType : DS.belongsTo('partyType'),
	isPerson : function() {
		return (this.get('partyType') !== null) && ('jdo.party.model.Person' == this.get('partyType').get('id'));
	}.property('partyType')
});
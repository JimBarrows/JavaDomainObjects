package jdo.party.model.contactmechanism;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-29T22:40:08.909-0700")
@StaticMetamodel(TelecommunicationsNumber.class)
public class TelecommunicationsNumber_ extends ContactMechanism_ {
	public static volatile SingularAttribute<TelecommunicationsNumber, Boolean> acceptsData;
	public static volatile SingularAttribute<TelecommunicationsNumber, Boolean> acceptsFaxes;
	public static volatile SingularAttribute<TelecommunicationsNumber, Boolean> acceptsTextMessages;
	public static volatile SingularAttribute<TelecommunicationsNumber, String> areaCode;
	public static volatile SingularAttribute<TelecommunicationsNumber, String> contactNumber;
	public static volatile SingularAttribute<TelecommunicationsNumber, String> countryCode;
	public static volatile SingularAttribute<TelecommunicationsNumber, String> extension;
}

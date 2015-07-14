package jdo.xml.adapters;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

	public ZonedDateTime unmarshal(String v) throws Exception {
       return ZonedDateTime.from( DateTimeFormatter.ISO_DATE_TIME.parse(v));
    }
 
    public String marshal(ZonedDateTime v) throws Exception {
        return DateTimeFormatter.ISO_DATE_TIME.format(v);
    }

}

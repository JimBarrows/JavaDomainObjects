/**
 * 
 */
/**
 * @author Jim
 *
 */
@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(type = DateTime.class, value = DateTimeAdapter.class) })
package jdo;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import jdo.xml.adapters.DateTimeAdapter;

import org.joda.time.DateTime;


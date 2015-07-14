/**
 * 
 */
/**
 * @author Jim
 *
 */

@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(type = java.time.ZonedDateTime.class, value = DateTimeAdapter.class) })
package jdo.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import jdo.xml.adapters.DateTimeAdapter;


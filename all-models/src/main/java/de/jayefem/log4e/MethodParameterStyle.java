package de.jayefem.log4e;

import org.apache.commons.lang.builder.ToStringStyle;

/**
 * The method parameter style for logging with Log4E.
 * 
 * @author Jan-Friedrich Mutter, log4e@jayefem.de, http://log4e.jayefem.de
 */
public class MethodParameterStyle extends ToStringStyle {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The method parameter style for logging with Log4E.
	 * @see #readResolve()
	 */
	public static final ToStringStyle METHOD_PARAMETER_STYLE = new MethodParameterStyle();

	/**
	 * Constructor. 
	 */
	public MethodParameterStyle() {
		super();

		this.setUseClassName(false);
		this.setUseIdentityHashCode(false);
		this.setUseFieldNames(true);
		this.setContentStart("");
		this.setContentEnd("");
		this.setFieldNameValueSeparator("=");
	}

	/**
	 * <p>Ensure <code>Singleton</code> after serialization.</p>
	 * @return the singleton
	 */
	private Object readResolve() {
		return METHOD_PARAMETER_STYLE;
	}
}
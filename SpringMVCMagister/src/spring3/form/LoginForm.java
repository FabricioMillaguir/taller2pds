package spring3.form;


public class LoginForm implements java.io.Serializable {
	
	/** The logins. */
	private java.lang.Object logins;
	
	/**
	 * Instantiates a new login form.
	 */
	public LoginForm(){
		
	}
	
	/**
	 * Instantiates a new login form.
	 *
	 * @param logins the logins
	 */
	public LoginForm(java.lang.Object logins){
		this.logins = logins;
	}

	/**
	 * Gets the logins.
	 *
	 * @return the logins
	 */
	public java.lang.Object getLogins() {
		return logins;
	}

	/**
	 * Sets the logins.
	 *
	 * @param logins the new logins
	 */
	public void setLogins(java.lang.Object logins) {
		this.logins = logins;
	}
	
}

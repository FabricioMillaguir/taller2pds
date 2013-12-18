package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * The Class Cuenta.
 *
 * @author Diego Solis San Martin
 */
/**
 * The Class Cuenta.
 */
public class Cuenta implements java.io.Serializable {
	
	/** The activa. */
	private boolean activa;
	
	/** The clienteid. */
	private spring3.form.Cliente clienteid;
	
	/** The servicioid. */
	private spring3.form.Servicio servicioid;
	
	/** The loginid. */
	private spring3.form.Login loginid;
	
	/**
	 * Instantiates a new cuenta.
	 */
	public Cuenta(){
		
	}
	
	/**
	 * Instantiates a new cuenta.
	 *
	 * @param activa the activa
	 * @param clienteid the clienteid
	 * @param servicioid the servicioid
	 * @param loginid the loginid
	 */
	public Cuenta(boolean activa, spring3.form.Cliente clienteid, spring3.form.Servicio servicioid, spring3.form.Login loginid){
		this.activa = activa;
		this.clienteid = clienteid;
		this.servicioid = servicioid;
		this.loginid = loginid;
	}

	/**
	 * Checks if is activa.
	 *
	 * @return true, if is activa
	 */
	public boolean isActiva() {
		return activa;
	}

	/**
	 * Sets the activa.
	 *
	 * @param activa the new activa
	 */
	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	/**
	 * Gets the clienteid.
	 *
	 * @return the clienteid
	 */
	public spring3.form.Cliente getClienteid() {
		return clienteid;
	}

	/**
	 * Sets the clienteid.
	 *
	 * @param clienteid the new clienteid
	 */
	public void setClienteid(spring3.form.Cliente clienteid) {
		this.clienteid = clienteid;
	}

	/**
	 * Gets the servicioid.
	 *
	 * @return the servicioid
	 */
	public spring3.form.Servicio getServicioid() {
		return servicioid;
	}

	/**
	 * Sets the servicioid.
	 *
	 * @param servicioid the new servicioid
	 */
	public void setServicioid(spring3.form.Servicio servicioid) {
		this.servicioid = servicioid;
	}

	/**
	 * Gets the loginid.
	 *
	 * @return the loginid
	 */
	public spring3.form.Login getLoginid() {
		return loginid;
	}

	/**
	 * Sets the loginid.
	 *
	 * @param loginid the new loginid
	 */
	public void setLoginid(spring3.form.Login loginid) {
		this.loginid = loginid;
	}
}

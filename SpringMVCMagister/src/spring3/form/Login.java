package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */
/**
 * The Class Login.
 */
public class Login implements java.io.Serializable {

	/** The token. */
	private java.lang.String token;
	
	/** The fecha_inicio. */
	private java.lang.String fecha_inicio;
	
	/** The fecha_fin. */
	private java.lang.String fecha_fin;
	
	/** The administradorid. */
	private spring3.form.Administrador administradorid;
	
	/**
	 * Instantiates a new login.
	 */
	public Login(){
		
	}
	
	/**
	 * Instantiates a new login.
	 *
	 * @param token the token
	 * @param fecha_inicio the fecha_inicio
	 * @param fecha_fin the fecha_fin
	 * @param administradorid the administradorid
	 */
	public Login(java.lang.String token, java.lang.String fecha_inicio, java.lang.String fecha_fin, spring3.form.Administrador administradorid){
		this.token = token;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.administradorid = administradorid;
	}

	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public java.lang.String getToken() {
		return token;
	}

	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(java.lang.String token) {
		this.token = token;
	}

	/**
	 * Gets the fecha_inicio.
	 *
	 * @return the fecha_inicio
	 */
	public java.lang.String getFecha_inicio() {
		return fecha_inicio;
	}

	/**
	 * Sets the fecha_inicio.
	 *
	 * @param fecha_inicio the new fecha_inicio
	 */
	public void setFecha_inicio(java.lang.String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	/**
	 * Gets the fecha_fin.
	 *
	 * @return the fecha_fin
	 */
	public java.lang.String getFecha_fin() {
		return fecha_fin;
	}

	/**
	 * Sets the fecha_fin.
	 *
	 * @param fecha_fin the new fecha_fin
	 */
	public void setFecha_fin(java.lang.String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	/**
	 * Gets the administradorid.
	 *
	 * @return the administradorid
	 */
	public spring3.form.Administrador getAdministradorid() {
		return administradorid;
	}

	/**
	 * Sets the administradorid.
	 *
	 * @param administradorid the new administradorid
	 */
	public void setAdministradorid(spring3.form.Administrador administradorid) {
		this.administradorid = administradorid;
	}
}

package spring3.form;

// TODO: Auto-generated Javadoc

/**
 * @author Diego Solis San Martin
 */
/**
 * The Class Administrador.
 */
public class Administrador implements java.io.Serializable {

	/** The usuario. */
	private java.lang.String usuario;

	/** The clave. */
	private java.lang.String clave;

	
	/**
	 * Instantiates a new administrador.
	 */
	public Administrador(){
		
	}
	
	/**
	 * Instantiates a new administrador.
	 *
	 * @param usuario the usuario
	 * @param clave the clave
	 */
	public Administrador(java.lang.String usuario, java.lang.String clave){
		this.usuario = usuario;
		this.clave = clave;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public java.lang.String getUsuario() {
		return usuario;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public void setUsuario(java.lang.String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets the clave.
	 *
	 * @return the clave
	 */
	public java.lang.String getClave() {
		return clave;
	}

	/**
	 * Sets the clave.
	 *
	 * @param clave the new clave
	 */
	public void setClave(java.lang.String clave) {
		this.clave = clave;
	}
	
	
}

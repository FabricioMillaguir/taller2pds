package domain;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */

/**
 * The Class AdministradorVO.
 */
public class AdministradorVO {
	
	/** The usuario. */
	private String usuario;
	
	/** The clave. */
	private String clave;
	
	/**
	 * Instantiates a new administrador vo.
	 */
	public AdministradorVO(){
		
	}

	/**
	 * Instantiates a new administrador vo.
	 *
	 * @param usuario the usuario
	 * @param clave the clave
	 */
	public AdministradorVO(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets the clave.
	 *
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * Sets the clave.
	 *
	 * @param clave the new clave
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}

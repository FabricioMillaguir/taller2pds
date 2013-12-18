package domain;

public class AdministradorVO {

	private String usuario;

	private String clave;

	public AdministradorVO() {

	}

	/**
	 * Instantiates a new administrador vo.
	 * 
	 * @param usuario
	 *            the usuario
	 * @param clave
	 *            the clave
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
	 * @param usuario
	 *            the new usuario
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
	 * @param clave
	 *            the new clave
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

}

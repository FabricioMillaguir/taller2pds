package domain;

/**
 * 
 * Clase AdministradorVO
 * 
 * @author Fabricio
 * 
 */
public class AdministradorVO {

	/**
	 * 
	 */
	private int id;
	private String usuario;
	private String clave;

	/**
	 * 
	 * Constructor vacío de AdministradorVO
	 */

	public AdministradorVO() {

	}

	/**
	 * Constructor de AdministradorVO
	 * 
	 * @param id
	 * @param usuario
	 * @param clave
	 */

	public AdministradorVO(int id, String usuario, String clave) {
		this.id = id;
		this.usuario = usuario;
		this.clave = clave;
	}

	/**
	 * Constructor de AdministradorVO usando solo el id
	 * 
	 * @param id
	 */
	public AdministradorVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de AdministradorVO sin id
	 * 
	 * @param usuario
	 * @param clave
	 */
	public AdministradorVO(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	/**
	 * Devuelve el usuario
	 * 
	 * @return
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Cambia el valor del usuario
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Devuelve la clave
	 * 
	 * @return
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * Cambia el valor de la clave
	 * 
	 * @param clave
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * Devuelve el id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Cambia el valor del id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

}

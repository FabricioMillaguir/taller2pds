package domain;

public class LoginVO {

	private int id;
	/** The token. */
	private String token;

	/** The fecha_inicio. */
	private String fecha_inicio;

	/** The fecha_fin. */
	private String fecha_fin;

	/** The o administrador vo. */
	private AdministradorVO oAdministradorVO;

	/**
	 * Instantiates a new login vo.
	 */
	public LoginVO() {

	}

	/**
	 * Instantiates a new login vo.
	 * 
	 * @param token
	 *            the token
	 * @param fecha_inicio
	 *            the fecha_inicio
	 * @param fecha_fin
	 *            the fecha_fin
	 * @param oAdministradorVO
	 *            the o administrador vo
	 */
	public LoginVO(int id, String token, String fecha_inicio, String fecha_fin,
			AdministradorVO oAdministradorVO) {
		this.token = token;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.oAdministradorVO = oAdministradorVO;
	}

	/**
	 * Gets the token.
	 * 
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Sets the token.
	 * 
	 * @param token
	 *            the new token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Gets the fecha_inicio.
	 * 
	 * @return the fecha_inicio
	 */
	public String getFecha_inicio() {
		return fecha_inicio;
	}

	/**
	 * Sets the fecha_inicio.
	 * 
	 * @param fecha_inicio
	 *            the new fecha_inicio
	 */
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	/**
	 * Gets the fecha_fin.
	 * 
	 * @return the fecha_fin
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}

	/**
	 * Sets the fecha_fin.
	 * 
	 * @param fecha_fin
	 *            the new fecha_fin
	 */
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	/**
	 * Gets the o administrador vo.
	 * 
	 * @return the o administrador vo
	 */
	public AdministradorVO getoAdministradorVO() {
		return oAdministradorVO;
	}

	/**
	 * Sets the o administrador vo.
	 * 
	 * @param oAdministradorVO
	 *            the new o administrador vo
	 */
	public void setoAdministradorVO(AdministradorVO oAdministradorVO) {
		this.oAdministradorVO = oAdministradorVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

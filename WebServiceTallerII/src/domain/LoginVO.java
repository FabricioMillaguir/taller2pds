package domain;

/**
 * LoginVO
 * 
 * @author Fabricio
 * 
 */
public class LoginVO {

	private String token;
	private long tiempoInicio;
	private AdministradorVO administradorVO;

	/**
	 * Constructor vacio de LoginVO
	 */
	public LoginVO() {
	}

	/**
	 * Constructor de LoginVO con el token
	 * 
	 * @param token
	 */
	public LoginVO(String token) {
		this.token = token;
	}

	/**
	 * Constructor del LoginVO
	 * 
	 * @param token
	 * @param tiempoInicio
	 * @param administradorVO
	 */
	public LoginVO(String token, long tiempoInicio,
			AdministradorVO administradorVO) {
		this.token = token;
		this.tiempoInicio = tiempoInicio;
		this.administradorVO = administradorVO;
	}

	/**
	 * Devuelve el token
	 * 
	 * @return
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Cambia el token
	 * 
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Devuelve el tiempo de inicio en milisegundos
	 * 
	 * @return
	 */
	public long getTiempoInicio() {
		return tiempoInicio;
	}

	/**
	 * Cambia el tiempo de inicio
	 * 
	 * @param tiempoInicio
	 */
	public void setTiempoInicio(long tiempoInicio) {
		this.tiempoInicio = tiempoInicio;
	}

	/**
	 * Devuelve el AdministadorVO
	 * 
	 * @return
	 */
	public AdministradorVO getAdministradorVO() {
		return administradorVO;
	}

	/**
	 * Cambia el AdministradorVO
	 * 
	 * @param administradorVO
	 */
	public void setAdministradorVO(AdministradorVO administradorVO) {
		this.administradorVO = administradorVO;
	}

}

package domain;

/**
 * CuentaVO
 * 
 * @author Fabricio
 * 
 */
public class CuentaVO {

	private int id;
	private boolean habilitada;
	private ClienteVO clienteVO;
	private ServicioVO servicioVO;
	private LoginVO loginVO;

	/**
	 * Constructor vacio de CuentaVO
	 */
	public CuentaVO() {
	}

	/**
	 * Constructor de CuentaVO con id
	 * 
	 * @param id
	 */
	public CuentaVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de CuentaVO sin el id
	 * 
	 * @param habilitada
	 * @param clienteVO
	 * @param servicioVO
	 * @param loginVO
	 */
	public CuentaVO(boolean habilitada, ClienteVO clienteVO,
			ServicioVO servicioVO, LoginVO loginVO) {
		this.habilitada = habilitada;
		this.clienteVO = clienteVO;
		this.servicioVO = servicioVO;
		this.loginVO = loginVO;
	}

	/**
	 * Constructor de CuentaVO
	 * 
	 * @param id
	 * @param habilitada
	 * @param clienteVO
	 * @param servicioVO
	 * @param loginVO
	 */
	public CuentaVO(int id, boolean habilitada, ClienteVO clienteVO,
			ServicioVO servicioVO, LoginVO loginVO) {
		this.id = id;
		this.habilitada = habilitada;
		this.clienteVO = clienteVO;
		this.servicioVO = servicioVO;
		this.loginVO = loginVO;
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
	 * Cambia el id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve true si esta habilitada y false en caso contrario
	 * 
	 * @return
	 */
	public boolean isHabilitada() {
		return habilitada;
	}

	/**
	 * Cambia habilitada
	 * 
	 * @param habilitada
	 */
	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}

	/**
	 * Devuelve ClienteVO al que pertenece la Cuenta
	 * 
	 * @return
	 */
	public ClienteVO getClienteVO() {
		return clienteVO;
	}

	/**
	 * Cambia el Cliente al que pertenece la Cuenta
	 * 
	 * @param clienteVO
	 */
	public void setClienteVO(ClienteVO clienteVO) {
		this.clienteVO = clienteVO;
	}

	/**
	 * Devuelve el ServicioVO
	 * 
	 * @return
	 */
	public ServicioVO getServicioVO() {
		return servicioVO;
	}

	/**
	 * Cambia el ServicioVO
	 * 
	 * @param servicioVO
	 */
	public void setServicioVO(ServicioVO servicioVO) {
		this.servicioVO = servicioVO;
	}

	/**
	 * Devuelve el LoginVO
	 * 
	 * @return
	 */
	public LoginVO getLoginVO() {
		return loginVO;
	}

	/**
	 * Cambia el LoginVO
	 * 
	 * @param loginVO
	 */
	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

}

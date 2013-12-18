package domain;

public class CuentaVO {

	private int id;
	/** The activa. */
	private boolean habilitada;

	/** The o cliente vo. */
	private ClienteVO oClienteVO;

	/** The o servicio vo. */
	private ServicioVO oServicioVO;

	/** The o login vo. */
	private LoginVO oLoginVO;

	/**
	 * Instantiates a new cuenta vo.
	 */
	public CuentaVO() {

	}

	/**
	 * Instantiates a new cuenta vo.
	 * 
	 * @param activa
	 *            the activa
	 * @param oClienteVO
	 *            the o cliente vo
	 * @param oServicioVO
	 *            the o servicio vo
	 * @param oLoginVO
	 *            the o login vo
	 */
	public CuentaVO(int id, boolean habilitada, ClienteVO oClienteVO,
			ServicioVO oServicioVO, LoginVO oLoginVO) {
		this.id = id;
		this.habilitada = habilitada;
		this.oClienteVO = oClienteVO;
		this.oServicioVO = oServicioVO;
		this.oLoginVO = oLoginVO;
	}

	/**
	 * Checks if is activa.
	 * 
	 * @return true, if is activa
	 */

	/**
	 * Gets the o cliente vo.
	 * 
	 * @return the o cliente vo
	 */
	public ClienteVO getoClienteVO() {
		return oClienteVO;
	}

	/**
	 * Sets the o cliente vo.
	 * 
	 * @param oClienteVO
	 *            the new o cliente vo
	 */
	public void setoClienteVO(ClienteVO oClienteVO) {
		this.oClienteVO = oClienteVO;
	}

	/**
	 * Gets the o servicio vo.
	 * 
	 * @return the o servicio vo
	 */
	public ServicioVO getoServicioVO() {
		return oServicioVO;
	}

	/**
	 * Sets the o servicio vo.
	 * 
	 * @param oServicioVO
	 *            the new o servicio vo
	 */
	public void setoServicioVO(ServicioVO oServicioVO) {
		this.oServicioVO = oServicioVO;
	}

	/**
	 * Gets the o login vo.
	 * 
	 * @return the o login vo
	 */
	public LoginVO getoLoginVO() {
		return oLoginVO;
	}

	/**
	 * Sets the o login vo.
	 * 
	 * @param oLoginVO
	 *            the new o login vo
	 */
	public void setoLoginVO(LoginVO oLoginVO) {
		this.oLoginVO = oLoginVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isHabilitada() {
		return habilitada;
	}

	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}

}

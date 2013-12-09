package domain;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */
/**
 * The Class ConsumoVO.
 */
public class ConsumoVO {
	
	/** The consumo. */
	private int consumo;
	
	/** The monto. */
	private int monto;
	
	/** The morosidad. */
	private boolean morosidad;
	
	/** The pagado. */
	private boolean pagado;
	
	/** The fecha_vencimiento. */
	private String fecha_vencimiento;
	
	/** The o cuenta vo. */
	private CuentaVO oCuentaVO;
	
	/** The o login vo. */
	private LoginVO oLoginVO;
	
	/**
	 * Instantiates a new consumo vo.
	 */
	public ConsumoVO(){
		
	}

	/**
	 * Instantiates a new consumo vo.
	 *
	 * @param consumo the consumo
	 * @param monto the monto
	 * @param morosidad the morosidad
	 * @param pagado the pagado
	 * @param fecha_vencimiento the fecha_vencimiento
	 * @param oCuentaVO the o cuenta vo
	 * @param oLoginVO the o login vo
	 */
	public ConsumoVO(int consumo, int monto, boolean morosidad, boolean pagado,
			String fecha_vencimiento, CuentaVO oCuentaVO, LoginVO oLoginVO) {
		super();
		this.consumo = consumo;
		this.monto = monto;
		this.morosidad = morosidad;
		this.pagado = pagado;
		this.fecha_vencimiento = fecha_vencimiento;
		this.oCuentaVO = oCuentaVO;
		this.oLoginVO = oLoginVO;
	}

	/**
	 * Gets the consumo.
	 *
	 * @return the consumo
	 */
	public int getConsumo() {
		return consumo;
	}

	/**
	 * Sets the consumo.
	 *
	 * @param consumo the new consumo
	 */
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	/**
	 * Gets the monto.
	 *
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * Sets the monto.
	 *
	 * @param monto the new monto
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/**
	 * Checks if is morosidad.
	 *
	 * @return true, if is morosidad
	 */
	public boolean isMorosidad() {
		return morosidad;
	}

	/**
	 * Sets the morosidad.
	 *
	 * @param morosidad the new morosidad
	 */
	public void setMorosidad(boolean morosidad) {
		this.morosidad = morosidad;
	}

	/**
	 * Checks if is pagado.
	 *
	 * @return true, if is pagado
	 */
	public boolean isPagado() {
		return pagado;
	}

	/**
	 * Sets the pagado.
	 *
	 * @param pagado the new pagado
	 */
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	/**
	 * Gets the fecha_vencimiento.
	 *
	 * @return the fecha_vencimiento
	 */
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	/**
	 * Sets the fecha_vencimiento.
	 *
	 * @param fecha_vencimiento the new fecha_vencimiento
	 */
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	/**
	 * Gets the o cuenta vo.
	 *
	 * @return the o cuenta vo
	 */
	public CuentaVO getoCuentaVO() {
		return oCuentaVO;
	}

	/**
	 * Sets the o cuenta vo.
	 *
	 * @param oCuentaVO the new o cuenta vo
	 */
	public void setoCuentaVO(CuentaVO oCuentaVO) {
		this.oCuentaVO = oCuentaVO;
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
	 * @param oLoginVO the new o login vo
	 */
	public void setoLoginVO(LoginVO oLoginVO) {
		this.oLoginVO = oLoginVO;
	}

	

}
package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */
/**
 * The Class Consumo.
 */
public class Consumo implements java.io.Serializable {
	
	/** The consumo. */
	private int consumo;
	
	/** The monto. */
	private int monto;
	
	/** The pagado. */
	private boolean pagado;
	
	/** The morosidad. */
	private boolean morosidad;
	
	/** The cuentaid. */
	private Cuenta cuentaid;
	
	/** The loginid. */
	private spring3.form.Login loginid;
	
	/**
	 * Instantiates a new consumo.
	 */
	public Consumo(){
		
	}
	
	/**
	 * Instantiates a new consumo.
	 *
	 * @param consumo the consumo
	 * @param monto the monto
	 * @param pagado the pagado
	 * @param morosidad the morosidad
	 * @param cuentaid the cuentaid
	 * @param loginid the loginid
	 */
	public Consumo(int consumo, int monto, boolean pagado, boolean morosidad, Cuenta cuentaid, spring3.form.Login loginid){
		this.consumo = consumo;
		this.monto = monto;
		this.pagado = pagado;
		this.morosidad = morosidad;
		this.cuentaid = cuentaid;
		this.loginid = loginid;
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
	 * Gets the cuentaid.
	 *
	 * @return the cuentaid
	 */
	public Cuenta getCuentaid() {
		return cuentaid;
	}

	/**
	 * Sets the cuentaid.
	 *
	 * @param cuentaid the new cuentaid
	 */
	public void setCuentaid(Cuenta cuentaid) {
		this.cuentaid = cuentaid;
	}

	/**
	 * Gets the loginid.
	 *
	 * @return the loginid
	 */
	public spring3.form.Login getLoginid() {
		return loginid;
	}

	/**
	 * Sets the loginid.
	 *
	 * @param loginid the new loginid
	 */
	public void setLoginid(spring3.form.Login loginid) {
		this.loginid = loginid;
	}

}

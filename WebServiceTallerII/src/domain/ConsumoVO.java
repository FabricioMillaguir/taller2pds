package domain;

import java.util.Calendar;
import java.util.Date;

/**
 * ConsumoVO
 * 
 * @author Fabricio
 * 
 */
public class ConsumoVO {

	private int id;
	private int cantidadConsumida;
	private boolean pagado;
	private boolean moroso;
	private Calendar fechaVencimiento;
	private int totalAPagar;
	private CuentaVO cuentaVO;
	private LoginVO loginVO;

	/**
	 * Constructor vacio de ConsumoVO
	 */
	public ConsumoVO() {

	}

	/**
	 * Constructor de ConsumoVO usando id
	 * 
	 * @param id
	 */
	public ConsumoVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de ConsumoVO sin id
	 * 
	 * @param cantidadConsumida
	 * @param pagado
	 * @param moroso
	 * @param fechaVencimiento
	 * @param totalAPagar
	 * @param cuentaVO
	 * @param loginVO
	 */
	public ConsumoVO(int cantidadConsumida, boolean pagado, boolean moroso,
			Calendar fechaVencimiento, int totalAPagar, CuentaVO cuentaVO,
			LoginVO loginVO) {
		this.cantidadConsumida = cantidadConsumida;
		this.pagado = pagado;
		this.moroso = moroso;
		this.fechaVencimiento = fechaVencimiento;
		this.totalAPagar = totalAPagar;
		this.cuentaVO = cuentaVO;
		this.loginVO = loginVO;
	}

	/**
	 * Constructor de ConsumoVO
	 * 
	 * @param id
	 * @param cantidadConsumida
	 * @param pagado
	 * @param moroso
	 * @param fechaVencimiento
	 * @param totalAPagar
	 * @param cuentaVO
	 * @param loginVO
	 */
	public ConsumoVO(int id, int cantidadConsumida, boolean pagado,
			boolean moroso, Calendar fechaVencimiento, int totalAPagar,
			CuentaVO cuentaVO, LoginVO loginVO) {
		this.id = id;
		this.cantidadConsumida = cantidadConsumida;
		this.pagado = pagado;
		this.moroso = moroso;
		this.fechaVencimiento = fechaVencimiento;
		this.totalAPagar = totalAPagar;
		this.cuentaVO = cuentaVO;
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
	 * Devuelve la cantidad consumida
	 * 
	 * @return
	 */
	public int getCantidadConsumida() {
		return cantidadConsumida;
	}

	/**
	 * Cambia la cantidad consumida
	 * 
	 * @param cantidadConsumida
	 */
	public void setCantidadConsumida(int cantidadConsumida) {
		this.cantidadConsumida = cantidadConsumida;
	}

	/**
	 * Devuelve true si el consumo esta pagado y false en caso contrario
	 * 
	 * @return
	 */
	public boolean isPagado() {
		return pagado;
	}

	/**
	 * Cambia el valor de pagado
	 * 
	 * @param pagado
	 */
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	/**
	 * Devuelve true si el consumo esta moroso y false en caso contrario
	 * 
	 * @return
	 */
	public boolean isMoroso() {
		return moroso;
	}

	/**
	 * Cambio el valor de moroso
	 * 
	 * @param moroso
	 */
	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	/**
	 * Devuelve la fecha de vencimiento
	 * 
	 * @return
	 */
	public Calendar getFechaVencimiento() {
		return fechaVencimiento;
	}

	/**
	 * Cambia la fecha de vencimiento
	 * 
	 * @param fechaVencimiento
	 */
	public void setFechaVencimiento(Calendar fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	/**
	 * Devuelve el total a pagar
	 * 
	 * @return
	 */
	public int getTotalAPagar() {
		return totalAPagar;
	}

	/**
	 * Cambia el total a pagar
	 * 
	 * @param totalAPagar
	 */
	public void setTotalAPagar(int totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	/**
	 * Devuelve CuentaVO a la que pertenece el consumo
	 * 
	 * @return
	 */
	public CuentaVO getCuentaVO() {
		return cuentaVO;
	}

	/**
	 * Cambia la cuenta a la que pertenece el ConsumoVO
	 * 
	 * @param cuentaVO
	 */
	public void setCuentaVO(CuentaVO cuentaVO) {
		this.cuentaVO = cuentaVO;
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
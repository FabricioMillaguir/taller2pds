package domain;

public class ConsumoVO {

	private int id;

	private int cantidadConsumida;

	private boolean pagado;

	private boolean moroso;

	private String fechaVencimiento;

	private int totalAPagar;

	private CuentaVO cuentaVO;

	private LoginVO loginVO;

	public ConsumoVO() {

	}

	public ConsumoVO(int id) {
		super();
		this.id = id;
	}

	public ConsumoVO(int cantidadConsumida, boolean pagado, boolean moroso,
			String fechaVencimiento, int totalAPagar, CuentaVO cuentaVO,
			LoginVO loginVO) {
		super();
		this.cantidadConsumida = cantidadConsumida;
		this.pagado = pagado;
		this.moroso = moroso;
		this.fechaVencimiento = fechaVencimiento;
		this.totalAPagar = totalAPagar;
		this.cuentaVO = cuentaVO;
		this.loginVO = loginVO;
	}

	public ConsumoVO(int id, int cantidadConsumida, boolean pagado,
			boolean moroso, String fechaVencimiento, int totalAPagar,
			CuentaVO cuentaVO, LoginVO loginVO) {
		super();
		this.id = id;
		this.cantidadConsumida = cantidadConsumida;
		this.pagado = pagado;
		this.moroso = moroso;
		this.fechaVencimiento = fechaVencimiento;
		this.totalAPagar = totalAPagar;
		this.cuentaVO = cuentaVO;
		this.loginVO = loginVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadConsumida() {
		return cantidadConsumida;
	}

	public void setCantidadConsumida(int cantidadConsumida) {
		this.cantidadConsumida = cantidadConsumida;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(int totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public CuentaVO getCuentaVO() {
		return cuentaVO;
	}

	public void setCuentaVO(CuentaVO cuentaVO) {
		this.cuentaVO = cuentaVO;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

}
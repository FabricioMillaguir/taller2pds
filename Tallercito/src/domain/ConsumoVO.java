package domain;

public class ConsumoVO {

	private int id;

	private int cantidadConsumida;

	private boolean pagado;

	private boolean moroso;

	private String fechaVencimiento;

	private int totalAPagar;

	private CuentaVO oCuentaVO;

	private LoginVO oLoginVO;

	public ConsumoVO() {

	}

	public ConsumoVO(int id, int cantidadConsumida, boolean pagado,
			boolean moroso, String fechaVencimiento, int totalAPagar,
			CuentaVO oCuentaVO, LoginVO oLoginVO) {
		this.id = id;
		this.cantidadConsumida = cantidadConsumida;
		this.pagado = pagado;
		this.moroso = moroso;
		this.fechaVencimiento = fechaVencimiento;
		this.totalAPagar = totalAPagar;
		this.oCuentaVO = oCuentaVO;
		this.oLoginVO = oLoginVO;

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

	public CuentaVO getoCuentaVO() {
		return oCuentaVO;
	}

	public void setoCuentaVO(CuentaVO oCuentaVO) {
		this.oCuentaVO = oCuentaVO;
	}

	public LoginVO getoLoginVO() {
		return oLoginVO;
	}

	public void setoLoginVO(LoginVO oLoginVO) {
		this.oLoginVO = oLoginVO;
	}

}
package spring3.form;

public class Consumo implements java.io.Serializable {

	private int consumo;
	private int monto;
	private boolean pagado;
	private boolean moroso;
	private Cuenta cuentaid;
	private spring3.form.Login loginid;

	public Consumo() {

	}

	public Consumo(int consumo, int monto, boolean pagado, boolean moroso,
			Cuenta cuentaid, spring3.form.Login loginid) {
		this.consumo = consumo;
		this.monto = monto;
		this.pagado = pagado;
		this.moroso = moroso;
		this.cuentaid = cuentaid;
		this.loginid = loginid;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
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

	public Cuenta getCuentaid() {
		return cuentaid;
	}

	public void setCuentaid(Cuenta cuentaid) {
		this.cuentaid = cuentaid;
	}

	public spring3.form.Login getLoginid() {
		return loginid;
	}

	public void setLoginid(spring3.form.Login loginid) {
		this.loginid = loginid;
	}

}

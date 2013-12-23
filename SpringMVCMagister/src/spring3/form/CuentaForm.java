package spring3.form;

import java.io.Serializable;

public class CuentaForm implements Serializable {

	private Object cuentas;

	public CuentaForm() {
	}

	public CuentaForm(Object cuentas) {
		this.cuentas = cuentas;
	}

	public Object getCuentas() {
		return cuentas;
	}

	public void setCuentas(Object cuentas) {
		this.cuentas = cuentas;
	}

}

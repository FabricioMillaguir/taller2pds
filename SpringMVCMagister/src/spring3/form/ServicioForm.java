package spring3.form;

import java.io.Serializable;

public class ServicioForm implements Serializable {

	private Object servicios;

	public ServicioForm(Object servicios) {
		this.servicios = servicios;
	}

	public ServicioForm() {
	}

	public Object getServicios() {
		return servicios;
	}

	public void setServicios(Object servicios) {
		this.servicios = servicios;
	}

}

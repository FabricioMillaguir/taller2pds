package spring3.form;

public class AdministradorForm implements java.io.Serializable {

	Object administradores;

	public AdministradorForm() {
	}

	public AdministradorForm(Object administradores) {
		this.administradores = administradores;
	}

	public Object getAdministradores() {
		return administradores;
	}

	public void setAdministradores(Object administradores) {
		this.administradores = administradores;
	}

}

package spring3.form;

public class Login implements java.io.Serializable {

	private java.lang.String token;

	private java.lang.String fecha_inicio;

	private java.lang.String fecha_fin;

	private spring3.form.Administrador administradorid;

	public Login() {

	}

	public Login(java.lang.String token, java.lang.String fecha_inicio,
			java.lang.String fecha_fin,
			spring3.form.Administrador administradorid) {
		this.token = token;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.administradorid = administradorid;
	}

	public java.lang.String getToken() {
		return token;
	}

	public void setToken(java.lang.String token) {
		this.token = token;
	}

	public java.lang.String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(java.lang.String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public java.lang.String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(java.lang.String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public spring3.form.Administrador getAdministradorid() {
		return administradorid;
	}

	public void setAdministradorid(spring3.form.Administrador administradorid) {
		this.administradorid = administradorid;
	}
}

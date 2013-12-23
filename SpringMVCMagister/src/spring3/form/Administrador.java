package spring3.form;

public class Administrador implements java.io.Serializable {

	private java.lang.String usuario;
	private java.lang.String clave;

	public Administrador() {

	}

	public Administrador(java.lang.String usuario, java.lang.String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	public java.lang.String getUsuario() {
		return usuario;
	}

	public void setUsuario(java.lang.String usuario) {
		this.usuario = usuario;
	}

	public java.lang.String getClave() {
		return clave;
	}

	public void setClave(java.lang.String clave) {
		this.clave = clave;
	}

}

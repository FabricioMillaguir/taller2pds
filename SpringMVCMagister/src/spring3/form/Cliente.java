package spring3.form;

public class Cliente implements java.io.Serializable {

	private int id;

	private java.lang.String nombre;

	private java.lang.String apellidoPaterno;

	private java.lang.String apellidoMaterno;

	private java.lang.String rut;

	private java.lang.String celular;

	private java.lang.String correo;

	private java.lang.String direccion;

	private spring3.form.Login loginid;

	public Cliente() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente(java.lang.String nombre, java.lang.String apellidoPaterno,
			java.lang.String apellidoMaterno, java.lang.String rut,
			java.lang.String celular, java.lang.String correo,
			java.lang.String direccion, spring3.form.Login loginid) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.loginid = loginid;
	}

	public java.lang.String getNombre() {
		return nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(java.lang.String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public java.lang.String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(java.lang.String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public java.lang.String getRut() {
		return rut;
	}

	public void setRut(java.lang.String rut) {
		this.rut = rut;
	}

	public java.lang.String getCelular() {
		return celular;
	}

	public void setCelular(java.lang.String celular) {
		this.celular = celular;
	}

	public java.lang.String getCorreo() {
		return correo;
	}

	public void setCorreo(java.lang.String correo) {
		this.correo = correo;
	}

	public java.lang.String getDireccion() {
		return direccion;
	}

	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	public spring3.form.Login getLoginid() {
		return loginid;
	}

	public void setLoginid(spring3.form.Login loginid) {
		this.loginid = loginid;
	}

}

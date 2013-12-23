package spring3.form;

public class Cliente implements java.io.Serializable {

	private int id;

	private java.lang.String nombre;

	private java.lang.String apellido_paterno;

	private java.lang.String apellido_materno;

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

	public Cliente(java.lang.String nombre, java.lang.String apellido_paterno,
			java.lang.String apellido_materno, java.lang.String rut,
			java.lang.String celular, java.lang.String correo,
			java.lang.String direccion, spring3.form.Login loginid) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
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

	public java.lang.String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(java.lang.String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public java.lang.String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(java.lang.String apellido_materno) {
		this.apellido_materno = apellido_materno;
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

package domain;

public class ClienteVO {

	private int id;

	private String nombre;

	private String apellido_paterno;

	private String apellido_materno;

	private String rut;

	private String celular;

	private String correo;

	private String direccion;

	private LoginVO oLoginVO;

	public ClienteVO() {

	}

	public ClienteVO(int id) {
		this.id = id;
	}

	public ClienteVO(int id, String nombre, String apellido_paterno,
			String apellido_materno, String rut, String celular, String correo,
			String direccion, LoginVO oLoginVO) {
		this.id = id;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.oLoginVO = oLoginVO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public LoginVO getoLoginVO() {
		return oLoginVO;
	}

	public void setoLoginVO(LoginVO oLoginVO) {
		this.oLoginVO = oLoginVO;
	}

	public void setId(int id) {
		this.id = id;
	}

}
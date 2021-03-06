package domain;

/**
 * ClienteVO
 * 
 * @author Fabricio
 * 
 */

public class ClienteVO {

	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String rut;
	private String celular;
	private String correo;
	private String direccion;
	private LoginVO loginVO;

	/**
	 * Constructor vacio de ClienteVO
	 */
	public ClienteVO() {

	}

	/**
	 * Constructor de ClienteVO usando id
	 * 
	 * @param id
	 */
	public ClienteVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de ClienteVO sin id
	 * 
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param rut
	 * @param celular
	 * @param correo
	 * @param direccion
	 * @param loginVO
	 */
	public ClienteVO(String nombre, String apellidoPaterno,
			String apellidoMaterno, String rut, String celular, String correo,
			String direccion, LoginVO loginVO) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.loginVO = loginVO;
	}

	/**
	 * Constructor de ClienteVO
	 * 
	 * @param id
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param rut
	 * @param celular
	 * @param correo
	 * @param direccion
	 * @param loginVO
	 */
	public ClienteVO(int id, String nombre, String apellidoPaterno,
			String apellidoMaterno, String rut, String celular, String correo,
			String direccion, LoginVO loginVO) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.loginVO = loginVO;
	}

	/**
	 * Devuelve el id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Cambia el id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el Apellido Paterno
	 * 
	 * @return
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * Cambia el Apellido Paterno
	 * 
	 * @param apellidoPaterno
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * Devuelve el Apellido Materno
	 * 
	 * @return
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * Cambia el Apellido Materno
	 * 
	 * @param apellidoMaterno
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * Devuelve el rut
	 * 
	 * @return
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * Cambia el rut
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * Devuelve el numero de Celular
	 * 
	 * @return
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Cambia el numero de Celular
	 * 
	 * @param celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * Devuelve el correo electronico
	 * 
	 * @return
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Cambia el correo electronico
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Devuelve la direccion
	 * 
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Cambia la direccion
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Devuelve el LoginVO
	 * 
	 * @return
	 */
	public LoginVO getLoginVO() {
		return loginVO;
	}

	/**
	 * Cambia el LoginVO
	 * 
	 * @param loginVO
	 */
	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

}
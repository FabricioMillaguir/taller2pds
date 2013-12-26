package domain;

import java.util.Calendar;

/**
 * Cambio Historico del Cliente
 * 
 * @author Fabricio
 * 
 */
public class ClienteHistoricoVO {

	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String rut;
	private String celular;
	private String correo;
	private String direccion;
	private Calendar fechaDeCambio;
	private ClienteVO clienteVO;
	private LoginVO loginVO;

	/**
	 * Constructor vacio Cliente Historico VO
	 */
	public ClienteHistoricoVO() {
	}

	/**
	 * Constructor de Cliente Historico VO usando el id
	 * 
	 * @param id
	 */
	public ClienteHistoricoVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de Cliente Historico sin id
	 * 
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param rut
	 * @param celular
	 * @param correo
	 * @param direccion
	 * @param fechaDeCambio
	 * @param clienteVO
	 * @param loginVO
	 */
	public ClienteHistoricoVO(String nombre, String apellidoPaterno,
			String apellidoMaterno, String rut, String celular, String correo,
			String direccion, Calendar fechaDeCambio, ClienteVO clienteVO,
			LoginVO loginVO) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.fechaDeCambio = fechaDeCambio;
		this.clienteVO = clienteVO;
		this.loginVO = loginVO;
	}

	/**
	 * Constructor Cliente Historico VO
	 * 
	 * @param id
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param rut
	 * @param celular
	 * @param correo
	 * @param direccion
	 * @param fechaDeCambio
	 * @param clienteVO
	 * @param loginVO
	 */
	public ClienteHistoricoVO(int id, String nombre, String apellidoPaterno,
			String apellidoMaterno, String rut, String celular, String correo,
			String direccion, Calendar fechaDeCambio, ClienteVO clienteVO,
			LoginVO loginVO) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.fechaDeCambio = fechaDeCambio;
		this.clienteVO = clienteVO;
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
	 * Cambia el valor del id
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
	 * Cambia el valor del rut
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
	 * Cambia el valor del correo electronico
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
	 * Devuelve la fecha en que se realizo el cambio
	 * 
	 * @return
	 */
	public Calendar getFechaDeCambio() {
		return fechaDeCambio;
	}

	/**
	 * Cambia la fecha en que se realizo el cambio
	 * 
	 * @param fechaDeCambio
	 */
	public void setFechaDeCambio(Calendar fechaDeCambio) {
		this.fechaDeCambio = fechaDeCambio;
	}

	/**
	 * Devuelve el ClienteVO
	 * 
	 * @return
	 */
	public ClienteVO getClienteVO() {
		return clienteVO;
	}

	/**
	 * Cambia el ClienteVO
	 * 
	 * @param clienteVO
	 */
	public void setClienteVO(ClienteVO clienteVO) {
		this.clienteVO = clienteVO;
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
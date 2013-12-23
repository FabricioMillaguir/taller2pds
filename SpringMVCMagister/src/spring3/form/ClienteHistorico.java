package spring3.form;

import java.io.Serializable;
import java.util.Date;

import webservice.ServicioGastosComunesStub.ClienteVO;
import webservice.ServicioGastosComunesStub.LoginVO;

public class ClienteHistorico implements Serializable{

	private int id;
	private String rut;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String celular;
	private String correo;
	private String direccion;
	private Date fechaCambio;
	private ClienteVO clienteVO;
	private LoginVO loginVO;

	public ClienteHistorico() {
	}

	public ClienteHistorico(int id) {
		this.id = id;
	}

	public ClienteHistorico(String rut, String nombre, String apellido_paterno,
			String apellido_materno, String celular, String correo,
			String direccion, Date fechaCambio, ClienteVO clienteVO,
			LoginVO loginVO) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.fechaCambio = fechaCambio;
		this.clienteVO = clienteVO;
		this.loginVO = loginVO;
	}

	public ClienteHistorico(int id, String rut, String nombre,
			String apellido_paterno, String apellido_materno, String celular,
			String correo, String direccion, Date fechaCambio,
			ClienteVO clienteVO, LoginVO loginVO) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.fechaCambio = fechaCambio;
		this.clienteVO = clienteVO;
		this.loginVO = loginVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public ClienteVO getClienteVO() {
		return clienteVO;
	}

	public void setClienteVO(ClienteVO clienteVO) {
		this.clienteVO = clienteVO;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

}

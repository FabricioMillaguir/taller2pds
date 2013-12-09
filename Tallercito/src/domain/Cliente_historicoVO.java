package domain;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */
/**
 * The Class Cliente_historicoVO.
 */
public class Cliente_historicoVO {

	/** The nombre. */
	private String nombre;
	
	/** The apellido_paterno. */
	private String apellido_paterno;
	
	/** The apellido_materno. */
	private String apellido_materno;
	
	/** The rut. */
	private String rut;
	
	/** The celular. */
	private String celular;
	
	/** The correo. */
	private String correo;
	
	/** The direccion. */
	private String direccion;
	
	/** The activa. */
	private int activa;
	
	/** The o cliente vo. */
	private ClienteVO oClienteVO;
	
	/** The o login vo. */
	private LoginVO oLoginVO;

	/**
	 * Instantiates a new cliente_historico vo.
	 */
	public Cliente_historicoVO(){

	}

	/**
	 * Instantiates a new cliente_historico vo.
	 *
	 * @param nombre the nombre
	 * @param apellido_paterno the apellido_paterno
	 * @param apellido_materno the apellido_materno
	 * @param rut the rut
	 * @param celular the celular
	 * @param correo the correo
	 * @param direccion the direccion
	 * @param oClienteVO the o cliente vo
	 * @param oLoginVO the o login vo
	 */
	public Cliente_historicoVO(String nombre, String apellido_paterno,
			String apellido_materno, String rut, String celular, String correo,
			String direccion, ClienteVO oClienteVO, LoginVO oLoginVO) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.oClienteVO = oClienteVO;
		this.oLoginVO = oLoginVO;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellido_paterno.
	 *
	 * @return the apellido_paterno
	 */
	public String getApellido_paterno() {
		return apellido_paterno;
	}

	/**
	 * Sets the apellido_paterno.
	 *
	 * @param apellido_paterno the new apellido_paterno
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	/**
	 * Gets the apellido_materno.
	 *
	 * @return the apellido_materno
	 */
	public String getApellido_materno() {
		return apellido_materno;
	}

	/**
	 * Sets the apellido_materno.
	 *
	 * @param apellido_materno the new apellido_materno
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	/**
	 * Gets the rut.
	 *
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * Sets the rut.
	 *
	 * @param rut the new rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * Gets the celular.
	 *
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Sets the celular.
	 *
	 * @param celular the new celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * Gets the correo.
	 *
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Sets the correo.
	 *
	 * @param correo the new correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/*public int getActiva() {
		return activa;
	}

	public void setActiva(int activa) {
		this.activa = activa;
	}*/

	/**
	 * Gets the o cliente vo.
	 *
	 * @return the o cliente vo
	 */
	public ClienteVO getoClienteVO() {
		return oClienteVO;
	}

	/**
	 * Sets the o cliente vo.
	 *
	 * @param oClienteVO the new o cliente vo
	 */
	public void setoClienteVO(ClienteVO oClienteVO) {
		this.oClienteVO = oClienteVO;
	}

	/**
	 * Gets the o login vo.
	 *
	 * @return the o login vo
	 */
	public LoginVO getoLoginVO() {
		return oLoginVO;
	}

	/**
	 * Sets the o login vo.
	 *
	 * @param oLoginVO the new o login vo
	 */
	public void setoLoginVO(LoginVO oLoginVO) {
		this.oLoginVO = oLoginVO;
	}
	
}
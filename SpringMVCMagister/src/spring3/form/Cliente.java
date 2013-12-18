package spring3.form;

public class Cliente implements java.io.Serializable {
	
	private int id;
	
	/** The nombre. */
	private java.lang.String nombre;
	
	/** The apellido_paterno. */
	private java.lang.String apellido_paterno;
	
	/** The apellido_materno. */
	private java.lang.String apellido_materno;
	
	/** The rut. */
	private java.lang.String rut;
	
	/** The celular. */
	private java.lang.String celular;
	
	/** The correo. */
	private java.lang.String correo;
	
	/** The direccion. */
	private java.lang.String direccion;
	
	/** The loginid. */
	private spring3.form.Login loginid;

	
	/**
	 * Instantiates a new cliente.
	 */
	public Cliente(){
		
	}
	
	/**
	 * Instantiates a new cliente.
	 *
	 * @param nombre the nombre
	 * @param apellido_paterno the apellido_paterno
	 * @param apellido_materno the apellido_materno
	 * @param rut the rut
	 * @param celular the celular
	 * @param correo the correo
	 * @param direccion the direccion
	 * @param loginid the loginid
	 */
	public Cliente(java.lang.String nombre, java.lang.String apellido_paterno, java.lang.String apellido_materno,
			java.lang.String rut,java.lang.String celular,java.lang.String correo,java.lang.String direccion, spring3.form.Login loginid){
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.rut = rut;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.loginid = loginid;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public java.lang.String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellido_paterno.
	 *
	 * @return the apellido_paterno
	 */
	public java.lang.String getApellido_paterno() {
		return apellido_paterno;
	}

	/**
	 * Sets the apellido_paterno.
	 *
	 * @param apellido_paterno the new apellido_paterno
	 */
	public void setApellido_paterno(java.lang.String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	/**
	 * Gets the apellido_materno.
	 *
	 * @return the apellido_materno
	 */
	public java.lang.String getApellido_materno() {
		return apellido_materno;
	}

	/**
	 * Sets the apellido_materno.
	 *
	 * @param apellido_materno the new apellido_materno
	 */
	public void setApellido_materno(java.lang.String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	/**
	 * Gets the rut.
	 *
	 * @return the rut
	 */
	public java.lang.String getRut() {
		return rut;
	}

	/**
	 * Sets the rut.
	 *
	 * @param rut the new rut
	 */
	public void setRut(java.lang.String rut) {
		this.rut = rut;
	}

	/**
	 * Gets the celular.
	 *
	 * @return the celular
	 */
	public java.lang.String getCelular() {
		return celular;
	}

	/**
	 * Sets the celular.
	 *
	 * @param celular the new celular
	 */
	public void setCelular(java.lang.String celular) {
		this.celular = celular;
	}

	/**
	 * Gets the correo.
	 *
	 * @return the correo
	 */
	public java.lang.String getCorreo() {
		return correo;
	}

	/**
	 * Sets the correo.
	 *
	 * @param correo the new correo
	 */
	public void setCorreo(java.lang.String correo) {
		this.correo = correo;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public java.lang.String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the loginid.
	 *
	 * @return the loginid
	 */
	public spring3.form.Login getLoginid() {
		return loginid;
	}

	/**
	 * Sets the loginid.
	 *
	 * @param loginid the new loginid
	 */
	public void setLoginid(spring3.form.Login loginid) {
		this.loginid = loginid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}

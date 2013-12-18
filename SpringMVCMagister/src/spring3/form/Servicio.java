package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */
/**
 * The Class Servicio.
 */
public class Servicio implements java.io.Serializable {

	/** The tipo_servicio. */
	private java.lang.String tipo_servicio;
	
	/** The valor_unitario. */
	private java.lang.String valor_unitario;
	
	/** The valor_fijo. */
	private java.lang.String valor_fijo;
	
	/**
	 * Instantiates a new servicio.
	 */
	public Servicio(){
		
	}
	
	/**
	 * Instantiates a new servicio.
	 *
	 * @param tipo_servicio the tipo_servicio
	 * @param valor_unitario the valor_unitario
	 * @param valor_fijo the valor_fijo
	 */
	public Servicio(java.lang.String tipo_servicio, java.lang.String valor_unitario, java.lang.String valor_fijo){
		this.tipo_servicio = tipo_servicio;
		this.valor_unitario = valor_unitario;
		this.valor_fijo = valor_fijo;
	}

	/**
	 * Gets the tipo_servicio.
	 *
	 * @return the tipo_servicio
	 */
	public java.lang.String getTipo_servicio() {
		return tipo_servicio;
	}

	/**
	 * Sets the tipo_servicio.
	 *
	 * @param tipo_servicio the new tipo_servicio
	 */
	public void setTipo_servicio(java.lang.String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	/**
	 * Gets the valor_unitario.
	 *
	 * @return the valor_unitario
	 */
	public java.lang.String getValor_unitario() {
		return valor_unitario;
	}

	/**
	 * Sets the valor_unitario.
	 *
	 * @param valor_unitario the new valor_unitario
	 */
	public void setValor_unitario(java.lang.String valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	/**
	 * Gets the valor_fijo.
	 *
	 * @return the valor_fijo
	 */
	public java.lang.String getValor_fijo() {
		return valor_fijo;
	}

	/**
	 * Sets the valor_fijo.
	 *
	 * @param valor_fijo the new valor_fijo
	 */
	public void setValor_fijo(java.lang.String valor_fijo) {
		this.valor_fijo = valor_fijo;
	}
	
}

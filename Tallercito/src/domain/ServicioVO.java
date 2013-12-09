package domain;

// TODO: Auto-generated Javadoc
/**
 * @author Diego Solis San Martin
 */
/**
 * The Class ServicioVO.
 */
public class ServicioVO {

	/** The tipo_servicio. */
	private String tipo_servicio;
	
	/** The valor_servicio. */
	private int valor_servicio;
	
	/** The valor_fijo. */
	private int valor_fijo;
	
	/**
	 * Instantiates a new servicio vo.
	 */
	public ServicioVO(){
		
	}
	
	/**
	 * Instantiates a new servicio vo.
	 *
	 * @param tipo_servicio the tipo_servicio
	 * @param valor_servicio the valor_servicio
	 * @param valor_fijo the valor_fijo
	 */
	public ServicioVO(String tipo_servicio, int valor_servicio, int valor_fijo){
		this.tipo_servicio = tipo_servicio;
		this.valor_servicio = valor_servicio;
		this.valor_fijo = valor_fijo;
	}

	/**
	 * Gets the tipo_servicio.
	 *
	 * @return the tipo_servicio
	 */
	public String getTipo_servicio() {
		return tipo_servicio;
	}

	/**
	 * Sets the tipo_servicio.
	 *
	 * @param tipo_servicio the new tipo_servicio
	 */
	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	/**
	 * Gets the valor_servicio.
	 *
	 * @return the valor_servicio
	 */
	public int getValor_servicio() {
		return valor_servicio;
	}

	/**
	 * Sets the valor_servicio.
	 *
	 * @param valor_servicio the new valor_servicio
	 */
	public void setValor_servicio(int valor_servicio) {
		this.valor_servicio = valor_servicio;
	}

	/**
	 * Gets the valor_fijo.
	 *
	 * @return the valor_fijo
	 */
	public int getValor_fijo() {
		return valor_fijo;
	}

	/**
	 * Sets the valor_fijo.
	 *
	 * @param valor_fijo the new valor_fijo
	 */
	public void setValor_fijo(int valor_fijo) {
		this.valor_fijo = valor_fijo;
	}
	
}

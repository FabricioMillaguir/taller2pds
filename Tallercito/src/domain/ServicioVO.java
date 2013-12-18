package domain;

public class ServicioVO {

	private int id;

	/** The tipo_servicio. */
	private String tipo_servicio;

	/** The valor_servicio. */
	private int valor_servicio;

	/** The valor_fijo. */
	private int cargo_fijo;

	private String unidadDeMedida;

	/**
	 * Instantiates a new servicio vo.
	 */
	public ServicioVO() {

	}

	/**
	 * Instantiates a new servicio vo.
	 * 
	 * @param tipo_servicio
	 *            the tipo_servicio
	 * @param valor_servicio
	 *            the valor_servicio
	 * @param valor_fijo
	 *            the valor_fijo
	 */
	public ServicioVO(int id, String tipo_servicio, int valor_servicio,
			int cargo_fijo, String unidadDeMedida) {
		this.id = id;
		this.tipo_servicio = tipo_servicio;
		this.valor_servicio = valor_servicio;
		this.cargo_fijo = cargo_fijo;
		this.unidadDeMedida = unidadDeMedida;
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
	 * @param tipo_servicio
	 *            the new tipo_servicio
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
	 * @param valor_servicio
	 *            the new valor_servicio
	 */
	public void setValor_servicio(int valor_servicio) {
		this.valor_servicio = valor_servicio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCargo_fijo() {
		return cargo_fijo;
	}

	public void setCargo_fijo(int cargo_fijo) {
		this.cargo_fijo = cargo_fijo;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

}

package domain;

/**
 * ServicioVO
 * 
 * @author Fabricio
 * 
 */
public class ServicioVO {

	private int id;
	private String tipoDeServicio;
	private String unidadDeMedida;
	private int valorUnitario;
	private int cargoFijo;

	/**
	 * Constructor vacio de ServicioVO
	 */
	public ServicioVO() {
	}

	/**
	 * Constructor de ServicioVO con el id
	 * 
	 * @param id
	 */
	public ServicioVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de ServicioVO sin el id
	 * 
	 * @param tipoDeServicio
	 * @param unidadDeMedida
	 * @param valorUnitario
	 * @param cargoFijo
	 */
	public ServicioVO(String tipoDeServicio, String unidadDeMedida,
			int valorUnitario, int cargoFijo) {
		this.tipoDeServicio = tipoDeServicio;
		this.unidadDeMedida = unidadDeMedida;
		this.valorUnitario = valorUnitario;
		this.cargoFijo = cargoFijo;
	}

	/**
	 * Constructor de ServicioVO
	 * 
	 * @param id
	 * @param tipoDeServicio
	 * @param unidadDeMedida
	 * @param valorUnitario
	 * @param cargoFijo
	 */
	public ServicioVO(int id, String tipoDeServicio, String unidadDeMedida,
			int valorUnitario, int cargoFijo) {
		this.id = id;
		this.tipoDeServicio = tipoDeServicio;
		this.unidadDeMedida = unidadDeMedida;
		this.valorUnitario = valorUnitario;
		this.cargoFijo = cargoFijo;
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
	 * Devuelve el tipo de servicio
	 * 
	 * @return
	 */
	public String getTipoDeServicio() {
		return tipoDeServicio;
	}

	/**
	 * Cambia el tipo de servicio
	 * 
	 * @param tipoDeServicio
	 */
	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	/**
	 * Devuelve la unidad de medida
	 * 
	 * @return
	 */
	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	/**
	 * Cambia la unidad de medida
	 * 
	 * @param unidadDeMedida
	 */
	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	/**
	 * Devuelve el valor unitario
	 * 
	 * @return
	 */
	public int getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * Cambia el valor unitario
	 * 
	 * @param valorUnitario
	 */
	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	/**
	 * Devuelve el cargo fijo
	 * 
	 * @return
	 */
	public int getCargoFijo() {
		return cargoFijo;
	}

	/**
	 * Cambia el cargo fijo
	 * 
	 * @param cargoFijo
	 */
	public void setCargoFijo(int cargoFijo) {
		this.cargoFijo = cargoFijo;
	}

}

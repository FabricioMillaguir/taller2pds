package spring3.form;

public class Servicio {

	private int id;
	private String tipoDeServicio;
	private String unidadDeMedida;
	private int valorUnitario;
	private int cargoFijo;

	public Servicio() {
	}

	public Servicio(int id) {
		super();
		this.id = id;
	}

	public Servicio(int id, String tipoDeServicio, String unidadDeMedida,
			int valorUnitario, int cargoFijo) {
		this.id = id;
		this.tipoDeServicio = tipoDeServicio;
		this.unidadDeMedida = unidadDeMedida;
		this.valorUnitario = valorUnitario;
		this.cargoFijo = cargoFijo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoDeServicio() {
		return tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCargoFijo() {
		return cargoFijo;
	}

	public void setCargoFijo(int cargoFijo) {
		this.cargoFijo = cargoFijo;
	}

}

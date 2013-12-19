package domain;

public class AdministradorVO {

	private int id;

	private String usuario;

	private String clave;

	public AdministradorVO() {

	}

	public AdministradorVO(int id, String usuario, String clave) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.clave = clave;
	}

	public AdministradorVO(int id) {
		super();
		this.id = id;
	}

	public AdministradorVO(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

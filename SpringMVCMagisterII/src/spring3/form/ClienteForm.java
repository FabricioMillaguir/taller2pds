package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * The Class ClienteForm.
 */
public class ClienteForm implements java.io.Serializable{
	
	/** The clientes. */
	private java.lang.Object clientes;
	
	/**
	 * Instantiates a new cliente form.
	 */
	public ClienteForm(){
		
	}
	
	/**
	 * Instantiates a new cliente form.
	 *
	 * @param clientes the clientes
	 */
	public ClienteForm(java.lang.Object clientes){
		this.clientes = clientes;
	}

	/**
	 * Gets the clientes.
	 *
	 * @return the clientes
	 */
	public java.lang.Object getClientes() {
		return clientes;
	}

	/**
	 * Sets the clientes.
	 *
	 * @param clientes the new clientes
	 */
	public void setClientes(java.lang.Object clientes) {
		this.clientes = clientes;
	}
}

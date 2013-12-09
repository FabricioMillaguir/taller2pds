package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * The Class ClienteForm.
 */
public class ClienteForm implements java.io.Serializable{
	
	/** The clients. */
	private java.lang.Object clients;
	
	/**
	 * Instantiates a new cliente form.
	 */
	public ClienteForm(){
		
	}
	
	/**
	 * Instantiates a new cliente form.
	 *
	 * @param clients the clients
	 */
	public ClienteForm(java.lang.Object clients){
		this.clients = clients;
	}

	/**
	 * Gets the clients.
	 *
	 * @return the clients
	 */
	public java.lang.Object getClients() {
		return clients;
	}

	/**
	 * Sets the clients.
	 *
	 * @param clients the new clients
	 */
	public void setClients(java.lang.Object clients) {
		this.clients = clients;
	}
}

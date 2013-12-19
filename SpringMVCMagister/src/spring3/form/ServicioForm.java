package spring3.form;


public class ServicioForm implements java.io.Serializable{
	
	/** The services. */
	private java.lang.Object services;
	
	/**
	 * Instantiates a new servicio form.
	 */
	public ServicioForm(){
		
	}
	
	/**
	 * Instantiates a new servicio form.
	 *
	 * @param services the services
	 */
	public ServicioForm(java.lang.Object services){
		this.services = services;
	}

	/**
	 * Gets the services.
	 *
	 * @return the services
	 */
	public java.lang.Object getServices() {
		return services;
	}

	/**
	 * Sets the services.
	 *
	 * @param services the new services
	 */
	public void setServices(java.lang.Object services) {
		this.services = services;
	}
	
	
}

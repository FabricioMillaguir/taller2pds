package spring3.form;


public class AdministradorForm implements java.io.Serializable {
	
	/** The admins. */
	private java.lang.Object admins;
	
	/**
	 * Instantiates a new administrador form.
	 */
	public AdministradorForm(){
		
	}
	
	/**
	 * Instantiates a new administrador form.
	 *
	 * @param admins the admins
	 */
	public AdministradorForm(java.lang.Object admins){
		this.admins = admins;
	}

	/**
	 * Gets the admins.
	 *
	 * @return the admins
	 */
	public java.lang.Object getAdmins() {
		return admins;
	}

	/**
	 * Sets the admins.
	 *
	 * @param admins the new admins
	 */
	public void setAdmins(java.lang.Object admins) {
		this.admins = admins;
	}
	
	

}

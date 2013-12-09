package spring3.form;
// TODO: Auto-generated Javadoc

/**
 * The Class ConsumoForm.
 *
 * @author Diego Solis San Martin
 */

public class ConsumoForm implements java.io.Serializable{
	
	/** The consumos. */
	private java.lang.Object consumos;
	
	/**
	 * Instantiates a new consumo form.
	 */
	public ConsumoForm(){
		
	}
	
	/**
	 * Instantiates a new consumo form.
	 *
	 * @param consumos the consumos
	 */
	public ConsumoForm(java.lang.Object consumos){
		this.consumos = consumos;
	}

	/**
	 * Gets the consumos.
	 *
	 * @return the consumos
	 */
	public java.lang.Object getConsumos() {
		return consumos;
	}

	/**
	 * Sets the consumos.
	 *
	 * @param consumos the new consumos
	 */
	public void setConsumos(java.lang.Object consumos) {
		this.consumos = consumos;
	}
	
	

}

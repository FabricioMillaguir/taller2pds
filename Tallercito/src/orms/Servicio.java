/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orms;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Servicio")
public class Servicio implements Serializable {
	public Servicio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orms.ORMConstants.KEY_SERVICIO_CUENTA) {
			return ORM_cuenta;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORMS_SERVICIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_SERVICIO_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="tipo_servicio", nullable=false, length=5)	
	private String tipo_servicio;
	
	@Column(name="valor_unitario", nullable=true, length=10)	
	private Integer valor_unitario;
	
	@Column(name="valor_fijo", nullable=true, length=10)	
	private Integer valor_fijo;
	
	@OneToMany(mappedBy="servicio", targetEntity=orms.Cuenta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cuenta = new java.util.HashSet();
	
	/**
	 * llave primaria servicio
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * llave primaria servicio
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * tipo servicio
	 */
	public void setTipo_servicio(String value) {
		this.tipo_servicio = value;
	}
	
	/**
	 * tipo servicio
	 */
	public String getTipo_servicio() {
		return tipo_servicio;
	}
	
	/**
	 * valor unitario servicio
	 */
	public void setValor_unitario(int value) {
		setValor_unitario(new Integer(value));
	}
	
	/**
	 * valor unitario servicio
	 */
	public void setValor_unitario(Integer value) {
		this.valor_unitario = value;
	}
	
	/**
	 * valor unitario servicio
	 */
	public Integer getValor_unitario() {
		return valor_unitario;
	}
	
	/**
	 * valor fijo del servicio
	 */
	public void setValor_fijo(int value) {
		setValor_fijo(new Integer(value));
	}
	
	/**
	 * valor fijo del servicio
	 */
	public void setValor_fijo(Integer value) {
		this.valor_fijo = value;
	}
	
	/**
	 * valor fijo del servicio
	 */
	public Integer getValor_fijo() {
		return valor_fijo;
	}
	
	private void setORM_Cuenta(java.util.Set value) {
		this.ORM_cuenta = value;
	}
	
	private java.util.Set getORM_Cuenta() {
		return ORM_cuenta;
	}
	
	@Transient	
	public final orms.CuentaSetCollection cuenta = new orms.CuentaSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_SERVICIO_CUENTA, orms.ORMConstants.KEY_CUENTA_SERVICIO, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

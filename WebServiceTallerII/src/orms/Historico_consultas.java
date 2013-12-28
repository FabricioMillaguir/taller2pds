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
@Table(name="Historico_consultas")
public class Historico_consultas implements Serializable {
	public Historico_consultas() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orms.ORMConstants.KEY_HISTORICO_CONSULTAS_CLIENTE) {
			this.cliente = (orms.Cliente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORMS_HISTORICO_CONSULTAS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_HISTORICO_CONSULTAS_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="fecha_consulta", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha_consulta;
	
	@ManyToOne(targetEntity=orms.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Clienteid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Cliente cliente;
	
	/**
	 * Id del historico de consultas
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id del historico de consultas
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Fecha de la consulta
	 */
	public void setFecha_consulta(java.util.Date value) {
		this.fecha_consulta = value;
	}
	
	/**
	 * Fecha de la consulta
	 */
	public java.util.Date getFecha_consulta() {
		return fecha_consulta;
	}
	
	public void setCliente(orms.Cliente value) {
		if (cliente != null) {
			cliente.historico_consultas.remove(this);
		}
		if (value != null) {
			value.historico_consultas.add(this);
		}
	}
	
	public orms.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(orms.Cliente value) {
		this.cliente = value;
	}
	
	private orms.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

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
/**
 * Cuenta
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cuenta")
public class Cuenta implements Serializable {
	public Cuenta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orms.ORMConstants.KEY_CUENTA_CONSUMO) {
			return ORM_consumo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orms.ORMConstants.KEY_CUENTA_CLIENTE) {
			this.cliente = (orms.Cliente) owner;
		}
		
		else if (key == orms.ORMConstants.KEY_CUENTA_SERVICIO) {
			this.servicio = (orms.Servicio) owner;
		}
		
		else if (key == orms.ORMConstants.KEY_CUENTA_LOGIN) {
			this.login = (orms.Login) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORMS_CUENTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_CUENTA_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="habilitada", nullable=false)	
	private Boolean habilitada;
	
	@ManyToOne(targetEntity=orms.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Clienteid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Cliente cliente;
	
	@ManyToOne(targetEntity=orms.Servicio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Servicioid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Servicio servicio;
	
	@ManyToOne(targetEntity=orms.Login.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Loginid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Login login;
	
	@OneToMany(mappedBy="cuenta", targetEntity=orms.Consumo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_consumo = new java.util.HashSet();
	
	/**
	 * Id de la Cuenta
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id de la Cuenta
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Habilitada si o no
	 */
	public void setHabilitada(boolean value) {
		setHabilitada(new Boolean(value));
	}
	
	/**
	 * Habilitada si o no
	 */
	public void setHabilitada(Boolean value) {
		this.habilitada = value;
	}
	
	/**
	 * Habilitada si o no
	 */
	public Boolean getHabilitada() {
		return habilitada;
	}
	
	public void setCliente(orms.Cliente value) {
		if (cliente != null) {
			cliente.cuenta.remove(this);
		}
		if (value != null) {
			value.cuenta.add(this);
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
	
	public void setServicio(orms.Servicio value) {
		if (servicio != null) {
			servicio.cuenta.remove(this);
		}
		if (value != null) {
			value.cuenta.add(this);
		}
	}
	
	public orms.Servicio getServicio() {
		return servicio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Servicio(orms.Servicio value) {
		this.servicio = value;
	}
	
	private orms.Servicio getORM_Servicio() {
		return servicio;
	}
	
	public void setLogin(orms.Login value) {
		if (login != null) {
			login.cuenta.remove(this);
		}
		if (value != null) {
			value.cuenta.add(this);
		}
	}
	
	public orms.Login getLogin() {
		return login;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Login(orms.Login value) {
		this.login = value;
	}
	
	private orms.Login getORM_Login() {
		return login;
	}
	
	private void setORM_Consumo(java.util.Set value) {
		this.ORM_consumo = value;
	}
	
	private java.util.Set getORM_Consumo() {
		return ORM_consumo;
	}
	
	@Transient	
	public final orms.ConsumoSetCollection consumo = new orms.ConsumoSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_CUENTA_CONSUMO, orms.ORMConstants.KEY_CONSUMO_CUENTA, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

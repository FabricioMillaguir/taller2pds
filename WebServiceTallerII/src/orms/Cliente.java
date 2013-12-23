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
 * Cliente
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cliente")
public class Cliente implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orms.ORMConstants.KEY_CLIENTE_CLIENTE_HISTORICO) {
			return ORM_cliente_historico;
		}
		else if (key == orms.ORMConstants.KEY_CLIENTE_CUENTA) {
			return ORM_cuenta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orms.ORMConstants.KEY_CLIENTE_LOGINTOKEN) {
			this.logintoken = (orms.Login) owner;
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
	@GeneratedValue(generator="ORMS_CLIENTE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_CLIENTE_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="nombre", nullable=false, length=30)	
	private String nombre;
	
	@Column(name="apellido_paterno", nullable=false, length=20)	
	private String apellido_paterno;
	
	@Column(name="apellido_materno", nullable=false, length=20)	
	private String apellido_materno;
	
	@Column(name="rut", nullable=false, length=10)	
	private String rut;
	
	@Column(name="celular", nullable=false, length=10)	
	private String celular;
	
	@Column(name="correo", nullable=false, length=50)	
	private String correo;
	
	@Column(name="direccion", nullable=false, length=50)	
	private String direccion;
	
	@ManyToOne(targetEntity=orms.Login.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Logintoken", referencedColumnName="token", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Login logintoken;
	
	@OneToMany(mappedBy="cliente", targetEntity=orms.Cliente_historico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente_historico = new java.util.HashSet();
	
	@OneToMany(mappedBy="cliente", targetEntity=orms.Cuenta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cuenta = new java.util.HashSet();
	
	/**
	 * Id del Cliente
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id del Cliente
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Nombre del Cliente
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre del Cliente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Apellido Paterno del Cliente
	 */
	public void setApellido_paterno(String value) {
		this.apellido_paterno = value;
	}
	
	/**
	 * Apellido Paterno del Cliente
	 */
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	
	/**
	 * Apellido Materno del Cliente
	 */
	public void setApellido_materno(String value) {
		this.apellido_materno = value;
	}
	
	/**
	 * Apellido Materno del Cliente
	 */
	public String getApellido_materno() {
		return apellido_materno;
	}
	
	/**
	 * Rut del Cliente
	 */
	public void setRut(String value) {
		this.rut = value;
	}
	
	/**
	 * Rut del Cliente
	 */
	public String getRut() {
		return rut;
	}
	
	/**
	 * Celular del Cliente
	 */
	public void setCelular(String value) {
		this.celular = value;
	}
	
	/**
	 * Celular del Cliente
	 */
	public String getCelular() {
		return celular;
	}
	
	/**
	 * Correo del Cliente
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	/**
	 * Correo del Cliente
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * Direccion del Cliente
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	/**
	 * Direccion del Cliente
	 */
	public String getDireccion() {
		return direccion;
	}
	
	public void setLogintoken(orms.Login value) {
		if (logintoken != null) {
			logintoken.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
		}
	}
	
	public orms.Login getLogintoken() {
		return logintoken;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Logintoken(orms.Login value) {
		this.logintoken = value;
	}
	
	private orms.Login getORM_Logintoken() {
		return logintoken;
	}
	
	private void setORM_Cliente_historico(java.util.Set value) {
		this.ORM_cliente_historico = value;
	}
	
	private java.util.Set getORM_Cliente_historico() {
		return ORM_cliente_historico;
	}
	
	@Transient	
	public final orms.Cliente_historicoSetCollection cliente_historico = new orms.Cliente_historicoSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_CLIENTE_CLIENTE_HISTORICO, orms.ORMConstants.KEY_CLIENTE_HISTORICO_CLIENTE, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cuenta(java.util.Set value) {
		this.ORM_cuenta = value;
	}
	
	private java.util.Set getORM_Cuenta() {
		return ORM_cuenta;
	}
	
	@Transient	
	public final orms.CuentaSetCollection cuenta = new orms.CuentaSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_CLIENTE_CUENTA, orms.ORMConstants.KEY_CUENTA_CLIENTE, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

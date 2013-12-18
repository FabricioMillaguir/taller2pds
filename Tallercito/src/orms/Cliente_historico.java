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
 * Cambio historico del Cliente
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cliente_historico")
public class Cliente_historico implements Serializable {
	public Cliente_historico() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orms.ORMConstants.KEY_CLIENTE_HISTORICO_CLIENTE) {
			this.cliente = (orms.Cliente) owner;
		}
		
		else if (key == orms.ORMConstants.KEY_CLIENTE_HISTORICO_LOGIN) {
			this.login = (orms.Login) owner;
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
	@GeneratedValue(generator="ORMS_CLIENTE_HISTORICO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_CLIENTE_HISTORICO_ID_GENERATOR", strategy="increment")	
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
	
	@ManyToOne(targetEntity=orms.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Clienteid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Cliente cliente;
	
	@ManyToOne(targetEntity=orms.Login.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Loginid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Login login;
	
	@Column(name="fecha_cambio", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha_cambio;
	
	/**
	 * Id del Cambio historico del cliente
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id del Cambio historico del cliente
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Nombre Cliente
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre Cliente
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
	 * Rut del cliente
	 */
	public void setRut(String value) {
		this.rut = value;
	}
	
	/**
	 * Rut del cliente
	 */
	public String getRut() {
		return rut;
	}
	
	/**
	 * Numero de celular del cliente
	 */
	public void setCelular(String value) {
		this.celular = value;
	}
	
	/**
	 * Numero de celular del cliente
	 */
	public String getCelular() {
		return celular;
	}
	
	/**
	 * E-mail del Cliente
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	/**
	 * E-mail del Cliente
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
	
	/**
	 * Fecha del cambio
	 */
	public void setFecha_cambio(java.util.Date value) {
		this.fecha_cambio = value;
	}
	
	/**
	 * Fecha del cambio
	 */
	public java.util.Date getFecha_cambio() {
		return fecha_cambio;
	}
	
	public void setCliente(orms.Cliente value) {
		if (cliente != null) {
			cliente.cliente_historico.remove(this);
		}
		if (value != null) {
			value.cliente_historico.add(this);
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
	
	public void setLogin(orms.Login value) {
		if (login != null) {
			login.cliente_historico.remove(this);
		}
		if (value != null) {
			value.cliente_historico.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

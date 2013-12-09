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
	
	@Column(name="nombre", nullable=true, length=30)	
	private String nombre;
	
	@Column(name="apellido_paterno", nullable=true, length=20)	
	private String apellido_paterno;
	
	@Column(name="apellido_materno", nullable=true, length=20)	
	private String apellido_materno;
	
	@Column(name="rut", nullable=true, length=10)	
	private String rut;
	
	@Column(name="celular", nullable=true, length=10)	
	private String celular;
	
	@Column(name="correo", nullable=true, length=50)	
	private String correo;
	
	@Column(name="direccion", nullable=true, length=50)	
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
	
	/**
	 * llave primaria
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * llave primaria
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * nombre cliente historico
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * nombre cliente historico
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * apellido paterno cliente historico
	 */
	public void setApellido_paterno(String value) {
		this.apellido_paterno = value;
	}
	
	/**
	 * apellido paterno cliente historico
	 */
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	
	/**
	 * apellido materno cliente historico
	 */
	public void setApellido_materno(String value) {
		this.apellido_materno = value;
	}
	
	/**
	 * apellido materno cliente historico
	 */
	public String getApellido_materno() {
		return apellido_materno;
	}
	
	/**
	 * rut cliente historico
	 */
	public void setRut(String value) {
		this.rut = value;
	}
	
	/**
	 * rut cliente historico
	 */
	public String getRut() {
		return rut;
	}
	
	/**
	 * celular cliente historico
	 */
	public void setCelular(String value) {
		this.celular = value;
	}
	
	/**
	 * celular cliente historico
	 */
	public String getCelular() {
		return celular;
	}
	
	/**
	 * correo cliente historico
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	/**
	 * correo cliente historico
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * direccion cliente historico
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	/**
	 * direccion cliente historico
	 */
	public String getDireccion() {
		return direccion;
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

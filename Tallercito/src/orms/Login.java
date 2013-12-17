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
 * Login
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Login")
public class Login implements Serializable {
	public Login() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orms.ORMConstants.KEY_LOGIN_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == orms.ORMConstants.KEY_LOGIN_CLIENTE_HISTORICO) {
			return ORM_cliente_historico;
		}
		else if (key == orms.ORMConstants.KEY_LOGIN_CONSUMO) {
			return ORM_consumo;
		}
		else if (key == orms.ORMConstants.KEY_LOGIN_CUENTA) {
			return ORM_cuenta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orms.ORMConstants.KEY_LOGIN_ADMINISTRADOR) {
			this.administrador = (orms.Administrador) owner;
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
	@GeneratedValue(generator="ORMS_LOGIN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_LOGIN_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="token", nullable=false, length=21)	
	private String token;
	
	@Column(name="fecha_inicio", nullable=false, length=25)	
	private String fecha_inicio;
	
	@Column(name="fecha_fin", nullable=false, length=25)	
	private String fecha_fin;
	
	@ManyToOne(targetEntity=orms.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Administradorid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Administrador administrador;
	
	@OneToMany(mappedBy="login", targetEntity=orms.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	@OneToMany(mappedBy="login", targetEntity=orms.Cliente_historico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente_historico = new java.util.HashSet();
	
	@OneToMany(mappedBy="login", targetEntity=orms.Consumo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_consumo = new java.util.HashSet();
	
	@OneToMany(mappedBy="login", targetEntity=orms.Cuenta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cuenta = new java.util.HashSet();
	
	/**
	 * Id del Login
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id del Login
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Token del login
	 */
	public void setToken(String value) {
		this.token = value;
	}
	
	/**
	 * Token del login
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Fecha inicio Login
	 */
	public void setFecha_inicio(String value) {
		this.fecha_inicio = value;
	}
	
	/**
	 * Fecha inicio Login
	 */
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	
	/**
	 * Fecha del fin del Login
	 */
	public void setFecha_fin(String value) {
		this.fecha_fin = value;
	}
	
	/**
	 * Fecha del fin del Login
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}
	
	public void setAdministrador(orms.Administrador value) {
		if (administrador != null) {
			administrador.login.remove(this);
		}
		if (value != null) {
			value.login.add(this);
		}
	}
	
	public orms.Administrador getAdministrador() {
		return administrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrador(orms.Administrador value) {
		this.administrador = value;
	}
	
	private orms.Administrador getORM_Administrador() {
		return administrador;
	}
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	@Transient	
	public final orms.ClienteSetCollection cliente = new orms.ClienteSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_LOGIN_CLIENTE, orms.ORMConstants.KEY_CLIENTE_LOGIN, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cliente_historico(java.util.Set value) {
		this.ORM_cliente_historico = value;
	}
	
	private java.util.Set getORM_Cliente_historico() {
		return ORM_cliente_historico;
	}
	
	@Transient	
	public final orms.Cliente_historicoSetCollection cliente_historico = new orms.Cliente_historicoSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_LOGIN_CLIENTE_HISTORICO, orms.ORMConstants.KEY_CLIENTE_HISTORICO_LOGIN, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Consumo(java.util.Set value) {
		this.ORM_consumo = value;
	}
	
	private java.util.Set getORM_Consumo() {
		return ORM_consumo;
	}
	
	@Transient	
	public final orms.ConsumoSetCollection consumo = new orms.ConsumoSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_LOGIN_CONSUMO, orms.ORMConstants.KEY_CONSUMO_LOGIN, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cuenta(java.util.Set value) {
		this.ORM_cuenta = value;
	}
	
	private java.util.Set getORM_Cuenta() {
		return ORM_cuenta;
	}
	
	@Transient	
	public final orms.CuentaSetCollection cuenta = new orms.CuentaSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_LOGIN_CUENTA, orms.ORMConstants.KEY_CUENTA_LOGIN, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

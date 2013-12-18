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
 * Administrador
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Administrador")
public class Administrador implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orms.ORMConstants.KEY_ADMINISTRADOR_LOGIN) {
			return ORM_login;
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
	@GeneratedValue(generator="ORMS_ADMINISTRADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_ADMINISTRADOR_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="usuario", nullable=false, length=20)	
	private String usuario;
	
	@Column(name="clave", nullable=false, length=20)	
	private String clave;
	
	@OneToMany(mappedBy="administrador", targetEntity=orms.Login.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_login = new java.util.HashSet();
	
	/**
	 * Id del administrador
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id del administrador
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Usuario
	 */
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	/**
	 * Usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	
	/**
	 * Clave
	 */
	public void setClave(String value) {
		this.clave = value;
	}
	
	/**
	 * Clave
	 */
	public String getClave() {
		return clave;
	}
	
	private void setORM_Login(java.util.Set value) {
		this.ORM_login = value;
	}
	
	private java.util.Set getORM_Login() {
		return ORM_login;
	}
	
	@Transient	
	public final orms.LoginSetCollection login = new orms.LoginSetCollection(this, _ormAdapter, orms.ORMConstants.KEY_ADMINISTRADOR_LOGIN, orms.ORMConstants.KEY_LOGIN_ADMINISTRADOR, orms.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

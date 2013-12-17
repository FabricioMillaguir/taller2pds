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
 * Consumo
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Consumo")
public class Consumo implements Serializable {
	public Consumo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orms.ORMConstants.KEY_CONSUMO_CUENTA) {
			this.cuenta = (orms.Cuenta) owner;
		}
		
		else if (key == orms.ORMConstants.KEY_CONSUMO_LOGIN) {
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
	@GeneratedValue(generator="ORMS_CONSUMO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORMS_CONSUMO_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="cantidad_consumida", nullable=false)	
	private Integer cantidad_consumida;
	
	@Column(name="pagado", nullable=false)	
	private Boolean pagado;
	
	@Column(name="moroso", nullable=false)	
	private Boolean moroso;
	
	@Column(name="fecha_vencimiento", nullable=false, length=25)	
	private String fecha_vencimiento;
	
	@Column(name="total_a_pagar", nullable=false)	
	private int total_a_pagar;
	
	@ManyToOne(targetEntity=orms.Cuenta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Cuentaid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Cuenta cuenta;
	
	@ManyToOne(targetEntity=orms.Login.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Loginid", referencedColumnName="id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orms.Login login;
	
	/**
	 * Id del consumo
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Id del consumo
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * cantidad consumido
	 */
	public void setCantidad_consumida(int value) {
		setCantidad_consumida(new Integer(value));
	}
	
	/**
	 * cantidad consumido
	 */
	public void setCantidad_consumida(Integer value) {
		this.cantidad_consumida = value;
	}
	
	/**
	 * cantidad consumido
	 */
	public Integer getCantidad_consumida() {
		return cantidad_consumida;
	}
	
	/**
	 * Pagado si o no
	 */
	public void setPagado(boolean value) {
		setPagado(new Boolean(value));
	}
	
	/**
	 * Pagado si o no
	 */
	public void setPagado(Boolean value) {
		this.pagado = value;
	}
	
	/**
	 * Pagado si o no
	 */
	public Boolean getPagado() {
		return pagado;
	}
	
	/**
	 * Morosidad del consumo si o no
	 */
	public void setMoroso(boolean value) {
		setMoroso(new Boolean(value));
	}
	
	/**
	 * Morosidad del consumo si o no
	 */
	public void setMoroso(Boolean value) {
		this.moroso = value;
	}
	
	/**
	 * Morosidad del consumo si o no
	 */
	public Boolean getMoroso() {
		return moroso;
	}
	
	/**
	 * Fecha de vencimiento del consumo
	 */
	public void setFecha_vencimiento(String value) {
		this.fecha_vencimiento = value;
	}
	
	/**
	 * Fecha de vencimiento del consumo
	 */
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	
	/**
	 * Total a pagar del consumo
	 */
	public void setTotal_a_pagar(int value) {
		this.total_a_pagar = value;
	}
	
	/**
	 * Total a pagar del consumo
	 */
	public int getTotal_a_pagar() {
		return total_a_pagar;
	}
	
	public void setCuenta(orms.Cuenta value) {
		if (cuenta != null) {
			cuenta.consumo.remove(this);
		}
		if (value != null) {
			value.consumo.add(this);
		}
	}
	
	public orms.Cuenta getCuenta() {
		return cuenta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cuenta(orms.Cuenta value) {
		this.cuenta = value;
	}
	
	private orms.Cuenta getORM_Cuenta() {
		return cuenta;
	}
	
	public void setLogin(orms.Login value) {
		if (login != null) {
			login.consumo.remove(this);
		}
		if (value != null) {
			value.consumo.add(this);
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

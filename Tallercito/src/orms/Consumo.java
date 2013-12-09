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
	
	@Column(name="consumo", nullable=true, length=10)	
	private Integer consumo;
	
	@Column(name="monto", nullable=true, length=10)	
	private Integer monto;
	
	@Column(name="pagado", nullable=true, length=1)	
	private Boolean pagado;
	
	@Column(name="morosidad", nullable=true, length=1)	
	private Boolean morosidad;
	
	@Column(name="fecha_vencimiento", nullable=true, length=25)	
	private String fecha_vencimiento;
	
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
	 * llave primaria consumo
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * llave primaria consumo
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * consumo
	 */
	public void setConsumo(int value) {
		setConsumo(new Integer(value));
	}
	
	/**
	 * consumo
	 */
	public void setConsumo(Integer value) {
		this.consumo = value;
	}
	
	/**
	 * consumo
	 */
	public Integer getConsumo() {
		return consumo;
	}
	
	/**
	 * monto consumo
	 */
	public void setMonto(int value) {
		setMonto(new Integer(value));
	}
	
	/**
	 * monto consumo
	 */
	public void setMonto(Integer value) {
		this.monto = value;
	}
	
	/**
	 * monto consumo
	 */
	public Integer getMonto() {
		return monto;
	}
	
	/**
	 * pagado
	 */
	public void setPagado(boolean value) {
		setPagado(new Boolean(value));
	}
	
	/**
	 * pagado
	 */
	public void setPagado(Boolean value) {
		this.pagado = value;
	}
	
	/**
	 * pagado
	 */
	public Boolean getPagado() {
		return pagado;
	}
	
	/**
	 * morosidad del consumo
	 */
	public void setMorosidad(boolean value) {
		setMorosidad(new Boolean(value));
	}
	
	/**
	 * morosidad del consumo
	 */
	public void setMorosidad(Boolean value) {
		this.morosidad = value;
	}
	
	/**
	 * morosidad del consumo
	 */
	public Boolean getMorosidad() {
		return morosidad;
	}
	
	/**
	 * fecha vencimiento consumo
	 */
	public void setFecha_vencimiento(String value) {
		this.fecha_vencimiento = value;
	}
	
	/**
	 * fecha vencimiento consumo
	 */
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
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

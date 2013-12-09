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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido_paterno;
	public final StringExpression apellido_materno;
	public final StringExpression rut;
	public final StringExpression celular;
	public final StringExpression correo;
	public final StringExpression direccion;
	
	public ClienteDetachedCriteria() {
		super(orms.Cliente.class, orms.ClienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_paterno = new StringExpression("apellido_paterno", this.getDetachedCriteria());
		apellido_materno = new StringExpression("apellido_materno", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orms.ClienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_paterno = new StringExpression("apellido_paterno", this.getDetachedCriteria());
		apellido_materno = new StringExpression("apellido_materno", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
	}
	
	public LoginDetachedCriteria createLoginCriteria() {
		return new LoginDetachedCriteria(createCriteria("login"));
	}
	
	public Cliente_historicoDetachedCriteria createCliente_historicoCriteria() {
		return new Cliente_historicoDetachedCriteria(createCriteria("ORM_cliente_historico"));
	}
	
	public CuentaDetachedCriteria createCuentaCriteria() {
		return new CuentaDetachedCriteria(createCriteria("ORM_cuenta"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}


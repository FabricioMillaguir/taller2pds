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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido_paterno;
	public final StringExpression apellido_materno;
	public final StringExpression rut;
	public final StringExpression celular;
	public final StringExpression correo;
	public final StringExpression direccion;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		apellido_paterno = new StringExpression("apellido_paterno", this);
		apellido_materno = new StringExpression("apellido_materno", this);
		rut = new StringExpression("rut", this);
		celular = new StringExpression("celular", this);
		correo = new StringExpression("correo", this);
		direccion = new StringExpression("direccion", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public LoginCriteria createLogintokenCriteria() {
		return new LoginCriteria(createCriteria("logintoken"));
	}
	
	public Cliente_historicoCriteria createCliente_historicoCriteria() {
		return new Cliente_historicoCriteria(createCriteria("ORM_cliente_historico"));
	}
	
	public CuentaCriteria createCuentaCriteria() {
		return new CuentaCriteria(createCriteria("ORM_cuenta"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}


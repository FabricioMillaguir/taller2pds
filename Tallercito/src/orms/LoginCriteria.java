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

public class LoginCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final StringExpression fecha_inicio;
	public final StringExpression fecha_fin;
	
	public LoginCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		token = new StringExpression("token", this);
		fecha_inicio = new StringExpression("fecha_inicio", this);
		fecha_fin = new StringExpression("fecha_fin", this);
	}
	
	public LoginCriteria(PersistentSession session) {
		this(session.createCriteria(Login.class));
	}
	
	public LoginCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_cliente"));
	}
	
	public Cliente_historicoCriteria createCliente_historicoCriteria() {
		return new Cliente_historicoCriteria(createCriteria("ORM_cliente_historico"));
	}
	
	public ConsumoCriteria createConsumoCriteria() {
		return new ConsumoCriteria(createCriteria("ORM_consumo"));
	}
	
	public CuentaCriteria createCuentaCriteria() {
		return new CuentaCriteria(createCriteria("ORM_cuenta"));
	}
	
	public Login uniqueLogin() {
		return (Login) super.uniqueResult();
	}
	
	public Login[] listLogin() {
		java.util.List list = super.list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}


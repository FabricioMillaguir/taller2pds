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

public class CuentaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final BooleanExpression habilitada;
	
	public CuentaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		habilitada = new BooleanExpression("habilitada", this);
	}
	
	public CuentaCriteria(PersistentSession session) {
		this(session.createCriteria(Cuenta.class));
	}
	
	public CuentaCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public ServicioCriteria createServicioCriteria() {
		return new ServicioCriteria(createCriteria("servicio"));
	}
	
	public LoginCriteria createLoginCriteria() {
		return new LoginCriteria(createCriteria("login"));
	}
	
	public ConsumoCriteria createConsumoCriteria() {
		return new ConsumoCriteria(createCriteria("ORM_consumo"));
	}
	
	public Cuenta uniqueCuenta() {
		return (Cuenta) super.uniqueResult();
	}
	
	public Cuenta[] listCuenta() {
		java.util.List list = super.list();
		return (Cuenta[]) list.toArray(new Cuenta[list.size()]);
	}
}


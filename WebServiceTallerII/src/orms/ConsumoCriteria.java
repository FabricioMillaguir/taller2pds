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

public class ConsumoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cantidad_consumida;
	public final BooleanExpression pagado;
	public final BooleanExpression moroso;
	public final DateExpression fecha_vencimiento;
	public final IntegerExpression total_a_pagar;
	
	public ConsumoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		cantidad_consumida = new IntegerExpression("cantidad_consumida", this);
		pagado = new BooleanExpression("pagado", this);
		moroso = new BooleanExpression("moroso", this);
		fecha_vencimiento = new DateExpression("fecha_vencimiento", this);
		total_a_pagar = new IntegerExpression("total_a_pagar", this);
	}
	
	public ConsumoCriteria(PersistentSession session) {
		this(session.createCriteria(Consumo.class));
	}
	
	public ConsumoCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public CuentaCriteria createCuentaCriteria() {
		return new CuentaCriteria(createCriteria("cuenta"));
	}
	
	public LoginCriteria createLogintokenCriteria() {
		return new LoginCriteria(createCriteria("logintoken"));
	}
	
	public Consumo uniqueConsumo() {
		return (Consumo) super.uniqueResult();
	}
	
	public Consumo[] listConsumo() {
		java.util.List list = super.list();
		return (Consumo[]) list.toArray(new Consumo[list.size()]);
	}
}


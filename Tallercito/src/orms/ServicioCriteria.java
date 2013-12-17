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

public class ServicioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression tipo_servicio;
	public final StringExpression unidad_de_medida;
	public final IntegerExpression valor_unitario;
	public final IntegerExpression cargo_fijo;
	
	public ServicioCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		tipo_servicio = new StringExpression("tipo_servicio", this);
		unidad_de_medida = new StringExpression("unidad_de_medida", this);
		valor_unitario = new IntegerExpression("valor_unitario", this);
		cargo_fijo = new IntegerExpression("cargo_fijo", this);
	}
	
	public ServicioCriteria(PersistentSession session) {
		this(session.createCriteria(Servicio.class));
	}
	
	public ServicioCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public CuentaCriteria createCuentaCriteria() {
		return new CuentaCriteria(createCriteria("ORM_cuenta"));
	}
	
	public Servicio uniqueServicio() {
		return (Servicio) super.uniqueResult();
	}
	
	public Servicio[] listServicio() {
		java.util.List list = super.list();
		return (Servicio[]) list.toArray(new Servicio[list.size()]);
	}
}


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

public class ServicioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression tipo_servicio;
	public final StringExpression unidad_de_medida;
	public final IntegerExpression valor_unitario;
	public final IntegerExpression cargo_fijo;
	
	public ServicioDetachedCriteria() {
		super(orms.Servicio.class, orms.ServicioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tipo_servicio = new StringExpression("tipo_servicio", this.getDetachedCriteria());
		unidad_de_medida = new StringExpression("unidad_de_medida", this.getDetachedCriteria());
		valor_unitario = new IntegerExpression("valor_unitario", this.getDetachedCriteria());
		cargo_fijo = new IntegerExpression("cargo_fijo", this.getDetachedCriteria());
	}
	
	public ServicioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orms.ServicioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tipo_servicio = new StringExpression("tipo_servicio", this.getDetachedCriteria());
		unidad_de_medida = new StringExpression("unidad_de_medida", this.getDetachedCriteria());
		valor_unitario = new IntegerExpression("valor_unitario", this.getDetachedCriteria());
		cargo_fijo = new IntegerExpression("cargo_fijo", this.getDetachedCriteria());
	}
	
	public CuentaDetachedCriteria createCuentaCriteria() {
		return new CuentaDetachedCriteria(createCriteria("ORM_cuenta"));
	}
	
	public Servicio uniqueServicio(PersistentSession session) {
		return (Servicio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Servicio[] listServicio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Servicio[]) list.toArray(new Servicio[list.size()]);
	}
}


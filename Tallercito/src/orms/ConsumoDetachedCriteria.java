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

public class ConsumoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cantidad_consumida;
	public final BooleanExpression pagado;
	public final BooleanExpression moroso;
	public final StringExpression fecha_vencimiento;
	public final IntegerExpression total_a_pagar;
	
	public ConsumoDetachedCriteria() {
		super(orms.Consumo.class, orms.ConsumoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cantidad_consumida = new IntegerExpression("cantidad_consumida", this.getDetachedCriteria());
		pagado = new BooleanExpression("pagado", this.getDetachedCriteria());
		moroso = new BooleanExpression("moroso", this.getDetachedCriteria());
		fecha_vencimiento = new StringExpression("fecha_vencimiento", this.getDetachedCriteria());
		total_a_pagar = new IntegerExpression("total_a_pagar", this.getDetachedCriteria());
	}
	
	public ConsumoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orms.ConsumoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cantidad_consumida = new IntegerExpression("cantidad_consumida", this.getDetachedCriteria());
		pagado = new BooleanExpression("pagado", this.getDetachedCriteria());
		moroso = new BooleanExpression("moroso", this.getDetachedCriteria());
		fecha_vencimiento = new StringExpression("fecha_vencimiento", this.getDetachedCriteria());
		total_a_pagar = new IntegerExpression("total_a_pagar", this.getDetachedCriteria());
	}
	
	public CuentaDetachedCriteria createCuentaCriteria() {
		return new CuentaDetachedCriteria(createCriteria("cuenta"));
	}
	
	public LoginDetachedCriteria createLoginCriteria() {
		return new LoginDetachedCriteria(createCriteria("login"));
	}
	
	public Consumo uniqueConsumo(PersistentSession session) {
		return (Consumo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Consumo[] listConsumo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Consumo[]) list.toArray(new Consumo[list.size()]);
	}
}


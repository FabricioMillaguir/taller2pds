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

public class Historico_consultasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final DateExpression fecha_consulta;
	
	public Historico_consultasDetachedCriteria() {
		super(orms.Historico_consultas.class, orms.Historico_consultasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fecha_consulta = new DateExpression("fecha_consulta", this.getDetachedCriteria());
	}
	
	public Historico_consultasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orms.Historico_consultasCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fecha_consulta = new DateExpression("fecha_consulta", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public Historico_consultas uniqueHistorico_consultas(PersistentSession session) {
		return (Historico_consultas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Historico_consultas[] listHistorico_consultas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Historico_consultas[]) list.toArray(new Historico_consultas[list.size()]);
	}
}


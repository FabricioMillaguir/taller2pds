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

public class Historico_consultasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final DateExpression fecha_consulta;
	
	public Historico_consultasCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fecha_consulta = new DateExpression("fecha_consulta", this);
	}
	
	public Historico_consultasCriteria(PersistentSession session) {
		this(session.createCriteria(Historico_consultas.class));
	}
	
	public Historico_consultasCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public Historico_consultas uniqueHistorico_consultas() {
		return (Historico_consultas) super.uniqueResult();
	}
	
	public Historico_consultas[] listHistorico_consultas() {
		java.util.List list = super.list();
		return (Historico_consultas[]) list.toArray(new Historico_consultas[list.size()]);
	}
}


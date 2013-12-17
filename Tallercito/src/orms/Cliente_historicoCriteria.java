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

public class Cliente_historicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido_paterno;
	public final StringExpression apellido_materno;
	public final StringExpression rut;
	public final StringExpression celular;
	public final StringExpression correo;
	public final StringExpression direccion;
	public final DateExpression fecha_cambio;
	
	public Cliente_historicoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		apellido_paterno = new StringExpression("apellido_paterno", this);
		apellido_materno = new StringExpression("apellido_materno", this);
		rut = new StringExpression("rut", this);
		celular = new StringExpression("celular", this);
		correo = new StringExpression("correo", this);
		direccion = new StringExpression("direccion", this);
		fecha_cambio = new DateExpression("fecha_cambio", this);
	}
	
	public Cliente_historicoCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente_historico.class));
	}
	
	public Cliente_historicoCriteria() throws PersistentException {
		this(orms.TallerAplicado1PersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public LoginCriteria createLoginCriteria() {
		return new LoginCriteria(createCriteria("login"));
	}
	
	public Cliente_historico uniqueCliente_historico() {
		return (Cliente_historico) super.uniqueResult();
	}
	
	public Cliente_historico[] listCliente_historico() {
		java.util.List list = super.list();
		return (Cliente_historico[]) list.toArray(new Cliente_historico[list.size()]);
	}
}


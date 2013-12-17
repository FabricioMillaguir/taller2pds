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

public class Cliente_historicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final StringExpression apellido_paterno;
	public final StringExpression apellido_materno;
	public final StringExpression rut;
	public final StringExpression celular;
	public final StringExpression correo;
	public final StringExpression direccion;
	public final DateExpression fecha_cambio;
	
	public Cliente_historicoDetachedCriteria() {
		super(orms.Cliente_historico.class, orms.Cliente_historicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_paterno = new StringExpression("apellido_paterno", this.getDetachedCriteria());
		apellido_materno = new StringExpression("apellido_materno", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		fecha_cambio = new DateExpression("fecha_cambio", this.getDetachedCriteria());
	}
	
	public Cliente_historicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orms.Cliente_historicoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_paterno = new StringExpression("apellido_paterno", this.getDetachedCriteria());
		apellido_materno = new StringExpression("apellido_materno", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		fecha_cambio = new DateExpression("fecha_cambio", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public LoginDetachedCriteria createLoginCriteria() {
		return new LoginDetachedCriteria(createCriteria("login"));
	}
	
	public Cliente_historico uniqueCliente_historico(PersistentSession session) {
		return (Cliente_historico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente_historico[] listCliente_historico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente_historico[]) list.toArray(new Cliente_historico[list.size()]);
	}
}


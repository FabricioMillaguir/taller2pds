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

public class LoginDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression token;
	public final LongExpression tiempo_inicio;
	
	public LoginDetachedCriteria() {
		super(orms.Login.class, orms.LoginCriteria.class);
		token = new StringExpression("token", this.getDetachedCriteria());
		tiempo_inicio = new LongExpression("tiempo_inicio", this.getDetachedCriteria());
	}
	
	public LoginDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orms.LoginCriteria.class);
		token = new StringExpression("token", this.getDetachedCriteria());
		tiempo_inicio = new LongExpression("tiempo_inicio", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_cliente"));
	}
	
	public CuentaDetachedCriteria createCuentaCriteria() {
		return new CuentaDetachedCriteria(createCriteria("ORM_cuenta"));
	}
	
	public Cliente_historicoDetachedCriteria createCliente_historicoCriteria() {
		return new Cliente_historicoDetachedCriteria(createCriteria("ORM_cliente_historico"));
	}
	
	public ConsumoDetachedCriteria createConsumoCriteria() {
		return new ConsumoDetachedCriteria(createCriteria("ORM_consumo"));
	}
	
	public Login uniqueLogin(PersistentSession session) {
		return (Login) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Login[] listLogin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}


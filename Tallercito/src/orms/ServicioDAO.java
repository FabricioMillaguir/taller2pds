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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class ServicioDAO {
	public static Servicio loadServicioByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadServicioByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getServicioByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadServicioByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getServicioByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Servicio) session.load(orms.Servicio.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Servicio) session.get(orms.Servicio.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Servicio) session.load(orms.Servicio.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Servicio) session.get(orms.Servicio.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryServicio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryServicio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryServicio(session, condition, orderBy);
			return (Servicio[]) list.toArray(new Servicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryServicio(session, condition, orderBy, lockMode);
			return (Servicio[]) list.toArray(new Servicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Servicio[] servicios = listServicioByQuery(session, condition, orderBy);
		if (servicios != null && servicios.length > 0)
			return servicios[0];
		else
			return null;
	}
	
	public static Servicio loadServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Servicio[] servicios = listServicioByQuery(session, condition, orderBy, lockMode);
		if (servicios != null && servicios.length > 0)
			return servicios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio createServicio() {
		return new orms.Servicio();
	}
	
	public static boolean save(orms.Servicio servicio) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().saveObject(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orms.Servicio servicio) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().deleteObject(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Servicio servicio)throws PersistentException {
		try {
			orms.Cuenta[] lCuentas = servicio.cuenta.toArray();
			for(int i = 0; i < lCuentas.length; i++) {
				lCuentas[i].setServicio(null);
			}
			return delete(servicio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Servicio servicio, org.orm.PersistentSession session)throws PersistentException {
		try {
			orms.Cuenta[] lCuentas = servicio.cuenta.toArray();
			for(int i = 0; i < lCuentas.length; i++) {
				lCuentas[i].setServicio(null);
			}
			try {
				session.delete(servicio);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orms.Servicio servicio) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().refresh(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orms.Servicio servicio) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().evict(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByCriteria(ServicioCriteria servicioCriteria) {
		Servicio[] servicios = listServicioByCriteria(servicioCriteria);
		if(servicios == null || servicios.length == 0) {
			return null;
		}
		return servicios[0];
	}
	
	public static Servicio[] listServicioByCriteria(ServicioCriteria servicioCriteria) {
		return servicioCriteria.listServicio();
	}
}

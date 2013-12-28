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

public class Historico_consultasDAO {
	public static Historico_consultas loadHistorico_consultasByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadHistorico_consultasByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas getHistorico_consultasByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getHistorico_consultasByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadHistorico_consultasByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas getHistorico_consultasByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getHistorico_consultasByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Historico_consultas) session.load(orms.Historico_consultas.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas getHistorico_consultasByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Historico_consultas) session.get(orms.Historico_consultas.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historico_consultas) session.load(orms.Historico_consultas.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas getHistorico_consultasByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historico_consultas) session.get(orms.Historico_consultas.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_consultas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryHistorico_consultas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_consultas(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryHistorico_consultas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas[] listHistorico_consultasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listHistorico_consultasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas[] listHistorico_consultasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listHistorico_consultasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_consultas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Historico_consultas as Historico_consultas");
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
	
	public static List queryHistorico_consultas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Historico_consultas as Historico_consultas");
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
	
	public static Historico_consultas[] listHistorico_consultasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHistorico_consultas(session, condition, orderBy);
			return (Historico_consultas[]) list.toArray(new Historico_consultas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas[] listHistorico_consultasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHistorico_consultas(session, condition, orderBy, lockMode);
			return (Historico_consultas[]) list.toArray(new Historico_consultas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadHistorico_consultasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadHistorico_consultasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Historico_consultas[] historico_consultases = listHistorico_consultasByQuery(session, condition, orderBy);
		if (historico_consultases != null && historico_consultases.length > 0)
			return historico_consultases[0];
		else
			return null;
	}
	
	public static Historico_consultas loadHistorico_consultasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Historico_consultas[] historico_consultases = listHistorico_consultasByQuery(session, condition, orderBy, lockMode);
		if (historico_consultases != null && historico_consultases.length > 0)
			return historico_consultases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHistorico_consultasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateHistorico_consultasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorico_consultasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateHistorico_consultasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorico_consultasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Historico_consultas as Historico_consultas");
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
	
	public static java.util.Iterator iterateHistorico_consultasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Historico_consultas as Historico_consultas");
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
	
	public static Historico_consultas createHistorico_consultas() {
		return new orms.Historico_consultas();
	}
	
	public static boolean save(orms.Historico_consultas historico_consultas) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().saveObject(historico_consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orms.Historico_consultas historico_consultas) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().deleteObject(historico_consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Historico_consultas historico_consultas)throws PersistentException {
		try {
			if(historico_consultas.getCliente() != null) {
				historico_consultas.getCliente().historico_consultas.remove(historico_consultas);
			}
			
			return delete(historico_consultas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Historico_consultas historico_consultas, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(historico_consultas.getCliente() != null) {
				historico_consultas.getCliente().historico_consultas.remove(historico_consultas);
			}
			
			try {
				session.delete(historico_consultas);
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
	
	public static boolean refresh(orms.Historico_consultas historico_consultas) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().refresh(historico_consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orms.Historico_consultas historico_consultas) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().evict(historico_consultas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_consultas loadHistorico_consultasByCriteria(Historico_consultasCriteria historico_consultasCriteria) {
		Historico_consultas[] historico_consultases = listHistorico_consultasByCriteria(historico_consultasCriteria);
		if(historico_consultases == null || historico_consultases.length == 0) {
			return null;
		}
		return historico_consultases[0];
	}
	
	public static Historico_consultas[] listHistorico_consultasByCriteria(Historico_consultasCriteria historico_consultasCriteria) {
		return historico_consultasCriteria.listHistorico_consultas();
	}
}

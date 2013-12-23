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

public class ConsumoDAO {
	public static Consumo loadConsumoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadConsumoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo getConsumoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getConsumoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadConsumoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo getConsumoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getConsumoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Consumo) session.load(orms.Consumo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo getConsumoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Consumo) session.get(orms.Consumo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Consumo) session.load(orms.Consumo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo getConsumoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Consumo) session.get(orms.Consumo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsumo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryConsumo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsumo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryConsumo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo[] listConsumoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listConsumoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo[] listConsumoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listConsumoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConsumo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Consumo as Consumo");
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
	
	public static List queryConsumo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Consumo as Consumo");
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
	
	public static Consumo[] listConsumoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConsumo(session, condition, orderBy);
			return (Consumo[]) list.toArray(new Consumo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo[] listConsumoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConsumo(session, condition, orderBy, lockMode);
			return (Consumo[]) list.toArray(new Consumo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadConsumoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadConsumoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Consumo[] consumos = listConsumoByQuery(session, condition, orderBy);
		if (consumos != null && consumos.length > 0)
			return consumos[0];
		else
			return null;
	}
	
	public static Consumo loadConsumoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Consumo[] consumos = listConsumoByQuery(session, condition, orderBy, lockMode);
		if (consumos != null && consumos.length > 0)
			return consumos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConsumoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateConsumoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsumoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateConsumoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConsumoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Consumo as Consumo");
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
	
	public static java.util.Iterator iterateConsumoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Consumo as Consumo");
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
	
	public static Consumo createConsumo() {
		return new orms.Consumo();
	}
	
	public static boolean save(orms.Consumo consumo) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().saveObject(consumo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orms.Consumo consumo) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().deleteObject(consumo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Consumo consumo)throws PersistentException {
		try {
			if(consumo.getCuenta() != null) {
				consumo.getCuenta().consumo.remove(consumo);
			}
			
			if(consumo.getLogintoken() != null) {
				consumo.getLogintoken().consumo.remove(consumo);
			}
			
			return delete(consumo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Consumo consumo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(consumo.getCuenta() != null) {
				consumo.getCuenta().consumo.remove(consumo);
			}
			
			if(consumo.getLogintoken() != null) {
				consumo.getLogintoken().consumo.remove(consumo);
			}
			
			try {
				session.delete(consumo);
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
	
	public static boolean refresh(orms.Consumo consumo) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().refresh(consumo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orms.Consumo consumo) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().evict(consumo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Consumo loadConsumoByCriteria(ConsumoCriteria consumoCriteria) {
		Consumo[] consumos = listConsumoByCriteria(consumoCriteria);
		if(consumos == null || consumos.length == 0) {
			return null;
		}
		return consumos[0];
	}
	
	public static Consumo[] listConsumoByCriteria(ConsumoCriteria consumoCriteria) {
		return consumoCriteria.listConsumo();
	}
}

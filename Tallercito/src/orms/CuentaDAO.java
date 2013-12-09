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

public class CuentaDAO {
	public static Cuenta loadCuentaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadCuentaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta getCuentaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getCuentaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadCuentaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta getCuentaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return getCuentaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cuenta) session.load(orms.Cuenta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta getCuentaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cuenta) session.get(orms.Cuenta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cuenta) session.load(orms.Cuenta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta getCuentaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cuenta) session.get(orms.Cuenta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCuenta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryCuenta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCuenta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return queryCuenta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta[] listCuentaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listCuentaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta[] listCuentaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return listCuentaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCuenta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Cuenta as Cuenta");
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
	
	public static List queryCuenta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Cuenta as Cuenta");
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
	
	public static Cuenta[] listCuentaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCuenta(session, condition, orderBy);
			return (Cuenta[]) list.toArray(new Cuenta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta[] listCuentaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCuenta(session, condition, orderBy, lockMode);
			return (Cuenta[]) list.toArray(new Cuenta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadCuentaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return loadCuentaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cuenta[] cuentas = listCuentaByQuery(session, condition, orderBy);
		if (cuentas != null && cuentas.length > 0)
			return cuentas[0];
		else
			return null;
	}
	
	public static Cuenta loadCuentaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cuenta[] cuentas = listCuentaByQuery(session, condition, orderBy, lockMode);
		if (cuentas != null && cuentas.length > 0)
			return cuentas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCuentaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateCuentaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCuentaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orms.TallerAplicado1PersistentManager.instance().getSession();
			return iterateCuentaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCuentaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Cuenta as Cuenta");
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
	
	public static java.util.Iterator iterateCuentaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orms.Cuenta as Cuenta");
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
	
	public static Cuenta createCuenta() {
		return new orms.Cuenta();
	}
	
	public static boolean save(orms.Cuenta cuenta) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().saveObject(cuenta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orms.Cuenta cuenta) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().deleteObject(cuenta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Cuenta cuenta)throws PersistentException {
		try {
			if(cuenta.getCliente() != null) {
				cuenta.getCliente().cuenta.remove(cuenta);
			}
			
			if(cuenta.getServicio() != null) {
				cuenta.getServicio().cuenta.remove(cuenta);
			}
			
			if(cuenta.getLogin() != null) {
				cuenta.getLogin().cuenta.remove(cuenta);
			}
			
			orms.Consumo[] lConsumos = cuenta.consumo.toArray();
			for(int i = 0; i < lConsumos.length; i++) {
				lConsumos[i].setCuenta(null);
			}
			return delete(cuenta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orms.Cuenta cuenta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(cuenta.getCliente() != null) {
				cuenta.getCliente().cuenta.remove(cuenta);
			}
			
			if(cuenta.getServicio() != null) {
				cuenta.getServicio().cuenta.remove(cuenta);
			}
			
			if(cuenta.getLogin() != null) {
				cuenta.getLogin().cuenta.remove(cuenta);
			}
			
			orms.Consumo[] lConsumos = cuenta.consumo.toArray();
			for(int i = 0; i < lConsumos.length; i++) {
				lConsumos[i].setCuenta(null);
			}
			try {
				session.delete(cuenta);
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
	
	public static boolean refresh(orms.Cuenta cuenta) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().refresh(cuenta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orms.Cuenta cuenta) throws PersistentException {
		try {
			orms.TallerAplicado1PersistentManager.instance().getSession().evict(cuenta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cuenta loadCuentaByCriteria(CuentaCriteria cuentaCriteria) {
		Cuenta[] cuentas = listCuentaByCriteria(cuentaCriteria);
		if(cuentas == null || cuentas.length == 0) {
			return null;
		}
		return cuentas[0];
	}
	
	public static Cuenta[] listCuentaByCriteria(CuentaCriteria cuentaCriteria) {
		return cuentaCriteria.listCuenta();
	}
}

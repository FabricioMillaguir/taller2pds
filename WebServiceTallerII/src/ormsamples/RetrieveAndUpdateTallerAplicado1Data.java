/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTallerAplicado1Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();
		try {
			orms.Cliente lormsCliente = orms.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			orms.ClienteDAO.save(lormsCliente);
			orms.Cliente_historico lormsCliente_historico = orms.Cliente_historicoDAO.loadCliente_historicoByQuery(null, null);
			// Update the properties of the persistent object
			orms.Cliente_historicoDAO.save(lormsCliente_historico);
			orms.Cuenta lormsCuenta = orms.CuentaDAO.loadCuentaByQuery(null, null);
			// Update the properties of the persistent object
			orms.CuentaDAO.save(lormsCuenta);
			orms.Login lormsLogin = orms.LoginDAO.loadLoginByQuery(null, null);
			// Update the properties of the persistent object
			orms.LoginDAO.save(lormsLogin);
			orms.Servicio lormsServicio = orms.ServicioDAO.loadServicioByQuery(null, null);
			// Update the properties of the persistent object
			orms.ServicioDAO.save(lormsServicio);
			orms.Consumo lormsConsumo = orms.ConsumoDAO.loadConsumoByQuery(null, null);
			// Update the properties of the persistent object
			orms.ConsumoDAO.save(lormsConsumo);
			orms.Administrador lormsAdministrador = orms.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			orms.AdministradorDAO.save(lormsAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cliente by ClienteCriteria");
		orms.ClienteCriteria lormsClienteCriteria = new orms.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsClienteCriteria.id.eq();
		System.out.println(lormsClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Cliente_historico by Cliente_historicoCriteria");
		orms.Cliente_historicoCriteria lormsCliente_historicoCriteria = new orms.Cliente_historicoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsCliente_historicoCriteria.id.eq();
		System.out.println(lormsCliente_historicoCriteria.uniqueCliente_historico());
		
		System.out.println("Retrieving Cuenta by CuentaCriteria");
		orms.CuentaCriteria lormsCuentaCriteria = new orms.CuentaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsCuentaCriteria.id.eq();
		System.out.println(lormsCuentaCriteria.uniqueCuenta());
		
		System.out.println("Retrieving Login by LoginCriteria");
		orms.LoginCriteria lormsLoginCriteria = new orms.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsLoginCriteria.token.eq();
		System.out.println(lormsLoginCriteria.uniqueLogin());
		
		System.out.println("Retrieving Servicio by ServicioCriteria");
		orms.ServicioCriteria lormsServicioCriteria = new orms.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsServicioCriteria.id.eq();
		System.out.println(lormsServicioCriteria.uniqueServicio());
		
		System.out.println("Retrieving Consumo by ConsumoCriteria");
		orms.ConsumoCriteria lormsConsumoCriteria = new orms.ConsumoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsConsumoCriteria.id.eq();
		System.out.println(lormsConsumoCriteria.uniqueConsumo());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		orms.AdministradorCriteria lormsAdministradorCriteria = new orms.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormsAdministradorCriteria.id.eq();
		System.out.println(lormsAdministradorCriteria.uniqueAdministrador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTallerAplicado1Data retrieveAndUpdateTallerAplicado1Data = new RetrieveAndUpdateTallerAplicado1Data();
			try {
				retrieveAndUpdateTallerAplicado1Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateTallerAplicado1Data.retrieveByCriteria();
			}
			finally {
				orms.TallerAplicado1PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

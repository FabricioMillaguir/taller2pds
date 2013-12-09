/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListTallerAplicado1Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cliente...");
		orms.Administrador[] ormsAdministradors = orms.AdministradorDAO.listAdministradorByQuery(null, null);
		//orms.Cliente[] ormsClientes = orms.ClienteDAO.listClienteByQuery(null, null);
		int length = Math.min(ormsAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsAdministradors[i].getUsuario() + " " + ormsAdministradors[i].getClave() );
		}
		/*System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente_historico...");
		orms.Cliente_historico[] ormsCliente_historicos = orms.Cliente_historicoDAO.listCliente_historicoByQuery(null, null);
		length = Math.min(ormsCliente_historicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsCliente_historicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cuenta...");
		orms.Cuenta[] ormsCuentas = orms.CuentaDAO.listCuentaByQuery(null, null);
		length = Math.min(ormsCuentas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsCuentas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Login...");
		orms.Login[] ormsLogins = orms.LoginDAO.listLoginByQuery(null, null);
		length = Math.min(ormsLogins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsLogins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Servicio...");
		orms.Servicio[] ormsServicios = orms.ServicioDAO.listServicioByQuery(null, null);
		length = Math.min(ormsServicios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsServicios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consumo...");
		orms.Consumo[] ormsConsumos = orms.ConsumoDAO.listConsumoByQuery(null, null);
		length = Math.min(ormsConsumos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsConsumos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		orms.Administrador[] ormsAdministradors = orms.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(ormsAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormsAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
	*/	
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Cliente by Criteria...");
		orms.ClienteCriteria lormsClienteCriteria = new orms.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsClienteCriteria.id.eq();
		lormsClienteCriteria.setMaxResults(ROW_COUNT);
		orms.Cliente[] ormsClientes = lormsClienteCriteria.listCliente();
		int length =ormsClientes== null ? 0 : Math.min(ormsClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Cliente_historico by Criteria...");
		orms.Cliente_historicoCriteria lormsCliente_historicoCriteria = new orms.Cliente_historicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsCliente_historicoCriteria.id.eq();
		lormsCliente_historicoCriteria.setMaxResults(ROW_COUNT);
		orms.Cliente_historico[] ormsCliente_historicos = lormsCliente_historicoCriteria.listCliente_historico();
		length =ormsCliente_historicos== null ? 0 : Math.min(ormsCliente_historicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsCliente_historicos[i]);
		}
		System.out.println(length + " Cliente_historico record(s) retrieved."); 
		
		System.out.println("Listing Cuenta by Criteria...");
		orms.CuentaCriteria lormsCuentaCriteria = new orms.CuentaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsCuentaCriteria.id.eq();
		lormsCuentaCriteria.setMaxResults(ROW_COUNT);
		orms.Cuenta[] ormsCuentas = lormsCuentaCriteria.listCuenta();
		length =ormsCuentas== null ? 0 : Math.min(ormsCuentas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsCuentas[i]);
		}
		System.out.println(length + " Cuenta record(s) retrieved."); 
		
		System.out.println("Listing Login by Criteria...");
		orms.LoginCriteria lormsLoginCriteria = new orms.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsLoginCriteria.id.eq();
		lormsLoginCriteria.setMaxResults(ROW_COUNT);
		orms.Login[] ormsLogins = lormsLoginCriteria.listLogin();
		length =ormsLogins== null ? 0 : Math.min(ormsLogins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsLogins[i]);
		}
		System.out.println(length + " Login record(s) retrieved."); 
		
		System.out.println("Listing Servicio by Criteria...");
		orms.ServicioCriteria lormsServicioCriteria = new orms.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsServicioCriteria.id.eq();
		lormsServicioCriteria.setMaxResults(ROW_COUNT);
		orms.Servicio[] ormsServicios = lormsServicioCriteria.listServicio();
		length =ormsServicios== null ? 0 : Math.min(ormsServicios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsServicios[i]);
		}
		System.out.println(length + " Servicio record(s) retrieved."); 
		
		System.out.println("Listing Consumo by Criteria...");
		orms.ConsumoCriteria lormsConsumoCriteria = new orms.ConsumoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsConsumoCriteria.id.eq();
		lormsConsumoCriteria.setMaxResults(ROW_COUNT);
		orms.Consumo[] ormsConsumos = lormsConsumoCriteria.listConsumo();
		length =ormsConsumos== null ? 0 : Math.min(ormsConsumos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsConsumos[i]);
		}
		System.out.println(length + " Consumo record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		orms.AdministradorCriteria lormsAdministradorCriteria = new orms.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormsAdministradorCriteria.id.eq();
		lormsAdministradorCriteria.setMaxResults(ROW_COUNT);
		orms.Administrador[] ormsAdministradors = lormsAdministradorCriteria.listAdministrador();
		length =ormsAdministradors== null ? 0 : Math.min(ormsAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormsAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTallerAplicado1Data listTallerAplicado1Data = new ListTallerAplicado1Data();
			try {
				listTallerAplicado1Data.listTestData();
				//listTallerAplicado1Data.listByCriteria();
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

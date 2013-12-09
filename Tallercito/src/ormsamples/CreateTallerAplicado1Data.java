/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateTallerAplicado1Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();
		try {
			orms.Administrador lormsAdministrador = orms.AdministradorDAO.createAdministrador();
					lormsAdministrador.setUsuario("userrrrr");
			lormsAdministrador.setClave("passsss");
			/*orms.Cliente lormsCliente = orms.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, cliente_historico, login
			orms.ClienteDAO.save(lormsCliente);
			orms.Cliente_historico lormsCliente_historico = orms.Cliente_historicoDAO.createCliente_historico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, cliente
			orms.Cliente_historicoDAO.save(lormsCliente_historico);
			orms.Cuenta lormsCuenta = orms.CuentaDAO.createCuenta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumo, login, servicio, cliente
			orms.CuentaDAO.save(lormsCuenta);
			orms.Login lormsLogin = orms.LoginDAO.createLogin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, consumo, cliente_historico, cliente, administrador
			orms.LoginDAO.save(lormsLogin);
			orms.Servicio lormsServicio = orms.ServicioDAO.createServicio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, tipo_servicio
			orms.ServicioDAO.save(lormsServicio);
			orms.Consumo lormsConsumo = orms.ConsumoDAO.createConsumo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, cuenta
			orms.ConsumoDAO.save(lormsConsumo);
			orms.Administrador lormsAdministrador = orms.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login
			*/orms.AdministradorDAO.save(lormsAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTallerAplicado1Data createTallerAplicado1Data = new CreateTallerAplicado1Data();
			try {
				createTallerAplicado1Data.createTestData();
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

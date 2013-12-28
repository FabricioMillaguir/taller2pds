/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteTallerAplicado1Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();
		try {
			orms.Cliente lormsCliente = orms.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			orms.ClienteDAO.delete(lormsCliente);
			orms.Cliente_historico lormsCliente_historico = orms.Cliente_historicoDAO.loadCliente_historicoByQuery(null, null);
			// Delete the persistent object
			orms.Cliente_historicoDAO.delete(lormsCliente_historico);
			orms.Cuenta lormsCuenta = orms.CuentaDAO.loadCuentaByQuery(null, null);
			// Delete the persistent object
			orms.CuentaDAO.delete(lormsCuenta);
			orms.Login lormsLogin = orms.LoginDAO.loadLoginByQuery(null, null);
			// Delete the persistent object
			orms.LoginDAO.delete(lormsLogin);
			orms.Servicio lormsServicio = orms.ServicioDAO.loadServicioByQuery(null, null);
			// Delete the persistent object
			orms.ServicioDAO.delete(lormsServicio);
			orms.Consumo lormsConsumo = orms.ConsumoDAO.loadConsumoByQuery(null, null);
			// Delete the persistent object
			orms.ConsumoDAO.delete(lormsConsumo);
			orms.Administrador lormsAdministrador = orms.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			orms.AdministradorDAO.delete(lormsAdministrador);
			orms.Historico_consultas lormsHistorico_consultas = orms.Historico_consultasDAO.loadHistorico_consultasByQuery(null, null);
			// Delete the persistent object
			orms.Historico_consultasDAO.delete(lormsHistorico_consultas);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTallerAplicado1Data deleteTallerAplicado1Data = new DeleteTallerAplicado1Data();
			try {
				deleteTallerAplicado1Data.deleteTestData();
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

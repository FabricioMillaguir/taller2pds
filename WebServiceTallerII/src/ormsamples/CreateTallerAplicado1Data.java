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
			/*
			orms.Cliente lormsCliente = orms.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historico_consultas, cuenta, cliente_historico, logintoken, direccion, correo, celular, rut, apellido_materno, apellido_paterno, nombre
			orms.ClienteDAO.save(lormsCliente);
			orms.Cliente_historico lormsCliente_historico = orms.Cliente_historicoDAO.createCliente_historico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : logintoken, fecha_cambio, cliente, direccion, correo, celular, rut, apellido_materno, apellido_paterno, nombre
			orms.Cliente_historicoDAO.save(lormsCliente_historico);
			orms.Cuenta lormsCuenta = orms.CuentaDAO.createCuenta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumo, logintoken, servicio, cliente, habilitada
			orms.CuentaDAO.save(lormsCuenta);
			orms.Login lormsLogin = orms.LoginDAO.createLogin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumo, cliente_historico, cuenta, cliente, administrador, tiempo_inicio
			orms.LoginDAO.save(lormsLogin);
			orms.Servicio lormsServicio = orms.ServicioDAO.createServicio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, cargo_fijo, valor_unitario, unidad_de_medida, tipo_servicio
			orms.ServicioDAO.save(lormsServicio);
			orms.Consumo lormsConsumo = orms.ConsumoDAO.createConsumo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : logintoken, cuenta, total_a_pagar, fecha_vencimiento, moroso, pagado, cantidad_consumida
			orms.ConsumoDAO.save(lormsConsumo);
			orms.Administrador lormsAdministrador = orms.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, clave, usuario
			orms.AdministradorDAO.save(lormsAdministrador);
			orms.Historico_consultas lormsHistorico_consultas = orms.Historico_consultasDAO.createHistorico_consultas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, fecha_consulta
			orms.Historico_consultasDAO.save(lormsHistorico_consultas);
			*/
			orms.Servicio lormAdministrador = orms.ServicioDAO.createServicio();
			lormAdministrador.setTipo_servicio("Gas");
			lormAdministrador.setUnidad_de_medida("cm3");
			lormAdministrador.setValor_unitario(20);
			lormAdministrador.setCargo_fijo(3000);
			
			orms.ServicioDAO.save(lormAdministrador);
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

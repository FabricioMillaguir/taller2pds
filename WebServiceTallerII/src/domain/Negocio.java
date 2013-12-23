package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

import orms.Administrador;
import orms.Cliente;
import orms.ClienteDAO;
import orms.Cliente_historico;
import orms.Cliente_historicoDAO;
import orms.CuentaDAO;
import orms.Login;
import orms.LoginDAO;
import orms.Servicio;
import orms.ServicioDAO;
import orms.TallerAplicado1PersistentManager;

public abstract class Negocio {

	public static boolean guardarToken(LoginVO loginVO) {

		try {
			PersistentTransaction t = TallerAplicado1PersistentManager
					.instance().getSession().beginTransaction();
			try {
				orms.Login ormsLogin = orms.LoginDAO.createLogin();
				ormsLogin.setToken(loginVO.getToken());
				ormsLogin.setTiempo_inicio(loginVO.getTiempoInicio());

				System.out.print(loginVO.getAdministradorVO().getId());

				ormsLogin.setAdministrador(orms.AdministradorDAO
						.getAdministradorByORMID(loginVO.getAdministradorVO()
								.getId()));

				LoginDAO.save(ormsLogin);
				t.commit();
				return true;

			} catch (Exception e) {
				t.rollback();
				return false;
			}
		} catch (PersistentException e) {

			e.printStackTrace();
			return false;
		}

	}

	public static LoginVO loggearAdministrador(AdministradorVO administradorVO) {
		// null pointer exception
		try {
			orms.Administrador ormsAdministrador = (Administrador) orms.AdministradorDAO
					.queryAdministrador(
							"usuario = '" + administradorVO.getUsuario() + "'",
							null).get(0);
			System.out.print(ormsAdministrador.getId()
					+ ormsAdministrador.getUsuario());
			if (ormsAdministrador.getClave().equals(administradorVO.getClave())) {
				administradorVO.setId(ormsAdministrador.getId());
				LoginVO loginVO = new LoginVO(
						generarToken(ormsAdministrador.getUsuario()));
				loginVO.setAdministradorVO(administradorVO);
				loginVO.setTiempoInicio(System.currentTimeMillis());

				System.out.print(guardarToken(loginVO));
				return loginVO;
			}

		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}

		return null;
	}

	private static String generarToken(String clave) {
		String out = "";
		out += System.currentTimeMillis();
		out += clave;

		return out;

	}

	public static String agregarAdministrador(AdministradorVO administradorVO) {

		try {
			PersistentTransaction t = TallerAplicado1PersistentManager
					.instance().getSession().beginTransaction();
			try {
				orms.Administrador admin = orms.AdministradorDAO
						.createAdministrador();

				admin.setUsuario(administradorVO.getUsuario());
				admin.setClave(administradorVO.getClave());

				orms.AdministradorDAO.save(admin);
				t.commit();
				return "guardado";

			} catch (Exception e) {
				t.rollback();
				return null;
			}
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static String agregarCliente(ClienteVO clienteVO) {
		try {
			PersistentTransaction t = orms.TallerAplicado1PersistentManager
					.instance().getSession().beginTransaction();
			try {
				orms.Cliente cliente = orms.ClienteDAO.createCliente();
				cliente.setRut(clienteVO.getRut());
				cliente.setNombre(clienteVO.getNombre());
				cliente.setApellido_paterno(clienteVO.getApellido_paterno());
				cliente.setApellido_materno(clienteVO.getApellido_materno());
				cliente.setCelular(clienteVO.getCelular());
				cliente.setCorreo(clienteVO.getCorreo());
				cliente.setDireccion(clienteVO.getDireccion());
				cliente.setORM_Logintoken(LoginDAO.getLoginByORMID(clienteVO
						.getoLoginVO().getToken()));

				ClienteDAO.save(cliente);
				t.commit();
				return "Cliente agregado";
			} catch (Exception e) {
				t.rollback();
			}
			return null;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static List<ClienteVO> filtrarCliente(String busqueda,
			String atributo) {
		List<domain.ClienteVO> clientes = new ArrayList<domain.ClienteVO>();
		orms.Cliente[] ormsClientes;
		try {
			PersistentSession s = orms.TallerAplicado1PersistentManager
					.instance().getSession();
			ormsClientes = orms.ClienteDAO.listClienteByQuery(atributo + "= '"
					+ busqueda + "'", null);

			int length = ormsClientes.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormsClientes[i]);
				clientes.add(new domain.ClienteVO(ormsClientes[i].getId(),
						ormsClientes[i].getNombre(), ormsClientes[i]
								.getApellido_paterno(), ormsClientes[i]
								.getApellido_materno(), ormsClientes[i]
								.getRut(), ormsClientes[i].getCelular(),
						ormsClientes[i].getCorreo(), ormsClientes[i]
								.getDireccion(), null));

				s.close();
			}
			return clientes;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String modificarCliente(domain.ClienteVO oClienteVO) {

		try {
			PersistentTransaction t = orms.TallerAplicado1PersistentManager
					.instance().getSession().beginTransaction();

			try {
				orms.Cliente lormCliente = orms.ClienteDAO
						.getClienteByORMID(oClienteVO.getId());

				// cambio Cliente historico
				System.out.print(guardarClienteHistorico(lormCliente));
				// Modifica los datos del cliente
				lormCliente.setRut(oClienteVO.getRut());
				lormCliente.setNombre(oClienteVO.getNombre());
				lormCliente.setApellido_paterno(oClienteVO
						.getApellido_paterno());
				lormCliente.setApellido_materno(oClienteVO
						.getApellido_materno());
				lormCliente.setCorreo(oClienteVO.getCorreo());
				lormCliente.setCelular(oClienteVO.getCelular());
				lormCliente.setDireccion(oClienteVO.getDireccion());
				lormCliente.setORM_Logintoken(LoginDAO
						.getLoginByORMID(oClienteVO.getoLoginVO().getToken()));

				orms.ClienteDAO.save(lormCliente);
				t.commit();
				return "Modificado con exito";
			} catch (Exception e) {
				t.rollback();
				return null;
			}

		} catch (PersistentException e1) {
			e1.printStackTrace();
			return null;
		}
	}

	private static boolean guardarClienteHistorico(Cliente cliente) {

		try {
			Cliente_historico lormCambio_cliente = orms.Cliente_historicoDAO
					.createCliente_historico();
			lormCambio_cliente.setORM_Cliente(cliente);
			lormCambio_cliente.setRut(cliente.getRut());
			lormCambio_cliente.setNombre(cliente.getNombre());
			lormCambio_cliente.setApellido_paterno(cliente
					.getApellido_paterno());
			lormCambio_cliente.setApellido_materno(cliente
					.getApellido_materno());
			lormCambio_cliente.setCorreo(cliente.getCorreo());
			lormCambio_cliente.setCelular(cliente.getCelular());
			lormCambio_cliente.setDireccion(cliente.getDireccion());
			lormCambio_cliente.setORM_Logintoken(cliente.getLogintoken());
			lormCambio_cliente.setFecha_cambio(new Date());

			Cliente_historicoDAO.save(lormCambio_cliente);
			return true;
		} catch (PersistentException e1) {
			e1.printStackTrace();
			return false;
		}

	}

	public static List<Cliente_historicoVO> filtrarCambioHistorico(
			ClienteVO oClienteVO) {
		List<domain.Cliente_historicoVO> clienteHistorico = new ArrayList<domain.Cliente_historicoVO>();
		orms.Cliente_historico[] ormsCliente_historicos;
		try {

			ormsCliente_historicos = orms.Cliente_historicoDAO
					.listCliente_historicoByQuery(
							"cliente.id = '" + oClienteVO.getId() + "'", null);

			System.out.print(ormsCliente_historicos[0].getNombre());
			int length = ormsCliente_historicos.length;
			for (int i = 0; i < length; i++) {
				clienteHistorico.add(new Cliente_historicoVO(
						ormsCliente_historicos[i].getId(),
						ormsCliente_historicos[i].getNombre(),
						ormsCliente_historicos[i].getApellido_paterno(),
						ormsCliente_historicos[i].getApellido_materno(),
						ormsCliente_historicos[i].getRut(),
						ormsCliente_historicos[i].getCelular(),
						ormsCliente_historicos[i].getCorreo(),
						ormsCliente_historicos[i].getDireccion(), oClienteVO,
						oClienteVO.getoLoginVO(), ormsCliente_historicos[i]
								.getFecha_cambio()));
			}
			System.out.print(clienteHistorico.get(0).getApellido_paterno());
			return clienteHistorico;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String registrarCuentaACliente(CuentaVO oCuentaVO) {
		PersistentTransaction t;
		try {

			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				orms.Cuenta lormCuenta = orms.CuentaDAO.createCuenta();

				Cliente cliente = ClienteDAO.getClienteByORMID(oCuentaVO
						.getClienteVO().getId());
				Servicio servicio = ServicioDAO.getServicioByORMID(oCuentaVO
						.getServicioVO().getId());
				Login login = LoginDAO.getLoginByORMID(oCuentaVO.getLoginVO()
						.getToken());

				lormCuenta.setHabilitada(oCuentaVO.isHabilitada());
				lormCuenta.setORM_Cliente(cliente);
				lormCuenta.setORM_Servicio(servicio);
				lormCuenta.setORM_Logintoken(login);

				CuentaDAO.save(lormCuenta);
				t.commit();
				return "Se ha registrado una cuenta al cliente exitosamente";

			}

			catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			e1.printStackTrace();
			return "Error persistencia";
		}

	}

	public static List<domain.ServicioVO> mostrarServicio() {
		List<domain.ServicioVO> servicio = new ArrayList<domain.ServicioVO>();
		orms.Servicio[] ormsServicio;
		try {
			ormsServicio = orms.ServicioDAO.listServicioByQuery(null, null);

			int length = ormsServicio.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormsServicio[i]);
				servicio.add(new ServicioVO(ormsServicio[i].getId(),
						ormsServicio[i].getTipo_servicio(), ormsServicio[i]
								.getUnidad_de_medida(), ormsServicio[i]
								.getValor_unitario(), ormsServicio[i]
								.getCargo_fijo()));

			}
			return servicio;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static List<domain.CuentaVO> filtrarCuentasDelCliente(
			ClienteVO clienteVO) {
		List<domain.CuentaVO> cuentas = new ArrayList<domain.CuentaVO>();
		orms.Cuenta[] ormsCuentas;
		try {
			ormsCuentas = orms.CuentaDAO.listCuentaByQuery("cliente.id = '"
					+ clienteVO.getId() + "'", null);

			int length = ormsCuentas.length;
			System.out.println("el largo es" + length);
			for (int i = 0; i < length; i++) {
				if (ormsCuentas[i].getHabilitada()) {
					System.out.println(ormsCuentas[i].getServicio()
							.getTipo_servicio());
					ServicioVO servicioVO = new ServicioVO(ormsCuentas[i]
							.getServicio().getId(), ormsCuentas[i]
							.getServicio().getTipo_servicio(), ormsCuentas[i]
							.getServicio().getUnidad_de_medida(),
							ormsCuentas[i].getServicio().getValor_unitario(),
							ormsCuentas[i].getServicio().getCargo_fijo());
					LoginVO loginVO = new LoginVO(ormsCuentas[i]
							.getLogintoken().getToken());
					cuentas.add(new CuentaVO(ormsCuentas[i].getId(),
							ormsCuentas[i].getHabilitada(), clienteVO,
							servicioVO, loginVO));
				}
			}
			return cuentas;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String deshabilitarCuentaACliente(CuentaVO oCuentaVO) {
		PersistentTransaction t;
		try {

			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				orms.Cuenta lormCuenta = CuentaDAO.getCuentaByORMID(oCuentaVO
						.getId());

				lormCuenta.setHabilitada(oCuentaVO.isHabilitada());
				lormCuenta.setLogintoken(LoginDAO.getLoginByORMID(oCuentaVO
						.getLoginVO().getToken()));

				CuentaDAO.save(lormCuenta);
				t.commit();
				return "Se ha deshabilitado esta cuenta al cliente";

			}

			catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			e1.printStackTrace();
			return "Error persistencia";
		}

	}

	public static void main(String[] args) {
		AdministradorVO admin = new AdministradorVO();
		admin.setUsuario("fabricio");
		admin.setClave("fabricio");

		LoginVO login = loggearAdministrador(admin);

		System.out.print(login.getToken());
	}

}
package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orms.Administrador;
import orms.Cliente;
import orms.ClienteDAO;
import orms.Login;
import orms.LoginDAO;
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
	
	public static String agregarCliente(ClienteVO clienteVO){
		try{
			PersistentTransaction t= orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();
			try{
			orms.Cliente cliente = orms.ClienteDAO.createCliente();
			cliente.setRut(clienteVO.getRut());
			cliente.setNombre(clienteVO.getNombre());
			cliente.setApellido_paterno(clienteVO.getApellido_paterno());
			cliente.setApellido_materno(clienteVO.getApellido_materno());
			cliente.setCelular(clienteVO.getCelular());
			cliente.setCorreo(clienteVO.getCorreo());
			cliente.setDireccion(clienteVO.getDireccion());
			cliente.setORM_Logintoken(LoginDAO.getLoginByORMID(clienteVO.getoLoginVO().getToken()));
		
			ClienteDAO.save(cliente);
			t.commit();
			return "Cliente agregado";
			}catch(Exception e){
				t.rollback();
			}
			return null;
		}catch(PersistentException e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static List<ClienteVO> filtrarCliente(String busqueda, String atributo) {
		List<domain.ClienteVO> clientes = new ArrayList<domain.ClienteVO>();
		orms.Cliente[] ormsClientes;
		try {
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

			}
			return clientes;
		} catch (PersistentException e) {
			e.printStackTrace();
			return null;
		}
	}


	public static String modificarCliente(domain.ClienteVO oClienteVO) {

		
		try {
			PersistentTransaction t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				orms.Cliente lormCliente = orms.ClienteDAO.getClienteByORMID(oClienteVO.getId());

				// cambio Cliente historico
				guardarClienteHistorico(lormCliente);
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
				lormCliente.setORM_Logintoken(LoginDAO.getLoginByORMID(oClienteVO.getoLoginVO().getToken()));

				orms.ClienteDAO.save(lormCliente);
				t.commit();
				return "Modificado con exito";
			}catch(Exception e) {
				t.rollback();
				return null;
			}
		}catch(PersistentException e1) {
			e1.printStackTrace();
			return null;
		}
	}

	private static boolean guardarClienteHistorico(Cliente cliente){
		PersistentTransaction t;
		try {
			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
		orms.Cliente_historico lormCambio_cliente = orms.Cliente_historicoDAO
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

		orms.Cliente_historicoDAO.save(lormCambio_cliente);
		t.commit();
		return true;
			} catch (Exception e) {
				t.rollback();
				return false;
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
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

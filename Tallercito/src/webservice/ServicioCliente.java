package webservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import orms.Cliente_historico;
import sun.security.krb5.internal.LoginOptions;
import domain.ClienteVO;
import domain.Cliente_historicoVO;
import domain.LoginVO;

public class ServicioCliente {

	public String agregarCliente(domain.ClienteVO oClienteVO) {
		PersistentTransaction t;
		try {
			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {

				if (oClienteVO.getNombre() == ""
						|| oClienteVO.getApellido_paterno() == ""
						|| oClienteVO.getApellido_materno() == ""
						|| oClienteVO.getRut() == ""
						|| oClienteVO.getCelular() == ""
						|| oClienteVO.getCorreo() == ""
						|| oClienteVO.getDireccion() == "") {

					return "Debe ingresar todos los parametros para almacenar un contacto";

				} else {

					orms.Cliente[] ormClientes, ormClientes2;

					String rutRepetido = "";
					String mailRepetido = "";
					rutRepetido += "rut = '" + oClienteVO.getRut() + "'";
					mailRepetido += "correo = '" + oClienteVO.getCorreo() + "'";

					// consultamos por el rut en la base de datos
					ormClientes2 = orms.ClienteDAO.listClienteByQuery(
							rutRepetido, null);
					// consultamos por el mail en la base de datos
					ormClientes = orms.ClienteDAO.listClienteByQuery(
							mailRepetido, null);

					if (!val.Validacion.largoCadena(oClienteVO.getNombre(), 30)) {
						return "Nombre excede de los caracteres permitidos";
					} else if (!val.Validacion.largoCadena(
							oClienteVO.getApellido_paterno(), 20)) {
						return "Apellido paterno excede de los caracteres permitidos";
					} else if (!val.Validacion.largoCadena(
							oClienteVO.getApellido_materno(), 20)) {
						return "Apellido materno excede de los caracteres permitidos";
					} else if (!val.Validacion.largoCadena(oClienteVO.getRut(),
							11)) {
						return "RUT excede de los caracteres permitidos";
					} else if (!val.Validacion.largoCadena(
							oClienteVO.getCelular(), 10)) {
						return "Telefono excede de los caracteres permitidos";
					} else if (!val.Validacion.largoCadena(
							oClienteVO.getCorreo(), 50)) {
						return "Mail excede de los caracteres permitidos";
					} else if (!val.Validacion.largoCadena(
							oClienteVO.getDireccion(), 50)) {
						return "Direccion excede de los caracteres permitidos";

					} else if (ormClientes.length != 0) {
						return "El mail ingresado ya se encuentra en uso";
					} else if (!val.Validacion.validarEmail(oClienteVO
							.getCorreo())) {
						return "El Email no contiene un formato valido";
					} else if (!val.Validacion.validarTelefono(oClienteVO
							.getCelular())) {
						return "El numero de Telefono es invalido";
					} else if (!val.Validacion.noNumero(oClienteVO.getNombre())
							|| !val.Validacion.noNumero(oClienteVO
									.getApellido_paterno())
							|| !val.Validacion.noNumero(oClienteVO
									.getApellido_materno())) {
						return "Nombre y apellido no pueden contener numeros";
					} else if (!val.Validacion.validarRut(oClienteVO.getRut())) {
						return "El rut ingresado no es valido";
					} else if (ormClientes2.length != 0) {
						return "El RUT ingresado ya se encuentra en uso";
					} else {

						// procedemos a ingresar los datos, evitando que el rut
						// y el mail esten repetidos en la BD
						orms.Cliente lormCliente = orms.ClienteDAO
								.createCliente();

						lormCliente.setNombre(oClienteVO.getNombre());
						lormCliente.setApellido_paterno(oClienteVO
								.getApellido_paterno());
						lormCliente.setApellido_materno(oClienteVO
								.getApellido_materno());
						lormCliente.setRut(oClienteVO.getRut());
						lormCliente.setCelular(oClienteVO.getCelular());
						lormCliente.setCorreo(oClienteVO.getCorreo());
						lormCliente.setDireccion(oClienteVO.getDireccion());

						String condLogin = "";
						condLogin += "usuario = '"
								+ oClienteVO.getoLoginVO()
										.getoAdministradorVO().getUsuario()
								+ "'";
						condLogin += "and clave = '"
								+ oClienteVO.getoLoginVO()
										.getoAdministradorVO().getClave() + "'";

						orms.Administrador adminLogeadoORM = orms.AdministradorDAO
								.loadAdministradorByQuery(condLogin, null);

						String logCond = "token = '"
								+ oClienteVO.getoLoginVO().getToken() + "'";
						orms.Login loginAdminORM = orms.LoginDAO
								.loadLoginByQuery(logCond, null);

						loginAdminORM.setORM_Administrador(adminLogeadoORM);

						lormCliente.setORM_Login(loginAdminORM);

						orms.ClienteDAO.save(lormCliente);
						t.commit();
						return "Se ha ingresado un cliente exitosamente";
					}
				}
			}

			catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}
	}

	public List<domain.ClienteVO> filtrarCliente(String busqueda,
			String atributo) {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Modifica un Cliente
	 * 
	 * @param domain
	 *            .ClienteVO oClienteVO
	 * @return String
	 */

	public String modificarCliente(domain.ClienteVO oClienteVO) {

		PersistentTransaction t;
		try {
			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				orms.Cliente lormCliente = orms.ClienteDAO.loadClienteByQuery(
						"id = '" + oClienteVO.getId() + "'", null);

				JOptionPane.showMessageDialog(null, oClienteVO.getCorreo());

				String condLogin = "";
				condLogin += "usuario = '"
						+ oClienteVO.getoLoginVO().getoAdministradorVO()
								.getUsuario() + "'";
				condLogin += "and clave = '"
						+ oClienteVO.getoLoginVO().getoAdministradorVO()
								.getClave() + "'";

				orms.Administrador adminLogeadoORM = orms.AdministradorDAO
						.loadAdministradorByQuery(condLogin, null);

				String logCond = "token = '"
						+ oClienteVO.getoLoginVO().getToken() + "'";
				orms.Login loginAdminORM = orms.LoginDAO.loadLoginByQuery(
						logCond, null);

				loginAdminORM.setORM_Administrador(adminLogeadoORM);

				// cambio Cliente
				orms.Cliente_historico lormCambio_cliente = orms.Cliente_historicoDAO
						.createCliente_historico();
				lormCambio_cliente.setORM_Cliente(lormCliente);
				lormCambio_cliente.setRut(lormCliente.getRut());
				lormCambio_cliente.setNombre(lormCliente.getNombre());
				lormCambio_cliente.setApellido_paterno(lormCliente
						.getApellido_paterno());
				lormCambio_cliente.setApellido_materno(lormCliente
						.getApellido_materno());
				lormCambio_cliente.setCorreo(lormCliente.getCorreo());
				lormCambio_cliente.setCelular(lormCliente.getCelular());
				lormCambio_cliente.setDireccion(lormCliente.getDireccion());
				lormCambio_cliente.setORM_Login(loginAdminORM);
				lormCambio_cliente.setFecha_cambio(new Date());

				JOptionPane.showMessageDialog(null,
						lormCambio_cliente.getCorreo());

				// Guarda el cambio del Cliente
				orms.Cliente_historicoDAO.save(lormCambio_cliente);

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
				// loginAdminORM.setORM_Usuario(adminLogeadoORM);
				lormCliente.setORM_Login(loginAdminORM);
				// lormCliente.setORM_Token(loginAdminORM);

				JOptionPane.showMessageDialog(null, lormCliente.getCorreo());

				// Guarda las modificaciones del Cliente
				orms.ClienteDAO.save(lormCliente);

				System.out.println("Modificado con Exito");
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return "modificado";
	}

	public List<domain.Cliente_historicoVO> filtrarCambioHistorico(
			ClienteVO oClienteVO) {
		List<domain.Cliente_historicoVO> clienteHistorico = new ArrayList<domain.Cliente_historicoVO>();
		orms.Cliente_historico[] ormsCliente_historicos;
		try {
			ormsCliente_historicos = orms.Cliente_historicoDAO
					.listCliente_historicoByQuery(
							"cliente.id = '" + oClienteVO.getId() + "'", null);

			int length = ormsCliente_historicos.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormsCliente_historicos[i]);
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
			return clienteHistorico;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] Args) {

		ServicioCliente service = new ServicioCliente();

		System.out.print(service.filtrarCliente("16988653-9", "rut").get(0)
				.getApellido_paterno());
	}

}

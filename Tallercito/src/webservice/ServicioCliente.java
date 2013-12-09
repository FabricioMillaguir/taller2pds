package webservice;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import domain.LoginVO;


public class ServicioCliente {
	
	public String agregarCliente(domain.ClienteVO oClienteVO){
		PersistentTransaction t;
		try {
			t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();

			try {

				if(oClienteVO.getNombre()=="" || oClienteVO.getApellido_paterno()=="" || oClienteVO.getApellido_materno()=="" || oClienteVO.getRut()=="" ||	oClienteVO.getCelular()=="" || 
						oClienteVO.getCorreo()=="" ||	oClienteVO.getDireccion()==""){

					return "Debe ingresar todos los parametros para almacenar un contacto";

				}else{

					orms.Cliente[] ormClientes, ormClientes2;

					String rutRepetido="";
					String mailRepetido = "";
					rutRepetido += "rut = '"+oClienteVO.getRut()+"'";
					mailRepetido += "correo = '"+oClienteVO.getCorreo()+"'";

					//consultamos por el rut en la base de datos
					ormClientes2 = orms.ClienteDAO.listClienteByQuery(rutRepetido, null);
					//consultamos por el mail en la base de datos
					ormClientes = orms.ClienteDAO.listClienteByQuery(mailRepetido, null);

					if(!val.Validacion.largoCadena(oClienteVO.getNombre(), 30)){
						return "Nombre excede de los caracteres permitidos";
					} else if(!val.Validacion.largoCadena(oClienteVO.getApellido_paterno(), 20)){
						return "Apellido paterno excede de los caracteres permitidos";
					} else if(!val.Validacion.largoCadena(oClienteVO.getApellido_materno(), 20)){
						return "Apellido materno excede de los caracteres permitidos";
					} else if(!val.Validacion.largoCadena(oClienteVO.getRut(), 11)){
						return "RUT excede de los caracteres permitidos";
					} else if(!val.Validacion.largoCadena(oClienteVO.getCelular(), 10)){
						return "Telefono excede de los caracteres permitidos";
					} else if(!val.Validacion.largoCadena(oClienteVO.getCorreo(), 50)){
						return "Mail excede de los caracteres permitidos";
					} else if(!val.Validacion.largoCadena(oClienteVO.getDireccion(), 50)){
						return "Direccion excede de los caracteres permitidos";

					} else	if(ormClientes.length !=0){
						return "El mail ingresado ya se encuentra en uso";
					} else if(!val.Validacion.validarEmail(oClienteVO.getCorreo())){
						return "El Email no contiene un formato valido";
					} else if(!val.Validacion.validarTelefono(oClienteVO.getCelular())){
						return "El numero de Telefono es invalido";
					} else if(!val.Validacion.noNumero(oClienteVO.getNombre()) || !val.Validacion.noNumero(oClienteVO.getApellido_paterno()) || !val.Validacion.noNumero(oClienteVO.getApellido_materno())){
						return "Nombre y apellido no pueden contener numeros";
					} else if(!val.Validacion.validarRut(oClienteVO.getRut())){
						return "El rut ingresado no es valido";
					} else if(ormClientes2.length !=0){
						return "El RUT ingresado ya se encuentra en uso";
					} else {

						//procedemos a ingresar los datos, evitando que el rut y el mail esten repetidos en la BD
						orms.Cliente lormCliente = orms.ClienteDAO.createCliente();
						// Initialize the properties of the persistent object here
						/*lormCliente.setNombre(val.Validacion.cadenaMayus(oClienteVO.getNombre()));
						lormCliente.setApellido_paterno(val.Validacion.cadenaMayus(oClienteVO.getApellido_paterno()));
						lormCliente.setApellido_materno(val.Validacion.cadenaMayus(oClienteVO.getApellido_materno()));
						lormCliente.setRut(oClienteVO.getRut());
						lormCliente.setCelular(oClienteVO.getCelular());
						lormCliente.setCorreo(val.Validacion.cadenaMayus(oClienteVO.getCorreo()));
						lormCliente.setDireccion(val.Validacion.cadenaMayus(oClienteVO.getDireccion()));*/
						lormCliente.setNombre(oClienteVO.getNombre());
						lormCliente.setApellido_paterno(oClienteVO.getApellido_paterno());
						lormCliente.setApellido_materno(oClienteVO.getApellido_materno());
						lormCliente.setRut(oClienteVO.getRut());
						lormCliente.setCelular(oClienteVO.getCelular());
						lormCliente.setCorreo(oClienteVO.getCorreo());
						lormCliente.setDireccion(oClienteVO.getDireccion());

						String condLogin = "";
						condLogin += "usuario = '"+oClienteVO.getoLoginVO().getoAdministradorVO().getUsuario()+"'";
						condLogin += "and clave = '"+oClienteVO.getoLoginVO().getoAdministradorVO().getClave()+"'";

						orms.Administrador adminLogeadoORM = orms.AdministradorDAO.loadAdministradorByQuery(condLogin, null);

						String logCond = "token = '"+oClienteVO.getoLoginVO().getToken()+"'";
						orms.Login loginAdminORM = orms.LoginDAO.loadLoginByQuery(logCond, null);

						loginAdminORM.setORM_Administrador(adminLogeadoORM);
						//loginAdminORM.setORM_Usuario(adminLogeadoORM);
						lormCliente.setORM_Login(loginAdminORM);
						//lormCliente.setORM_Token(loginAdminORM);

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
	
	/*
	public List<domain.ContactoVO> mostrarContacto(){
		List<domain.ContactoVO> contactos = new ArrayList<domain.ContactoVO>();
		orm.Contacto[] ormContactos;
		try {
		ormContactos = orm.ContactoDAO.listContactoByQuery(null , null);
		int length = ormContactos.length;
		for (int i = 0; i < length; i++) {
		System.out.println(ormContactos[i]);
		contactos.add(new
		domain.ContactoVO(ormContactos[i].getUid(),
				ormContactos[i].getNombre(),
		ormContactos[i].getApellido(),
		ormContactos[i].getMail(),
		ormContactos[i].getTelefono()));
		}
		return contactos;
		} catch (PersistentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
		}
		}*/
		
		/**
		* Filtra contactos
		* @param String busqueda
		* @param String atributo
		* @return List<domain.ContactoVO>
		*/
		public List<domain.ClienteVO> filtrarCliente(String busqueda, String atributo){
			List<domain.ClienteVO> clientes = new ArrayList<domain.ClienteVO>();
			orms.Cliente[] ormsClientes;
			try {
				ormsClientes = orms.ClienteDAO.listClienteByQuery(atributo + "= '" + busqueda + "'", null);
		
			
			int length = ormsClientes.length;
			for (int i = 0; i < length; i++) {
			System.out.println(ormsClientes[i]);
			clientes.add(new domain.ClienteVO(ormsClientes[i].getId(), ormsClientes[i].getNombre(), ormsClientes[i].getApellido_paterno(), ormsClientes[i].getApellido_materno(), ormsClientes[i].getRut(), ormsClientes[i].getCelular(), ormsClientes[i].getCorreo(), ormsClientes[i].getDireccion()));
					
			}
			return clientes;
			} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			}
			}
		
		/**
		* Elimina un Contacto
		* @param int uid
		* @return String
		*/
		
		/* eliminar
		public String eliminarContacto(int uid) {
			
			PersistentTransaction t;
			try {
			 t = orm.Taller1MagisterInformaticaPersistentManager.instance().getSession().beginTransaction();
			
			 try{
				orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery("uid = " + uid, null);
				// Delete the persistent object
				orm.ContactoDAO.delete(lormContacto);
				System.out.println("Eliminado con Exito");
				t.commit();
				
			}
			catch (Exception e) {
				t.rollback();
			}
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
			
			return "eliminado";
		}*/
		
		
		/**
		* Modifica un Contacto
		* @param domain.ContactoVO oContactoVO
		* @return String
		*/
		
	/*	public String modificarCliente(domain.ClienteVO oClienteVO){
			
			PersistentTransaction t;
			try {
			t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();

			
			try{
				orms.Cliente lormCliente = orms.ClienteDAO.loadClienteByQuery("id_cliente = '" + oClienteVO.getId()) + "'", null);
				
				// Update the properties of the persistent object
				lormCliente.setRut(oClienteVO.getRut());
				lormCliente.setNombre(oClienteVO.getNombre());
				lormCliente.setApellido_paterno(oClienteVO.getApellido_paterno());
				lormCliente.setApellido_materno(oClienteVO.getApellido_materno());
				lormCliente.setCorreo(oClienteVO.getCorreo());
				lormCliente.setCelular(oClienteVO.getCelular());
				lormCliente.setDireccion(oClienteVO.getDireccion());
				
				orms.ClienteDAO.save(lormCliente);
				
				/*orms.Cambio_cliente lormCambio_cliente = orms.Cambio_clienteDAO.createCambio_cliente();
				lormCambio_cliente.setId_cliente(lormCliente);
				lormCambio_cliente.setRut(lormCliente.getRut());
				lormCambio_cliente.setNombre(lormCliente.getNombre());
				lormCambio_cliente.setApellido_paterno(lormCliente.getApellido_paterno());
				lormCambio_cliente.setApellido_materno(lormCliente.getApellido_materno());
				lormCambio_cliente.setCorreo(lormCliente.getCorreo());
				lormCambio_cliente.setCelular(lormCliente.getCelular());
				lormCambio_cliente.setDireccion(lormCliente.getDireccion());
				lormCambio_cliente.setFecha_cambio(new Date());
				
				
				System.out.println("Modificado con Exito");
				t.commit();
			}
			catch (Exception e) {
				t.rollback();
			}
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
			
			return "modificado";
		}

		
	*/

}

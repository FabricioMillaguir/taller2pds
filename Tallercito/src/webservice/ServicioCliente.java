package webservice;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class ServicioCliente {
	
	public String agregarCliente(domain.ClienteVO oClienteVO){
		PersistentTransaction t;
		try {
		t=orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();

		
		try {
		orms.Cliente lormCliente = orms.ClienteDAO.createCliente();
			
		
		// Initialize the properties of the persistent object here
		
		lormCliente.setRut(oClienteVO.getRut());
		lormCliente.setNombre(oClienteVO.getNombre());
		lormCliente.setApellido_paterno(oClienteVO.getApellido_paterno());
		lormCliente.setApellido_materno(oClienteVO.getApellido_materno());
		lormCliente.setCelular(oClienteVO.getCelular());
		lormCliente.setCorreo(oClienteVO.getCorreo());
		lormCliente.setDireccion(oClienteVO.getDireccion());
		
		orms.ClienteDAO.save(lormCliente);
		System.out.println("Ingreso Exitoso");
		t.commit();
		return "Ingreso exitoso";
		
		
		
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
	/*
		public List<domain.ClienteVO> filtrarCliente(String busqueda, String atributo){
			List<domain.ClienteVO> clientes = new ArrayList<domain.ClienteVO>();
			orms.Cliente[] ormClientes;
			try {
			ormClientes = orms.ClienteDAO.listClienteByQuery(atributo + "= '" + busqueda + "'" , null);
			
			int length = ormClientes.length;
			for (int i = 0; i < length; i++) {
			System.out.println(ormClientes[i]);
			clientes.add(new
			domain.ClienteVO(ormClientes[i].getId(),
					ormClientes[i].getRut(),
					ormClientes[i].getNombre(),
			ormClientes[i].getApellido_paterno(),
			ormClientes[i].getApellido_materno(),
			ormClientes[i].getCorreo(),
			ormClientes[i].getDireccion(),
			ormClientes[i].getCelular()
			));
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

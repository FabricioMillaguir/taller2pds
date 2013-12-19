package webservice;

import java.util.List;

import domain.AdministradorVO;
import domain.ClienteVO;
import domain.LoginVO;
import domain.Negocio;

public class ServicioGastosComunes {
	
	public static LoginVO loggear(AdministradorVO administradorVO){
		return Negocio.loggearAdministrador(administradorVO);			
	}
	
	public static String agregarAdministrador(AdministradorVO administradorVO){
		return Negocio.agregarAdministrador(administradorVO);
	}

	public static String agregarCliente(ClienteVO clienteVO){
		return Negocio.agregarCliente(clienteVO);
	}
	
	public static List<ClienteVO> filtrarCliente(String busqueda, String atributo){
		return Negocio.filtrarCliente(busqueda, atributo);
	}
	
	public static String modificarCliente(ClienteVO clienteVO){
		return Negocio.modificarCliente(clienteVO);
	}
}

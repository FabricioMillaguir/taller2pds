package webservice;

import java.util.List;

import domain.AdministradorVO;
import domain.ClienteVO;
import domain.ClienteHistoricoVO;
import domain.ConsumoVO;
import domain.CuentaVO;
import domain.LoginVO;
import domain.Negocio;
import domain.ServicioVO;

public class ServicioGastosComunes {

	public static LoginVO loggear(AdministradorVO administradorVO) {
		return Negocio.loggearAdministrador(administradorVO);
	}

	public static String agregarAdministrador(AdministradorVO administradorVO) {
		return Negocio.agregarAdministrador(administradorVO);
	}

	public static String agregarCliente(ClienteVO clienteVO) {
		return Negocio.agregarCliente(clienteVO);
	}

	public static List<ClienteVO> filtrarCliente(String busqueda,
			String atributo) {
		return Negocio.filtrarCliente(busqueda, atributo);
	}

	public static String modificarCliente(ClienteVO clienteVO) {
		return Negocio.modificarCliente(clienteVO);
	}

	public static List<ClienteHistoricoVO> filtrarCambioHistorico(
			ClienteVO clienteVO) {
		return Negocio.filtrarCambioHistorico(clienteVO);
	}

	public static String registrarCuentaACliente(CuentaVO cuentaVO) {
		return Negocio.registrarCuentaACliente(cuentaVO);
	}

	public static List<ServicioVO> mostrarServicio() {
		return Negocio.mostrarServicio();
	}

	public static List<CuentaVO> filtrarCuentasDelCliente(ClienteVO clienteVO) {
		return Negocio.filtrarCuentasDelCliente(clienteVO);
	}

	public static CuentaVO filtrarCuenta(CuentaVO cuentaVO){
		return Negocio.filtrarCuenta(cuentaVO);
	}
	
	public static String deshabilitarCuentaACliente(CuentaVO cuentaVO) {
		return Negocio.deshabilitarCuentaACliente(cuentaVO);
	}
	
	public static String registrarConsumoDeCuenta(ConsumoVO consumoVO){
		return Negocio.registrarConsumoDeCuenta(consumoVO);
	}
	
	public static String modificarConsumo(ConsumoVO consumoVO){
		return Negocio.modificarConsumo(consumoVO);
	}
}

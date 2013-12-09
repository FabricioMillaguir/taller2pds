/*package spring3.controller;

//import net.viralpatel.spring3.form.Contact;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import spring3.form.Administrador;
import spring3.form.AdministradorForm;
import spring3.form.Cliente;
import spring3.form.ClienteForm;
import spring3.form.ClienteHistorico;
import spring3.form.ClienteHistoricoForm;
import spring3.form.Consumo;
import spring3.form.ConsumoForm;
import spring3.form.Cuenta;
import spring3.form.CuentaForm;
import spring3.form.Login;
import spring3.form.LoginForm;
import spring3.form.Servicio;
import spring3.form.ServicioForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

//import webservice.ServicioAdministracionStub;
//import webservice.ServicioClienteStub;
//import webservice.ServicioCuentaStub;






import webservice.ServicioAdministracionStub;
// --------------------Importar VO-----------------------------------------------
import webservice.ServicioAdministracionStub.AdministradorVO;
import webservice.ServicioClienteStub.Cliente_historicoVO;
import webservice.ServicioClienteStub.ClienteVO;
import webservice.ServicioCuentaStub.ConsumoVO;
import webservice.ServicioCuentaStub.CuentaVO;
import webservice.ServicioCuentaStub.LoginVO;
import webservice.ServicioAdministracionStub.ServicioVO;
//--------Importar Funciones------------------------------------------------------
import webservice.ServicioAdministracionStub.AgregarAdministrador;
import webservice.ServicioAdministracionStub.AgregarAdministradorResponse;
import webservice.ServicioClienteStub.AgregarCliente;
import webservice.ServicioClienteStub.AgregarClienteResponse;
import webservice.ServicioCuentaStub.ModificarConsumo;
import webservice.ServicioCuentaStub.ModificarConsumoResponse;
import webservice.ServicioCuentaStub.DesactivarCuenta;
import webservice.ServicioCuentaStub.DesactivarCuentaResponse;
import webservice.ServicioClienteStub.FiltrarCliente;
import webservice.ServicioClienteStub.FiltrarClienteResponse;
import webservice.ServicioAdministracionStub.LoginAdministrador;
import webservice.ServicioAdministracionStub.LoginAdministradorResponse;
import webservice.ServicioClienteStub.ModificarCliente;
import webservice.ServicioClienteStub.ModificarClienteResponse;
import webservice.ServicioClienteStub.MostrarClientes;
import webservice.ServicioClienteStub.MostrarClientesResponse;
import webservice.ServicioClienteStub.MostrarClientesHistoricos;
import webservice.ServicioClienteStub.MostrarClientesHistoricosResponse;
import webservice.ServicioCuentaStub.PagoConsumo;
import webservice.ServicioCuentaStub.RegistrarCuenta;
import webservice.ServicioCuentaStub.RegistrarCuentaResponse;
import webservice.ServicioAdministracionStub.ModificarServicio;
import webservice.ServicioAdministracionStub.ModificarServicioResponse;

@Controller
@SessionAttributes
public class CuentaController {

	// --------------------------------- Login -----------------------------------------
	@RequestMapping("/login")
	public ModelAndView abrirPrincipal() {
		// Administrador oAdministrador = new Administrador();
		return new ModelAndView("login", "command", new Administrador());
	}

	// Loguearse, generar token y todo lo demas
	@RequestMapping("/loguear")
	public ModelAndView logearAdministrador(
			@ModelAttribute("Administrador") @Valid Administrador admin,
			BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("log");
		}
		try {
			webservice.ServicioAdministracionStub oStub = new webservice.ServicioAdministracionStub();

			AdministradorVO oAdministradorVO = new AdministradorVO();

			oAdministradorVO.setUsuario(admin.getUsuario());
			oAdministradorVO.setClave(admin.getPass());

			AdministradorVO administrador = new AdministradorVO();
			administrador.setUsuario(admin.getUsuario());
			administrador.setClave(admin.getPass());
			session.setAttribute("admin", administrador);

			LoginAdministrador logAdmin = new LoginAdministrador();
			logAdmin.setOAdministradorVO(oAdministradorVO);

			LoginAdministradorResponse objResponse = oStub
					.loginAdministrador(logAdmin);
			
			String mensaje = objResponse.get_return();
			System.out.println("mensaje(token) --->"+mensaje);
			session.setAttribute("token", mensaje);
			
			
			if (mensaje.equals("Ingrese sus datos para logearse")) {
				return new ModelAndView("mensaje", "message", mensaje);
			
			} else if (mensaje.equals("El largo de usuario no puede exceder de 20 caracteres")) {
				return new ModelAndView("mensaje", "message", mensaje);
				
			} else if (mensaje.equals( "La clave es incorrecta")) {
				return new ModelAndView("mensaje", "message", mensaje);	
			
			} else if (mensaje.equals( "La cuenta de administrador no existe")) {
				return new ModelAndView("mensaje", "message", mensaje);	
				
			}else{

				return new ModelAndView("menu", "command", "");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("mensaje", "message", "ERROR");
		}
	}

	// Carga menues para los diferentes items

	// ---------------------- Menu principal -------------------------------
	@RequestMapping("/menu")
	public ModelAndView menu() {

		return new ModelAndView("menu");
	}

	// ------------------------Menu administracion  ----------------------------

	// menu pricipal administrador
	@RequestMapping("/administracion")
	public ModelAndView administracion() {

		return new ModelAndView("administracion");
	}

	// menu para ingresar datos para administrador
	@RequestMapping("/agregarAdmin")
	public ModelAndView registrarAdmin() {

		return new ModelAndView("registrarAdmin", "command",
				new Administrador());
	}

	// Registrar un nuevo administrador en BD
	@RequestMapping(value = "/registrarAdmin", method = RequestMethod.POST)
	public ModelAndView registrarAdmin(
			@ModelAttribute("administrador") @Valid Administrador administrador,
			BindingResult result) {
		// BindingResult result,
		if (result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("administrador");
		}
		System.out.println("Usuario:" + administrador.getUsuario()
				+ "Contraseña:" + administrador.getPass());

		try {

			webservice.ServicioAdministracionStub oStub = new webservice.ServicioAdministracionStub();
			// AGREGAR NUEVO ADMINISTRADOR
			AdministradorVO oAdministradorVO = new AdministradorVO();
			oAdministradorVO.setUsuario(administrador.getUsuario());
			oAdministradorVO.setClave(administrador.getPass());

			AgregarAdministrador oAgregarAdministrador = new AgregarAdministrador();
			oAgregarAdministrador.setOAdministradorVO(oAdministradorVO);
			AgregarAdministradorResponse objResponse = oStub
					.agregarAdministrador(oAgregarAdministrador);
			String mensaje = objResponse.get_return();

			System.out.println(mensaje);
			return new ModelAndView("mensaje", "message", mensaje);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("mensaje", "message", "ERROR");
		}

		// return "redirect:contacts.html";

	}

	// menu para modificar servicios
	@RequestMapping("/modificarServicio")
	public ModelAndView modificarServicio() {

		return new ModelAndView("registrarServicio", "command", new Servicio());
	}

	// Registrar las modificaciones del servicio en la BD
	@RequestMapping(value = "/registrarServicio", method = RequestMethod.POST)
	public ModelAndView registrarServicio(
			@ModelAttribute("servicio") @Valid Servicio servicio,
			BindingResult result) {
		// BindingResult result,
		if (result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("servicio");
		}

		try {


			webservice.ServicioAdministracionStub oStub = new webservice.ServicioAdministracionStub();

			ServicioVO oServicioVO = new ServicioVO();

			oServicioVO.setTipo_servicio(servicio.getTipo_servicio());

			oServicioVO.setValor_unitario(servicio.getValor_unitario());
			oServicioVO.setValor_fijo(servicio.getValor_fijo());
			;

			ModificarServicio oModificarServicio = new ModificarServicio();
			oModificarServicio.setOServicioVO(oServicioVO);
			ModificarServicioResponse objResponse = oStub
					.modificarServicio(oModificarServicio);
			String mensaje = objResponse.get_return();

			System.out.println(mensaje);
			return new ModelAndView("mensaje", "message", mensaje);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("mensaje", "message", "ERROR");
		}

		// return "redirect:contacts.html";
	}

	// ------------------------- FIN MENU ADMINISTRADOR --------------------------

	// ---------------------------- MENU CLIENTES  --------------------------------------

	// MENU PRINCIPAL CLIENTES
	@RequestMapping("/clientes")
	public ModelAndView clientes() {

		return new ModelAndView("clientes");
	}

	// MENU REGISTRAR CLIENTES
	@RequestMapping("/agregarCliente")
	public ModelAndView registrarCliente() {

		return new ModelAndView("registrarCliente", "command", new Cliente());
	}

	// REGISTRAR CLIENTE EN BD
		@RequestMapping(value = "/registrarCliente", method = RequestMethod.POST)
		public ModelAndView registrarCliente(
				@ModelAttribute("Administrador") @Valid Cliente cliente,
				BindingResult result, HttpSession session) {
			// BindingResult result,
			if (result.hasErrors()) {
				System.out.println("ERROR");
				return new ModelAndView("log");
			}

			try {

				webservice.ServicioClienteStub oStub = new webservice.ServicioClienteStub();
				// AGREGA
				ClienteVO oClienteVO = new ClienteVO();
				oClienteVO.setNombre(cliente.getNombre());
				oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
				oClienteVO.setApellido_materno(cliente.getApellido_materno());
				oClienteVO.setRut(cliente.getRut());
				oClienteVO.setCelular(cliente.getCelular());
				oClienteVO.setCorreo(cliente.getCorreo());
				oClienteVO.setDireccion(cliente.getDireccion());
	
				webservice.ServicioClienteStub.LoginVO loginvo = new webservice.ServicioClienteStub.LoginVO();
				
				webservice.ServicioAdministracionStub.AdministradorVO administrador = (webservice.ServicioAdministracionStub.AdministradorVO) session.getAttribute("admin");
			
				webservice.ServicioClienteStub.AdministradorVO administradorCliente = new webservice.ServicioClienteStub.AdministradorVO();
				administradorCliente.setUsuario(administrador.getUsuario());
				administradorCliente.setClave(administrador.getClave());
				
	    		loginvo.setOAdministradorVO(administradorCliente);
				loginvo.setToken(session.getAttribute("token").toString());
				oClienteVO.setLogin(loginvo);
				
				System.out.println("token --->"+loginvo.getToken().toString() );
				System.out.println("user --->"+administradorCliente.getUsuario().toString());
				System.out.println("pass --->"+administradorCliente.getClave().toString() );
	
				AgregarCliente oAgregarCliente = new AgregarCliente();
				oAgregarCliente.setOClienteVO(oClienteVO);
				AgregarClienteResponse objResponse = oStub
						.agregarCliente(oAgregarCliente);
				String mensaje = objResponse.get_return();

				return new ModelAndView("mensaje", "message", mensaje);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("mensaje", "message", "ERROR");
			}

		}

		// MOSTRAR CLIENTES
		@RequestMapping("/mostrarClientes")
		public ModelAndView mostrarClientes() {
			
			List<Cliente> clientes = new ArrayList<Cliente>();

			ClienteForm clienteForm = new ClienteForm();
			
			try {
				
				webservice.ServicioClienteStub oStub = new webservice.ServicioClienteStub();
				MostrarClientes oMostrarContacto = new MostrarClientes();

				MostrarClientesResponse objResponde = oStub.mostrarClientes(oMostrarContacto);
				ClienteVO[] clientes2 = objResponde.get_return();

				clienteForm.setCliente(clientes2);
				return new ModelAndView("mostrarClientes", "clienteForm",
						clienteForm);

			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("mensaje", "message", "ERROR");
			}

		}
		
		// BUSCAR CLIENTES POR FILTRO-------------------------------------------------------
		
	//  EDITAR CLIENTES  --------------------------------------------------
			@RequestMapping("/buscarCliente")
			public ModelAndView filtrarCliente() {

				return new ModelAndView("buscarCliente", "command", new Cliente());
			}

				@RequestMapping(value = "/filtrarCliente", method = RequestMethod.POST)
				public ModelAndView filtrarCliente(
						@ModelAttribute("Administrador") @Valid Cliente cliente,
						BindingResult result, HttpSession session) {
					// BindingResult result,
					if (result.hasErrors()) {
						System.out.println("ERROR");
						return new ModelAndView("log");
					}
					try {
						ClienteForm clienteForm = new ClienteForm();

						webservice.ServicioClienteStub oStub = new webservice.ServicioClienteStub();
					
						ClienteVO oClienteVO = new ClienteVO();
						
						// filtro
						oClienteVO.setNombre(cliente.getNombre());
						oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
						oClienteVO.setApellido_materno(cliente.getApellido_materno());
						oClienteVO.setRut(cliente.getRut());
						oClienteVO.setCorreo(cliente.getCorreo());
						oClienteVO.setCelular(cliente.getCelular());
						oClienteVO.setDireccion(cliente.getDireccion());
			
						webservice.ServicioClienteStub.LoginVO loginvo = new webservice.ServicioClienteStub.LoginVO();
						
						webservice.ServicioAdministracionStub.AdministradorVO administrador = (webservice.ServicioAdministracionStub.AdministradorVO) session.getAttribute("admin");
					
						webservice.ServicioClienteStub.AdministradorVO administradorCliente = new webservice.ServicioClienteStub.AdministradorVO();
						administradorCliente.setUsuario(administrador.getUsuario());
						administradorCliente.setClave(administrador.getClave());
						
			    		loginvo.setOAdministradorVO(administradorCliente);
						loginvo.setToken(session.getAttribute("token").toString());
						oClienteVO.setLogin(loginvo);
						
						System.out.println("token --->"+loginvo.getToken().toString() );
						System.out.println("user --->"+administradorCliente.getUsuario().toString());
						System.out.println("pass --->"+administradorCliente.getClave().toString() );
						
						FiltrarCliente oFiltrarCliente = new FiltrarCliente();
						
						oFiltrarCliente.setOClienteVO(oClienteVO);
						FiltrarClienteResponse objResponse = oStub
								.filtrarCliente(oFiltrarCliente);
//						String mensaje = objResponse.get_return();
						
						ClienteVO[] filtrados = objResponse.get_return();

						clienteForm.setCliente(filtrados);

						return new ModelAndView("mostrarClientes", "clienteForm",
								clienteForm);

					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

						return new ModelAndView("mensaje", "message", "ERROR");
					}

				}
				
		
		
		
		
		
				
		//  EDITAR CLIENTES  --------------------------------------------------
		@RequestMapping("/modificarCliente")
		public ModelAndView modificarCliente() {

			return new ModelAndView("modificarCliente", "command", new Cliente());
		}

		// Registrar los cambios de cliente en BD
			@RequestMapping(value = "/modificaCliente", method = RequestMethod.POST)
			public ModelAndView editaCliente(
					@ModelAttribute("Administrador") @Valid Cliente cliente,
					BindingResult result, HttpSession session) {
				// BindingResult result,
				if (result.hasErrors()) {
					System.out.println("ERROR");
					return new ModelAndView("log");
				}
				try {

					webservice.ServicioClienteStub oStub = new webservice.ServicioClienteStub();
					// AGREGA
					ClienteVO oClienteVO = new ClienteVO();
					
					oClienteVO.setCorreo(cliente.getCorreo());
					
					oClienteVO.setNombre(cliente.getNombre());
					oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
					oClienteVO.setApellido_materno(cliente.getApellido_materno());
					oClienteVO.setRut(cliente.getRut());
					oClienteVO.setCelular(cliente.getCelular());
					oClienteVO.setDireccion(cliente.getDireccion());
		
					webservice.ServicioClienteStub.LoginVO loginvo = new webservice.ServicioClienteStub.LoginVO();
					
					webservice.ServicioAdministracionStub.AdministradorVO administrador = (webservice.ServicioAdministracionStub.AdministradorVO) session.getAttribute("admin");
				
					webservice.ServicioClienteStub.AdministradorVO administradorCliente = new webservice.ServicioClienteStub.AdministradorVO();
					administradorCliente.setUsuario(administrador.getUsuario());
					administradorCliente.setClave(administrador.getClave());
					
		    		loginvo.setOAdministradorVO(administradorCliente);
					loginvo.setToken(session.getAttribute("token").toString());
					oClienteVO.setLogin(loginvo);
					
					System.out.println("token --->"+loginvo.getToken().toString() );
					System.out.println("user --->"+administradorCliente.getUsuario().toString());
					System.out.println("pass --->"+administradorCliente.getClave().toString() );
					
					ModificarCliente oModificarCliente = new ModificarCliente();
					
					oModificarCliente.setOClienteVO(oClienteVO);
					ModificarClienteResponse objResponse = oStub
							.modificarCliente(oModificarCliente);
					String mensaje = objResponse.get_return();
					

					return new ModelAndView("mensaje", "message", mensaje);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

					return new ModelAndView("mensaje", "message", "ERROR");
				}

			}
			
		
		
	// MOSTRAR CLIENTES HISTORICOS
	@RequestMapping("/mostrarHistoricos")
	public ModelAndView mostrarHistoricos() {
		
		List<ClienteHistorico> clientesHist = new ArrayList<ClienteHistorico>();

		ClienteHistoricoForm clienteHistForm = new ClienteHistoricoForm();
		
		
		try {
			
			webservice.ServicioClienteStub oStub = new webservice.ServicioClienteStub();
			MostrarClientesHistoricos oMostrarHist = new MostrarClientesHistoricos();

			MostrarClientesHistoricosResponse objResponde = oStub.mostrarClientesHistoricos(oMostrarHist);
			Cliente_historicoVO[] historico = objResponde.get_return();

			clienteHistForm.setClienteHistorico(historico);
			return new ModelAndView("mostrarHistoricos", "clienteHistForm",
					clienteHistForm);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("mensaje", "message", "ERROR");
		}

	}
	
	
	
		//--------------------------------------FIN MENU CLIENTES ---------------------------------

			
			
	
	
	// --------------------Menu Cuentas ------------------------------------
	@RequestMapping("/cuentas")
	public ModelAndView cuentas() {

		return new ModelAndView("cuentas");
	}

}*/
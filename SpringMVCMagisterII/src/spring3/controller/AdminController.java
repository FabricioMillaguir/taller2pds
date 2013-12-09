package spring3.controller;


import java.rmi.RemoteException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ctc.wstx.evt.WEvent;

import spring3.form.Administrador;
import spring3.form.Cliente;
import spring3.form.ClienteForm;
import spring3.form.Login;
import spring3.form.Servicio;



import webservice.ServicioAdministradorStub;
import webservice.ServicioAdministradorStub.AdministradorVO;
import webservice.ServicioAdministradorStub.AgregarAdministrador;
import webservice.ServicioAdministradorStub.AgregarAdministradorResponse;
import webservice.ServicioAdministradorStub.LoginAdministrador;
import webservice.ServicioAdministradorStub.LoginAdministradorResponse;
import webservice.ServicioClienteStub;
/**************Fin Administracion*********************************/
/************************Cliente*********************************/
import webservice.ServicioClienteStub.ClienteVO;
import webservice.ServicioClienteStub.AgregarCliente;
import webservice.ServicioClienteStub.AgregarClienteResponse;
import webservice.ServicioClienteStub.LoginVO;


/************************Fin Cliente*********************************/
/***********************Cuenta****************************************/
import webservice.ServicioCuentaStub.AgregarCuenta;
/*********************Fin Cuenta **************************************/


@Controller
@SessionAttributes
public class AdminController {


	@RequestMapping("/login")
	public ModelAndView abrirPrincipal() {
		return new ModelAndView("login", "command", new Administrador());
	}

	/**
	 * Logear.
	 *
	 * @param admin the admin
	 * @param result the result
	 * @param session the session
	 * @return the model and view
	 */
	@RequestMapping("/loguear")
	public ModelAndView loguear(@ModelAttribute("Administrador") @Valid  Administrador administrador, BindingResult result, HttpSession session) {
		try {

			if(administrador.getUsuario() == "" || administrador.getClave() == ""){
				return new ModelAndView("error","message", "campos vacios");
			}

			ServicioAdministradorStub oStub = new ServicioAdministradorStub();
			
			
			AdministradorVO oAdministradorVO = new AdministradorVO();
			oAdministradorVO.setUsuario(administrador.getUsuario());
			oAdministradorVO.setClave(administrador.getClave());
			LoginAdministrador oLoginAdministrador = new LoginAdministrador();
			oLoginAdministrador.setArgs0(oAdministradorVO);
			LoginAdministradorResponse objResponse = oStub.loginAdministrador(oLoginAdministrador);
			
			//String mensaje = objResponse.get_return();

			session.setAttribute("admin", oAdministradorVO);
			
			session.setAttribute("token", objResponse.get_return().getToken());


			return new ModelAndView("menu","command", "");

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

		//return new ModelAndView("Logeado", "clientesRegistrados", "asd");

	}

	// ---------------------- Menu principal -------------------------------
	@RequestMapping("/menu")
	public ModelAndView menu() {

		return new ModelAndView("menu");
	}


	//------------------------Menu administracion -----------------------------------

	// menu pricipal administrador
	@RequestMapping("/administracion")
	public ModelAndView administracion() {

		return new ModelAndView("administracion");
	}

	//menu para ingresar datos para administrador
	@RequestMapping("/agregarAdmin")
	public ModelAndView registrarAdmin() {

		return new ModelAndView("registrarAdmin", "command", new Administrador());
	}

	//Registrar un nuevo administrador en BD
	
	//Registrar un nuevo administrador en BD
		@RequestMapping(value = "/registrarAdmin", method = RequestMethod.POST)
		public ModelAndView registrarAdmin(@ModelAttribute("administrador") @Valid  Administrador administrador, BindingResult result) {
			//BindingResult result, 
			if(result.hasErrors()) {
				System.out.println("ERROR");
				return new ModelAndView("administrador");
			}
			System.out.println("Usuario:" + administrador.getUsuario() + 
					"Clave:" + administrador.getClave());


			try {
				ServicioAdministradorStub oStub = new ServicioAdministradorStub();
				
				// AGREGAR NUEVO ADMINISTRADOR
				AdministradorVO oAdministradorVO = new AdministradorVO();
				oAdministradorVO.setUsuario(administrador.getUsuario());
				oAdministradorVO.setClave(administrador.getClave());

				
				AgregarAdministrador agregarAdministrador = new AgregarAdministrador();
				//AgregarAdministrador oAgregarAdministrador = new AgregarAdministrador();
				agregarAdministrador.setArgs0(oAdministradorVO);
				AgregarAdministradorResponse obResponse = oStub.agregarAdministrador(agregarAdministrador);
				
				//AgregarAdministradorResponse objResponse = oStub.agregarAdministrador(oAgregarAdministrador);
				String mensaje = obResponse.get_return();

				System.out.println(mensaje);
				return new ModelAndView("mensaje", "message", mensaje);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("error", "message", "ERROR");
			}

			//return "redirect:contacts.html";

		}

	// ------------------------- FIN MENU ADMINISTRADOR ---------------------------------------


	// -----------------------Menu Clientes--------------------------------------------

	//menu principal clientes
	/*
		@RequestMapping("/clientes")
	public ModelAndView clientes() {

		return new ModelAndView("clientes");
	}

	//menu para ingresar datos para registrar cliente
	@RequestMapping("/agregarCliente")
	public ModelAndView registrarCliente() {

		return new ModelAndView("registrarCliente", "command", new Cliente());
	}


	//Registrar un nuevo cliente en BD
	@RequestMapping(value = "/registrarCliente", method = RequestMethod.POST)
	public ModelAndView registrarCliente(@ModelAttribute("Administrador") @Valid  Cliente cliente, BindingResult result,HttpSession session) {
		//BindingResult result, 
		if(result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("cliente");
		}

		try {

			ServicioClienteStub oStub = new ServicioClienteStub();
			// AGREGAR NUEVO CLIENTE
			ClienteVO oClienteVO = new ClienteVO();
			oClienteVO.setNombre(cliente.getNombre());
			oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
			oClienteVO.setApellido_materno(cliente.getApellido_materno());
			oClienteVO.setRut(cliente.getRut());
			oClienteVO.setCelular(cliente.getCelular());
			oClienteVO.setCorreo(cliente.getCorreo());
			oClienteVO.setDireccion(cliente.getDireccion());

			AgregarCliente oAgregarCliente = new AgregarCliente();
			oAgregarCliente.setOClienteVO(oClienteVO);
			AgregarClienteResponse objResponse = oStub.agregarCliente(oAgregarCliente);
			String mensaje = objResponse.get_return();

			System.out.println(mensaje);
			return new ModelAndView("mensaje", "message", mensaje);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

		//return "redirect:contacts.html";
	}
	// Registrar un nuevo cliente en BD
	
	@RequestMapping(value = "/addCliente", method = RequestMethod.POST)	
	public ModelAndView agregarCliente(@ModelAttribute("Administrador") @Valid Cliente cliente, BindingResult result, HttpSession session) {
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

			webservice.ServicioClienteStub.LoginVO LoginVO = new webservice.ServicioClienteStub.LoginVO();

			AdministradorVO AdministradorVO = (webservice.ServicioAdministradorStub.AdministradorVO) session.getAttribute("admin");

			webservice.ServicioClienteStub.AdministradorVO administradorCliente = new webservice.ServicioClienteStub.AdministradorVO();
			administradorCliente.setUsuario(AdministradorVO.getUsuario());
			
			administradorCliente.setClave(AdministradorVO.getClave());

			LoginVO.setOAdministradorVO(administradorCliente);
			LoginVO.setToken(session.getAttribute("token").toString());
			oClienteVO.setOLoginVO(LoginVO);


			System.out.println("token --->"+LoginVO.getToken().toString() );
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

	}*/


	//Registrar un nuevo cliente en BD
	/*
	@RequestMapping(value = "/registrarServicio", method = RequestMethod.POST)
	public ModelAndView registrarServicio(@ModelAttribute("servicio") @Valid  Servicio servicio, BindingResult result) {
		//BindingResult result, 
		if(result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("servicio");
		}

		try {

			ServicioAdministracionStub oStub = new ServicioAdministracionStub();
			// AGREGAR Nuevo Servicio
			ServicioVO oServicioVO = new ServicioVO();
			oServicioVO.setTipo_servicio(servicio.getTipo_servicio());
			oServicioVO.setValor_servicio(Integer.parseInt(servicio.getValor_unitario()));
			oServicioVO.setValor_fijo(Integer.parseInt(servicio.getValor_fijo()));

			RegistrarServicio oRegistrarServicio = new RegistrarServicio();
			oRegistrarServicio.setOServicioVO(oServicioVO);
			RegistrarServicioResponse objResponse = oStub.registrarServicio(oRegistrarServicio);
			String mensaje = objResponse.get_return();
			System.out.println(mensaje);
			return new ModelAndView("mensaje", "message", mensaje);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

		//return "redirect:contacts.html";
	} */

	//mostrar Clientes registrados
		
		
/*	@RequestMapping("/mostrarClientes")
	public ModelAndView mostrarClientes() {

		List<Cliente> clientes = new ArrayList<Cliente>();

		ClienteForm clienteForm = new ClienteForm();

		try {
			ServicioClienteStub oStub = new ServicioClienteStub();
			MostrarClientes oMostrarClientes = new MostrarClientes();
			MostrarClientesResponse objResponde = oStub.mostrarClientes(oMostrarClientes);
			ClienteVO[] clientes2= objResponde.get_return();

			clienteForm.setClients(clientes2);
			return new ModelAndView("mostrarClientes" , "clienteForm", clienteForm);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}*/


	//--------------------Menu Cuentas -------------------------------------------
	@RequestMapping("/cuentas")
	public ModelAndView cuentas() {

		return new ModelAndView("cuentas");
	}
}
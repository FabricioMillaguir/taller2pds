package spring3.controller;
 
//import net.viralpatel.spring3.form.Contact;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.validation.Valid;

import spring3.form.Cliente;
import spring3.form.ClienteForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webservice.ServicioClienteStub;
import webservice.ServicioAdministradorStub.AdministradorVO;
import webservice.ServicioClienteStub.AgregarCliente;
import webservice.ServicioClienteStub.AgregarClienteResponse;
import webservice.ServicioClienteStub.ClienteVO;
import webservice.ServicioClienteStub.FiltrarCliente;
import webservice.ServicioClienteStub.FiltrarClienteResponse;
import webservice.ServicioClienteStub.ModificarCliente;
import webservice.ServicioClienteStub.ModificarClienteResponse;


 
@Controller
@SessionAttributes
public class ClienteController {
 
	//menu principal clientes
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
				oAgregarCliente.setArgs0(oClienteVO);
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
				oAgregarCliente.setArgs0(oClienteVO);
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

   
    @RequestMapping("/buscar.html")
    public ModelAndView showBuscar() {
    	ClienteForm clienteForm = new ClienteForm(); 
        return new ModelAndView("filtrarcliente", "clienteForm", clienteForm);
    }
    
    
    @RequestMapping("/filtrar.html")
    public ModelAndView filtrar(@RequestParam("busqueda") String busqueda, @RequestParam("atributo") String atributo){
 ClienteForm clienteForm = new ClienteForm();
         //JOptionPane.showMessageDialog(null, busqueda + " " + atributo);
         try {

        	 ServicioClienteStub oStub1 = new ServicioClienteStub();
        	
     		
     		//Filtra
        	 FiltrarCliente oFiltrarCliente1 = new FiltrarCliente();
        	 oFiltrarCliente1.setArgs0(busqueda);
        	 oFiltrarCliente1.setArgs1(atributo);
        	 
        	 
     
        	FiltrarClienteResponse objResponse1 = oStub1.filtrarCliente(oFiltrarCliente1);
        	
        	ClienteVO[] clientes2 = objResponse1.get_return();
        	System.out.print(clientes2[0].getNombre());
     		
     		clienteForm.setClientes(clientes2);
     		
			return new ModelAndView("filtrarcliente","clienteForm",clienteForm);
	        
	         
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
			
		}
    }
    
    /*
    @RequestMapping("/show")
	public ModelAndView helloWorld() {
    	//String message = "Hola Mundo Spring se ha instaldo correctamente";
    	 List<Cliente> clientes = new ArrayList<Cliente>();
    	 
    	    
    	      
    	 ClienteForm clienteForm = new ClienteForm();
    	
         
         try {

        	 ServicioClienteStub oStub = new ServicioClienteStub();
     		
        	
        	 MostrarContacto oMostrarContacto = new MostrarContacto();
     		
     		MostrarContactoResponse objResponde =  oStub.mostrarContacto(oMostrarContacto);
     		ContactoVO[] contacts2= objResponde.get_return();
     		
			 contactForm.setContacts(contacts2);
	         return new ModelAndView("showcontactrow" , "contactForm", contactForm);
	         
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}
        
	}]*/
    
    /*
    @RequestMapping("/eliminar")
    public RedirectView eliminarContacto(@RequestParam String uid) {
    	
         
         try {
        
     		ServicioContactoStub oStub = new ServicioContactoStub();
     		//Elimina Contacto
     		EliminarContacto oEliminarContacto = new EliminarContacto();
     		oEliminarContacto.setUid(Integer.parseInt(uid));
     		
        	EliminarContactoResponse objResponse = oStub.eliminarContacto(oEliminarContacto);
        	String repuesta=objResponse.get_return();
     		
			
     		
	         
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

			
			
		}
         
         return new RedirectView("show.html");
      
        
    }*/
    
    
    @RequestMapping("/modificarForm")
   	public ModelAndView modificarForm(@RequestParam("id") String id){
    
    	ClienteForm clienteForm = new ClienteForm();
    	
        
        try {

        	ServicioClienteStub oStub = new ServicioClienteStub();
    		
    		//Filtra
        	FiltrarCliente oFiltrarCliente = new FiltrarCliente();
       	 oFiltrarCliente.setArgs0(id);
       	 oFiltrarCliente.setArgs1("id");
       	 
       	FiltrarClienteResponse obResponse = oStub.filtrarCliente(oFiltrarCliente);
       	 
       	 
    	ClienteVO[] clientes2 = obResponse.get_return();	
    		
    		clienteForm.setClientes(clientes2);
			
	         return new ModelAndView("update" , "clienteForm", clienteForm);
	         
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}
    	
    	
    	
    }
    
  
    @RequestMapping(value = "/modificarCliente", method = RequestMethod.POST)
    public ModelAndView modificarCliente(@ModelAttribute("cliente") @Valid  Cliente cliente, BindingResult result, HttpSession session) {
         //BindingResult result, 
    	 if(result.hasErrors()) {
    		 System.out.println("ERROR");
             return new ModelAndView("cliente");
         }
        System.out.println("First Name:" + cliente.getNombre() + 
                    "Last Name:" + cliente.getApellido_paterno());
        
       
        try {
        	
        	ServicioClienteStub oStub = new ServicioClienteStub();
        	
    		// MODIFICA
        	ClienteVO oClienteVO = new ClienteVO();
    		oClienteVO.setId(cliente.getId());
        	oClienteVO.setRut(cliente.getRut());
        	oClienteVO.setNombre(cliente.getNombre());
        	oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
        	oClienteVO.setApellido_materno(cliente.getApellido_materno());
        	oClienteVO.setCorreo(cliente.getCorreo());
        	oClienteVO.setCelular(cliente.getCelular());
        	oClienteVO.setDireccion(cliente.getDireccion());
    		JOptionPane.showMessageDialog(null, cliente.getCorreo());
    		
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

    		
    		ModificarCliente oModificarCliente = new ModificarCliente();
    		oModificarCliente.setArgs0(oClienteVO);
    		ModificarClienteResponse obResponse = oStub.modificarCliente(oModificarCliente);
    		
    		
    		String mensaje = obResponse.get_return();
    				

		        System.out.println(mensaje);
				return new ModelAndView("saludo", "message", mensaje);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return new ModelAndView("error", "message", "ERROR");
		}
         
        //return "redirect:contacts.html";
        
    }
    
    

}
package spring3.controller;
 
//import net.viralpatel.spring3.form.Contact;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

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
 
    @RequestMapping(value = "/addCliente.html", method = RequestMethod.POST)
    public ModelAndView addCliente(@ModelAttribute("cliente") @Valid  Cliente cliente, BindingResult result) {
         //BindingResult result, 
    	 if(result.hasErrors()) {
    		 System.out.println("ERROR");
             return new ModelAndView("cliente");
         }
        System.out.println("First Name:" + cliente.getNombre() + 
                    "Last Name:" + cliente.getApellido_paterno());
        
       
        try {
        	ServicioClienteStub oStub = new ServicioClienteStub();
        	
        	
    		// AGREGA
        	ClienteVO oClienteVO = new ClienteVO();
        	oClienteVO.setRut(cliente.getRut());
        	oClienteVO.setNombre(cliente.getNombre());
        	oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
        	oClienteVO.setApellido_materno(cliente.getApellido_materno());
        	oClienteVO.setCelular(cliente.getCelular());
        	oClienteVO.setCorreo(cliente.getCorreo());
        	oClienteVO.setDireccion(cliente.getDireccion());
        	
        	AgregarCliente oAgregarCliente = new AgregarCliente();
        	oAgregarCliente.setOClienteVO(oClienteVO);
        	AgregarClienteResponse obResponse = oStub.agregarCliente(oAgregarCliente);
        	
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
    
    
    @RequestMapping("/clientes.html")
    public ModelAndView showClientes() {
         
        return new ModelAndView("cliente", "command", new Cliente());
    }
   
    @RequestMapping("/buscar.html")
    public ModelAndView showBuscar() {
    	ClienteForm clienteForm = new ClienteForm(); 
        return new ModelAndView("buscarcliente", "clienteForm", clienteForm);
    }
    
    /*
    @RequestMapping("/filtrar.html")
    public ModelAndView buscar(@RequestParam String busqueda, String atributo){
 ClienteForm clienteForm = new ClienteForm();
         
         try {

        	ServicioClienteStub oStub = new ServicioClienteStub();
     		
     		//Filtra
        	 FiltrarCliente oFiltrarCliente = new FiltrarCliente();
        	 oFiltrarCliente.setBusqueda(busqueda);
        	 oFiltrarCliente.setAtributo(atributo);
        	 
        	
        	FiltrarClienteResponse obResponse = oStub.filtrarCliente(oFiltrarCliente);
        	 
     		ClienteVO[] clientes2 = obResponse.get_return();
     		
     		clienteForm.setClientes(clientes2);
			
	        return new ModelAndView("buscarcliente" , "clienteForm", clienteForm);
	         
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
    
    /*
    @RequestMapping("/modificarForm")
   	public ModelAndView modificarForm(@RequestParam String id_cliente){
    
    	ClienteForm clienteForm = new ClienteForm();
    	
        
        try {

        	ServicioClienteStub oStub = new ServicioClienteStub();
    		
    		//Filtra
        	FiltrarCliente oFiltrarCliente = new FiltrarCliente();
       	 oFiltrarCliente.setBusqueda(id_cliente);
       	 oFiltrarCliente.setAtributo("id_cliente");
       	 
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
    
  /*
    @RequestMapping(value = "/modificarCliente", method = RequestMethod.POST)
    public ModelAndView modificarCliente(@ModelAttribute("cliente") @Valid  Cliente cliente, BindingResult result) {
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
    		oClienteVO.setId_cliente(cliente.getId());
        	oClienteVO.setRut(cliente.getRut());
        	oClienteVO.setNombre(cliente.getNombre());
        	oClienteVO.setApellido_paterno(cliente.getApellido_paterno());
        	oClienteVO.setApellido_materno(cliente.getApellido_materno());
        	oClienteVO.setCorreo(cliente.getCorreo());
        	oClienteVO.setCelular(Integer.parseInt(cliente.getCelular()));
        	oClienteVO.setDireccion(cliente.getDireccion());
    		
    		
    		ModificarCliente oModificarCliente = new ModificarCliente();
    		oModificarCliente.setOClienteVO(oClienteVO);
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
    */
    

}
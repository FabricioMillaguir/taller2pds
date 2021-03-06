package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;
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

import webservice.ServicioGastosComunesStub;
import webservice.ServicioGastosComunesStub.AgregarCliente;
import webservice.ServicioGastosComunesStub.AgregarClienteResponse;
import webservice.ServicioGastosComunesStub.ClienteVO;
import webservice.ServicioGastosComunesStub.FiltrarCliente;
import webservice.ServicioGastosComunesStub.FiltrarClienteResponse;
import webservice.ServicioGastosComunesStub.LoginVO;
import webservice.ServicioGastosComunesStub.ModificarCliente;
import webservice.ServicioGastosComunesStub.ModificarClienteResponse;

@Controller
@SessionAttributes
public class ClienteController {

	@RequestMapping("/clientes")
	public ModelAndView clientes() {

		return new ModelAndView("clientes");
	}

	@RequestMapping("/mostrarRegistrarCliente")
	public ModelAndView registrarCliente() {

		return new ModelAndView("registrarCliente", "command", new Cliente());
	}

	@RequestMapping(value = "/registrarCliente", method = RequestMethod.POST)
	public ModelAndView registrarCliente(
			@ModelAttribute("Administrador") @Valid Cliente cliente,
			BindingResult result, HttpSession session) {

		if (result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("cliente");
		}

		try {

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setRut(cliente.getRut());
			clienteVO.setNombre(cliente.getNombre());
			clienteVO.setApellidoPaterno(cliente.getApellidoPaterno());
			clienteVO.setApellidoMaterno(cliente.getApellidoMaterno());
			clienteVO.setCelular(cliente.getCelular());
			clienteVO.setCorreo(cliente.getCorreo());
			clienteVO.setDireccion(cliente.getDireccion());

			LoginVO login = (LoginVO) session.getAttribute("token");
			clienteVO.setLoginVO(login);

			AgregarCliente oAgregarCliente = new AgregarCliente();
			oAgregarCliente.setArgs0(clienteVO);
			AgregarClienteResponse objResponse = oStub
					.agregarCliente(oAgregarCliente);
			String mensaje = objResponse.get_return();

			return new ModelAndView("mensaje", "message", mensaje);
		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");
		}

	}

	@RequestMapping("/buscarCliente.html")
	public ModelAndView showBuscar() {
		ClienteForm clienteForm = new ClienteForm();
		return new ModelAndView("filtrarCliente", "clienteForm", clienteForm);
	}

	@RequestMapping("/filtrarCliente.html")
	public ModelAndView filtrar(@RequestParam("busqueda") String busqueda,
			@RequestParam("atributo") String atributo) {
		ClienteForm clienteForm = new ClienteForm();

		try {

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			FiltrarCliente oFiltrarCliente = new FiltrarCliente();
			oFiltrarCliente.setArgs0(busqueda);
			oFiltrarCliente.setArgs1(atributo);

			FiltrarClienteResponse objResponse = oStub
					.filtrarCliente(oFiltrarCliente);

			ClienteVO[] clientes2 = objResponse.get_return();

			clienteForm.setClientes(clientes2);

			return new ModelAndView("filtrarCliente", "clienteForm",
					clienteForm);

		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");

		}
	}

	@RequestMapping("/opcionesCliente.html")
	public ModelAndView showCliente(@RequestParam("id") String id) {

		ClienteForm clienteForm = new ClienteForm();
		try {

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			FiltrarCliente oFiltrarCliente = new FiltrarCliente();
			oFiltrarCliente.setArgs0(id);
			oFiltrarCliente.setArgs1("id");

			FiltrarClienteResponse obResponse = oStub
					.filtrarCliente(oFiltrarCliente);

			ClienteVO[] clientes = obResponse.get_return();
			clienteForm.setClientes(clientes);

			return new ModelAndView("opcionesCliente", "clienteForm", clienteForm);

		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}

	@RequestMapping("/mostrarModificarCliente")
	public ModelAndView modificarForm(@RequestParam("id") String id) {

		ClienteForm clienteForm = new ClienteForm();
		try {

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			FiltrarCliente oFiltrarCliente = new FiltrarCliente();
			oFiltrarCliente.setArgs0(id);
			oFiltrarCliente.setArgs1("id");

			FiltrarClienteResponse obResponse = oStub
					.filtrarCliente(oFiltrarCliente);

			ClienteVO[] clientes = obResponse.get_return();
			clienteForm.setClientes(clientes);

			return new ModelAndView("modificarCliente", "clienteForm", clienteForm);

		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}

	@RequestMapping(value = "/modificarCliente", method = RequestMethod.POST)
	public ModelAndView modificarCliente(
			@ModelAttribute("cliente") @Valid Cliente cliente,
			BindingResult result, HttpSession session) {

		if (result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("cliente");
		}

		try {

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			ClienteVO oClienteVO = new ClienteVO();
			oClienteVO.setId(cliente.getId());
			oClienteVO.setRut(cliente.getRut());
			oClienteVO.setNombre(cliente.getNombre());
			oClienteVO.setApellidoPaterno(cliente.getApellidoPaterno());
			oClienteVO.setApellidoMaterno(cliente.getApellidoMaterno());
			oClienteVO.setCorreo(cliente.getCorreo());
			oClienteVO.setCelular(cliente.getCelular());
			oClienteVO.setDireccion(cliente.getDireccion());

			LoginVO login = (LoginVO) session.getAttribute("token");
			oClienteVO.setLoginVO(login);

			ModificarCliente oModificarCliente = new ModificarCliente();
			oModificarCliente.setArgs0(oClienteVO);
			ModificarClienteResponse objResponse = oStub
					.modificarCliente(oModificarCliente);

			String mensaje = objResponse.get_return();

			return new ModelAndView("saludo", "message", mensaje);
		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}

}
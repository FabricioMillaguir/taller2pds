package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spring3.form.CuentaForm;
import spring3.form.ServicioForm;
import webservice.ServicioGastosComunesStub;
import webservice.ServicioGastosComunesStub.ClienteVO;
import webservice.ServicioGastosComunesStub.CuentaVO;
import webservice.ServicioGastosComunesStub.DeshabilitarCuentaACliente;
import webservice.ServicioGastosComunesStub.DeshabilitarCuentaAClienteResponse;
import webservice.ServicioGastosComunesStub.FiltrarCuenta;
import webservice.ServicioGastosComunesStub.FiltrarCuentaResponse;
import webservice.ServicioGastosComunesStub.FiltrarCuentasDelCliente;
import webservice.ServicioGastosComunesStub.FiltrarCuentasDelClienteResponse;
import webservice.ServicioGastosComunesStub.LoginVO;
import webservice.ServicioGastosComunesStub.MostrarServicio;
import webservice.ServicioGastosComunesStub.MostrarServicioResponse;
import webservice.ServicioGastosComunesStub.RegistrarCuentaACliente;
import webservice.ServicioGastosComunesStub.RegistrarCuentaAClienteResponse;
import webservice.ServicioGastosComunesStub.ServicioVO;

@Controller
@SessionAttributes
public class CuentaController {
	
	@RequestMapping("/mostrarOpcionesCuentas")
	public ModelAndView clientes(@RequestParam("id") String id) {
		CuentaForm cuentaForm = new CuentaForm();

		try {
			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setId(Integer.parseInt(id));
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			FiltrarCuentasDelCliente filtrarCuentasDelCliente = new FiltrarCuentasDelCliente();
			filtrarCuentasDelCliente.setArgs0(clienteVO);
			FiltrarCuentasDelClienteResponse objResponse = oStub
					.filtrarCuentasDelCliente(filtrarCuentasDelCliente);
			CuentaVO[] cuentaVOs = objResponse.get_return();
			cuentaForm.setCuentas(cuentaVOs);
			ModelAndView modelAndView =  new ModelAndView("opcionesCuentas",
					"cuentaForm", cuentaForm);
			modelAndView.addObject(clienteVO);
			return modelAndView;


		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");

		}



		
		
	}

	@RequestMapping("/mostrarRegistrarCuenta")
	public ModelAndView mostrarRegistrarCuenta(@RequestParam("idCliente") String idCliente) {
		ServicioForm servicioForm = new ServicioForm();

		try {
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			MostrarServicio mostrarServicio = new MostrarServicio();
			MostrarServicioResponse objResponse = oStub
					.mostrarServicio(mostrarServicio);
			ServicioVO[] servicios = objResponse.get_return();
			servicioForm.setServicios(servicios);
			ModelAndView modelAndView = new ModelAndView("registrarCuenta",
					"servicioForm", servicioForm);
			
			//AQUI
			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setId(Integer.parseInt(idCliente));
			modelAndView.addObject("clienteVO", clienteVO);
			System.out.print("el id es " + clienteVO.getId() + "nombre " + clienteVO.getNombre());
			return modelAndView;

		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");

		}
	}

	@RequestMapping("/registrarCuenta")
	public ModelAndView registrarCuenta(
			@RequestParam("idCliente") String idCliente,
			@RequestParam("idServicio") String idServicio,
			@RequestParam("habilitada") boolean habilitada, HttpSession session) {
		try {
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			ServicioVO servicioVO = new ServicioVO();
			servicioVO.setId(Integer.parseInt(idServicio));
			LoginVO login = (LoginVO) session.getAttribute("token");
			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setId(Integer.parseInt(idCliente));

			CuentaVO cuentaVO = new CuentaVO();
			cuentaVO.setHabilitada(habilitada);
			cuentaVO.setServicioVO(servicioVO);
			cuentaVO.setClienteVO(clienteVO);
			cuentaVO.setLoginVO(login);

			RegistrarCuentaACliente registrarCuentaACliente = new RegistrarCuentaACliente();
			registrarCuentaACliente.setArgs0(cuentaVO);

			RegistrarCuentaAClienteResponse objResponse = oStub
					.registrarCuentaACliente(registrarCuentaACliente);
			String mensaje = objResponse.get_return();

			System.out.print(habilitada);
			return new ModelAndView("mensaje", "message", mensaje);

		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");
		}

	}

	@RequestMapping("/mostrarDeshabilitarCuenta")
	public ModelAndView mostrarDeshabilitarCuenta(@RequestParam("idCliente") String idCliente) {
		CuentaForm cuentaForm = new CuentaForm();

		try {
			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setId(Integer.parseInt(idCliente));
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			FiltrarCuentasDelCliente filtrarCuentasDelCliente = new FiltrarCuentasDelCliente();
			filtrarCuentasDelCliente.setArgs0(clienteVO);
			FiltrarCuentasDelClienteResponse objResponse = oStub
					.filtrarCuentasDelCliente(filtrarCuentasDelCliente);
			CuentaVO[] cuentaVOs = objResponse.get_return();
			cuentaForm.setCuentas(cuentaVOs);
			ModelAndView modelAndView = new ModelAndView("deshabilitarCuenta",
					"cuentaForm", cuentaForm);
			return modelAndView;

		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");

		}
	}

	@RequestMapping("/deshabilitarCuenta")
	public ModelAndView deshabilitarCuenta(
			@RequestParam("idCuenta") String idCuenta,
			@RequestParam("habilitada") boolean habilitada, HttpSession session) {
		try {
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			CuentaVO cuentaVO = new CuentaVO();
			cuentaVO.setId(Integer.parseInt(idCuenta));
			System.out.print(habilitada);
			cuentaVO.setHabilitada(habilitada);
			LoginVO loginVO = (LoginVO) session.getAttribute("token");
			cuentaVO.setLoginVO(loginVO);

			DeshabilitarCuentaACliente deshabilitarCuentaACliente = new DeshabilitarCuentaACliente();
			deshabilitarCuentaACliente.setArgs0(cuentaVO);

			DeshabilitarCuentaAClienteResponse objResponse = oStub
					.deshabilitarCuentaACliente(deshabilitarCuentaACliente);
			String mensaje = objResponse.get_return();

			System.out.print(habilitada);
			return new ModelAndView("mensaje", "message", mensaje);

		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");
		}

	}

	@RequestMapping("/mostrarSeleccionarCuenta")
	public ModelAndView seleccionarCuenta(@RequestParam("id") String id) {
		CuentaForm cuentaForm = new CuentaForm();

		try {
			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setId(Integer.parseInt(id));
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			FiltrarCuentasDelCliente filtrarCuentasDelCliente = new FiltrarCuentasDelCliente();
			filtrarCuentasDelCliente.setArgs0(clienteVO);
			FiltrarCuentasDelClienteResponse objResponse = oStub
					.filtrarCuentasDelCliente(filtrarCuentasDelCliente);
			CuentaVO[] cuentaVOs = objResponse.get_return();
			cuentaForm.setCuentas(cuentaVOs);
			ModelAndView modelAndView = new ModelAndView("seleccionarCuenta",
					"cuentaForm", cuentaForm);
			return modelAndView;

		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");

		}

	}
	
	

}

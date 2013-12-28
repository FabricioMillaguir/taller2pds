package spring3.controller;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spring3.form.Administrador;
import spring3.form.Consumo;
import spring3.form.Cuenta;
import spring3.form.CuentaForm;
import webservice.ServicioGastosComunesStub;
import webservice.ServicioGastosComunesStub.ClienteHistoricoVO;
import webservice.ServicioGastosComunesStub.ClienteVO;
import webservice.ServicioGastosComunesStub.ConsumoVO;
import webservice.ServicioGastosComunesStub.CuentaVO;
import webservice.ServicioGastosComunesStub.FiltrarCuenta;
import webservice.ServicioGastosComunesStub.FiltrarCuentaResponse;
import webservice.ServicioGastosComunesStub.FiltrarCuentasDelCliente;
import webservice.ServicioGastosComunesStub.FiltrarCuentasDelClienteResponse;
import webservice.ServicioGastosComunesStub.LoginVO;
import webservice.ServicioGastosComunesStub.RegistrarConsumoDeCuenta;
import webservice.ServicioGastosComunesStub.RegistrarConsumoDeCuentaResponse;

@Controller
@SessionAttributes
public class ConsumoController {
	
	@RequestMapping("/mostrarRegistrarConsumo")
	public ModelAndView mostrarRegistrarConsumo(@RequestParam("idCuenta") String idCuenta){
		CuentaForm cuentaForm = new CuentaForm();
		CuentaVO cuentaVO= new CuentaVO();
		try{
			cuentaVO.setId(Integer.parseInt(idCuenta));
			System.out.print(cuentaVO.getId());
		ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
		FiltrarCuenta filtrarCuenta = new FiltrarCuenta();
		filtrarCuenta.setArgs0(cuentaVO);
		FiltrarCuentaResponse objResponse = oStub.filtrarCuenta(filtrarCuenta);
		CuentaVO cuentaVOs = objResponse.get_return();
		
		ModelAndView modelAndView = new ModelAndView("registrarConsumo", "cuentaVOs", cuentaVOs);
		int[] agnos = mostrarAgnos();
		System.out.print(agnos[0]);
		modelAndView.addObject(agnos);
		return modelAndView;
		}catch(RemoteException e){
				e.printStackTrace();
		return new ModelAndView("error", "message", "ERROR");
		}
		
		
		
	}
	
	@RequestMapping("/registrarConsumo")
	public ModelAndView registrarConsumo(@ModelAttribute("consumo") @Valid Consumo consumo,
			BindingResult result,@RequestParam("idCuenta") int idCuenta, HttpSession session) {
		try{
		ConsumoVO consumoVO = new ConsumoVO();
		CuentaVO cuentaVO = new CuentaVO();
		cuentaVO.setId(idCuenta);
		LoginVO login = (LoginVO) session.getAttribute("token");
		
		consumoVO.setCantidadConsumida(consumo.getCantidadConsumida());
		consumoVO.setFechaVencimiento(consumo.getFechaDeVencimiento());
		consumoVO.setCuentaVO(cuentaVO);
		consumoVO.setLoginVO(login);
		
		ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
		RegistrarConsumoDeCuenta registrarConsumoDeCuenta = new RegistrarConsumoDeCuenta();
		registrarConsumoDeCuenta.setArgs0(consumoVO);
		RegistrarConsumoDeCuentaResponse objResponse = oStub.registrarConsumoDeCuenta(registrarConsumoDeCuenta);
		String mensaje = objResponse.get_return();
		
		System.out.print(mensaje);
		return new ModelAndView("mensaje", "message", mensaje);
		
		
		}catch(RemoteException e){
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");
		}
		
	}
	
	public static int[] mostrarAgnos(){
		int[] agnos = new int[2];

		agnos[0]=Calendar.getInstance().get(1);
		if((Calendar.getInstance().get(2)+1)==12){
			agnos[1]=(agnos[0])+1;
		}
		

		return agnos;
	}

}

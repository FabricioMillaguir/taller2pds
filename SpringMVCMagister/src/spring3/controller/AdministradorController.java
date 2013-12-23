package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spring3.form.Administrador;

import webservice.ServicioGastosComunesStub;
import webservice.ServicioGastosComunesStub.AgregarAdministrador;
import webservice.ServicioGastosComunesStub.AgregarAdministradorResponse;
import webservice.ServicioGastosComunesStub.AdministradorVO;

@Controller
@SessionAttributes
public class AdministradorController {

	@RequestMapping("/menu")
	public ModelAndView menu() {

		return new ModelAndView("menu");
	}

	@RequestMapping("/administracion")
	public ModelAndView administracion() {

		return new ModelAndView("administracion");
	}

	@RequestMapping("/agregarAdmin")
	public ModelAndView registrarAdmin() {

		return new ModelAndView("registrarAdmin", "command",
				new Administrador());
	}

	@RequestMapping(value = "/registrarAdmin", method = RequestMethod.POST)
	public ModelAndView registrarAdmin(
			@ModelAttribute("administrador") @Valid Administrador administrador,
			BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("ERROR");
			return new ModelAndView("administrador");
		}

		try {

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			AdministradorVO oAdministradorVO = new AdministradorVO();
			oAdministradorVO.setUsuario(administrador.getUsuario());
			oAdministradorVO.setClave(administrador.getClave());

			AgregarAdministrador agregarAdministrador = new AgregarAdministrador();

			agregarAdministrador.setArgs0(oAdministradorVO);
			AgregarAdministradorResponse objResponse = oStub
					.agregarAdministrador(agregarAdministrador);

			String mensaje = objResponse.get_return();

			System.out.println(mensaje);
			return new ModelAndView("mensaje", "message", mensaje);
		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}
}
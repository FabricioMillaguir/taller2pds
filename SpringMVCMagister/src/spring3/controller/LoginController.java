package spring3.controller;

import java.rmi.RemoteException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spring3.form.Administrador;
import webservice.ServicioGastosComunesStub;
import webservice.ServicioGastosComunesStub.AdministradorVO;
import webservice.ServicioGastosComunesStub.Loggear;
import webservice.ServicioGastosComunesStub.LoggearResponse;

@Controller
@SessionAttributes
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView abrirPrincipal() {
		return new ModelAndView("login", "command", new Administrador());
	}

	@RequestMapping("/loggear")
	public ModelAndView loguear(
			@ModelAttribute("Administrador") @Valid Administrador administrador,
			BindingResult result, HttpSession session) {
		try {

			if (administrador.getUsuario().isEmpty()
					|| administrador.getClave().isEmpty()) {
				return new ModelAndView("error", "message", "campos vacios");
			}

			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();

			AdministradorVO oAdministradorVO = new AdministradorVO();
			oAdministradorVO.setUsuario(administrador.getUsuario());
			oAdministradorVO.setClave(administrador.getClave());
			Loggear olLoggear = new Loggear();
			olLoggear.setArgs0(oAdministradorVO);
			LoggearResponse objResponse = oStub.loggear(olLoggear);

			session.setAttribute("token", objResponse.get_return());

			return new ModelAndView("menu", "command", "");

		} catch (RemoteException e) {
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}

	}
}

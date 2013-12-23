package spring3.controller;

import java.rmi.RemoteException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spring3.form.ClienteHistoricoForm;
import webservice.ServicioGastosComunesStub;
import webservice.ServicioGastosComunesStub.ClienteVO;
import webservice.ServicioGastosComunesStub.Cliente_historicoVO;
import webservice.ServicioGastosComunesStub.FiltrarCambioHistorico;
import webservice.ServicioGastosComunesStub.FiltrarCambioHistoricoResponse;

@Controller
@SessionAttributes
public class ClienteHistoricoController {

	@RequestMapping("/mostrarCambioHistorico")
	public ModelAndView mostrarCambioHistorico(@RequestParam("id") String id) {
		ClienteHistoricoForm clienteHistoricosForm = new ClienteHistoricoForm();
		try {
			ClienteVO clienteVO = new ClienteVO();
			clienteVO.setId(Integer.parseInt(id));
			ServicioGastosComunesStub oStub = new ServicioGastosComunesStub();
			FiltrarCambioHistorico filtrarCambioHistorico = new FiltrarCambioHistorico();
			filtrarCambioHistorico.setArgs0(clienteVO);
			FiltrarCambioHistoricoResponse objResponse = oStub
					.filtrarCambioHistorico(filtrarCambioHistorico);
			Cliente_historicoVO[] clienteHistoricoVOs = objResponse
					.get_return();
			clienteHistoricosForm.setClienteHistoricos(clienteHistoricoVOs);
			System.out.print(clienteHistoricoVOs[0].getApellido_paterno());
			return new ModelAndView("cambiohistorico", "clienteHistoricosForm",
					clienteHistoricosForm);
		} catch (RemoteException e) {
			e.printStackTrace();
			return new ModelAndView("error", "message", "ERROR");
		}

	}
}

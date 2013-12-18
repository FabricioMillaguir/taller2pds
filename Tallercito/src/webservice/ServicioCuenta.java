package webservice;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orms.Cliente;
import orms.ClienteDAO;
import orms.CuentaDAO;
import orms.Login;
import orms.LoginDAO;
import orms.Servicio;
import orms.ServicioDAO;
import domain.ClienteVO;
import domain.Cliente_historicoVO;
import domain.CuentaVO;
import domain.ServicioVO;

public class ServicioCuenta {

	public List<domain.ServicioVO> mostrarServicio() {
		List<domain.ServicioVO> servicio = new ArrayList<domain.ServicioVO>();
		orms.Servicio[] ormsServicio;
		try {
			ormsServicio = orms.ServicioDAO.listServicioByQuery(null, null);

			int length = ormsServicio.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormsServicio[i]);
				servicio.add(new ServicioVO(ormsServicio[i].getId(),
						ormsServicio[i].getTipo_servicio(), ormsServicio[i]
								.getValor_unitario(), ormsServicio[i]
								.getCargo_fijo(), ormsServicio[i]
								.getUnidad_de_medida()));

			}
			return servicio;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String registrarCuentaACliente(CuentaVO oCuentaVO) {
		PersistentTransaction t;
		try {

			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				orms.Cuenta lormCuenta = orms.CuentaDAO.createCuenta();

				Cliente cliente = ClienteDAO.getClienteByORMID(oCuentaVO
						.getoClienteVO().getId());
				Servicio servicio = ServicioDAO.getServicioByORMID(oCuentaVO
						.getoServicioVO().getId());
				Login login = LoginDAO.getLoginByORMID(oCuentaVO.getoLoginVO()
						.getId());

				lormCuenta.setHabilitada(oCuentaVO.isHabilitada());
				lormCuenta.setORM_Cliente(cliente);
				lormCuenta.setORM_Servicio(servicio);
				lormCuenta.setORM_Login(login);

				CuentaDAO.save(lormCuenta);

				return "Se ha registrado una cuenta al cliente exitosamente";

			}

			catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}

	}

	public String deshabilitarCuentaACliente(CuentaVO oCuentaVO) {
		PersistentTransaction t;
		try {

			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				orms.Cuenta lormCuenta = CuentaDAO.getCuentaByORMID(oCuentaVO
						.getId());

				lormCuenta.setHabilitada(oCuentaVO.isHabilitada());

				CuentaDAO.save(lormCuenta);

				return "Se ha deshabilitado esta cuenta al cliente";

			}

			catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}

	}

}

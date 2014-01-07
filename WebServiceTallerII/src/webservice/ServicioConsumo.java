package webservice;

import java.util.Date;

import javax.swing.JOptionPane;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orms.Cliente;
import orms.ClienteDAO;
import orms.Consumo;
import orms.ConsumoDAO;
import orms.Cuenta;
import orms.CuentaDAO;
import orms.Login;
import orms.LoginDAO;
import orms.Servicio;
import orms.ServicioDAO;
import domain.ConsumoVO;
import domain.CuentaVO;

public class ServicioConsumo {

	
	
	public String registrarPagoConsumo(ConsumoVO consumoVO) {
		PersistentTransaction t;
		try {
			t = orms.TallerAplicado1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				Consumo lormConsumo = ConsumoDAO.getConsumoByORMID(consumoVO
						.getId());

				lormConsumo.setPagado(true);
				lormConsumo.setMoroso(false);

				ConsumoDAO.save(lormConsumo);

				System.out.println("Pagado con Exito");
				t.commit();
			} catch (Exception e) {
				t.rollback();
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return "pagado";

	}

}

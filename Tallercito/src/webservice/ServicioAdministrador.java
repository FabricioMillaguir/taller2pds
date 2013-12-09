package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import domain.LoginVO;

public class ServicioAdministrador {
	
	public domain.LoginVO loginAdministrador(domain.AdministradorVO oAdministradorVO){
		String mensaje ="Error";
		PersistentTransaction t;
		try {
			
			t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();

			try {

				if(oAdministradorVO.getUsuario() == "" || oAdministradorVO.getClave() == ""){

					return null;

				} else{

					String condLogin = "usuario = '"+ oAdministradorVO.getUsuario()+"' ";
					condLogin += "and clave = '"+ oAdministradorVO.getClave() +"'";

					orms.Administrador[] existeAdmin;
					orms.Administrador adminLogeadoorms = orms.AdministradorDAO.loadAdministradorByQuery(condLogin, null);
					existeAdmin = orms.AdministradorDAO.listAdministradorByQuery(condLogin, null);

					if(!val.Validacion.largoCadena(oAdministradorVO.getUsuario(), 20)){
						return null;//"El largo de usuario no puede exceder de 20 caracteres";
					} else if(!val.Validacion.largoCadena(oAdministradorVO.getClave(), 20)){
						return null;//"El largo de la clave no puede exceder de 20 caracteres";
					} else if(existeAdmin.length == 0){
						return null;//"La cuenta de administrador no existe";
					} else {

						orms.Login[] existeToken;
						String token;
						Date date = new Date();
						DateFormat hourdateFormsat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

						orms.Login lormsLogin = orms.LoginDAO.createLogin();

						do{
							token = tok.Token.generarToken(21);
							existeToken = orms.LoginDAO.listLoginByQuery("token = '"+token+"'", null);
							System.out.println(token);
						}while(existeToken.length != 0);

						Date fecha_fin = new Date(date.getTime()+5*60000);
						LoginVO loginvo = new LoginVO();
						lormsLogin.setFecha_inicio(hourdateFormsat.format(date));
						lormsLogin.setFecha_fin(hourdateFormsat.format(fecha_fin));
						lormsLogin.setToken(token);
						lormsLogin.setAdministrador(adminLogeadoorms);
						loginvo.setFecha_inicio(hourdateFormsat.format(date));
						loginvo.setFecha_fin(hourdateFormsat.format(fecha_fin));
						loginvo.setToken(token);
						loginvo.setoAdministradorVO(oAdministradorVO);
						//lormsLogin.setUsuario(adminLogeadoorms);
						//ormsLogin.setorms_Usuario(adminLogeadoorms);
						orms.LoginDAO.save(lormsLogin);
						t.commit();

						return loginvo;//"Se ha logeado exitosamente";

					}
				}
			}

			catch (Exception e) {
				t.rollback();
				return null;//"Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;//"Error persistencia";
		}

	}
	
	public String agregarAdministrador(domain.AdministradorVO oAdministradorVO){
		PersistentTransaction t;
		try {

			t = orms.TallerAplicado1PersistentManager.instance().getSession().beginTransaction();

			try {
				
				if(oAdministradorVO.getUsuario() == "" || oAdministradorVO.getClave() == ""){

					return "Debe ingresar todos los parametros para crear una cuenta de administrador";

				} else{

					orms.Administrador[] ormsAdministrador;

					String usuarioRepetido="";
					usuarioRepetido += "usuario = '"+oAdministradorVO.getUsuario()+"'";

					//consultamos por el usuario en la base de datos
					ormsAdministrador = orms.AdministradorDAO.listAdministradorByQuery(usuarioRepetido, null);
					if(ormsAdministrador.length != 0){
						return "El usuario ya existe";
					} else if(!val.Validacion.largoCadena(oAdministradorVO.getUsuario(), 20)){
						return "El largo de usuario no puede exceder de 20 caracteres";
					} else if(!val.Validacion.largoCadena(oAdministradorVO.getClave(), 20)){
						return "El largo de la clave no puede exceder de 20 caracteres";
					} else{ 

						orms.Administrador lormsAdministrador = orms.AdministradorDAO.createAdministrador();
						// Initialize the properties of the persistent object here
						lormsAdministrador.setUsuario(oAdministradorVO.getUsuario());
						lormsAdministrador.setClave(oAdministradorVO.getClave());

						orms.AdministradorDAO.save(lormsAdministrador);
						t.commit();
						return "Se ha ingresado un administrador exitosamente";

					}
				}
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

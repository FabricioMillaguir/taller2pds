package val;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {


	/*
	 * Validar el largo de cadena
	 * @param String cadena
	 * se verificara el largo de cadena es correcto
	 * @return TRUE si el largo es correcto
	 */
	public static boolean largoCadena(String cadena, int largo){

		boolean validacion = false;

		if(cadena.length() > 0 && cadena.length() < largo){
			validacion=true;
		}

		return validacion;

	}

	/*
	 * Pasar String cadena a Mayusculas
	 * @param String cadena
	 * cadena que pasara a Mayusculas
	 * @return String cadena
	 */
	public static String cadenaMayus(String cadena){

		return cadena.toUpperCase();	
	}

	/**
	 * Validar email con expresiones regulares.
	 * @param email
	 * email para validar
	 * @return true, si el email es valido 
	 */
	public static boolean validarEmail(String email) {

		String patron = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(patron);		
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();

	}

	/**
	 * Validar telefono con expresiones regulares.
	 * @param telefono
	 * telefono para validar
	 * @return true, si el telefono es valido 
	 */
	public static boolean validarTelefono(String telefono){
		try {
			Integer.parseInt(telefono);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

	/**
	 * Retorna TRUE si la palabra no tiene numeros.
	 * @param cadena
	 * cadena a validar para que no contenga numeros
	 * @return boolean
	 */	
	public static boolean noNumero(String cadena){
		boolean valido = true;

		for(int i=0; i<cadena.length(); i++){
			if((cadena.charAt(i)<65 || cadena.charAt(i)>90)&&(cadena.charAt(i)<97 || cadena.charAt(i)>122)){
				valido=false;
			}
		}

		return valido;
	}

	/*
	 * Retorna TRUE si la edad esta en un rango normal
	 * @param edad
	 * edad a validar
	 * @return true, si edad es valida
	 */
	public static boolean validarEdad(String edad){

		boolean valido = false;

		if(Integer.parseInt(edad) > 0 && Integer.parseInt(edad) <150){
			valido = true;
		}

		return valido;

	}

	/*
	 * Retorna TRUE si el RUT es valido
	 * @param RUT
	 * RUT a validar
	 * @return true, si RUT es valido
	 */
	public static boolean validarRut(String rut) {  

		boolean validacion = false;  
		try {  

			rut = rut.replace(".", "");  
			rut = rut.replace("-", "");  
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));  

			char dv = rut.charAt(rut.length() - 1);  

			int m = 0, s = 1;  
			for (; rutAux != 0; rutAux /= 10) {  
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;  
			}  
			if (dv == (char) (s != 0 ? s + 47 : 75)) {  
				validacion = true;  
			}  

		} catch (java.lang.NumberFormatException e) {  

		} catch (Exception e) { 

		}  
		return validacion;  
	}  
	
	
	/*
	 * Retorna TRUE si el Token es valido
	 * @param domain.loginVO log
	 * verificar token vigente
	 * @return true, si token es valido
	 */

	public static boolean verificarLoginVigente(domain.LoginVO log){
		boolean salida = false;
		if(log!=null){
			//fecha debe ser con el formato yy/mm/dd hh:mm:ss

			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

			try {
				Date date = new Date();
				System.out.println(formatter.format(date));


				if(vigente){
					salida=true;
				}else{
					salida=false;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		return salida;
	}


}

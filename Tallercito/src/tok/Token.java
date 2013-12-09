package tok;

/**
 * @author Diego Solis San Martin
 */
public class Token {
	//Generar Token con letras aleatoreas
	public static String generarToken(int largo){
		char[] token = new char[largo];
		for(int i=0;i<largo;i++){
			token[i] = (char) ((Math.random()*25) + 65);
		}
		return String.valueOf(token);
	}
	
}

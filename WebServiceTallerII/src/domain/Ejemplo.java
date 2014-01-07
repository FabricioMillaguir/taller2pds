package domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.security.util.Length;

public class Ejemplo {
	
	public static void main(String[] args){
	
		System.out.print(digitoVerificador("188738508"));
	}
	
	public static boolean digitoVerificador(String rut){
	
		char digVerificador=rut.charAt(rut.length()-1);
		int serie=2;
		int acum=0;
		int resto;
		for(int i=rut.length()-2; i>=0;i--){
			if(serie>7){
				serie=2;
			}
			acum+=((rut.charAt(i)-48)*serie);
			serie++;
			
		}
	   
		resto=acum%11;
		resto=11-resto;
		if(resto==(digVerificador-48))
		{
			return true;
		}
		
		return false;
		
	}

}

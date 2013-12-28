package domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ejemplo {
	
	public static void main(String[] args){
	
		Calendar c= new GregorianCalendar(2013, 3, 5);
		
		//System.out.print(c.before(Calendar.getInstance()));
		
		Date d= new Date(2016, 0, 1);
	
		System.out.print( d.getDay());
	}

}

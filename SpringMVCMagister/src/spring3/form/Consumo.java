package spring3.form;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import webservice.ServicioGastosComunesStub.CuentaVO;

public class Consumo implements java.io.Serializable {

	private int id;
	private int cantidadConsumida;
	private boolean pagado;
	private boolean moroso;
	private int totalAPagar;
	private int dia;
	private int mes;
	private int agno;
	private Calendar fechaDeVencimiento;
	private CuentaVO cuenta;
	private spring3.form.Login login;

	public Consumo() {
	}

	public Consumo(int id, int cantidadConsumida, boolean pagado,
			boolean moroso, int totalAPagar, Calendar fechaDeVencimiento, CuentaVO cuenta, Login login) {
		super();
		this.id = id;
		this.cantidadConsumida = cantidadConsumida;
		this.pagado = pagado;
		this.moroso = moroso;
		this.totalAPagar = totalAPagar;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.cuenta = cuenta;
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadConsumida() {
		return cantidadConsumida;
	}

	public void setCantidadConsumida(int cantidadConsumida) {
		this.cantidadConsumida = cantidadConsumida;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	public int getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(int totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	
	public Calendar getFechaDeVencimiento() {
		Calendar calendar= new GregorianCalendar(this.getAgno(), this.getMes(), this.getDia());
		return calendar;
	}

	public void setFechaDeVencimiento(Calendar fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public CuentaVO getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaVO cuenta) {
		this.cuenta = cuenta;
	}

	public spring3.form.Login getLogin() {
		return login;
	}

	public void setLogin(spring3.form.Login login) {
		this.login = login;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes-1;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int agno) {
		this.agno = agno;
	}

	
	
}

package domain;

public class LoginVO {
	
	private String token;
	private long tiempoInicio;
	private AdministradorVO administradorVO;
	
	public LoginVO(){}
	
	
	
	public LoginVO(long tiempoInicio, AdministradorVO administradorVO) {
		super();
		this.tiempoInicio = tiempoInicio;
		this.administradorVO = administradorVO;
	}



	public LoginVO(String token) {
		super();
		this.token = token;
	}



	public LoginVO(String token, long tiempoInicio,
			AdministradorVO administradorVO) {
		super();
		this.token = token;
		this.tiempoInicio = tiempoInicio;
		this.administradorVO = administradorVO;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public long getTiempoInicio() {
		return tiempoInicio;
	}
	public void setTiempoInicio(long tiempoInicio) {
		this.tiempoInicio = tiempoInicio;
	}
	public AdministradorVO getAdministradorVO() {
		return administradorVO;
	}
	public void setAdministradorVO(AdministradorVO administradorVO) {
		this.administradorVO = administradorVO;
	}
	
	

}

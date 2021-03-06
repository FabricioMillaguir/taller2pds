package spring3.form;

import domain.xsd.ServicioVO;
import webservice.ServicioGastosComunesStub.ClienteVO;
import webservice.ServicioGastosComunesStub.LoginVO;

public class Cuenta implements java.io.Serializable {

	private int id;
	private boolean habilitada;
	private ClienteVO clienteVO;
	private ServicioVO servicioVO;
	private LoginVO loginVO;

	public Cuenta() {

	}

	public Cuenta(int id, boolean habilitada, ClienteVO clienteVO,
			ServicioVO servicioVO, LoginVO loginVO) {
		super();
		this.id = id;
		this.habilitada = habilitada;
		this.clienteVO = clienteVO;
		this.servicioVO = servicioVO;
		this.loginVO = loginVO;
	}

	public Cuenta(boolean habilitada, ClienteVO clienteVO,
			ServicioVO servicioVO, LoginVO loginVO) {
		super();
		this.habilitada = habilitada;
		this.clienteVO = clienteVO;
		this.servicioVO = servicioVO;
		this.loginVO = loginVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isHabilitada() {
		return habilitada;
	}

	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}

	public ClienteVO getClienteVO() {
		return clienteVO;
	}

	public void setClienteVO(ClienteVO clienteVO) {
		this.clienteVO = clienteVO;
	}

	public ServicioVO getServicioVO() {
		return servicioVO;
	}

	public void setServicioVO(ServicioVO servicioVO) {
		this.servicioVO = servicioVO;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

}

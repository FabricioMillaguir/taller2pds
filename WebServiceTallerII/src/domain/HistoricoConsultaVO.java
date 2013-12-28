package domain;

import java.util.Calendar;

/**
 * Historico de consultas del Cliente
 * 
 * @author Fabricio
 * 
 */
public class HistoricoConsultaVO {

	private int id;
	private Calendar fechaDeConsulta;
	private ClienteVO clienteVO;

	/**
	 * Constructor de HistoricoConsultaVO
	 */
	public HistoricoConsultaVO() {
	}

	/**
	 * Constructor de HistoricoConsultaVO con id
	 * 
	 * @param id
	 */
	public HistoricoConsultaVO(int id) {
		this.id = id;
	}

	/**
	 * Constructor de HistoricoConsultaVO sin id
	 * 
	 * @param fechaDeConsulta
	 * @param clienteVO
	 */
	public HistoricoConsultaVO(Calendar fechaDeConsulta, ClienteVO clienteVO) {
		this.fechaDeConsulta = fechaDeConsulta;
		this.clienteVO = clienteVO;
	}

	/**
	 * Constructor de HistoricoConsultaVO
	 * 
	 * @param id
	 * @param fechaDeConsulta
	 * @param clienteVO
	 */
	public HistoricoConsultaVO(int id, Calendar fechaDeConsulta,
			ClienteVO clienteVO) {
		this.id = id;
		this.fechaDeConsulta = fechaDeConsulta;
		this.clienteVO = clienteVO;
	}

	/**
	 * Devuelve el id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Cambia el id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve la fecha de la consulta
	 * 
	 * @return
	 */
	public Calendar getFechaDeConsulta() {
		return fechaDeConsulta;
	}

	/**
	 * Cambia la fecha de la Consulta
	 * 
	 * @param fechaDeConsulta
	 */
	public void setFechaDeConsulta(Calendar fechaDeConsulta) {
		this.fechaDeConsulta = fechaDeConsulta;
	}

	/**
	 * Devuelve el ClienteVO
	 * 
	 * @return
	 */
	public ClienteVO getClienteVO() {
		return clienteVO;
	}

	/**
	 * Cambia el ClienteVO
	 * 
	 * @param clienteVO
	 */
	public void setClienteVO(ClienteVO clienteVO) {
		this.clienteVO = clienteVO;
	}

}

package ec.edu.ups.EvaluacionWSVeletanga.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import ec.edu.ups.EvaluacionWSVeletanga.*;

/**
 * @author ADMINX
 *
 */
@Entity
public class Cuenta implements Serializable {
	// Atributos de la clase
	@Id
	@Column(name = "numero_cuenta")
	private String numeroCuentaDeAhorro;
	private Date fechaDeRegistro;
	private Double saldoCuentaDeAhorro;
	// RELACION DE UNO CLIENTE A MUCHAS CUENTAS
	@OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "cedula_cliente")
	private Cliente cliente;
		public Cuenta() {

	}

	public String getNumeroCuentaDeAhorro() {
		return numeroCuentaDeAhorro;
	}

	public void setNumeroCuentaDeAhorro(String numeroCuentaDeAhorro) {
		this.numeroCuentaDeAhorro = numeroCuentaDeAhorro;
	}

	public Date getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public Double getSaldoCuentaDeAhorro() {
		return saldoCuentaDeAhorro;
	}

	public void setSaldoCuentaDeAhorro(Double saldoCuentaDeAhorro) {
		this.saldoCuentaDeAhorro = saldoCuentaDeAhorro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

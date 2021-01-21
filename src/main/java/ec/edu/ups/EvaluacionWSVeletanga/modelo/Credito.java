package ec.edu.ups.EvaluacionWSVeletanga.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author ADMINX
 *
 */
@Entity
public class Credito implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idc")
	private int id;
	private int Monto;
	private int meses;
	private Date fechacredito;
	// RELACION DE UNO CLIENTE A MUCHAS CUENTAS
	@OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "numero_cuenta")
	private Cuenta cuenta;
	private Amortizacion amortizacion;
	
	
	
	public Date getFechacredito() {
		return fechacredito;
	}

	public void setFechacredito(Date fechacredito) {
		this.fechacredito = fechacredito;
	}

	public Amortizacion getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(Amortizacion amortizacion) {
		this.amortizacion = amortizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Credito() {

	}

	@Override
	public String toString() {
		return "Credito [id=" + id + ", Monto=" + Monto + ", meses=" + meses + ", fechacredito=" + fechacredito
				+ ", cuenta=" + cuenta + ", amortizacion=" + amortizacion + "]";
	}

	
	
	

}

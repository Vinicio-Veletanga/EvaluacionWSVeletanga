package ec.edu.ups.EvaluacionWSVeletanga.modelo;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.*;

import ec.edu.ups.EvaluacionWSVeletanga.modelo.*;
/**
 * @author ADMINX
 *
 */
@Entity
public class Cliente implements Serializable { 
	//Atributos de la entidad
	private static  final long serialVersionUID = 1L;
	@Id 
	@Column(name="cedula_cliente")
	private String cedula; 
	private String nombre; 
	
	public Cliente() {

	} 

	public String getCedula() {
		return cedula;
	}  
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	} 
	
	public String getNombre() {
		return nombre;
	} 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + "]";
	} 
	
	
	
	
	
}

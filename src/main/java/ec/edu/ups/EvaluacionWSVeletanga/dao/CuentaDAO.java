package ec.edu.ups.EvaluacionWSVeletanga.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionWSVeletanga.modelo.*;


/**
 * @author ADMINX
 *
 */
@Stateless
public class CuentaDAO {
	
	//Atributo de la clase
	@PersistenceContext(name = "bancavirtualPersistenceUnit") 
	private EntityManager em;
	
	/** 
	 * Metodo que permite obtener un cliente de la base de datos
	 * @param cedulaCliente Cedula que se utilizara para obtener el cliente
	 * @return un cliente que se encuentre registrado en la base
	 */
	public Cuenta read(String numeroCuenta) {
		return em.find(Cuenta.class, numeroCuenta);
	} 
	
	public void insert(Cuenta c) {
		em.persist(c);
	}
	/** 
	 * Metodo que permite eliminar un cliente de la base de datos
	 * @param cedulaCliente Cedula utilizaremos para poder eliminar el cliente
	 */
	public void delete(String numeroCuenta) {
		Cuenta c = read(numeroCuenta);
		em.remove(c);
	}
	
	/** 
	 * Metodo que permite obtener los clientes que estan registrados en la base de datos
	 * @return Lista de clientes que estan registrados en la base de datos
	 */
	public List<Cuenta> getCuentas() {
		String jpql = "SELECT c FROM Cuenta c ";

		Query q = em.createQuery(jpql, Cliente.class);
		return q.getResultList();
	} 
	
	
	
	
	
	
}

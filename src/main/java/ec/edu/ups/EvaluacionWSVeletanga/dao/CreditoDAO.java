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
public class CreditoDAO {
	
	//Atributo de la clase
	@PersistenceContext(name = "examenapdPersistenceUnit") 
	private EntityManager em;
	
	/** 
	 * Metodo que permite obtener un cliente de la base de datos
	 * @param cedulaCliente Cedula que se utilizara para obtener el cliente
	 * @return un cliente que se encuentre registrado en la base
	 */
	public Credito read(int codigoc) {
		return em.find(Credito.class, codigoc);
	} 
	
	/** 
	 * Metodo que permite eliminar un cliente de la base de datos
	 * @param cedulaCliente Cedula utilizaremos para poder eliminar el cliente
	 */
	public void delete(int  codigoc) {
		Credito c = read(codigoc);
		em.remove(c);
	}
	
	/** 
	 * Metodo que permite obtener los clientes que estan registrados en la base de datos
	 * @return Lista de clientes que estan registrados en la base de datos
	 */
	public List<Credito> getCreditos() {
		String jpql = "SELECT c FROM Credito c ";

		Query q = em.createQuery(jpql, Credito.class);
		return q.getResultList();
	} 
	
	
	
	
	
	
}

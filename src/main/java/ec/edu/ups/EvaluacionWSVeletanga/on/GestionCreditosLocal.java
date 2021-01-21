package ec.edu.ups.EvaluacionWSVeletanga.on;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

/**
 * @author ADMINX
 *
 */


import ec.edu.ups.EvaluacionWSVeletanga.modelo.*;
@Local
public interface GestionCreditosLocal {
	public String generarCredito(String cedula,String numerocuenta,int valor,int numeses);
	public String getUsuario(String cedula, String nombre, String apellido);
	public String getContraseña();
	public void enviarCorreo(String destinatario, String asunto, String cuerpo);
	public String fecha();
	public String obtenerFecha(Date fecha);
	public void guardarCliente(Cliente c);
	public Cliente buscarCliente(String cedulaCliente);
	public Cliente buscarClienteUsuarioContraseña(String usuario, String contraseña);
	public void eliminarCliente(String cedulaCliente);
	public void actualizarCliente(Cliente cliente);
	public List<Cliente> listaClientes();
	public Cuenta buscarCuentaDeAhorroCliente(String cedulaCliente);
	public void guardarPoliza(Credito c);
	public List<Credito> listasPolizas();
	public List<Credito> getListasPolizas();
	public String realizarTransaccion(String cuenta, double monto, String tipoTransaccion);
	}

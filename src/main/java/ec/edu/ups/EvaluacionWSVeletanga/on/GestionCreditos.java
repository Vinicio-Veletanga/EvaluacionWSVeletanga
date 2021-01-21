package ec.edu.ups.EvaluacionWSVeletanga.on;

import javax.inject.Inject;

import ec.edu.ups.EvaluacionWSVeletanga.dao.*;
import ec.edu.ups.EvaluacionWSVeletanga.modelo.*;

import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;

import java.sql.SQLException;
import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.management.remote.NotificationResult;
import javax.persistence.NoResultException;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class GestionCreditos implements GestionCreditosLocal{
	@Inject
	private ClienteDAO clienteDAO;
	@Inject
	private CuentaDAO cuentaDAO;
	@Inject
	private AmortizacionDAO amortizacionDAO;
	@Inject
	private CreditoDAO creditoDAO;
	
	@Override
	public String generarCredito(String cedula,String numerocuenta,int monto,int meses) {
		
		
		//SE VALIDA SI EL CLIENTE EXISTE CON LA CEDULA
		
		Cliente s= clienteDAO.read(cedula);
		if (s != null) {
			//SE BUSCA LA CUENTA
			Cuenta ca = cuentaDAO.read(numerocuenta);//SE CRE EL CREDITO
			Credito cr = new Credito();
			cr.setMeses(meses);
			cr.setCuenta(ca);
			cr.setMonto(monto);
			cr.setFechacredito(new Date());
			try {
				cuentaDAO.insert(ca);
			} catch (Exception e) {
				e.getMessage();
				// TODO: handle exception
			}
			
			
		} else {
			

		}
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public String getUsuario(String cedula, String nombre, String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getContraseña() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String fecha() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String obtenerFecha(Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void guardarCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cliente buscarCliente(String cedulaCliente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Cliente buscarClienteUsuarioContraseña(String usuario, String contraseña) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void eliminarCliente(String cedulaCliente) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Cliente> listaClientes() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Cuenta buscarCuentaDeAhorroCliente(String cedulaCliente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void guardarPoliza(Credito c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Credito> listasPolizas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Credito> getListasPolizas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String realizarTransaccion(String cuenta, double monto, String tipoTransaccion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

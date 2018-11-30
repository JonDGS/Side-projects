package Personas;
import java.text.SimpleDateFormat;
import java.util.Date;

import Object_Models.Persona;

public class Visitante extends Persona{
	private String entrada;
	private String salida;
	private String residenteAutorizado;
	
	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getResidenteAutorizado() {
		return residenteAutorizado;
	}

	public void setResidenteAutorizado(String residenteAutorizado) {
		this.residenteAutorizado = residenteAutorizado;
	}
	
	public Visitante(String residenteAutorizado) {
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm");
		Date date = new Date();
		this.entrada = format.format(date);
	}

}

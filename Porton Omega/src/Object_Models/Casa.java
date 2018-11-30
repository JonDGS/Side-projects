package Object_Models;

import Personas.Residente;

public class Casa {
	private String numeroDeCasa;
	private String[] numeros;
	private Residente[] residentes;
	private String[] placas;
	
	public Casa(String numeroDeCasa, String numero) {
		this.numeroDeCasa = numeroDeCasa;
		String[] numeros = numero.split(",");
		this.numeros = numeros;
	}

}

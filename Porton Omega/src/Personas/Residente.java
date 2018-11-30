package Personas;

import Object_Models.Persona;

public class Residente extends Persona{
	private String numeroDeCasa;
	private boolean tieneAuto;
	private String[] placas;
	
	public Residente(String apellido, String nombre, String cedula, String telefono, String numeroDeCasa, boolean tieneAuto, String placa) {
		String[] apellidos = apellido.split(" ");
		String[] nombres = nombre.split(" ");
		setApellido_1(apellidos[0]);
		setApellido_2(apellidos[1]);
		setNombre_1(nombres[0]);
		if(nombres[1] == null) {
			setNombre_2("N/A");
		}else {
			setNombre_2(nombres[1]);
		}
		setCedula(cedula);
		setTelefono(telefono);
		setEsResidente(true);
		this.numeroDeCasa = numeroDeCasa;
		this.tieneAuto = tieneAuto;
		if(tieneAuto) {
			String[] placas = placa.split(",");
			for(int i = 0; i < placas.length; i++) {
				this.placas[i] = placas[i];
			}
		}
	}

}

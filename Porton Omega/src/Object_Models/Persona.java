package Object_Models;

public class Persona {
	
	private String apellido_2;
	private String nombre_1;
	private String nombre_2;
	private String cedula;
	private String telefono;
	private boolean esResidente;
	private String apellido_1;

	public String getApellido_1() {
		return apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	public String getNombre_1() {
		return nombre_1;
	}

	public void setNombre_1(String nombre_1) {
		this.nombre_1 = nombre_1;
	}

	public String getNombre_2() {
		return nombre_2;
	}

	public void setNombre_2(String nombre_2) {
		this.nombre_2 = nombre_2;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEsResidente() {
		return esResidente;
	}

	public void setEsResidente(boolean esResidente) {
		this.esResidente = esResidente;
	}

}

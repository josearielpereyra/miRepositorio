package prueba_git;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private String direccion;
	private String telefono;
	private Calendar fechaNacimiento;
	
	public Persona(String nombre, String direccion, String telefono, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the nombre
	 */
	public String obtenerNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String obtenerDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void establecerDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String obtenerTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void establecerTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Calendar obtenerFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void establecerFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void mostrarDatos() {
		System.out.println("Datos de la Persona...");
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Telefono: " + telefono);
		System.out.printf("Fecha de nacimiento: %d/%d/%d", fechaNacimiento.get(Calendar.DAY_OF_MONTH), 
							fechaNacimiento.get(Calendar.MONTH), fechaNacimiento.get(Calendar.YEAR) );
	}
	
	
}

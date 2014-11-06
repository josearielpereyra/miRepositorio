package prueba_git;

import java.util.GregorianCalendar;

public class PruebaPersona {
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan Perez", "Calle Principal #45", "809-555-5555", 
										new GregorianCalendar(1975, 10, 25));
		persona1.mostrarDatos();
		System.out.println( persona1.obtenerNombre() );
		
		System.out.println("Para probar merge...");
		System.out.println("Una linea mas..");
		System.out.println("esto es una prueba...");
		System.out.println("colaborador...");
	}

}

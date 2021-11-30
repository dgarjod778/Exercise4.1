import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Apartado 1.

		Persona Juan, Paco, Manolo, Benito;
		Juan = new Persona();
		System.out.println("El nombre de la persona=" + Juan.getNombre());
		System.out.println("Dime un nuevo nombre para el la persona: ");

		Juan.setNombre(sc.nextLine());

		System.out.println("El nombre asignado para esa persona es: " + Juan.getNombre());

		// Apartado 2
		System.out.printf("Voy a necesitar que me des nuevos datos\nEdad: ");
		Juan.setEdad(sc.nextInt());
		System.out.println("Altura: ");
		Juan.setAltura(sc.nextFloat());
		System.out.println("Ocupación: ");
		Juan.setOcupacion(sc.nextLine());

		System.out.printf("Entonces tienes los siguientes datos:\n" + Juan.getNombre() + "\n" + Juan.getEdad() + "\n"
				+ Juan.getAltura() + "\n" + Juan.getOcupacion());

		// Apartado 3

		Paco = new Persona();

		System.out.printf("Los dos por defectos del constructor son:\n" + Paco.getNombre() + "\n" + Paco.getEdad()
				+ "\n" + Paco.getAltura() + "\n" + Paco.getOcupacion()+"\n");

		// Apartado 6

		Manolo = new Persona("manolo", 45, 1.7f, "albañil", 900);
		Benito = new Persona("benito", 45, 1.5f, "Carpintero", 1200);
		
		Manolo.sumaSueldo(Benito);
		
		System.out.printf("EL suelo de manoloy es  y el de benito es "+ Manolo.getSueldo() + Benito.getSueldo());
		
		
		
		
		

	}

}

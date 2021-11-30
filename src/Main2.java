import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Alumno paco;
		
		paco=new Alumno();
		System.out.println("Dime las dos notas:");
		
		paco.ponNota(sc.nextInt(), sc.nextInt());
		
		System.out.println(paco.dameMedia());
		
		System.out.println(paco.descripcion());
		

	}

}

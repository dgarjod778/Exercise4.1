
public class Alumno {
	private String nombre;
	private int numMatricula;
	private double nota1;
	private double nota2;
	private String descripcion;

	public Alumno() {
		nombre = "Sin nombre";
		numMatricula = 0000;

	}

	void ponNota(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	double dameMedia() {

		return (this.nota1 + this.nota2) / 2;

	}

	String descripcion() {

		return "El nombre del alumno es " + this.nombre + " tiene el numero de matricula " + this.numMatricula + " Su nota media es " + this.dameMedia();
	}
	
	

}

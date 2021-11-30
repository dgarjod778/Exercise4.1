public class Persona {
	private String nombre;
	private int edad;
	private float altura;
	private String ocupacion;
	//Apartado 6
	private double sueldo;

	// Apartado 4.
	public Persona() {
		nombre = "Sin nombre";
		edad = 0;
		altura = 0.0f;
		ocupacion = "Sin ocupacion";

	

	}
	
	//Apartado 5
	
	public Persona(String nombre, int edad, float altura, String ocupacion, double sueldo) {
		this.nombre=nombre;
		this.edad=edad;
		this.altura=altura;
		this.ocupacion=ocupacion;
		this.sueldo=sueldo;
	}
	

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Aparado 2

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

	float getAltura() {
		return altura;
	}

	void setAltura(float altura) {
		this.altura = altura;
	}

	String getOcupacion() {
		return ocupacion;
	}

	void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	//Apartado 6
	double getSueldo() {
		return sueldo;
	}
	
	void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	void sumaSueldo(Persona p) {
		sueldo=p.sueldo;
		
//	void doblarSueldo(Persona p) {
//		
//	}
	}
	
	
}
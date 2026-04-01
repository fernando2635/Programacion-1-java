package Herencia;

public class Docente extends Persona {
	public Docente(String nombre, int edad, String titulo) {
		super(nombre, edad);
		this.titulo = titulo;
	}
	public void titulo() {
		System.out.println("Titulo: Licenciatura en Informatica");
	}
}

}

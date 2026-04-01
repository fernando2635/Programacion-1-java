package Herencia;

public class Docente extends Persona {
	private String titulo;
	public Docente(String nombre, int edad) {
		super(nombre, edad);
	}
	public Docente(String nombre, int edad, String titulo) {
		super(nombre, edad);
		this.titulo = titulo;
		}
	public void mostrarInfo() {
		this.saludar();
		System.out.println("Mi titulo es: " + titulo);
	}
	
}
package Herencia;

public class GestorPersona {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Matias", 30);
		persona1.saludar();
		Docente docente1 = new Docente("Juan", 51);
		docente1.saludar();
		docente1.mostrarInfo();
		
		Docente docente2 = new Docente("Matias", 45, "Ing. en Sistemas");
		docente2.mostrarInfo();
	}
}

package Herencia;

public class GestorPersona {
	public static void main(String[] args) {
		persona p1 = new persona("Juan", 30);
		p1.mostrarinformacion();
		
		Docente d1 = new Docente("Maria", 40, "Licenciatura en Informatica");
		d1.mostrarinformacion();
		

	}

}

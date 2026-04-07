package abstraccion;

public class mascotas {

	public static void main(String[] args) {
		// Ejemplo mínimo de uso: crea una mascota y muestra su nombre
		Mascota ejemplo = new Mascota("Fido", "Perro", "Labrador", 4, "+549123456789");
		System.out.println("Mascota creada: " + ejemplo.getNombre());
	}

}

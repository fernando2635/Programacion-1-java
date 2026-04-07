package abstraccion;

public class MascotaConcreta extends Mascota {

	public MascotaConcreta(String nombre, String especie, String raza, int edad, String contactoDueno) {
		super(nombre, especie, raza, edad, contactoDueno);
	}

	@Override
	public void registrarConsulta(String diagnostico, String tratamiento) {
		// Implementación concreta para registrar la consulta
		System.out.println("Consulta registrada para " + getNombre() + ": Diagnóstico - " + diagnostico + ", Tratamiento - " + tratamiento);
	}

	@Override
	public void contactarDueno(String mensaje) {
		// Implementación concreta para contactar al dueño
		System.out.println("Contactando a " + getContactoDueno() + ": " + mensaje);
	}

}

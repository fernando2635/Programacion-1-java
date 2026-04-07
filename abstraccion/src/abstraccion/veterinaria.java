package abstraccion;

public class veterinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Mascota mascota1 = new MascotaConcreta("Firulais", "Perro", "Labrador", 5, "555-1234");
		mascota1.registrarConsulta("Gripe canina", "Reposo y medicamentos");
		mascota1.contactarDueno("La consulta ha sido registrada exitosamente.");
		
	}

}

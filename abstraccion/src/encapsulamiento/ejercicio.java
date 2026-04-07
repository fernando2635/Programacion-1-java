package encapsulamiento;

public class ejercicio {
	
	public static void main(String[] args) {
		Termostato termostato = new Termostato();
				
		System.out.println("Temperatura actual: " + termostato.getTemperaturaActual() + "°C");
		System.out.println("Temperatura objetivo: " + termostato.getTemperaturaObjetivo() + "°C");
		
		System.out.println("\nIntentando establecer temperatura objetivo a 25.0°C...");
		termostato.setTemperaturaObjetivo(25.0);
		System.out.println("Temperatura objetivo actualizada: " + termostato.getTemperaturaObjetivo() + "°C");
		
		System.out.println("\nIntentando establecer temperatura objetivo a 10.0°C (fuera de rango)...");
		termostato.setTemperaturaObjetivo(10.0);
		System.out.println("Temperatura objetivo después del intento fallido: " + termostato.getTemperaturaObjetivo() + "°C");
		
		System.out.println("\nIntentando establecer temperatura objetivo a 35.0°C (fuera de rango)...");
		termostato.setTemperaturaObjetivo(35.0);
		System.out.println("Temperatura objetivo después del intento fallido: " + termostato.getTemperaturaObjetivo() + "°C");
	}
	/*
	 * en quen parte actua la abstracion?
	 * La abstracción se manifiesta en la forma en que el usuario interactúa con el termostato a través de métodos públicos (getters y setters) sin necesidad de conocer los detalles internos de cómo se almacenan o gestionan las temperaturas. El usuario solo necesita saber cómo obtener la temperatura actual y establecer la temperatura objetivo, sin preocuparse por la implementación interna o las validaciones que se realizan dentro de la clase Termostato.
	 * 
	 * y si ahora hacemos que el usuario ingrese la temperatura?
	 * 
	 * Si se desea permitir que el usuario ingrese la temperatura objetivo, se podría agregar un método adicional que solicite al usuario que ingrese un valor a través de la consola. Este método podría utilizar un Scanner para leer la entrada del usuario y luego llamar al setter setTemperaturaObjetivo con el valor ingresado. La validación de rango seguiría siendo parte del setter, asegurando que solo se acepten valores válidos.
	 * 
	 * en donde lo agregamos?
	 * Podríamos agregar un método llamado solicitarTemperaturaObjetivo() dentro de la clase Termostato, que se encargue de solicitar al usuario que ingrese la temperatura objetivo a través de la consola. Este método podría ser llamado desde el main o desde cualquier otro lugar donde se desee permitir al usuario establecer la temperatura objetivo de manera interactiva.
	 * 
	 * */

}

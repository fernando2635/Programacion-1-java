
public class Parte2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Parte 2: Programa de Prueba (Main)
		 * Creá una clase principal para probar tu Contador realizando exactamente los siguientes pasos en orden:
		 * Crear el objeto cnt1 utilizando el constructor por defecto.
		 * Crear el objeto cnt2 utilizando el constructor que inicializa el valor en 100.
		 * Crear el objeto cnt3 utilizando el constructor que inicializa el valor en 10 y el incremento en 3.
		 * Mostrar por consola los valores y los incrementos de los tres contadores.
		 * Ejecutar el método incrementar() en cada uno de los contadores.
		 * Mostrar los nuevos valores de los tres contadores.
		 * Cambiar el valor de cnt1 a 50 (usando su setter).
		 * Cambiar el incremento de cnt2 a 5 (usando su setter).
		 * Ejecutar el método incrementar() en cada uno de los contadores nuevamente.
		 * Mostrar los valores finales de los tres contadores.
		 * */
		
		Contador cnt1 = new Contador();
		Contador cnt2 = new Contador(100);
		Contador cnt3 = new Contador(10, 3);
		
		System.out.println("Contador 1: valor = " + cnt1.getValor() + ", incremento = " + cnt1.getIncremento());
		System.out.println("Contador 2: valor = " + cnt2.getValor() + ", incremento = " + cnt2.getIncremento());
		System.out.println("Contador 3: valor = " + cnt3.getValor() + ", incremento = " + cnt3.getIncremento());
		
		cnt1.incrementar();
		cnt2.incrementar();
		cnt3.incrementar();
		
		System.out.println("Después de incrementar:");
		System.out.println("Contador 1: valor = " + cnt1.getValor() + ", incremento = " + cnt1.getIncremento());
		System.out.println("Contador 2: valor = " + cnt2.getValor() + ", incremento = " + cnt2.getIncremento());
		System.out.println("Contador 3: valor = " + cnt3.getValor() + ", incremento = " + cnt3.getIncremento());
		
		cnt1.setValor(50);
		cnt2.setIncremento(5);
		
		
	}
}

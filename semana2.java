import java.util.Scanner;
public class semana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Creamos el objeto Scanner para leer desde consola
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese su nombre:");
	    String nombre = scanner.nextLine();

	    System.out.println("Ingrese su edad:");
	    int edad = scanner.nextInt();
	    
	    System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
	    System.out.println(nombre.length());
	    
	    // Crear arreglo
	    int[] numeros = {10, 20, 30, 40, 50};
	    int numeros2[] = new int[5];
	    // Mostrar algunos valores
	    System.out.println("Primer número: " + numeros[0]);
	    System.out.println("Tercer número: " + numeros[2]);
	    
	    // Cerramos el Scanner
	    scanner.close();
	}

}

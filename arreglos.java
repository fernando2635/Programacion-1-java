import java.util.Iterator;
import java.util.Scanner;

public class arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int[]numeros= new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
			System.out.println("Ingrese el numero["+i+"]: ");
			numeros[i]=teclado.nextInt();
			suma+=numeros[i];
		}
		for (int i = 0; i<5; i++) {
			System.out.print(numeros[i]+"");
		}
		System.out.println("la suma es de: "+suma);
		teclado.close();
	}
}

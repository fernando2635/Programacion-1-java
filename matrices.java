import java.util.Iterator;
import java.util.Scanner;

public class matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int[][] matriz = new int[2][3];

	    // Cargar matriz
	    for (int i = 0; i < 2; i++) {
	      for (int j = 0; j < 3; j++) {
	        System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
	        matriz[i][j] = sc.nextInt();
	      }
	    }

	    // Mostrar matriz
	    System.out.println("Matriz cargada:");
	    for (int i = 0; i < 2; i++) {
	      for (int j = 0; j < 3; j++) {
	        System.out.print(matriz[i][j] + " ");
	      }
	      System.out.println();
	    }

	    sc.close();
	}

}
//frase.split(separa en lo que este en las comillas" ") es un arreglo de palabras
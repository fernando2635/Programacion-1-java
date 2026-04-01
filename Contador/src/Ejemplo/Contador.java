package Ejemplo;

public class Contador {

	
		// TODO Auto-generated method stub
		/*
		 * Desarrollá una clase llamada Contador que represente un contador numérico. La clase debe tener
		 * dos atributos privados: valor e incremento (ambos enteros).
		 * Deberá implementar el siguiente comportamiento:
		 * Constructor por defecto: inicializa el valor en 0 y el incremento en 1.
		 * Constructor con 1 parámetro: recibe un entero para inicializar el valor, y establece el incremento en 1.
		 * Constructor con 2 parámetros: recibe dos enteros para inicializar tanto el valor como el incremento.
		 * Métodos de acceso: Getters y Setters para ambos atributos.
		 * Método de acción: Un método incrementar() que sume al valor actual la cantidad especificada en el incremento.
		 * */
		private int valor;
		private int incremento;

		public Contador() {
			this.valor = 0;
			this.incremento = 1;
		}

		public Contador(int nuevovalor) {
			this.valor = nuevovalor;
			this.incremento = 1;
		}

		public Contador(int nuevovalor, int nuevoincremento) {
			this.valor = nuevovalor;
			this.incremento = nuevoincremento;
		}

		public int getValor() {
			return valor;
		}

		public int getIncremento() {
			return incremento;
		}

		public void setValor(int nuevovalor) {
			this.valor = nuevovalor;
		}

		public void setIncremento(int nuevoincremento) {
			this.incremento = nuevoincremento;
		}

		public void incrementar() {
			this.valor = this.valor + this.incremento;
			valor= valor + incremento;
			valor+= incremento;
		}
	}


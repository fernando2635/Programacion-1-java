package encapsulamiento;

public class Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Encapsulamiento es un principio de la programación orientada a objetos que consiste en ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos públicos. Esto se logra utilizando modificadores de acceso como private, protected y public para controlar el acceso a los atributos y métodos de una clase.
 * El encapsulamiento ayuda a proteger los datos de una clase, evitando que sean modificados directamente desde fuera de la clase. En su lugar, se proporcionan métodos públicos (getters y setters) para acceder y modificar los atributos de manera controlada. Esto mejora la seguridad y la integridad de los datos, ya que se pueden implementar validaciones dentro de los métodos para asegurar que los datos sean correctos antes de ser modificados.
 * El encapsulamiento también facilita el mantenimiento del código, ya que los cambios en la implementación interna de una clase no afectan a las clases que la utilizan, siempre y cuando la interfaz pública (métodos) se mantenga constante. Esto permite a los desarrolladores modificar y mejorar la funcionalidad de una clase sin preocuparse por romper el código que depende de ella.
 * En resumen, el encapsulamiento es una técnica fundamental en la programación orientada a objetos que promueve la modularidad, la seguridad y la mantenibilidad del código al ocultar los detalles internos de una clase y exponer solo lo necesario a través de métodos públicos.
 * 
 * 🛠️ Práctica de POO - Ejercicio 1: El Termostato Inteligente
 * Poné a prueba los conceptos de Abstracción y Encapsulamiento.
 * Consigna
 * Estás desarrollando el software para una casa inteligente. Tu primera tarea es modelar un Termostato. El objetivo es que el usuario interactúe de forma sencilla
 * (Abstracción) y que el sistema evite temperaturas peligrosas (Encapsulamiento).
 * Atributos: Crea la clase Termostato con dos atributos privados: temperaturaActual y temperaturaObjetivo (ambos de tipo double).
 * Constructor: Al instanciar el termostato, la temperatura actual debe comenzar siempre en 20.0 grados, y la objetivo también en 20.0.
 * Métodos de acceso (Getters/Setters):
 * Crea un método para obtener la temperatura actual.
 * Crea un método setTemperaturaObjetivo(double nuevaTemp). Validación: El termostato solo acepta valores entre 15.0 y 30.0 grados. Si se ingresa un valor fuera de ese rango, debe mostrar un mensaje de error y no modificar la temperatura.
 */
package encapsulamiento;
import java.util.Scanner;
/**
 * Clase Termostato que implementa encapsulamiento y abstracción.
 * 
 * Encapsulamiento: Los atributos son privados y se accede a través de métodos públicos.
 * Validación: El setter verifica que la temperatura objetivo esté en el rango [15.0, 30.0].
 * Abstracción: El usuario solo necesita llamar a métodos simples sin conocer la lógica interna.
 */
public class Termostato {

    // Atributos privados (Encapsulamiento)
    private double temperaturaActual;
    private double temperaturaObjetivo;

    // Rango válido de temperaturas
    private static final double TEMP_MIN = 15.0;
    private static final double TEMP_MAX = 30.0;
    private static final double TEMP_INICIAL = 20.0;

    /**
     * Constructor del Termostato.
     * Inicializa tanto la temperatura actual como la objetivo a 20.0 grados.
     */
    public Termostato() {
        this.temperaturaActual = TEMP_INICIAL;
        this.temperaturaObjetivo = TEMP_INICIAL;
    }

    /**
     * Obtiene la temperatura actual del termostato (Getter).
     * 
     * @return la temperatura actual en grados Celsius
     * 
     */
    public double getTemperaturaActual() {
        return this.temperaturaActual;
    }

    /**
     * Obtiene la temperatura objetivo del termostato (Getter).
     * 
     * @return la temperatura objetivo en grados Celsius
     */
    public double getTemperaturaObjetivo() {
        return this.temperaturaObjetivo;
    }
    
    public void solicitarTemperaturaObjetivo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la temperatura objetivo (entre " + TEMP_MIN + " y " + TEMP_MAX + " °C): ");
		double nuevaTemp = scanner.nextDouble();
		setTemperaturaObjetivo(nuevaTemp);
	}

    /**
     * Establece la temperatura objetivo con validación de rango.
     * Solo acepta valores entre 15.0 y 30.0 grados (Encapsulamiento + Validación).
     * 
     * @param nuevaTemp la nueva temperatura objetivo
     */
    public void setTemperaturaObjetivo(double nuevaTemp) {
        if (nuevaTemp < TEMP_MIN || nuevaTemp > TEMP_MAX) {
            System.err.println("❌ Error: La temperatura debe estar entre " + TEMP_MIN 
                + " y " + TEMP_MAX + " grados. Se rechazó el valor: " + nuevaTemp);
            return; // No modifica la temperatura si está fuera de rango
        }
        this.temperaturaObjetivo = nuevaTemp;
        System.out.println("✓ Temperatura objetivo establecida en: " + nuevaTemp + " °C");
    }

    /**
     * Simula un cambio gradual de la temperatura actual hacia la objetivo.
     * (Método de utilidad para demostración.)
     */
    public void simularCambioTemperatura() {
        if (Math.abs(this.temperaturaActual - this.temperaturaObjetivo) > 0.1) {
            if (this.temperaturaActual < this.temperaturaObjetivo) {
                this.temperaturaActual += 0.5;
            } else {
                this.temperaturaActual -= 0.5;
            }
        }
    }

    /**
     * Retorna información del estado actual del termostato.
     */
    @Override
    public String toString() {
        return String.format("Termostato [Actual: %.1f°C, Objetivo: %.1f°C]",
                this.temperaturaActual, this.temperaturaObjetivo);
    }
    /*
     *en que parte agregamos el metodo para solicitar la temperatura al usuario?
     *Podemos agregar un método llamado solicitarTemperaturaObjetivo() dentro de la clase Term
     * */
    
}

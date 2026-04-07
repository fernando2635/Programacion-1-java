package abstraccion;

/**
 * Clase que modela una Mascota para una Clínica Veterinaria.
 * Se usan un máximo de 5 atributos necesarios para atender al animal y
 * contactar al dueño. Se incluyen además métodos (acciones) relevantes
 * en el contexto de una consulta veterinaria.
 */
public class Mascota {

    // Atributos (máximo 5): identifican la mascota y permiten contactar al dueño
    private String nombre;         // nombre de la mascota
    private String especie;        // ejemplo: Perro, Gato, Ave
    private String raza;           // raza o tipo
    private int edad;              // edad en años
    private String contactoDueno;  // teléfono o email del dueño

    // Constructor completo
    public Mascota(String nombre, String especie, String raza, int edad, String contactoDueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.contactoDueno = contactoDueno;
    }

    // Acciones (métodos) relevantes para la clínica veterinaria

    /**
     * Registra una consulta clínica para la mascota con diagnóstico y tratamiento.
     * (implementación pendiente)
     */
    public void registrarConsulta(String diagnostico, String tratamiento) {
        // lógica para guardar la consulta en la historia clínica
    }

    /**
     * Contacta al dueño con un mensaje (por ejemplo, para informar resultados o citas).
     * (implementación pendiente)
     */
    public void contactarDueno(String mensaje) {
        // lógica para notificar al dueño (llamada, SMS o email)
    }

    // Getters y setters básicos (opcional pero útiles para el modelo)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getContactoDueno() { return contactoDueno; }
    public void setContactoDueno(String contactoDueno) { this.contactoDueno = contactoDueno; }

}

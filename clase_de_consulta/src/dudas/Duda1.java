package dudas;

public class Duda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*
 * metodos del polimorfismo, herencia, abstraccion y encapsulamiento,
 * que es cada uno, ejemplos y diferencias entre ellos
 * 
 * polimorfismo: es la capacidad de un objeto de tomar muchas formas, es decir, un objeto puede ser tratado como un objeto de su clase o como un objeto de su superclase. Ejemplo: una clase Animal puede tener un método hacerSonido() y las clases Perro y Gato pueden heredar de Animal y sobrescribir el método hacerSonido() para hacer sonidos diferentes.
 * 
 * herencia: es la capacidad de una clase de heredar las propiedades y comportamientos de otra clase. Ejemplo: una clase Perro puede heredar de la clase Animal, lo que significa que Perro tiene todas las propiedades y comportamientos de Animal, además de sus propias propiedades y comportamientos.
 * 
 * abstraccion: es la capacidad de ocultar los detalles de implementación y mostrar solo la funcionalidad esencial de un objeto. Ejemplo: una clase abstracta Vehiculo puede tener un método abstracto mover() que debe ser implementado por las clases concretas como Coche y Bicicleta.
 * 
 * encapsulamiento: es la capacidad de ocultar los datos y métodos de una clase y protegerlos de accesos no autorizados. Ejemplo: una clase CuentaBancaria puede tener un atributo saldo que es privado y solo se puede acceder a través de métodos públicos como depositar() y retirar().
 * 
 * diferencias:
 * - el polimorfismo se refiere a la capacidad de un objeto de tomar muchas formas, mientras que la herencia se refiere a la capacidad de una clase de heredar las propiedades y comportamientos de otra clase.
 * - la abstraccion se refiere a la capacidad de ocultar los detalles de implementación y mostrar solo la funcionalidad esencial de un objeto, mientras que el encapsulamiento se refiere a la capacidad de ocultar los datos y métodos de una clase y protegerlos de accesos no autorizados.
 * 
 * overwriting: es la capacidad de una subclase de proporcionar una implementación específica de un método que ya está definido en su superclase. Ejemplo: si la clase Animal tiene un método hacerSonido() y la clase Perro sobrescribe ese método para hacer un sonido específico, entonces se dice que Perro está sobrescribiendo el método hacerSonido() de Animal.
 * 
 * setter: es un método que se utiliza para establecer el valor de un atributo privado de una clase. Ejemplo: si la clase CuentaBancaria tiene un atributo privado saldo, se puede crear un método setter llamado setSaldo() que permita establecer el valor del saldo.
 * 
 * getter: es un método que se utiliza para obtener el valor de un atributo privado de una clase. Ejemplo: si la clase CuentaBancaria tiene un atributo privado saldo, se puede crear un método getter llamado getSaldo() que permita obtener el valor del saldo.
 * 
 * super: es una palabra clave que se utiliza para referirse a la superclase de una clase. Se puede utilizar para llamar a un método de la superclase o para acceder a un atributo de la superclase. Ejemplo: si la clase Perro hereda de la clase Animal, se puede utilizar super.hacerSonido() para llamar al método hacerSonido() de la clase Animal desde la clase Perro.
 * 
 * this: es una palabra clave que se utiliza para referirse al objeto actual de una clase. Se puede utilizar para acceder a los atributos y métodos de la clase. Ejemplo: si la clase CuentaBancaria tiene un atributo saldo, se puede utilizar this.saldo para referirse al saldo del objeto actual de la clase CuentaBancaria.
 * 
 * super clase: es la clase de la cual se heredan las propiedades y comportamientos. Ejemplo: si la clase Perro hereda de la clase Animal, entonces Animal es la superclase de Perro.
 * 
 * sub clase: es la clase que hereda las propiedades y comportamientos de otra clase. Ejemplo: si la clase Perro hereda de la clase Animal, entonces Perro es la subclase de Animal.
 * 
 * contructor: es un método especial que se utiliza para crear objetos de una clase. El constructor tiene el mismo nombre que la clase y no tiene un tipo de retorno. Ejemplo: si la clase CuentaBancaria tiene un constructor que toma un parámetro saldoInicial, se puede crear un objeto de la clase CuentaBancaria utilizando ese constructor, como CuentaBancaria cuenta = new CuentaBancaria(1000).
 * 
 * main: es el método principal de una clase que se ejecuta cuando se inicia el programa. El método main tiene la siguiente firma: public static void main(String[] args). Ejemplo: en la clase Duda1, el método main es el punto de entrada del programa y se ejecutará cuando se ejecute la clase Duda1.
 * 
 * POO: es un paradigma de programación que se basa en el concepto de objetos, que son instancias de clases. La programación orientada a objetos se centra en la creación de objetos que tienen propiedades y comportamientos, y en la interacción entre esos objetos. Ejemplo: en Java, se pueden crear clases como Animal, Perro y Gato, y luego crear objetos de esas clases para representar diferentes animales.
 * 
 * como escribo y leeo archivo?
 * - para escribir un archivo en Java, se puede utilizar la clase FileWriter o la clase BufferedWriter. Ejemplo: 
  try (BufferedWriter writer = new BufferedWriter(new FileWriter("archivo.txt"))) {
	  writer.write("Hola, mundo!");
  } catch (IOException e) {
	  e.printStackTrace();
  }
  * - para leer un archivo en Java, se puede utilizar la clase FileReader o la clase BufferedReader. Ejemplo:
  * try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
	  String linea;
	  while ((linea = reader.readLine()) != null) {
		  System.out.println(linea);
	  }
  } catch (IOException e) {
	  e.printStackTrace();
  }
  
  
 *interfaz: es una colección de métodos abstractos que una clase puede implementar. Una interfaz define un contrato que las clases que la implementan deben cumplir. Ejemplo: si se tiene una interfaz llamada Volador con un método volar(), cualquier clase que implemente la interfaz Volador debe proporcionar una implementación para el método volar().
 *
 * clase abstracta: es una clase que no se puede instanciar y que puede contener métodos abstractos y métodos concretos. Una clase abstracta se utiliza como base para otras clases que heredan de ella. Ejemplo: si se tiene una clase abstracta llamada Animal con un método abstracto hacerSonido(), cualquier clase que herede de Animal debe proporcionar una implementación para el método hacerSonido().
 * 
 *metodos estaticos?
 *
 *- un método estático es un método que pertenece a la clase en lugar de a una instancia de la clase. Se puede llamar a un método estático sin crear un objeto de la clase. Ejemplo: si se tiene una clase llamada Matematica con un método estático llamado sumar(), se puede llamar al método sumar() utilizando Matematica.sumar() sin necesidad de crear un objeto de la clase Matematica.
 *
 *- un método no estático, también conocido como método de instancia, es un método que pertenece a una instancia de la clase. Para llamar a un método no estático, primero se debe crear un objeto de la clase y luego llamar al método a través de ese objeto. Ejemplo: si se tiene una clase llamada Persona con un método no estático llamado saludar(), se debe crear un objeto de la clase Persona, como Persona persona = new Persona(), y luego llamar al método saludar() utilizando persona.saludar().
 *
 *- la diferencia principal entre un método estático y un método no estático es que un método estático pertenece a la clase y se puede llamar sin crear un objeto, mientras que un método no estático pertenece a una instancia de la clase y requiere la creación de un objeto para ser llamado.
 *
 *- un método estático no puede acceder a los atributos y métodos de instancia de la clase, ya que no tiene una referencia a un objeto específico. Por otro lado, un método no estático puede acceder a los atributos y métodos de instancia de la clase, ya que se ejecuta en el contexto de un objeto específico.
 *
 *- un método estático se utiliza comúnmente para realizar operaciones que no dependen de los datos de una instancia específica, como métodos de utilidad o métodos que operan en datos estáticos. Un método no estático se utiliza para realizar operaciones que dependen de los datos de una instancia específica, como métodos que manipulan los atributos de un objeto.
 *
 *- un método estático se puede llamar utilizando el nombre de la clase, mientras que un método no estático se debe llamar a través de un objeto de la clase. Ejemplo: Matematica.sumar() para un método estático y persona.saludar() para un método no estático.
 *
 *- un método estático no puede ser sobrescrito por una subclase, ya que pertenece a la clase y no a una instancia específica. Por otro lado, un método no estático puede ser sobrescrito por una subclase, ya que se ejecuta en el contexto de un objeto específico. Ejemplo: si la clase Matematica tiene un método estático sumar() y la clase AvanzadaMatematica intenta sobrescribir ese método, no se permitirá la sobrescritura. Sin embargo, si la clase Persona tiene un método no estático saludar() y la clase Estudiante intenta sobrescribir ese método, se permitirá la sobrescritura.
 *
 *- un método estático se puede llamar desde un contexto estático, como el método main(), sin necesidad de crear un objeto de la clase. Por otro lado, un método no estático no se puede llamar desde un contexto estático sin crear un objeto de la clase. Ejemplo: Matematica.sumar() se puede llamar desde el método main() sin crear un objeto, mientras que persona.saludar() no se puede llamar desde el método main() sin crear un objeto de la clase Persona.
 *
 *- un método estático se puede utilizar para acceder a variables estáticas de la clase, mientras que un método no estático no puede acceder a variables estáticas sin una referencia a la clase. Ejemplo: si la clase Matematica tiene una variable estática llamada PI, un método estático dentro de la clase Matematica puede acceder a esa variable utilizando PI, mientras que un método no estático necesitaría una referencia a la clase Matematica para acceder a esa variable, como Matematica.PI.
 *
 *- un método estático se puede utilizar para crear métodos de fábrica, que son métodos que devuelven instancias de la clase. Un método no estático no se puede utilizar para crear métodos de fábrica, ya que requiere la creación de un objeto para ser llamado. Ejemplo: si la clase Persona tiene un método estático llamado crearPersona() que devuelve una nueva instancia de Persona, se puede llamar a ese método utilizando Persona.crearPersona() sin necesidad de crear un objeto de la clase Persona.
 *
 *metodo sort: el método sort() es un método de la clase Arrays en Java que se utiliza para ordenar los elementos de un array. El método sort() puede ordenar los elementos en orden ascendente o descendente, dependiendo del tipo de datos y del comparador utilizado. Ejemplo: si se tiene un array de enteros llamado numeros, se puede ordenar utilizando Arrays.sort(numeros) para ordenarlo en orden ascendente.
 *metodo compareTo: el método compareTo() es un método de la interfaz Comparable en Java que se utiliza para comparar dos objetos. El método compareTo() devuelve un valor entero que indica si el objeto actual es menor, igual o mayor que el objeto comparado. Ejemplo: si se tiene una clase Persona que implementa la interfaz Comparable, se puede implementar el método compareTo() para comparar las personas por su edad, y luego utilizar ese método para ordenar una lista de personas por edad.
 *
 *array list: un array es una estructura de datos que almacena una colección de elementos del mismo tipo en una ubicación contigua en memoria. Un array tiene un tamaño fijo y se accede a sus elementos mediante índices. Ejemplo: int[] numeros = {1, 2, 3, 4, 5} es un array de enteros que almacena los números del 1 al 5.
 *
 * una ArrayList es una clase de la biblioteca de Java que implementa la interfaz List y proporciona una implementación dinámica de un array. A diferencia de un array, una ArrayList puede crecer o reducir su tamaño según sea necesario, y se accede a sus elementos mediante métodos en lugar de índices. Ejemplo: ArrayList<String> nombres = new ArrayList<>(); es una ArrayList que puede almacenar objetos de tipo String y puede crecer o reducir su tamaño según sea necesario.
 * 
 * array vs array list:
 * - un array tiene un tamaño fijo, mientras que una ArrayList puede crecer o reducir su tamaño según sea necesario.
 * - un array se accede a sus elementos mediante índices, mientras que una ArrayList se accede a sus elementos mediante métodos.
 * 
 * array: int[] numeros = {1, 2, 3, 4, 5};
 * * array list: ArrayList<String> nombres = new ArrayList<>();
  nombres.add("Juan");
  nombres.add("Maria");
  nombres.add("Pedro");
  System.out.println(nombres.get(0)); // Imprime "Juan"
  System.out.println(nombres.size()); // Imprime 3
  
 *como accedo a los datos de los arreglos?
 *
 * - para acceder a los datos de un array, se utiliza el índice del elemento que se desea acceder. El índice comienza en 0 para el primer elemento, 1 para el segundo elemento, y así sucesivamente. Ejemplo: si se tiene un array de enteros llamado numeros, se puede acceder al primer elemento utilizando numeros[0], al segundo elemento utilizando numeros[1], y así sucesivamente.
 * - para acceder a los datos de una ArrayList, se utilizan los métodos proporcionados por la clase ArrayList. Para acceder a un elemento específico, se utiliza el método get() con el índice del elemento que se desea acceder. Ejemplo: si se tiene una ArrayList de Strings llamada nombres, se puede acceder al primer elemento utilizando nombres.get(0), al segundo elemento utilizando nombres.get(1), y así sucesivamente.
 * y para recorrer los datos de los arreglos?
 * - para recorrer los datos de un array, se puede utilizar un bucle for o un bucle foreach. Ejemplo: 
  for (int i = 0; i < numeros.length; i++) {
	  System.out.println(numeros[i]);
  }
  for (int numero : numeros) {
	  System.out.println(numero);
  }
 * 
 * 
 * 
 * editar los datos de los arreglos?
 * - para editar los datos de un array, se utiliza el índice del elemento que se desea editar y se asigna un nuevo valor a ese índice. Ejemplo: si se tiene un array de enteros llamado numeros, se puede editar el primer elemento utilizando numeros[0] = 10, lo que asignará el valor 10 al primer elemento del array.
 * - para editar los datos de una ArrayList, se utiliza el método set() con el índice del elemento que se desea editar y el nuevo valor que se desea asignar. Ejemplo: si se tiene una ArrayList de Strings llamada nombres, se puede editar el primer elemento utilizando nombres.set(0, "Carlos"), lo que asignará el valor "Carlos" al primer elemento de la ArrayList.
 * 
 * split: el método split() es un método de la clase String en Java que se utiliza para dividir una cadena en partes utilizando un delimitador específico. El método split() devuelve un array de Strings que contiene las partes divididas de la cadena original. Ejemplo: si se tiene una cadena llamada texto con el valor "Hola, mundo!", se puede dividir utilizando texto.split(",") para obtener un array de Strings que contiene "Hola" y " mundo!".
 * 
 * array de objetos: un array de objetos es un array que almacena referencias a objetos en lugar de valores primitivos. Cada elemento del array puede ser una instancia de una clase específica. Ejemplo: si se tiene una clase llamada Persona, se puede crear un array de objetos de tipo Persona utilizando Persona[] personas = new Persona[5], lo que creará un array que puede almacenar hasta 5 objetos de tipo Persona.
 * 
 * @Override: es una anotación en Java que se utiliza para indicar que un método está sobrescribiendo un método de la superclase. La anotación @Override se coloca antes de la declaración del método y ayuda a garantizar que el método está sobrescribiendo correctamente el método de la superclase. Ejemplo: si la clase Perro hereda de la clase Animal y sobrescribe el método hacerSonido(), se puede utilizar la anotación @Override para indicar que el método hacerSonido() en la clase Perro está sobrescribiendo el método hacerSonido() en la clase Animal.
 * 
 * equals: el método equals() es un método de la clase Object en Java que se utiliza para comparar dos objetos en términos de igualdad. El método equals() devuelve true si los objetos son considerados iguales y false si no lo son. Por defecto, el método equals() compara las referencias de los objetos, pero se puede sobrescribir para comparar los valores de los objetos. Ejemplo: si se tiene una clase Persona con atributos como nombre y edad, se puede sobrescribir el método equals() para comparar dos objetos de tipo Persona basándose en sus atributos en lugar de sus referencias.
 * 
 * equalsignorecase: el método equalsIgnoreCase() es un método de la clase String en Java que se utiliza para comparar dos cadenas de texto sin tener en cuenta las diferencias entre mayúsculas y minúsculas. El método equalsIgnoreCase() devuelve true si las cadenas son consideradas iguales sin importar las mayúsculas o minúsculas, y false si no lo son. Ejemplo: si se tiene una cadena llamada texto1 con el valor "Hola" y otra cadena llamada texto2 con el valor "hola", se puede comparar utilizando texto1.equalsIgnoreCase(texto2) para obtener true, ya que ambas cadenas son consideradas iguales sin importar las mayúsculas o minúsculas.
 * 
 * toString: el método toString() es un método de la clase Object en Java que se utiliza para obtener una representación en forma de cadena de un objeto. El método toString() devuelve una cadena que representa el objeto de manera legible. Por defecto, el método toString() devuelve una cadena que incluye el nombre de la clase y la dirección de memoria del objeto, pero se puede sobrescribir para proporcionar una representación más significativa del objeto. Ejemplo: si se tiene una clase Persona con atributos como nombre y edad, se puede sobrescribir el método toString() para devolver una cadena que incluya el nombre y la edad de la persona, lo que facilitará la visualización de la información del objeto cuando se imprima o se convierta a cadena.
 * 
 * String.format: el método String.format() es un método de la clase String en Java que se utiliza para crear una cadena formateada utilizando un formato específico. El método String.format() toma una cadena de formato y una lista de argumentos, y devuelve una cadena formateada que reemplaza los marcadores de formato en la cadena de formato con los valores correspondientes de los argumentos. Ejemplo: si se tiene una cadena de formato "%s tiene %d años" y se desea formatear esa cadena con el nombre "Juan" y la edad 30, se puede utilizar String.format("%s tiene %d años", "Juan", 30) para obtener la cadena "Juan tiene 30 años".
 * 
 * compareTo: el método compareTo() es un método de la interfaz Comparable en Java que se utiliza para comparar dos objetos. El método compareTo() devuelve un valor entero que indica si el objeto actual es menor, igual o mayor que el objeto comparado. El valor devuelto por compareTo() es negativo si el objeto actual es menor que el objeto comparado, cero si son iguales, y positivo si el objeto actual es mayor que el objeto comparado. Ejemplo: si se tiene una clase Persona que implementa la interfaz Comparable, se puede implementar el método compareTo() para comparar las personas por su edad, y luego utilizar ese método para ordenar una lista de personas por edad.
 * 
 * implement: la palabra clave implement se utiliza en Java para indicar que una clase está implementando una interfaz. Al implementar una interfaz, la clase se compromete a proporcionar una implementación para todos los métodos definidos en esa interfaz. Ejemplo: si se tiene una interfaz llamada Volador con un método volar(), una clase llamada Pajaro puede implementar la interfaz Volador utilizando la declaración public class Pajaro implements Volador, lo que significa que la clase Pajaro debe proporcionar una implementación para el método volar() definido en la interfaz Volador.
 * 
 * extends: la palabra clave extends se utiliza en Java para indicar que una clase está heredando de otra clase. Al extender una clase, la subclase hereda las propiedades y comportamientos de la superclase, y puede agregar sus propias propiedades y comportamientos adicionales. Ejemplo: si se tiene una clase llamada Animal y una clase llamada Perro que extiende de Animal utilizando la declaración public class Perro extends Animal, entonces la clase Perro hereda todas las propiedades y comportamientos de la clase Animal, además de sus propias propiedades y comportamientos específicos de los perros.
 * 
 * import java.io.File
 * import java.util.ArrayList
 * import java.util.Comparator
 * import java.util.Scanner
 * 
 * se puede usar el from import como en python?
 * - en Java no existe la sintaxis from import como en Python. En Java, se utiliza la palabra clave import para importar clases o paquetes específicos. Por ejemplo, para importar la clase File de la biblioteca java.io, se utilizaría import java.io.File; y para importar la clase ArrayList de la biblioteca java.util, se utilizaría import java.util.ArrayList;. No es posible importar todas las clases de un paquete utilizando una sintaxis similar a from import en Python.
 * 
 *size vs length: en Java, el método size() se utiliza para obtener el número de elementos en una colección, como una ArrayList, mientras que el método length se utiliza para obtener la longitud de un array. Ejemplo: si se tiene una ArrayList llamada nombres, se puede obtener su tamaño utilizando nombres.size(), y si se tiene un array de enteros llamado numeros, se puede obtener su longitud utilizando numeros.length.
 *
 *size: se utiliza para obtener el número de elementos en una colección, como una ArrayList. Ejemplo: si se tiene una ArrayList llamada nombres, se puede obtener su tamaño utilizando nombres.size(), lo que devolverá el número de elementos almacenados en la ArrayList.
 *length: se utiliza para obtener la longitud de un array. Ejemplo: si se tiene un array de enteros llamado numeros, se puede obtener su longitud utilizando numeros.length, lo que devolverá el número de elementos que el array puede almacenar.
 *
 *throws Exception: la palabra clave throws se utiliza en Java para indicar que un método puede lanzar una excepción. Al declarar que un método throws una excepción, se está indicando que el método puede generar una situación de error que debe ser manejada por el código que llama al método. Ejemplo: si se tiene un método llamado leerArchivo() que puede lanzar una IOException, se puede declarar el método utilizando public void leerArchivo() throws IOException, lo que indica que cualquier código que llame a leerArchivo() debe manejar la posible IOException.
 *
 *try catch: el bloque try-catch se utiliza en Java para manejar excepciones. El código que puede generar una excepción se coloca dentro del bloque try, y el código para manejar la excepción se coloca dentro del bloque catch. Si se genera una excepción dentro del bloque try, el flujo de ejecución se transfiere al bloque catch correspondiente para manejar la excepción. Ejemplo:
 *
 *File file = new File("archivo.txt");
 *Scanner lector = new Scanner(file);
 *
 *hasNextLine: el método hasNextLine() es un método de la clase Scanner en Java que se utiliza para verificar si hay una línea de texto disponible para leer en el flujo de entrada. El método hasNextLine() devuelve true si hay una línea de texto disponible para leer, y false si no lo hay. Ejemplo: si se tiene un objeto Scanner llamado lector que está leyendo desde un archivo, se puede utilizar un bucle while con hasNextLine() para leer cada línea del archivo hasta que no haya más líneas disponibles, como while (lector.hasNextLine()) { String linea = lector.nextLine(); // Procesar la línea }.
 *
 *parseInt: el método parseInt() es un método de la clase Integer en Java que se utiliza para convertir una cadena de texto en un valor entero. El método parseInt() toma una cadena como argumento y devuelve el valor entero correspondiente. Si la cadena no se puede convertir a un entero válido, se lanzará una NumberFormatException. Ejemplo: si se tiene una cadena llamada numeroStr con el valor "123", se puede convertir a un entero utilizando int numero = Integer.parseInt(numeroStr), lo que asignará el valor 123 a la variable numero.
 *
 *stream: el método stream() es un método de la interfaz Collection en Java que se utiliza para crear un flujo de datos a partir de una colección. El método stream() devuelve un objeto Stream que permite realizar operaciones de procesamiento de datos de manera funcional, como filtrado, mapeo y reducción. Ejemplo: si se tiene una ArrayList de Strings llamada nombres, se puede crear un flujo de datos utilizando nombres.stream(), lo que permitirá realizar operaciones como nombres.stream().filter(nombre -> nombre.startsWith("A")).collect(Collectors.toList()) para obtener una lista de nombres que comienzan con la letra "A".
 *
 *Integer.parseInt vs Integer.valueOf: ambos métodos se utilizan para convertir una cadena de texto en un valor entero, pero tienen diferencias en su comportamiento. El método Integer.parseInt() devuelve un valor primitivo int, mientras que el método Integer.valueOf() devuelve un objeto Integer. Además, Integer.valueOf() utiliza un caché de objetos Integer para valores entre -128 y 127, lo que significa que si se llama a Integer.valueOf() con un valor dentro de ese rango, se devolverá el mismo objeto Integer en lugar de crear uno nuevo. Por otro lado, Integer.parseInt() siempre devuelve un nuevo valor primitivo int sin utilizar ningún caché.
 *
 *.add: el método add() es un método de la interfaz Collection en Java que se utiliza para agregar un elemento a una colección. El método add() toma un elemento como argumento y lo agrega a la colección. Si la colección se ha modificado como resultado de la llamada al método add(), se devuelve true; de lo contrario, se devuelve false. Ejemplo: si se tiene una ArrayList de Strings llamada nombres, se puede agregar un nuevo nombre utilizando nombres.add("Juan"), lo que agregará el nombre "Juan" a la lista de nombres.
 *
 *lector.close()
 *
 *comparator.comparing: el método comparing() es un método estático de la clase Comparator en Java que se utiliza para crear un comparador basado en una función de extracción de clave. El método comparing() toma una función como argumento que extrae una clave de un objeto, y devuelve un comparador que compara los objetos basándose en las claves extraídas. Ejemplo: si se tiene una clase Persona con un atributo edad, se puede crear un comparador para ordenar las personas por edad utilizando Comparator.comparing(Persona::getEdad), lo que devolverá un comparador que compara las personas basándose en su edad.
 *
 *.reverseOrder: el método reverseOrder() es un método estático de la clase Comparator en Java que se utiliza para obtener un comparador que ordena los elementos en orden inverso. El método reverseOrder() devuelve un comparador que compara los elementos en orden inverso al orden natural. Ejemplo: si se tiene una clase Persona con un atributo edad, se puede crear un comparador para ordenar las personas por edad en orden inverso utilizando Comparator.comparing(Persona::getEdad).reversed(), lo que devolverá un comparador que compara las personas basándose en su edad pero en orden inverso.
 *
 *.getnombre: el método getNombre() es un método de acceso (getter) que se utiliza para obtener el valor del atributo nombre de una clase. El método getNombre() devuelve el valor del atributo nombre, que generalmente es una cadena de texto. Ejemplo: si se tiene una clase Persona con un atributo privado String nombre, se puede crear un método getter llamado getNombre() que devuelva el valor del nombre, como public String getNombre() { return nombre; }, lo que permitirá obtener el nombre de una persona utilizando persona.getNombre().
 * 
 * comparingint: el método comparingInt() es un método estático de la clase Comparator en Java que se utiliza para crear un comparador basado en una función de extracción de clave que devuelve un valor entero. El método comparingInt() toma una función como argumento que extrae una clave entera de un objeto, y devuelve un comparador que compara los objetos basándose en las claves enteras extraídas. Ejemplo: si se tiene una clase Persona con un atributo edad, se puede crear un comparador para ordenar las personas por edad utilizando Comparator.comparingInt(Persona::getEdad), lo que devolverá un comparador que compara las personas basándose en su edad como un valor entero.
 * 
 * .then: el método thenComparing() es un método de la interfaz Comparator en Java que se utiliza para encadenar comparadores. El método thenComparing() toma otro comparador como argumento y devuelve un nuevo comparador que primero utiliza el comparador original para comparar los objetos, y si el resultado es igual (es decir, los objetos son considerados iguales por el primer comparador), entonces utiliza el segundo comparador para comparar los objetos. Ejemplo: si se tiene una clase Persona con atributos edad y nombre, se puede crear un comparador para ordenar las personas por edad y luego por nombre utilizando Comparator.comparingInt(Persona::getEdad).thenComparing(Persona::getNombre), lo que devolverá un comparador que compara las personas primero por edad y, en caso de empate, por nombre.
 * 
 * printWriter: la clase PrintWriter en Java es una clase que se utiliza para escribir texto en un flujo de salida, como un archivo o la consola. La clase PrintWriter proporciona métodos para escribir texto de manera conveniente, como print() y println(), que permiten escribir texto sin necesidad de manejar excepciones de E/S. Ejemplo: si se desea escribir texto en un archivo llamado "salida.txt", se puede crear un objeto PrintWriter utilizando PrintWriter writer = new PrintWriter("salida.txt"), y luego utilizar writer.println("Hola, mundo!") para escribir la cadena "Hola, mundo!" en el archivo.
 * 
 * fileWriter: la clase FileWriter en Java es una clase que se utiliza para escribir caracteres en un archivo. La clase FileWriter proporciona métodos para escribir caracteres de manera eficiente, y se puede utilizar junto con otras clases como BufferedWriter para mejorar el rendimiento de escritura. Ejemplo: si se desea escribir texto en un archivo llamado "salida.txt", se puede crear un objeto FileWriter utilizando FileWriter writer = new FileWriter("salida.txt"), y luego utilizar writer.write("Hola, mundo!") para escribir la cadena "Hola, mundo!" en el archivo.
 * 
 * 
 * 
 * 
 * */
}

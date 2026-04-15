package Clinica;

public class Clinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Enunciado
En la Clínica UNdeC se desea desarrollar un sistema simple para la gestión de pacientes.

De cada paciente se dispone de la siguiente información:

Nombre y apellido
Edad
Sexo (Masculino o Femenino)
Condición (valor entero entre 1 y 5, donde 1 indica menor gravedad y 5 mayor gravedad)
Teléfono
Los datos se encuentran almacenados en un archivo de texto, donde cada paciente ocupa múltiples líneas consecutivas siguiendo el mismo formato.

Se solicita desarrollar un programa en Java que:
Lea los datos del archivo hasta el final del mismo y los almacene en una estructura adecuada (ArrayList).
Muestre todos los pacientes en forma de tabla.
Calcule y muestre el porcentaje de pacientes masculinos y femeninos.
Informe la cantidad de pacientes por cada nivel de condición (1 a 5).
Muestre el nombre y apellido de los pacientes cuya condición sea 5.
Muestre el listado de pacientes ordenado por edad.
Generación de identificador (ID)
Genere un identificador (ID) para cada paciente con el siguiente formato:

Primeros 3 caracteres del nombre y apellido
Edad
Primeras 2 letras del sexo
Últimos 2 dígitos del teléfono
Ejemplo:

FOSSATTI MARIA INES //apellido y nombre
19 //edad
Femenino //sexo
2  //gravedad del caso
3825384574 //telefono

ID generado: FOS19Fe74

Consideraciones
Utilizar ArrayList para almacenar los datos.
Se puede definir una clase Paciente.
Para el ordenamiento, utilizar Comparator o métodos propios.
El programa debe ser claro, ordenado y correctamente modularizado.
 * 
 */
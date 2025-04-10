package ar.edu.unq.po2.tp3.persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;

	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int obtenerEdad() {
		return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
	}

	public static int obtenerEdad(Persona persona) {
		return Period.between(persona.getFechaDeNacimiento(), LocalDate.now()).getYears();
	}

	/*
	 * 1) Cuando un objeto le pide la edad a una Persona, no conoce cómo se calcula
	 * internamente ese valor. Solo interactúa con la interfaz pública (el método
	 * obtenerEdad())
	 */

//     2

	public boolean menorQue(Persona otraPersona) {
		return this.fechaDeNacimiento.isAfter(otraPersona.getFechaDeNacimiento());
	}

//     3

	public static Persona crearPersona(String nombre, LocalDate fechaNacimiento) {
		return new Persona(nombre, fechaNacimiento);
	}
}

/*
 * Implemente la clase Persona en Java. Una persona tiene un nombre y una fecha
 * de nacimiento, por lo que debe ser posible pedirle su nombre, fecha de
 * nacimiento y edad. En base a esto:
 * 
 * 1. Responder: Si un objeto cualquiera que le pide la edad a una Persona:
 * ¿Conoce cómo ésta calcula u obtiene tal valor? ¿Cómo se llama el mecanismo de
 * abstracción que permite esto?
 * 
 * 2. Agregue a la clase Persona definida anteriormente el método
 * menorQue(Persona persona) que recibe como parámetro a otra persona y retorna
 * true en caso de que el receptor sea menor en edad que el parámetro, o false
 * en caso contrario.
 * 
 * 3. Agregue a la clase Persona un método (de clase) de creación, respetando la
 * siguiente firma: Persona(String nombre, Date fechaNacimiento) que recibe como
 * parámetros el nombre y la fecha de nacimiento de la persona a crear, crea una
 * nueva instancia de Persona y la retorna inicializada con los valores
 * recibidos como parámetro.
 * 
 */
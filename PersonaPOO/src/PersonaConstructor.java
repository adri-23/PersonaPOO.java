
public class PersonaConstructor {

	int edad;
	String nombre;
	//creamos un constructor
	PersonaConstructor(int edad, String nombre) {
		this.edad= edad;
		this.nombre= nombre;
		/* click derecho
		 * click source
		 * generate getters and setters
		 * para q ns de el codigo de abajo
		 */
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//creamos un metodo
	public String quiovolas() {
		//creamos return
		return "hola soy " + this.nombre + " mi edad es " + this.edad;
	}
}


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// agregamos un metodo y ponemos el nombre de la clase q es adriana
		Persona adriana = new Persona();
		adriana.name = "adriana bermudez";
		adriana.age =27;
		System.out.println(adriana.saludar());
		System.out.println(adriana.miEdad());
		
		//ejercicio q nos enseño eduardo de PersonaConstructor
		//le ponemos el nombre de nuestra clase, leasignamos un nombre 
		// le ponemos valores q queramos
		//imprimimos le ponemos el nombre de la clase y el metodo
		PersonaConstructor paleta = new PersonaConstructor(20, "Adriana");
		System.out.println(paleta.quiovolas());
	}

}

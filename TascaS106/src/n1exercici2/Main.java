package n1exercici2;

public class Main {

	public static <T, V, U> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Byte b1 = 28;
		Persona p1 =  new Persona("Kaiden", "Garcia", b1);
		String s1 = "Hello World";
		
		GenericMethods<Byte, Persona, String> gm = new GenericMethods<>();
		
		gm.impresioGenerica(b1, p1, s1);
		
	}

	/*
	 * Crea una classe anomenada Persona amb els atributs nom, cognom i edat. 
	 * Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti tres 
	 * arguments de tipus genèric. 
	 * Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. 
	 * Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.

Exemple: un objecte de la classe Persona, un String i un tipus primitiu.

D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.
	 */
	
}

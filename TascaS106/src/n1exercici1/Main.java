package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		NoGenericMethods ngm = new NoGenericMethods(obj1, obj2, obj3);
		System.out.println(ngm.toString());
		
		NoGenericMethods ngm2 = new NoGenericMethods(obj2, obj3, obj1);
		System.out.println(ngm2.toString());
		
	}

	
	/*
	 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, 
	 * juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor 
	 * per a inicialitzar els tres. 
	 * Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
	 */
}

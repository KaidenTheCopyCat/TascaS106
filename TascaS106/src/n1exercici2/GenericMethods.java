package n1exercici2;

public class GenericMethods <T, U, V>{
	
	public void impresioGenerica(T t1, U t2, V t3) {
		System.out.println("1er Parametre: "+t1.toString());
		System.out.println("2on Parametre: "+t2.toString());
		System.out.println("3er Parametre: "+t3.toString());
	}
	
}

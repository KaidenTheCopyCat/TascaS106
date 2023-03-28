package n1exercici2;

public class Persona {
	
	private String nom,cognom;
	private byte edat;
	
	public Persona(String nom, String cognom, byte edat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCognom() {
		return cognom;
	}
	
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	
	public byte getEdat() {
		return edat;
	}
	
	public void setEdat(byte edat) {
		this.edat = edat;
	}
	
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}

}

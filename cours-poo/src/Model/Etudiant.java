package Model;

public class Etudiant extends Personne {
	private String niveau;
	
	// constructeurs
	public Etudiant(int num, String nom, String prenom, Adresse[] adresses, String niveau) {
		super(num, nom, prenom, adresses);
		this.niveau = niveau;
	}

	
	// getters et setters 

	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	 // tostring


	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + ", toString()=" + super.toString() + "]";
	}

	
}

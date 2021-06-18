package Model;

public class Enseignant extends Personne {
	private int salaire;

	
	// Les constructeurs
	
	public Enseignant(int num, String nom, String prenom, Adresse[] adresses, int salaire) {
		super(num, nom, prenom, adresses);
		this.salaire = salaire;
	}

	// setters et getters

	public int getSalaire() {
		return salaire;
	}


	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	// tostring
	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}

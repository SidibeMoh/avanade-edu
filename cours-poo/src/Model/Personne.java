package Model;

import java.util.Arrays;

public class Personne {
	/* ============== 1- déclaration des attributs ===========*/
	private int num;
	private String nom;
	private String prenom;
	private Adresse[] adresses;
	
	public Personne() {
		super();
	}
	
	public Personne(int num, String nom, String prenom) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public Personne(int num, String nom, String prenom, Adresse[] adresses) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
	}

	public int getNum() {
		return num;
	}
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				+ Arrays.toString(adresses) + "]";
	}

	public Adresse[] getAdresses() {
		return adresses;
	}

	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}

	public void setNum(int num) {
		if (num>=0) {
			this.num = num;
			
		} else {
			this.num = 0;
		}
		
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}

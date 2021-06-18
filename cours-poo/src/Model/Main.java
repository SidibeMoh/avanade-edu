package Model;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =2;
		Personne personne = new Personne();
		personne.setNom("wick");
		personne.setPrenom("john");
		personne.setNum(-100);
		
		System.out.println(personne);
		Personne personne2= new Personne (200,"dalton","jack");
		System.out.println(personne2);
		
		
		Adresse adresse = new Adresse();
		adresse.setRue(92);
		adresse.setCodepostal(93300);
		adresse.setVille("paris");
		System.out.println(adresse);
		
		Adresse adresse2 = new Adresse(86,77120,"coulommiers");
		// 2 ème adresse
		Adresse [] adresses = new Adresse[] {adresse,adresse2};
		
		// afficher uniquement les 2 villes de la dernière personne
		
		for (int i = 0 ; i < adresses.length ; i++) {
			System.out.println(adresses[i].getVille());
		}
		
		
		Personne personne3 = new Personne(300,"dalton","jack", adresses);
		System.out.println(personne3);
		
		Etudiant etudiant = new Etudiant(400, "cervera", "sophie", adresses, "master");
		System.out.println(etudiant);
		
		Enseignant enseignant = new Enseignant(700, "Achref", "Mouelhi", adresses, 1700);
		System.out.println(enseignant);
		
		System.out.println(enseignant instanceof Personne);
		System.out.println(personne instanceof Enseignant);
		Personne[] personnes = new Personne[] {etudiant, personne, enseignant};
		for (Personne p: personnes) {
			/*
			 afficher le numéro s'il s'agit d'une personne
			 afficher le salaire s'il s'agit d'un enseignant
			 afficher le niveau s'il d'un étudiant
			 */
			if(p instanceof Enseignant) {
				System.out.println(((Enseignant) p).getSalaire());
				
			} else {if (p instanceof Etudiant) {
				System.out.println(((Etudiant) p).getNiveau()
						
						
						
						
						);
				
			} else {
				System.out.println(p.getNum());
			}
				
			}
			
		}
		

	}

}

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

	}

}

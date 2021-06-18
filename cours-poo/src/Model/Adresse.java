package Model;

public class Adresse {
	
	//attributs
	private int rue;
	private int codepostal;
	private String ville;
	
	
	// constructeurs
	public Adresse() {
		
	}
	
	public Adresse(int rue, int codepostal, String ville) {
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
	}
	
	// getters et setters
	public int getRue() {
		return rue;
	}
	public void setRue(int rue) {
		this.rue = rue;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codepostal=" + codepostal + ", ville=" + ville + "]";
	}

}

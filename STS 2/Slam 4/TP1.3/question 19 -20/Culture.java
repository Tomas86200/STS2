
public class Culture {
	private String nom;

	public Culture(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Culture [nom=" + nom + "]";
	}
	
}

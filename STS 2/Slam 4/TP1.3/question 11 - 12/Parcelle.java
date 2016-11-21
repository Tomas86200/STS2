import java.util.ArrayList;
import java.util.List;


public class Parcelle {
	private int noCadastralEtendu;
	private float surfaceParcelleHa;
	private float surfaceClasseHa;
	private Commune uneCommune;
	private TypeParcelle unTypeParcelle;
	private List<Semis> lesSemis;
	
	public Parcelle(int noCadastralEtendu, float surfaceParcelleHa,
			float surfaceClasseHa, Commune commune, TypeParcelle leTypeParcelle) {
		this.noCadastralEtendu = noCadastralEtendu;
		this.surfaceParcelleHa = surfaceParcelleHa;
		this.surfaceClasseHa = surfaceClasseHa;
		this.uneCommune=commune;
		this.unTypeParcelle=leTypeParcelle;
		this.lesSemis = new ArrayList<Semis>();
	}
	
	public void addSemis (Semis Semis) {
		this.lesSemis.add(Semis);
	}

	public Semis removeSemis(int index) {
		Semis SemisSupprime=null;
		if (index>0 && index < this.lesSemis.size()) SemisSupprime=this.lesSemis.remove(index);
		return SemisSupprime;
	}

	public void removeAllSemis() {
		this.lesSemis.clear();
	}

	public Semis getSemis(int index) {
		Semis SemisTrouve=null;
		if (index>0 && index < this.lesSemis.size()) SemisTrouve=this.lesSemis.get(index);
		return SemisTrouve;
	}

	public int getIndexSemis (Semis Semis) {
		int index=-1;
		int i=0;
		while ( index==-1 && i<this.lesSemis.size()) {
			if ( this.lesSemis.get(i).equals(Semis))
				index = i;
			else 
				i++;
		}
		return index;
	}

	public List<Semis> getLesSemis() {
		return this.lesSemis;
	}

	public int getNoCadastralEtendu() {
		return noCadastralEtendu;
	}

	public void setNoCadastralEtendu(int noCadastralEtendu) {
		this.noCadastralEtendu = noCadastralEtendu;
	}

	public float getSurfaceParcelleHa() {
		return surfaceParcelleHa;
	}

	public void setSurfaceParcelleHa(float surfaceParcelleHa) {
		this.surfaceParcelleHa = surfaceParcelleHa;
	}

	public float getSurfaceClasseHa() {
		return surfaceClasseHa;
	}

	public void setSurfaceClasseHa(float surfaceClasseHa) {
		this.surfaceClasseHa = surfaceClasseHa;
	}

	public Commune getCommune() {
		return uneCommune;
	}

	public void setCommune(Commune laCommune) {
		this.uneCommune = laCommune;
	}
	
	public TypeParcelle getTypeParcelle() {
		return unTypeParcelle;
	}

	public void setTypeParcelle(TypeParcelle leTypeParcelle) {
		this.unTypeParcelle = leTypeParcelle;
	}

	@Override
	public String toString() {
		return "Parcelle [noCadastralEtendu=" + noCadastralEtendu
				+ ", surfaceParcelleHa=" + surfaceParcelleHa
				+ ", surfaceClasseHa=" + surfaceClasseHa + uneCommune.toString()+ unTypeParcelle.toString() + "]";
	}
	
	public float montantImpot() {
		float montant;
		String dept = this.uneCommune.getCodePostal().substring(0, 2);
		montant = this.getTypeParcelle().montantImpot(this.surfaceClasseHa, this.surfaceParcelleHa, dept);
		return montant;		
	}
	
	
}

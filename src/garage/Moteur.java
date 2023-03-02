package garage;

public class Moteur {
	private Integer num = 0;
	private Integer nbmoteurs;
	private Integer puissance;
	private float prix;
	
	public Moteur(Integer puissance, float prix) {
		this.puissance = puissance;
		this.prix = prix;
		num++;
	}

	public String toString() {
		return "Moteur de puissance " + puissance + " cv";
	}

	public Integer getNum() {
		return num;
	}

	public Integer getNbmoteurs() {
		return nbmoteurs;
	}

	public Integer getPuissance() {
		return puissance;
	}

	public float getPrix() {
		return prix;
	}
	
	
	
	
}

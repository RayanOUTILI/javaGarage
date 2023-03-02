package garage;

public class Roue {
	private float diametre; 
	private float largeur;
	private float prix;

	public Roue(float diametre, float largeur, float prix) {
		this.diametre = diametre;
		this.largeur = largeur;
		this.prix = prix;
	}
	
	public String toString() {
		return diametre + " x " + largeur;
	}

	public float getDiametre() {
		return diametre;
	}

	public float getLargeur() {
		return largeur;
	}

	public float getPrix() {
		return prix;
	}
	
	
	
}



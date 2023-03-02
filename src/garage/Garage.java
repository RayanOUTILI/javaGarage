package garage;

public class Garage {
	private String nom;
	private String adresse;
	private int nbVoitures;
	private int nbMaxVoitures;
	private Voiture[] liste_voit; 
	
	
	public Garage(String nom, String adresse, int max) {
		 this.nom = nom;
		 this.adresse = adresse;
		 this.nbMaxVoitures = max;
		 liste_voit = new Voiture[max];
	}
	public void ajouterVoiture(Voiture v) {
		if (this.nbVoitures < this.nbMaxVoitures) {
			this.liste_voit[nbVoitures] = v;
			this.nbVoitures++;
		}
		else {
			System.out.println("D�sol�, le garage est plein !");
		}
	}
	
	public float valeurStock() { 
		float prix=0;
		for(int i=0;i < nbVoitures; i++) {
			prix += this.liste_voit[i].prix();
		}
		return prix;
	}
	
	public Voiture laPlusPuissanteVoiture() {
		Voiture puissance_max = this.liste_voit[0];
		for(int i=0;i < nbVoitures-1; i++) {
			if (puissance_max.estPlusPuissante(liste_voit[i+1])) {
				puissance_max = liste_voit[i];
			}
			else{
				puissance_max = liste_voit[i+1];
			}
		}
		return puissance_max;
	}
	
	public String toString() {
		String retour = "";
		retour = "\nGarage" + this.nom + "(" + this.adresse + ")" + " Capacite : " + this.nbMaxVoitures + "\n*************************************\n"; 
		for (int i=0; i<nbVoitures;i++){
			retour += liste_voit[i].toString() + "\n";
		}
		return retour ;
	}
	
	
	
	
}

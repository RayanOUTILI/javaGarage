package garage;

public class TestGarage {
	public static void main(String[] args) {
		Voiture voit1 = new Voiture(15, 10000, 17, 165, 100, 15, 165, 110);
		Voiture voit2 = new Voiture(9, 5000, 17, 155, 200, 15, 155, 220);
		//Voiture voit3 = new Voiture(500, 100000, 50, 50, 50, 15, 15, 500);
		// Tests de la classe Voiture
		/* 
		System.out.println(voit1.toString());
		System.out.println(voit2.toString());
		System.out.println(voit1.prix());
		System.out.println(voit1.estPlusPuissante(voit2));
		*/ 
		// Tests de la classe Garage
		Garage garage1 = new Garage("PARADISO", "Nice", 50);
		garage1.ajouterVoiture(voit1);
		garage1.ajouterVoiture(voit2);
		//garage1.ajouterVoiture(voit3);
		System.out.println(garage1.toString());

		System.out.println("La voiture la plus puissante est la voiture " + garage1.laPlusPuissanteVoiture().getNumld());	
		System.out.println("La valeur totale du stock de voitures est de " + garage1.valeurStock() + "$\n");
	}

}

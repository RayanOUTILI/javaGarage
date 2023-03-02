package garage;

public class Voiture {
    private String numld;
    private static int nbVoitures = 0; //static car sinon nbVoitures est initialisé à 0 à chaque fois qu'on crée une voiture
    private Moteur moteur;
    private Roue[] rouesNormales;
    private Roue roueN;
    private Roue roueS;
    
    public Voiture(int puissance, float prixM, float diamN, float largN, float prixN, float diamS,  float largS, float prixS)
    {
        this.moteur = new Moteur(puissance, prixM);
        this.roueN = new Roue(diamN, largN, prixN);
        this.roueS = new Roue(diamS, largS, prixS);
        this.rouesNormales = new Roue[4];
        for (int i=0; i<4; i++){
            this.rouesNormales[i] = this.roueN;
        }   
        this.numld = "V"+nbVoitures;
        Voiture.nbVoitures++;

    }

    public String getNumld()
    {
        return numld;
    }
    
    public float prix()
    {
        return roueN.getPrix()*4+roueS.getPrix()+moteur.getPrix();
    }    
    
    public boolean estPlusPuissante(Voiture v)
    {
        return this.moteur.getPuissance() > v.moteur.getPuissance();
    }

    public String toString()
    {
        return "Voiture "+ numld + " Prix : "+ prix()+"$ \nMoteur de puissance " +this.moteur.getPuissance()+ " cv \nRoues normales : "+this.roueN.toString()+"\nRoue de secours : " +roueS.toString() + "\n";
    }
}

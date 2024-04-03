package produit;

import personnages.Gaulois;

public class Sanglier extends Produit implements Description {

    private double poids;
    private Gaulois chasseur;

    public Sanglier(double poids, Gaulois chasseur) {
    		super("sanglier","Kilogrammes");
    		this.poids = poids;
            this.chasseur = chasseur;
    }

    public double getPoids() {
        return poids;
    }

    public Gaulois getChasseur() {
        return chasseur;
    }

    @Override
    public String description() {
        return getNom() + " de " + poids + " kg chassé par " + chasseur + ".";
    }
}

package produit;

public abstract class Produit implements Description, IProduit {

    private String nom;
    private String unite;

    public Produit(String nom, String unite) {
        this.nom = nom;
        this.unite = unite;
    }

    @Override
	public String getNom() {
        return nom;
    }

    @Override
	public String getUnite() {
        return unite;
    }


    @Override
    public abstract String description();
}


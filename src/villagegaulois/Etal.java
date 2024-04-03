package villagegaulois;

import personnages.Gaulois;
import produit.*;

public class Etal implements IEtal {
    private Gaulois vendeur;
    private IProduit[] produits;
    private int nbProduit;
    private int prix;

    // Constructeur
    public Etal() {
        this.vendeur = null;
        this.produits = null;
        this.nbProduit = 0;
        this.prix = 0;
    }

    // Méthode pour installer le vendeur et les produits
    public void installerVendeur(Gaulois vendeur, Produit[] produits, int prix) {
        this.vendeur = vendeur;
        this.produits = produits;
        this.nbProduit = produits.length;
        this.prix = prix;
    }

    @Override
    public Gaulois getVendeur() {
        return vendeur;
    }

    @Override
    public double donnerPrix() {
        return prix;
    }

    @Override
    public int contientProduit(String produit, int quantiteSouhaitee) {
    	int quantiteAVendre = 0;
    	if (nbProduit != 0 && this.produits[0].getNom().equals(produit)) {
    	if (nbProduit >= quantiteSouhaitee) {
    	quantiteAVendre = quantiteSouhaitee;
    	} else {
    	quantiteAVendre = nbProduit;
    	}
    	}
    	return quantiteAVendre;
    	}
    	@Override
    	public double acheterProduit(int quantiteSouhaite) {
    	double prixPaye = 0;
    	for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
    	prixPaye += produits[i].calculerPrix(prix);
    	}
    	if (nbProduit >= quantiteSouhaite) {
    	nbProduit -= quantiteSouhaite;
    	} else {
    	nbProduit = 0;
    	}
    	return prixPaye;
    	}
    	@Override
    	public String etatEtal() {
    	StringBuilder chaine = new StringBuilder(vendeur.getNom());
    	if (nbProduit > 0) {
    	chaine.append(" vend ");
    	chaine.append(nbProduit + " produits :");
    	for (int i = 0; i < nbProduit; i++) {
    	chaine.append("\n- " + produits[i].description());
    	}
    	} else {
    	chaine.append(" n'a plus rien à vendre.");
    	}
    	chaine.append("\n");
    	return chaine.toString();
    	}
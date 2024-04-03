package villagegauloisold;

import personnages.Gaulois;
import produit.IProduit;
import produit.Produit;

public class Etal<T extends IProduit> implements IEtal {
    private Gaulois vendeur;
    private Produit produit;
    private int quantiteDebutMarche;
    private int quantite;
    private boolean etalOccupe = false;

    
    public Etal () {
    	vendeur = null ; 
    	quantiteDebutMarche = 0 ; 
    	quantite = 0 ; 
    }
    
    
    

    public void installerVendeur(Gaulois vendeur, Produit produit, int quantite) {
        this.vendeur = vendeur;
        this.produit = produit;
        this.quantite = quantite;
        quantiteDebutMarche = quantite;
        etalOccupe = true;
    }



    @Override
    public int acheterProduit(int quantiteAcheter) {
        if (quantite == 0) {
            quantiteAcheter = 0;
        }
        if (quantiteAcheter > quantite) {
            quantiteAcheter = quantite;
        }
        if (etalOccupe) {
            quantite -= quantiteAcheter;
        }
        return quantiteAcheter;
    }

    @Override
    public void libererEtal() {
        etalOccupe = false;
    }

    @Override
    public String[] etatEtal() {
        String[] donneesVente = new String[5];
        donneesVente[0] = String.valueOf(etalOccupe);
        if (etalOccupe) {
            donneesVente[1] = vendeur.getNom();
            donneesVente[2] = produit.getNom();
            donneesVente[3] = String.valueOf(quantiteDebutMarche);
            donneesVente[4] = String.valueOf(quantiteDebutMarche - quantite);
        }
        return donneesVente;
    }




	@Override
	public void occuperEtal(Gaulois vendeur, IProduit produit, int quantite) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public boolean contientProduit(IProduit produit) {
		// TODO Auto-generated method stub
		return false;
	}
}


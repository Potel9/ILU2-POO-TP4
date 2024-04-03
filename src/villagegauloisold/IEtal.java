package villagegauloisold;

import personnages.Gaulois;
import produit.IProduit;

public interface IEtal {
    void occuperEtal(Gaulois vendeur, IProduit produit, int quantite);
    boolean contientProduit(IProduit produit);
    int acheterProduit(int quantiteAcheter);
    void libererEtal();
    String[] etatEtal();
}

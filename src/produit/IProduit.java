package produit;

public interface IProduit {

	String getNom();

	String getUnite();

	String description();

	double calculerPrix(int prix);

}
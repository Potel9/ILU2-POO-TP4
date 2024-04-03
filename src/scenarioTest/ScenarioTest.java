package scenarioTest;

import personnages.Gaulois;
import produit.*;
import villagegaulois.*;


public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		Etal etalsanglier1 = new Etal();
		Etal etalsanglier2 = new Etal();
		Etal etalpoisson = new Etal();
		etalsanglier1.installerVendeur(obelix, sangliersObelix, 8);
		etalsanglier2.installerVendeur(asterix, sangliersAsterix, 10);
		etalpoisson.installerVendeur(ordralfabetix, poissons, 7);
		
		
}	
}
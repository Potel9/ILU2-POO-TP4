package produit;

public class Poisson extends Produit {

	private String datePeche ; 
	
	public Poisson( String datePeche) {
		super("poisson","Kilogramme");
		this.datePeche = datePeche ; 
	}
	 @Override
	    public String description() {
	        return "poisson pêchés "+datePeche;
	    }
}

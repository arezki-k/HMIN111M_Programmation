package tp5_2019;

public class Colis extends ObjetPostal {
	/*
	 * Attributs
	 */
	
	private String declareContenu= "contenu non déclaré";
	private double valeurDeclaree;
	
	/*
	 * Constructeurs
	 */
	
	public Colis() {}

	public Colis(String origine, String destination, String codePostal, double poids, double volume,
			double tauxDeRecommandation, String declareContenu, double valeurDeclaree) {
		super(origine, destination, codePostal, poids, volume, tauxDeRecommandation);
		this.declareContenu = declareContenu;
		this.valeurDeclaree = valeurDeclaree;
	}
	
	/*
	 * Accesseurs
	 */
	
	public String getDeclareContenu() {
		return declareContenu;
	}

	public void setDeclareContenu(String declareContenu) {
		this.declareContenu = declareContenu;
	}

	public double getValeurDeclaree() {
		return valeurDeclaree;
	}

	public void setValeurDeclaree(double valeurDeclaree) {
		if (valeurDeclaree >=0 )
			this.valeurDeclaree = valeurDeclaree;
		else System.out.println("la valeur declaree doit etre positive");
	}
	
	/*
	 * Méthode toString
	 */

	@Override
	public String toString() {
		return "Colis [declareContenu=" + declareContenu + ", valeurDeclaree=" + valeurDeclaree + ", toString()="
				+ super.toString() + "]";
	}
	
	/*
	 * Méthode tarifAffranchissement
	 */
	
	@Override
	double getTarifBase() {
		return 2;
	}

	@Override
	public double tarifAffranchissement() {
		double tarifAff = super.tarifAffranchissement();
		if (this.getVolume() > 1.0/8) tarifAff += 3;
		return tarifAff;
	}

	@Override
	public double tarifRemboursement() {
		if (this.getTauxDeRecommandation()==1)
			return this.getValeurDeclaree()*0.1;
		else if (this.getTauxDeRecommandation()==2)
			return this.getValeurDeclaree()*0.5;
		return 0;
	}
}

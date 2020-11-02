package tp4_2019;

public abstract class Piece {
	private String referenceDebase;
	private String nom;
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public Piece(String referenceDebase, String nom) {
		this.referenceDebase = referenceDebase;
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getReferenceDebase() {
		return referenceDebase;
	}
	public void setReferenceDebase(String referenceDebase) {
		this.referenceDebase = referenceDebase;
	}

	@Override
	public String toString() {
		return "Piece [referenceDebase=" + referenceDebase + ", nom=" + nom
				+ "]";
	}
	public abstract double prix();
	public abstract double dureeGarantie();
	public abstract double dureeFabrication();
	public abstract String prefixe();
	
	
	public String reference(){
		return this.prefixe()+this.getReferenceDebase();
	}
	public void affiche(){
		System.out.println("nom : "+this.getNom() + "\nréférence : " + this.reference()
				+"\nprix : " + this.prix() + " $ "+"\ngarantie : " 
				+ this.dureeGarantie() + " mois"
				+"\ndurée de fabrication : " + this.dureeFabrication() +" jour(s)");
		
	}
	
	
	
	

}

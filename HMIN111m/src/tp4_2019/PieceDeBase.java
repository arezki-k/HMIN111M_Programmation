package tp4_2019;

public class PieceDeBase extends Piece{
	private double prix;
	private double dureeGarantie;
	private double dureeFabrication;
	
	
	//constructeur vide
	public PieceDeBase() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//constructeur avec parametres
	public PieceDeBase(String r, String n, double p, double dg, double df ){
		super(r, n);
		this.dureeGarantie=dg;
		this.dureeFabrication=df;
	}
	
	//setters et getters:
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}


	public double getDureeGarantie() {
		return dureeGarantie;
	}
	public void setDureeGarantie(double dureeGarantie) {
		this.dureeGarantie = dureeGarantie;
	}
	public double getDureeFabrication() {
		return dureeFabrication;
	}
	public void setDureeFabrication(double dureeFabrication) {
		this.dureeFabrication = dureeFabrication;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"prix=" + prix + ", dureeGarantie=" + dureeGarantie
				+ ", dureeFabrication=" + dureeFabrication + "]";
	}
	@Override
	public double prix() {
		// TODO Auto-generated method stub
		return this.getPrix();
	}



	@Override
	public double dureeGarantie() {
		// TODO Auto-generated method stub
		
		return this.getDureeGarantie();
	}

	@Override
	public double dureeFabrication() {
		// TODO Auto-generated method stub
		return this.getDureeFabrication();
	}

	@Override
	public String prefixe() {
		// TODO Auto-generated method stub
		return "00";
	}

}

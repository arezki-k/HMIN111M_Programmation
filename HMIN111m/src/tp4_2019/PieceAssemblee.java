package tp4_2019;

public class PieceAssemblee extends PieceComposite {
	private double prixMontage;
	private double dureeMontageAtelier;
	private static double garantieAtelier=6;
	
	
	
	

	/**
	 * 
	 */
	public PieceAssemblee() {
	}
	
	
	
	

	/**
	 * @param r
	 * @param n
	 * @param prixMontage
	 * @param dureeMontageAtelier
	 */
	@SuppressWarnings("unused")
	private PieceAssemblee(String r, String n, double prixMontage,
			double dureeMontageAtelier) {
		super(r, n);
		this.prixMontage = prixMontage;
		this.dureeMontageAtelier = dureeMontageAtelier;
	}





	public double getPrixMontage() {
		return prixMontage;
	}

	public void setPrixMontage(double prixMontage) {
		this.prixMontage = prixMontage;
	}

	public double getDureeMontageAtelier() {
		return dureeMontageAtelier;
	}

	public void setDureeMontageAtelier(double dureeMontageAtelier) {
		this.dureeMontageAtelier = dureeMontageAtelier;
	}

	public static double getGarantieAtelier() {
		return garantieAtelier;
	}

	public static void setGarantieAtelier(double garantieAtelier) {
		PieceAssemblee.garantieAtelier = garantieAtelier;
	}
	
	

	
	
	
	
	@Override
	public String toString() {
		return super.toString()+ "PieceAssemblee [prixMontage=" + prixMontage
				+ ", dureeMontageAtelier=" + dureeMontageAtelier + "]";
	}





	@Override
	public double prix() {
		// TODO Auto-generated method stub
		//somme des prix des compposants plus prix de la somme du montage.
		//super.prix()+
		
		
		return 0;
	}

	@Override
	public double dureeGarantie() {
		// TODO Auto-generated method stub
		
		return super.dureeGarantie()+6;
	}

	@Override
	public double dureeFabrication() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String prefixe() {
		// TODO Auto-generated method stub
		return "02";
	}
	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		super.affiche();
	}

}

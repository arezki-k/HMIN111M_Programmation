package tp4_2019;

public class PieceCompositeEnKit extends PieceComposite{
	private double dureeMontage;
	private String notice;
	
	public PieceCompositeEnKit() {
		// TODO Auto-generated constructor stub
	}
	public PieceCompositeEnKit(String r, String n,double dm, String no){
		super(r, n);
		this.dureeMontage= dm;
		this.notice= no;
		
	}
	

	public double getDureeMontage() {
		return dureeMontage;
	}
	public void setDureeMontage(double dureeMontage) {
		this.dureeMontage = dureeMontage;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	
	
	
//	@Override
//	public double prix() {
//		// TODO Auto-generated method stub
	//pas necessaire de la mettre dans cette sous classe, car elle exactement 
	//similaire a la methode prix dans super.
//		return 0;
//	}

	@Override
	public String toString() {
		return super.toString()+"PieceCompositeEnKit [dureeMontage=" + dureeMontage
				+ ", notice=" + notice + "]";
	}
	
	
	@Override
	public double dureeGarantie() {
		
		// TODO Auto-generated method stub
		return super.dureeGarantie()/2;
	}

	@Override
	public double dureeFabrication() {
		// TODO Auto-generated method stub
		return super.dureeFabrication()+this.getDureeMontage();
	}

	@Override
	public String prefixe() {
		// TODO Auto-generated method stub
		return "01";
	}
	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		super.affiche();
		System.out.println("\ndurée de montage particulier : " + this.getDureeMontage()
				+" jour(s)"
				+"\ncompsants : "
			);
	}

}

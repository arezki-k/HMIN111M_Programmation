package tp4_2019;

import java.util.ArrayList;

public abstract class PieceComposite extends Piece {
	private ArrayList<Piece> listePieceComposite = new ArrayList<Piece>();
	
	
	
	public PieceComposite() {
		// TODO Auto-generated constructor stub
	}
	
	public PieceComposite(String r, String n){
		super(r,n);
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public double prix() {
		// TODO Auto-generated method stub
		//somme prix des compsants.
		double res=0;
		for(Piece p:listePieceComposite){
			res+=p.prix();
		}
		return res;
	}
	@Override
	public double dureeGarantie() {
		// TODO Auto-generated method stub
		double res = 0;
		if(!listePieceComposite.isEmpty()){
			res = listePieceComposite.get(0).dureeGarantie();
			for (Piece p:listePieceComposite){
				if(p.dureeGarantie()<res){
					res=p.dureeGarantie();
				}
			}
		}
		return res;
	}
		
	@Override
	public double dureeFabrication() {
		// TODO Auto-generated method stub
		double res = 0;
		if(! listePieceComposite.isEmpty()){
			res=listePieceComposite.get(0).dureeFabrication();
			for(Piece p:listePieceComposite){
				if(p.dureeFabrication()>res){
					res = p.dureeFabrication();
				}
			}
		}
		return res;
	}
	
	public void composeAvec(Piece p){
		if(! listePieceComposite.contains(p)){
			listePieceComposite.add(p);
		}
		else{
			System.err.println("pieces deja contenue.");
		}
		
	}

}

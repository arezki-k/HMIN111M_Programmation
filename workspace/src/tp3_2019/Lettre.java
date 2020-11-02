package tp3_2019;

import java.util.Scanner;


public class Lettre extends ObjetPostal{
	
	/*attribut*/
	private String statut;
	/*constructeurs*/
	public Lettre(){
		
	}
	public Lettre(String origine, String destination, int codePostal, 
			double poids, double volume, tp3_2019.TauxRec tauxRec, String statut){
		super(origine, destination,codePostal, poids, volume, tauxRec);
		this.setStatut(statut);
	}
	
	/*accesseurs*/
	/*get*/
	public String getStatut(){
		return this.statut;
	}
	/*set*/
	public void setStatut(String statut){
		if (statut.equals("urgente") || statut.equals("ordinaire")){
			this.statut=statut;
		}
		else{
			System.err.println("statut saisie non valable");
		}
	}
	/*méthode toString*/
	public String toString(){
		return(super.toString()+"\nStatut de la lettre: "+this.statut);
	}
	/*méthode de saisie*/
	public void Saisie(Scanner sc){
		super.Saisi(sc);
		System.out.println("veuillez saisir le statut de la lettre");
		this.setStatut(sc.next());
	}
	/*affranchissement*/
	
	@Override
	public double tarifAffranchissement(){
		double supp=0;
		if(this.getStatut().equals("ordinaire")){
			return supp+super.tarifAffranchissement();
		}
		else if(this.getStatut().equals("urgente")){
			supp+=0.30;
			return supp+super.tarifAffranchissement();
		}
		else{
			return 999999;
		}
		}
	//tarif remboursement lettre
	@Override
	public double tarifRemboursement(){
		double remboursement=0;
		getTaux_rec();
		if(this.getTaux_rec().equals(tp3_2019.TauxRec.faible)){
			remboursement=super.tarifRemboursement();
		} else {
			getTaux_rec();
			if (this.getTaux_rec().equals(tp3_2019.TauxRec.moyen)){
				remboursement=1.5;
			} else {
				getTaux_rec();
				if (this.getTaux_rec().equals(tp3_2019.TauxRec.fort)){
					remboursement=15;
				}
			}
		}
		return remboursement;
	}
	@Override
	public double tarifBase() {
		// TODO Auto-generated method stub
		return 0.5;
	}
	
	
	
	

}

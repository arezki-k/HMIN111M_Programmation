package tp3_2019;

import java.util.Scanner;

public class Colis extends ObjetPostal {
	/*attribut*/
	private String contenu;
	private double valeur;
	/*constructeur*/
	public Colis(){
		
	}
	public Colis(String origine, String destination, int codePostal, 
		double poids, double volume, TauxRec taux, String contenu, 
		double valeur){
		super(origine, destination, codePostal, poids, volume, taux);
		this.contenu=contenu;
		this.valeur=valeur;
		
	}
	/*accesserus*/
	/*get*//*Ctrl + espace*/
	public String getContenu() {
		return contenu;
	}
	public double getValeur() {
		return valeur;
	}
	
	
	/*set*//*Ctrl+espace*/
	
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	/*méthode de saisie*/
	public void Saisie(Scanner sc){
		super.Saisi(sc);
		System.out.println("veuillez saisir le contenu");
		this.setContenu(sc.next());
		System.out.println("veuillez saisir la valeur");
		this.setValeur(sc.nextDouble());
		
	}
	/*méthode to String*/
	public String toString(){
		return(super.toString()+"\ncontenue du colis: "
	+this.getContenu()+"\nvaleur du colis: "+this.getValeur());
	}
	/*affranchsissement*/
	@Override
	public double tarifAffranchissement(){
		double supp=0, base=2.0;
		if(this.getVolume()<=0.125){
			return base+supp+super.tarifAffranchissement();
		}
		else if(this.getVolume()>0.125){
			supp+=3;
			return base+supp+super.tarifAffranchissement();
		}
		else{
			return 999999;
		}
		}
	/*remboursement*/
	@Override
	public double tarifRemboursement(){
		double remboursement;
		if(this.getTaux_rec().equals(TauxRec.faible)){
			remboursement=super.tarifRemboursement();
			return remboursement;
		}
		else if(this.getTaux_rec().equals(TauxRec.moyen)){
			remboursement=0.1*this.getValeur();
			return remboursement;
		}
		else{
			remboursement=0.5*this.getValeur();
			return remboursement;	
		}
	}
	@Override
	public double tarifBase() {
		// TODO Auto-generated method stub
		return 2;
	}
	}

package cc2_2019;

import java.util.*;

public class MagasinVelo {
	private String nom;
	private ArrayList<Velo> listeVelo=new ArrayList<Velo>();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Velo> getListeVelo() {
		return listeVelo;
	}
	public void setListeVelo(ArrayList<Velo> listeVelo) {
		this.listeVelo = listeVelo;
	}
	/**
	 * @param nom
	 */
	public MagasinVelo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MagasinVelo(String nom) {
		this.setNom(nom);
		//this.listeVelo=new ArrayList<Velo>();
	}
	
	//methode ajout vend
	public void vend(Velo v){
		if(! listeVelo.contains(v)){
			listeVelo.add(v);
		}
		else{
			System.err.println("velo deja contenu");
		}
	}
	public ArrayList<Velo> veloEnfant(){
		ArrayList<Velo> veloEnfant = new ArrayList<Velo>();
		for ( Velo v:listeVelo){
			if (v.getTailleRoue()<609){
				veloEnfant.add(v);
			}
		}
		if (veloEnfant.size()==0){
			System.out.println("il n y a pas de velo enfant dans le lot");
		}
		return veloEnfant;
		
	}
	public int nbVeloInferieurTailleRoue(double tailleRoue){
		ArrayList<Velo> liste = new ArrayList<Velo>();
		for (Velo v:listeVelo){
			if (v.getTailleRoue()<=tailleRoue){
				liste.add(v);
			}
		}
		if(liste.size()==0){
			System.out.println("liste vide");
		}
		return liste.size();
	}
	public ArrayList<Velo> veloTailleRoueEntre(int min, int max){
		ArrayList<Velo> listeentre = new ArrayList<Velo>();
		for (Velo v:listeVelo){
			if (v.getTailleRoue()>=min && v.getTailleRoue()<=max){
				listeentre.add(v);
				
			}
		}
		if (listeentre.size()==0){
			System.out.println("pas de velo dans cet interval");
		}
		return listeentre ;
	}
	
	
	
	
	
	
	

}

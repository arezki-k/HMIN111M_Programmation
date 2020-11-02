package cc_2017;

import java.util.*;

public class KitSport {
	//attributs
	private ArrayList<MaterielSport> liste=new ArrayList<>();
	private String denomenation=null;
	
	//constructeurs:
	public KitSport(ArrayList<MaterielSport> liste, String denomenation) {
		this.liste = liste;
		this.denomenation = denomenation;
	}
	
	
	public KitSport(){
		this.liste=new ArrayList<MaterielSport>();
		this.denomenation=null;
		
	}
	public KitSport(String nom){
		this.liste=new ArrayList<MaterielSport>();
		this.denomenation=nom;
	}
	
	//set et get
	public ArrayList<MaterielSport> getListe() {
		return liste;
	}


	public String getDenomenation() {
		return denomenation;
	}


	public void setDenomenation(String denomenation) {
		this.denomenation = denomenation;
	}
	
	
	
	
	
	public void ajoutMatos(MaterielSport m){
		if (this.liste.contains(m)){
			System.err.println("objet déja contenue");
		}
		else{
			this.liste.add(m);
		}
	}
	public double calculPoids(){
		double poids=0;
		for(MaterielSport m:liste){
			poids+=m.getPoids();
	}
		System.out.println("le poids est: ");
		return poids;
		
	}
	public ArrayList<MaterielSport> poidsInferieur(double poids){
		ArrayList<MaterielSport> listeInf = new ArrayList<MaterielSport>();
		for (MaterielSport m:liste){
			if(m.getPoids()<= poids){
				listeInf.add(m);
			}
		}
		if(listeInf.size()==0){
			System.out.println("aucun objet trouvé");
		}
		return listeInf;
	}
	public void programme(double poids){
		MaterielSport m = new MaterielSport();
		MaterielSport me = new MaterielSportEnfant();
		KitSport kit = new KitSport();
		Scanner sc = new Scanner(System.in);
		m.saisie(sc);
		me.saisie(sc);
		kit.ajoutMatos(m);
		kit.ajoutMatos(me);
		System.out.println("calcul du poids: "+kit.calculPoids());
		System.out.println("poids inferieur "+ kit.poidsInferieur(poids));
		
	}

	
	
	

}

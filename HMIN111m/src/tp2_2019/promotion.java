package tp2_2019;
import java.util.*;
public class promotion {
	
							/*partie attributs*/
	private int annee;
	private ArrayList <Etudiant> listeEtudiants;//= new ArrayList <> ();
						 /*partie constructeurs*/
	public promotion(){
		this.annee=0;
		this.listeEtudiants=new ArrayList<> ();
	}
	public promotion(int annee){
		this.annee=annee;
		this.listeEtudiants=new ArrayList <> ();
	}

	
						/*partie accesseurs*/
	public int getanneepromotion(){
		return this.annee;
	}
	public void setanneepromotion(int annee){
		this.annee=annee;
	}
						/*méthodes*/
	public void inscrire(Etudiant etud){
		if(listeEtudiants.contains(etud)){
			System.out.println("l'etudiant "+etud+" est deja dans la liste");
		}
		else
		{this.listeEtudiants.add(etud);
		}
	}
	public int nbEtudiants(){
		return this.listeEtudiants.size();
	}
	
	public String afficheEtudiants(){
		if(this.nbEtudiants()==0)
		{return"la liste est vide!";
		}
		else
		{
			String res="";
			for (Etudiant elem: listeEtudiants)
			{
				res += elem.getNom()+"\n";	
			}
			return res;
		}
	}
	
	public Etudiant getEtudiant(int i){
		return this.listeEtudiants.get(i);
	}
	public Etudiant getEtudiant2(int i){
		
		if(i>this.nbEtudiants())
		{
			Etudiant etud=null;
			return etud;
		}
		else 
		{
			Etudiant etud=this.listeEtudiants.get(i);
			return etud;
		}
		
	
	}
	/*methode moyenne generale*/
	public double moyenneGenerale(){
		double moyenne,sommemoyenne = 0,moyenneG;
		if(this.listeEtudiants.size()==0){
			moyenneG=0;
			System.out.println("la liste est vide");
			return moyenneG;
		}
		else{
			for(Etudiant etud: listeEtudiants){
				moyenne=etud.moyenne();
				sommemoyenne+=moyenne;
				//System.out.println(sommemoyenne);
				}
		moyenneG=sommemoyenne/listeEtudiants.size();
		return moyenneG;
			
		}
		
		
	}
	
	/*méthode afficheResultats*/
	public void afficheResultats(){
		if(listeEtudiants.size()==0){
			System.out.println("la liste est vide");
		}
		else{
			for(Etudiant etud:listeEtudiants){
				System.out.println(etud.ligneResultat());
				
			}
		}
	}
	public boolean recherche(String nom){
		boolean res=true;
		int i=0;
		while (i<listeEtudiants.size()){
			if(nom==this.getEtudiant(i).getNom()){
				System.out.println(res);
				return res;	}
			else{
				res=false;
			}
		}
		return res;
	}
	
	
	
}

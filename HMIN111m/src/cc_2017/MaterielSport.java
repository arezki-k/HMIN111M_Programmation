package cc_2017;
import java.util.*;

public class MaterielSport {
	/*mise en place des attributs*/
	private final String description;
	private double poids;//en KG
	
	/*partie constructeurs*/
	//vide
	public MaterielSport(){
		this.description=null;
		this.poids=0;
	}
	//avec parametre
	public MaterielSport(String desc, double poids){
		this.description=desc;
		this.setPoids(poids);
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		if (poids<0){
			System.out.println("poids non valide, veuillez saisir un poids positif");
			this.setPoids(sc.nextDouble());
		}
		else{
		this.poids = poids;}
	}
	
	
	public String getDescription() {
		return description;
	}
	
	

	@Override
	public String toString() {
		return "MaterielSport [description=" + description + ", poids=" + poids
				+ "]";
	}
	
	//méthode de saisie:
	Scanner sc = new Scanner(System.in);
	public void saisie(Scanner sc){
		System.out.println("veuillez saisir le poids svp");
		this.setPoids(sc.nextDouble());
	}
	
	
	

}

package tp3_2019;
import java.util.*;

public abstract class ObjetPostal {
	
	/*partie attribut*/
	private String Origine;
	private String Destination;
	private int CodePostal;
	private double Poids;
	private double Volume;
	private TauxRec TauxRec;
	
	/*partie constructeur*/
	public ObjetPostal(){
		
	}
	
	public ObjetPostal(String origine, String destination, 
	int codePostal, double poids, double volume, TauxRec taux){
	this.setOrigine(origine);
	this.setDEstination(destination);
	this.setCodePostal(codePostal);
	this.setPoids(poids);
	this.setVolume(volume);
	this.setTaux_rec(taux);
	}
	
	
	/*partie accesseurs*/
	/*get*/

	public String getOrigine(){
		return this.Origine;
	}
	public String getDestination(){
		return this.Destination;
	}
	public int getCodepostal(){
		return this.CodePostal;
	}
	public double getPoids(){
		return this.Poids;
	}
	public double getVolume(){
		return this.Volume;
	}
	public TauxRec getTaux_rec(){
		return this.TauxRec;
	}
	
	/*set*/
	Scanner sc = new Scanner(System.in);
	public void setOrigine(String origine){
		this.Origine=origine;
	}
	public void setDEstination(String destination){
		this.Destination=destination;
	}
	public void setCodePostal(int codePostal){
		this.CodePostal=codePostal;
	}
	
	public void setPoids(double poids){
		this.Poids=poids;
	}
	
	public void setVolume(double volume){
		this.Volume=volume;
	}
	public void setTaux_rec(TauxRec taux){
		if (taux.equals(tp3_2019.TauxRec.faible) || taux.equals(tp3_2019.TauxRec.moyen) || taux.equals(tp3_2019.TauxRec.fort)){
			this.TauxRec=taux;
		}
		else{
			System.out.println("veuillez renseigner une donnée "
					+ "valable (faible, moyen, fort)");
			this.setTaux_rec(tp3_2019.TauxRec.valueOf(sc.next()));
		
		}
	}
	/*méthode de saisie*/
	public void Saisi(Scanner sc){
		System.out.println("veuillez saisir une origine" );
		this.setOrigine(sc.next());
		System.out.println("veuillez saisir une destination");
		this.setDEstination(sc.next());
		System.out.println("veuillez saisir un code postale ");
		this.setCodePostal(sc.nextInt());
		System.out.println("veuillez saisir un poids en gramme");
		this.setPoids(sc.nextDouble());
		System.out.println("veuillez saisir un volume en m3");
		this.setVolume(sc.nextDouble());
		System.out.println("veuillez saisir un taux de recommendation");
		this.setTaux_rec(tp3_2019.TauxRec.valueOf(sc.next()));
	}
	/*méthode to String*/
	public String toString(){
		return("information concernant l'objet postal sont: \norigine: "
		+this.getOrigine()+"\ndestination: "+this.getDestination()
		+"\ncode postale: "+this.getCodepostal()+"\npoids: "
		+this.getPoids()+" grammes\nvolume: "+this.getVolume()
		+" M3\ntaux de recommendation: "+this.getTaux_rec()
		+"\ntarif affranchissemnt: "+this.tarifAffranchissement()
		+"\nTarif de remboursement: "+this.tarifRemboursement());
		
	}
	//méthode d'affranchissement
	/*public double tarifAffranchissement(){
		double tarifDeBase=0.5;
		if (this.getTaux_rec()==0){
			return tarifDeBase;
		}
		else if (this.getTaux_rec()==1){
			tarifDeBase+=0.5;
			return tarifDeBase;
		}
		else if(this.getTaux_rec()==2){
			tarifDeBase+=1.5;
			return tarifDeBase;			
		}
		else{
			return 9999999;
		}
		
	}
	*/
	public double tarifAffranchissement(){
		double tarif=0;
		if (this.getTaux_rec().equals(tp3_2019.TauxRec.moyen)){
			tarif=0.5+this.tarifBase();
		}
		else if(this.getTaux_rec().equals(tp3_2019.TauxRec.fort))
		{
			tarif=this.tarifBase()+1.5;
		}
		return tarif;
	}
	//methode de remboursement:
	public double tarifRemboursement(){
		double remboursement = 0;
		if(this.getTaux_rec().equals(tp3_2019.TauxRec.faible)){
			remboursement=0;	
		}
		return 	remboursement;
		
	}
	//methode tarif de base:
	abstract public double tarifBase();

}

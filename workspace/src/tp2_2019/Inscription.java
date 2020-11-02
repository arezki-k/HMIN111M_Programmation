package tp2_2019;

import java.util.Scanner;

public class Inscription {
	
	
	/****************** Partie attributs ****************************************/
	private int codeInscription;
	private int codePays;
	
/***************************************************************************/
	/********************Partie Constructeurs ***************************/
	Scanner sc = new Scanner(System.in);
	
	public Inscription(){
		
	}
	public Inscription(int codeInscription,int codePays ){
		this.setcodeInscription(codeInscription);
		this.setcodePays(codePays);
	}
	
	
	/********************Partie Accesseurs ***************************/
	/*constructeurs get pour codeInscription*/
	public int getcodeInscription(){
		return this.codeInscription;
	}
	
	/*constructeurs set pour codeInscription*/
	public void setcodeInscription(int codeInsc){
		if (codeInsc != 1 && codeInsc !=2) {
			System.out.print("veuillez saisir la bonne valeur svp \n 1 pour une premiere inscription,  \n 2 pour une reinscription");
			this.setcodeInscription(sc.nextInt());
		}
		else {
			this.codeInscription=codeInsc;
		}
	}
	/*constructeurs get pour codePays*/
	public int getcodePays(){
		return this.codePays;
	};
	/*constructeurs set pour codePays*/
	public void setcodePays(int codeCountry){
		if(codeCountry<1 || codeCountry>3){
			System.out.print("veuillez saisir la bonne valeur svp: \n 1 pour une francais,  \n 2 pour etranger francophone, \n 3 pour etranger non francophone");
			this.setcodePays(sc.nextInt());
			
		}
		this.codePays=codeCountry;
	}
	
	
	
	/****************************** Partie méthodes ***************************************/	
	
			/*Méthode Nationnalite() */
	public String Nationalite(){
		int cp=this.codePays;
		String nationalite="null";
		if(cp==1){
			nationalite="Francaise";
		}
		else if(cp==2){
			nationalite="Etranger Francophone";
		}
		else if (cp==3){
			nationalite="Etranger non francophone";
		}
		return nationalite;
	}
		
		/*methode typeInscription*/
	public String typeInscription(){
		int codeInscription=this.codeInscription;
		String typeInscription="null";
		if(codeInscription==1){
			typeInscription="premiere inscription";
		}
		else if(codeInscription==2){
			typeInscription="reinscription";
		}
		return typeInscription;
		
	}
	/* methode to String*/
	public String toString(){
		return"\n"+" code d'inscription: "+this.getcodeInscription()+"\n"+" codePays: "+this.getcodePays()+"\n"+" type d'inscription: "+this.typeInscription()+"\n"+" nationalite: "+this.Nationalite();
	}
	
	
	
	
}





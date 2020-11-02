package tp3_2019;

import java.io.IOException;
import java.util.Scanner;

public class MainObjetPostal {
	public static void main(String[] args) throws  IOException{
		/*creation des objets postaux*/
		//suite au passage de la class objetostal a abstract, on ne peut plus creer d'objets postaux, mais direcetement des lettres et des colis.
		/*ObjetPostal objet1=new ObjetPostal();
		ObjetPostal objet2=new ObjetPostal("Monptellier","Paris",34090,45.4,0.02,1);
		ObjetPostal objet3=new ObjetPostal("Monptellier","Dijon",34090,4.4,0.04,2);
		ObjetPostal objet4=new ObjetPostal("Monptellier","Lyon",34090,450.4,0.12,1);
		ObjetPostal objet5=new ObjetPostal("Monptellier","Bordeaux",34090,4005.4,1,2);
		ObjetPostal objet6=new ObjetPostal("Monptellier","Lille",34090,10000.4,2,0);*/
		/*test de la méthode toString des objet postaux*/
		/*System.out.println(objet1);
		System.out.println(objet2);
		System.out.println(objet3);
		System.out.println(objet4);
		System.out.println(objet5);
		System.out.println(objet6);
		*/
		/*création d'une lettre*/
		Lettre lettre1=new Lettre("Monptellier","Paris",34090,45.4,0.02,TauxRec.fort,"urgente");
		/*teste de la methode toString*/
		System.out.println(lettre1);
		/*création des objet demandés*/
		Lettre lettre2=new Lettre("Monptellier","Kouk; igloo2; banquise du nord",99999,45.4,0.02,TauxRec.moyen,"ordinaire");
		Lettre lettre3=new Lettre("Monptellier","Sbouk, igloo8, banquise nord",99999,45.4,0.02,TauxRec.moyen,"urgente");
		//Lettre lettre4=new Lettre();
		/*teste de la methode to string*/
		//Scanner sc = new Scanner (System.in);
		System.out.println(lettre2);
		System.out.println(lettre3);
		/*lettre4.Saisie(sc);*/
		//System.out.println(lettre4);
		
		/*création de colis*/
		/*avec constructeurs*/
		//Colis colis1 = new Colis();
		Colis colis2 = new Colis("Monptellier","Paris",34090,45.4,1.2,TauxRec.fort,"chaussures",50);
		/*saisie du colis1*/
		/*colis1.Saisie(sc);*/
		/*teste de la methode to string*/
		//System.out.println(colis1.toString());
		System.out.println(colis2.toString());
		
		//création des objets demandés
		Colis colis3=new Colis("paris","Frodok, hangar 200, terres ouest",99999,1,0.01,TauxRec.faible,"platre",240);
		Colis colis4=new Colis("paris","Miko, igloo 2, banquise ouest",99999,1,0.01,TauxRec.moyen,"veste",250);
		System.out.println(colis3);
		System.out.println(colis4);
		
		/*teste des méthode d'affrachissement*/
		/*System.out.println("tarif objet 1: "+objet1.tarifAffranchissement()+" euro");
		System.out.println("tarif objet 2: "+objet2.tarifAffranchissement()+" euro");
		System.out.println("tarif objet 3: "+objet3.tarifAffranchissement()+" euro");
		System.out.println("tarif objet 4: "+objet4.tarifAffranchissement()+" euro");
		System.out.println("tarif objet 5: "+objet5.tarifAffranchissement()+" euro");
		System.out.println("tarif objet 6: "+objet6.tarifAffranchissement()+" euro");*/
		System.out.println("tarif lettre 1: "+lettre1.tarifAffranchissement()+" euro");
		System.out.println("tarif lettre 2: "+lettre2.tarifAffranchissement()+" euro");
		System.out.println("tarif lettre 3: "+lettre3.tarifAffranchissement()+" euro");
		//System.out.println("tarif lettre 3: "+lettre4.tarifAffranchsissement()+" euro");
		//System.out.println("tarif Colis 1: "+colis1.tarifAffranchsissement()+" euro");
		System.out.println("tarif Colis 2: "+colis2.tarifAffranchissement()+" euro");
		System.out.println("tarif Colis 3: "+colis3.tarifAffranchissement()+" euro");
		System.out.println("tarif Colis 4: "+colis4.tarifAffranchissement()+" euro");
		
		
		System.out.println("remboursement lettre 1  :"+lettre1.tarifRemboursement());
		System.out.println("remboursement colis 3  :"+colis3.tarifRemboursement());
		
		//System.out.println(lettre1);
		
		
		SacPostal sac1 = new SacPostal(0.1);
		sac1.ajoutObjet(lettre1);
		sac1.ajoutObjet(lettre2);
		sac1.ajoutObjet(lettre3);
		//sac1.ajoutObjet(colis2);
		sac1.ajoutObjet(colis4);
		System.out.println(sac1.contenuSac());
		System.out.println(sac1.remboursementSac());

		System.out.println(sac1.volumeSac());
		
		
		
	}
		
		
		
		
	

}

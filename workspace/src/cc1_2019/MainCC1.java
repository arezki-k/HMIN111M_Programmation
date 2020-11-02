package cc1_2019;

import java.io.IOException;
import java.util.Scanner;

public class MainCC1 {

	public static void main(String[] args) throws IOException {
		
	
		/**** Tests Classe Point ****/
		
		System.out.println("Tests de la classe Point");
		
		// Création de deux points p1 et p2 ayant pour coordonnées p1(10,15) et p2(2,3)
		Point p1 = new Point(10.0,15.0);
		Point p2 = new Point(2.0,3.0);
		
		// Affichage des points p1 et p2
		System.out.println("les informations du point p1 sont: \n "+p1);
		System.out.println("les informations du point P2 sont: \n "+p2);
		
		
		// Calcul de la distance entre les points p1 et p2
		//p1.distance(p1);
		p1.distance(p1, p2);
		//System.out.println("La distance entre le point p1 et le point p2 est : "+p1.distance(p1, p2));
		
		//Création de deux nouveaux points p3 et p4 saisis par l'utilisateur
	Point p3 = new Point();
	Point p4 = new Point();
	Scanner sc= new Scanner(System.in);
	p3.saisie(sc);
	p4.saisie(sc);
		
		//Affichage des deux nouveaux points p3 et p4
	System.out.println("les informations du point p3 sont: \n "+p3);
	System.out.println("les informations du point P4 sont: \n "+p4);
	
		
		
	
		
		
		/**** Tests Classe Segment ****/
		
		System.out.println("Tests de la Classe Segment:");
		
		// Création d'un nouveau segment s=[p1 p2]
		Segment s=new Segment(p1, p2);
		
		// Affichage du segment s
		System.out.println(s);
		
		//Calcul du milieu du segment s
		
		
		
		//Création d'un nouveau segment s1 saisi par l'utilisateur
		Segment s1 = new Segment();
		s1.Saisie(sc);
		
		//Affichage du segment s1
		
		System.out.println("informations concernant le segment s1 sont :"+s1);
					
		//Vérification si les longueurs entre s et s1 sont égales
		
		
		
		// Comparaison des segments s et s1
		
		
		// Modification du point p1 du segment s avec pour nouvelles coordonnées p1(13,15)
		
		
		// Calcul de la nouvelle longueur de s
		
		
		// Affichage du nouveau segment s
		
		
		// Nouvelle comparaison entre s et s1
	
		
		
		
	
		
	
	
	}
	
}

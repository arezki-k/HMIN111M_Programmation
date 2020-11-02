package Cours4NotesExpress;

import java.util.Scanner;

/*
 * Listes, Enumérations, Répétitives
 * 
 * Dans ce cours, nous étudions une situation d'association entre classes,
 * mais cette fois-ci, l'association est de type 1-n et navigable dans une seule
 * direction, nous ne rencontrerons donc pas les problèmes de connection 
 * étudiés au cours précédent. 
 * Dans une association de type 1-n, un objet d'une classe est connecté 
 * à plusieurs objets d'une autre classe.
 * La navigabilité est indiquée par une pointe de flèche orientée vers
 * la classe Appartement.
 * Ici, une agence immobilière est connectée à plusieurs appartements qu'elle gère.
 * Un appartement est géré par une unique agence immobilière mais 
 * on ne se préoccupera pas de ce lien inverse.
 * Un appartement est décrit par une adresse, une superficie,
 * un nombre de pièces, une année de construction et une classification.
 * Les classifications d'appartement sont : T1, T2, T3, F1, F2, F3, studio, duplex, loft, souplex.
 * 
 */

//    
//     -------------------                          ----------------------------
//    | AgenceImmobilière |                      * |   Appartement              |
//    | ------------------|----------------------->|----------------------------|
//    | - nom : String    |               apptGérés| - adresse :String          |
//    |                   |                        | - superficie : réel        |
//     -------------------                         | - nbPieces : int           |
//                                                 | - anneeConstruction : int  |
//                                                 | - classif : Classification |
//                                                  ----------------------------
// 

/* 
 * Nous commençons par présenter la classe Appartement
 * dont le code est très ressemblant à tout ce que nous avons étudié précédemment.
 * La seule nouveauté sera le type de l'attribut classification que nous allons
 * décrire à l'aide d'une énumération (encore appelée type énuméré).
 * Un type énuméré se définit par la liste de ses propres valeurs littérales 
 * et possède nativement plusieurs opérations pour faciliter son utilisation.
 * Une variable de ce type prend obligatoirement l'une des valeurs littérales, 
 * ce qui le rend intéressant pour limiter un ensemble de valeurs.
 * Reportez-vous dès maintenant au fichier Classification.java
 * pour observer le type énuméré décrivant les valeurs possibles
 * de l'attribut classif.
 * En UML, ce type énuméré a une représentation également:
 *  ------------------- 
 * |    << enum >>     |
 * | Classification    | 
 *  ------------------- 
 * |          T1       |
 * |          T2       |
 * |          T3       |
 * |          F1       |
 * |          F2       |
 * |          F3       |
 * |       studio      |
 * |       duplex      |
 * |       loft        |
 * |       souplex     |
 *  ------------------- 
 */

/*
 * Observez la classe Appartement, notamment toString et saisie
 * puis déplacez-vous vers le fichier AgenceImmobiliere
 * 
 */
public class Appartement {
	
	// Attributs
	
	private String adresse;
	private double superficie;
	private int nbPieces;
	private int anneeConstruction;
	private Classification classif;
	
	// Constructeurs
	
	
	public Appartement(String adresse, double superficie, int nbPieces, 
						int anneeConstruction, Classification classif) {
		this.setAdresse(adresse);
		this.setSuperficie(superficie);
		this.setNbPieces(nbPieces);
		this.setAnneeConstruction(anneeConstruction);
		this.setClassif(classif);
	}


	public Appartement() {
		// à compléter
	}
	
	// Accesseurs

	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public double getSuperficie() {
		return superficie;
	}

	// à améliorer en contrôlant que superficie est un réel positif
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	public int getNbPieces() {
		return nbPieces;
	}

	// à améliorer en contrôlant que nbPieces est un entier positif
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}


	public int getAnneeConstruction() {
		return anneeConstruction;
	}

	// à améliorer en contrôlant que anneeConstruction est un entier >= 1000
	public void setAnneeConstruction(int anneeConstruction) {
		this.anneeConstruction = anneeConstruction;
	}


	public Classification getClassif() {
		return classif;
	}


	public void setClassif(Classification classif) {
		this.classif = classif;
	}
	
	// Méthodes
	
	public String toString() {
		return this.adresse+" "+this.superficie
				+" "+this.nbPieces+" "+this.anneeConstruction
				+" "+this.classif; // notez que la valeur de classif se transforme en String
		                           // sans effort de notre part
	}
	
	public void saisie(Scanner clav) {
		System.out.println("adresse ?");
		this.adresse = clav.next();
		System.out.println("superficie ?");
		this.superficie = clav.nextDouble();
		System.out.println("nombre de pièces ?");
		this.nbPieces = clav.nextInt();
		System.out.println("année de construction ?");
		this.anneeConstruction = clav.nextInt();
		System.out.println("classification ?");	
		this.classif = Classification.valueOf(clav.next());
		// la chaîne de caractère saisie doit être changée en valeur
		// du type énuméré
	}
}

/*
 * Partie 1
 */

/*
 * Dans ce cours, nous proposons une introduction à la notion d'héritage.
 * Nous reprenons classe Appartement du cours précédent sous une forme simplifiée : 
 * nous avons retiré les attributs décrivant la classification et l'année de construction.
 * 
 * Le problème que nous traitons est l'évolution du logiciel pour prendre en compte 
 * deux sous-catégories d'appartements :
 * - des appartements normaux décrits par le nombre de nuisances pouvant survenir 
 * dans leur environnement (industrie polluante, marécage, autoroute, boulevard passager, etc.).
 * Ce nombre entier est limité à 10.
 * - des appartements de luxes décrits par les services offerts (internet, buanderie, 
 * gardiennage, etc.). Ces services sont décrits sous forme d'une unique chaîne de caractères.
 * 
 * Avec les moyens dont nous disposons, deux solutions s'offrent à nous 
 * pour cette représentation :
 * - (solution 1) écrire deux classes indépendantes,
 * - (solution 2) écrire une unique classe contenant les attributs propres aux appartements normaux
 * et aux appartements de luxe, ainsi qu'un attribut indiquant de quel type est l'appartement.
 * 
 * Les inconvénients de ces deux solutions sont les suivants :
 * - solution 1 : les attributs sont répétés et peuvent être décrits de manière incohérentes 
 * sur les noms et types. Les opérations les manipulant contiennent des codes avec des 
 * répétitions elles aussi. Toute répétition entraîne des risques d'erreur, surtout lors
 * d'opérations d'évolution.
 * - solution 2 : certains attributs ne sont pas utilisés et occupent de la place mémoire 
 * inutilement. Ils peuvent être utilisés à mauvais escient (pour un appartement qui n'est 
 * pas du type que l'on imagine. Dans le code, il faut tester régulièrement le type
 * d'appartement sur lequel on travaille, car cela détermine certaines procédures de calcul.
 * - dans les deux cas, ajouter une nouvelle catégorie d'appartement (par exemple 
 * les appartement de fonction) est compliquée : soit on fait une nouvelle copie des 
 * parties communes (pour la soution 1), soit on modifie la classe existante, on ajoute les 
 * nouveaux attributs et on ajoute des cas dans toutes les méthodes.
 * 
 * L'héritage nous offre une troisième solution consistant à étendre la classe
 * Appartement par deux autres classes, appelées des sous-classes.
 * La description des sous-classes va compléter ou affiner celle de la super-classe.
 * 
 * Orientez-vous vers le fichier ApptLuxe pour voir l'écriture d'une sous-classe.
 * 
 */


package Cours5NotesExpress;

import java.util.Scanner;

public class Appartement {
	
	// Attributs
	
	private String adresse = "adresse inconnue";
	private double superficie;
	private int nbPieces;
	
	// Constructeurs
	
	public Appartement() {}
	
	public Appartement(String adresse, double superficie, int nbPieces) {
		this.setAdresse(adresse);
		this.setSuperficie(superficie);
		this.setNbPieces(nbPieces);
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
	
	// Méthodes
	
	public String toString() {
		return this.adresse+" "+this.superficie
				+" "+this.nbPieces;
	}
	
	public void saisie(Scanner clav) {
		System.out.println("adresse ?");
		this.setAdresse(clav.next());
		System.out.println("superficie ?");
		this.setSuperficie(clav.nextDouble());
		System.out.println("nombre de pièces ?");
		this.setNbPieces(clav.nextInt());
	}
}

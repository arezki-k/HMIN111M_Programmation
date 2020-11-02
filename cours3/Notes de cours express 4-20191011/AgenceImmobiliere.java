package Cours4NotesExpress;

import java.util.ArrayList;

/*
 * Nous introduisons la notion de liste dans ce fichier
 * Une liste peut se représenter en Java par plusieurs classes.
 * 
 * Une liste est une succession de valeurs :
 * - toutes de même type 
 * - ordonnées
 * - indexées par leur numéro de rang dans la succession
 * - extensible
 * 
 * Dans notre contexte, le type des valeurs peut être une classe.
 * Si on désire une liste de valeurs d'un type primitif (int, double, ...), 
 * on devra utiliser une classe enveloppe (Integer, Double, ...)
 * 
 * Dans le cadre de ce cours, nous nous limiterons à la classe ArrayList,
 * qui est basée sur une mise en oeuvre avec un tableau.
 * Nous n'étudions pas les tableaux primitifs dans ce cours (ceux-ci ne sont
 * pas extensibles).
 * Vous les trouverez décrits dans le polycopié si vous êtes intéressés.
 * 
 */

public class AgenceImmobiliere {
	
	// Attribut représentant le nom : rien de nouveau !
	private String nom;
	
	// Attribut représentant la liste des appartements gérés
	// par l'agence immobilière.
	// Vous observez ici la manière dont on DECLARE une liste.
	// On indique le type ArrayList qui doit être importé par 
	// import java.util.ArrayList
	// et le type des éléments stockés dans la liste, ici des appartements
	
	private ArrayList<Appartement> apptGeres = new ArrayList<>();


	
	// pour créer véritablement la liste, on doit le faire lors de la déclaration
	// de l'attribut, ou bien dans le(s) constructeur(s).
	// cela se fait avec new ArrayList<>(), comme pour tout objet.

	// Constructeurs
	
	public AgenceImmobiliere() {
		// à compléter
	}
	
	public AgenceImmobiliere(String nom, ArrayList<Appartement> apptGeres) {
		this.nom = nom;
		this.apptGeres = apptGeres;
	}

	public AgenceImmobiliere(String nom) {
		this.nom = nom;
	}
	
	// Accesseurs
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// IMPORTANT : On n'écrit volontairement pas de méthode d'accès à apptGeres
	// En effet cela laisserait l'accès totalement libre à toute manipulation
	
	/*
	 * Méthodes
	 * Nous allons introduire différentes méthodes.
	 * Elles vont nous permettre d'observer différentes méthodes sur les listes.
	 * 
	 */
	
	/*
	 * Connaître le nombre d'appartements gérés
	 * Illustration de la méthode size
	 */
	
	public int nbAppartGeres() {
		return this.apptGeres.size();
	}
	
	/*
	 * Connaître l'appartement de rang i
	 * Illustration de la méthode get
	 */	
	
	public Appartement apptRang(int i) {
		// Les indices vont de 0 à size()-1
		if (i>=0 && i <this.apptGeres.size())
			return this.apptGeres.get(i);
		else 
			return null;
	}
	
	/*
	 * Ajouter un nouvel appartement
	 * s'il n'y est pas déjà
	 * Illustration des méthodes contains et add
	 */
	
	public void ajoute(Appartement appt) {
		if (this.apptGeres.contains(appt))
			System.out.println("appartement déjà présent");
		else
			this.apptGeres.add(appt);
	}
	
	/*
	 * 4 formes d'itérations sont disponibles en Java
	 * - for avec un itérateur, pour tout parcourir
	 * - for avec un indice, pour parcourir tout ou partie
	 *   en connaissant le rang de l'élément
	 * - while
	 * - do while
	 * 
	 * Nous les illustrons avec quelques méthodes.
	 * 
	 */
	
	/*
	 * For, version avec itérateur
	 * L'itérateur est la variable a
	 * qui prend successivement comme valeur 
	 * un appartement de la liste :
	 * le premier, le second, etc.
	 */
	
	public void afficheAdresses() {
		for (Appartement a : this.apptGeres) {
			System.out.println("adresse appt. "+a.getAdresse());
		}
}
	
	/*
	 * For, version avec indice
	 * L'indice est la variable i
	 * qui prend successivement comme valeur 
	 * un rang d'un appartement de la liste :
	 * 1, 2, etc.
	 */
	
	public void afficheAdresses0() {
			for (int i = 0; i < this.nbAppartGeres(); i++) {
				System.out.println("adresse appt. de rang = "+i+" "
						+this.apptGeres.get(i).getAdresse());
			}
	}
	
	/*
	 * While, version avec indice
	 * L'indice est la variable i
	 * qui prend successivement comme valeur 
	 * un rang d'un appartement de la liste :
	 * 1, 2, etc.
	 */
	
	public void afficheAdresses2() {
		int i = 0;
		while(i < this.nbAppartGeres()){
			System.out.println("adresse appt. de rang = "+i+" "
					+this.apptGeres.get(i).getAdresse());
			i++;
		}
	}
	
	/*
	 * Do-While, version avec indice
	 * L'indice est la variable i
	 * qui prend successivement comme valeur 
	 * un rang d'un appartement de la liste :
	 * 1, 2, etc.
	 * Le Do-While effectue au moins une fois
	 * le corps de l'itération avant d'effectuer le test "i < this.nbAppartGeres()"
	 * Il faut donc se prémunir du cas où la liste est vide.
	 */
	
	public void afficheAdresses3() {
		if (this.apptGeres.isEmpty())
			System.out.println("pas d'adresse à afficher");
		else {
				int i = 0;
				do {
					System.out.println("adresse appt. de rang = "+i+" "
							+this.apptGeres.get(i).getAdresse());
					i++;
				}
				while (i < this.nbAppartGeres());
		}
	}
}


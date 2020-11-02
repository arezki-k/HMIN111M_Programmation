package Cours7NotesExpress;

/*
 * Première partie du cours
 */

import java.util.Date;

/*
 * Dans ce cours, nous étudions comment mieux gérer certaines informations
 * dans les classes :
 * - sortir les valeurs du code des méthodes
 * - éviter de modifier les constantes, ce qui serait incohérent
 * - coder des ensembles de valeurs pour limiter les erreurs de programmation 
 * et se placer à un niveau plus élevé de description de l'information
 * - se placer au bon niveau (description de classe versus description d'instance
 * et éviter des redondances de données 
 */

public class TypeProdAlimentaire {

	/*
	 * Les instances de cette classe sont tout d'abord décrites par
	 * des attributs d'instance comme ceux que l'on a vus jusqu'à maintenant
	 */
	
	private String nom;
	private double prixHT,nbKJ;
	
	/*
	 * Usage d'une énumération (ensemble de valeurs connues à l'avance)
	 */
	
	private FamilleAliment famille = FamilleAliment.cereales;
	public FamilleAliment getFamille() {
		return this.famille;
	}
	public void setFamille(FamilleAliment famille) {
		this.famille=famille;
	}
	
	/*
	 * On peut également décrire des données relatives à la classe
	 * et non à une de ses instances particulières.
	 * Elles sont dans ce cas précédées du mot-clef static.
	 * Ces données sont globales.
	 * Elles existent en un seul exemplaire dans le système,
	 * contrairement aux attributs d'instance (non static) dont
	 * il existe un exemplaire dans chaque instance.
	 */
	
	private static double tauxTVA;
	private static int nbReferences; // de produits déjà créés
	
	/*
	 * Il existe aussi des données non modifiables (des constantes).
	 * La notion existant en Java est "donnée qui ne peut être
	 * initialisée qu'une fois" : elles sont introduites par le mot clef final
	 * On peut l'utiliser pour les attributs, les paramètres et les variables 
	 * locales. On peut aussi l'utiliser pour une classe pour empêcher 
	 * la création de sous-classes.
	 * 
	 * Quand ce sont des attributs, on doit les initialiser soit
	 * au moment de la déclaration, soit dans les constructeurs.
	 * Ils n'auront pas d'accesseur en modification.
	 */
	
	private final String reference;
	
	// exemple d'initialisation au moment de la création
	private final Date dateCreation = new Date(); // donne la date du jour
	
	/*
	 * Et enfin il existe des constantes de classe (final et static).
	 * Elles seront souvent public.
	 *
	 */
	
	public static final double tauxConversionKJ2KCal = 0.239;
	
	/*
	 * Conséquence sur les constructeurs.
	 * En règle générale, les attributs static seront rarement
	 * passés en paramètre à un constructeur
	 */
	
	/* 
	 * On ne voit pas tauxTVA ni nbReferences dans les paramètres ci-dessous
	 */
	
	public TypeProdAlimentaire() {
		// la reference d'un produit est donnee par "ref" suivi du numero courant
		// donne par le nombre de produit deja references
		this.reference = "ref"+TypeProdAlimentaire.nbReferences;
		TypeProdAlimentaire.nbReferences++;
	}
	
	public TypeProdAlimentaire(String nom, double prixHT, double nbKJ) {
		this.nom = nom;
		this.prixHT = prixHT;
		this.nbKJ = nbKJ;
		this.reference = "ref"+TypeProdAlimentaire.nbReferences;
		TypeProdAlimentaire.nbReferences++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getReference() {
		return reference;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public double getNbKJ() {
		return nbKJ;
	}

	public void setNbKJ(double nbKJ) {
		this.nbKJ = nbKJ;
	}
	
	/*
	 * Les accesseurs aux attributs static par des méthodes
	 * elles-même static en général.
	 * Noter l'accès avec le nom de la classe et non pas avec this.
	 */

	public static double getTauxTVA() {
		return TypeProdAlimentaire.tauxTVA;
	}

	public static void setTauxTVA(double tauxTVA) {
		TypeProdAlimentaire.tauxTVA = tauxTVA;
	}

	public static int getNbReferences() {
		return TypeProdAlimentaire.nbReferences;
	}

	public static void setNbReferences(int nbReferences) {
		TypeProdAlimentaire.nbReferences = nbReferences;
	}
}

package tp2_2019;




/*********************************TP 2.1***********************************************/

public class Etudiant {

	
	/****************** Partie attributs ****************************************/
	
	//L'attribut nom de l'étudiant
	private String nom;
	
	// Vous devez insérer ci-dessous les autres attributs (l'age et les 3 notes)
	
	
	/***************************************************************************/
	
	
	
	/********************Partie Constructeurs ***************************/
	
	//Constructeur par défaut qui ne contient aucun attribut
	public Etudiant(){
		
	}
	
	
	//Constructeur qui contient seulement l'attribut nom 
	public Etudiant(String name){
	this.nom = name;
	}
	
		
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf les notes de l'étudiant
	
	
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age de l'étudiant
	
	
	//Vous devez ci-dessous définir le constructeur qui initialise tous les attributs
	
		
	
	/***********************************************************************/
	
	
	/*************************************Partie Accesseurs ***********************/
	
	/* Accesseurs de l'attribut nom : 
		getNom qui retourne la valeur du nom 
		setNom qui initialise la valeur du nom
	 */
	
	public String getNom() {
		return this.nom;
	}
	
	
	public void setNom(String name) {
		this.nom = name;
	}
	
	/* Vous devez ci-dessous créer les accesseurs pour les autres attributs : */
		
	//Accesseurs de l'age
	
	
	
	//Accesseurs des notes
	
	
	
/***********************************************************************************/
	
	
	
	
	
/****************************** Partie méthodes ***************************************/	
	
	
	/* Méthode toString() qui permet d'afficher des informations concernant un étudiant. 
	Méthode à décommenter et à modifier ci-dessous */
		
	
		/* public String toString() {
			return "";
		} */
	
	
	
	
	/* Méthode saisie qui permet à l'utilisateur de saisir les informations des étudiants et de les initialiser. 
	 Méthode à écrire intégralement en vous inspirant du TP1  */
		
	
	
	
	/* Méthode moyenne à décommenter et à remplir */
	
		/*
		 public double moyenne(){
		 	return 
		 }
		 */
	
	
	/* Méthode mention à écrire ci-dessous. 
	 Cette méthode utilise la méthode moyenne définie précédemment 
	 et retourne une chaine de caractère qui correspond à la mention de l'étudiant dont les valeurs possibles sont :
	 Ajourné, passable, AB, Bien, TB */
	
	
	
	
	/* Methode ligneResultat à écrire ci-dessous 
	 * Cette méthode utilise le résultat de moyenne et de mention
	 * et retourne une chaine de caractère précisant :
	 * le nom, la moyenne, la mention, et si l'étudiant est ajourné, la liste des modules obtenus
	 */
	
	

}

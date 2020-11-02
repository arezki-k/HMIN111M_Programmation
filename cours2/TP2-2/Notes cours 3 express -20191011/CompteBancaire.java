package Cours3NotesExpress;

public class CompteBancaire {
	// attributs issus du compartiment "attribut" de la classe UML
	private String numero;
	private double solde;
	// attribut correspondant au rôle que joue la personne dans l'association
	private Personne client; 
	
	// construction des objets
	// choix : un compte bancaire est créé pour une personne
	// à laquelle il est directement rattaché
	// et avec un solde qui doit être positif ou nul

	
	public CompteBancaire(String numero, Personne client, double soldeInitial) {
		// on initialise le numero
		this.numero = numero;
		// on relie dans les deux sens le client et le compte
		this.client = client;
		client.setCompte(this);
		// on initialise le solde
		if (soldeInitial >= 0) this.solde = soldeInitial;
		else System.out.println("le solde initial doit être positif ou nul");
	}
	
	// accesseurs
	// choix : un compte ne peut pas être rattaché plus tard à un autre client
	// et il ne peut pas changer de numéro
	// Donc pas d'accesseur setNumero, ni d'accesseur setClient
	
	public double getSolde() {
		return this.solde;
	}
	
	public void setSolde(double nouveauSolde) {
		this.solde = nouveauSolde;
	}

	public String getNumero() {
		return numero;
	}

	public Personne getClient() {
		return client;
	}
	
	// méthode toString pour la version V2 de celle de Personne
	public String toString() {
		return " num compte = "+this.getNumero()
		       +" solde = "+this.getSolde();
		// remarque, attention à l'ordre des appels
		// le code suivant provoquerait une boucle infinie
		// return "num compte = "+this.getNumero()
		//        +" solde = "+this.getSolde()
		//       +" client = "+this.getClient();		
	}
	
	// Comprendre le passage de paramètres par valeur
	// qui est le seul mode de passage de paramètres en Java
	
	// Exemple 1 : un paramètre de type primitif
	// On ne pourra pas modifier une variable passée en paramètre
	
	public void augmenteDe10pourCents(double valeur){
		valeur = 1.1 * valeur; // ne change que le paramètre
		// voir le main pour voir que cela ne change pas
		// une variable passée en paramètre
	}
	
	// Exemple 2 : un paramètre de type classe
	// l'adresse/la référence de l'objet est passée par valeur.
	// On ne pourra pas modifier la variable adresse.
	// Mais on peut modifier l'objet au travers de l'adresse.
	
	public void virement(double v, CompteBancaire autreCompte) {
		if (v>=0 && this.getSolde()>=v) {
			this.solde = this.solde - v;
			autreCompte.solde = autreCompte.solde+v;
		}
		else {
			System.out.println("virement impossible");
		}
	}
}

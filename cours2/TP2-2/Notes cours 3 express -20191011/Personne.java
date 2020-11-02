package Cours3NotesExpress;


public class Personne {
	// attribut correspondant au rôle que joue le compte dans l'association
	private CompteBancaire compte; 
	// attributs issus du compartiment "attribut" de la classe UML
	private String nom;
	private String adresse;
	
	// construction des objets
	// choix : une personne est créée sans compte bancaire
	// elle peut ne pas en avoir
	// elle peut en changer
	
	public Personne(String nom, String adresse) {
		this.nom = nom; this.adresse = adresse;
	}

	// accesseurs
	// choix : une personne peut changer de nom, d'adresse et de 
	// compte bancaire
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public CompteBancaire getCompte() {
		return compte;
	}

	public void setCompte(CompteBancaire compte) {
		this.compte = compte;
	}
	
	// Répartition du calcul
	// Etude du problème avec la méthode toString
	//
	// version V1
	// pas de répartition du calcul
	// la classe Personne est maîtresse de tout
	
	public String toStringV1() {
		String res = "nom "+this.nom+" adresse "+this.adresse;
		if (this.compte != null)
			{ res = res+" num compte = "+this.compte.getNumero()
					+" solde = "+this.compte.getSolde();
			}
		else { res += " pas de compte associé"; }
		return res;
	}
	
	// version V2 (à préférer)
	// prépartition du calcul
	// chaque classe est responsable de ses attributs
	
	public String toString() {
		String res = "nom "+this.nom+" adresse "+this.adresse;
		if (this.compte != null)
			{ 
				// la classe Personne délègue à la classe
				// Comptebancaire la responsabilité de
			 	// présenter ses attributs dans une chaîne de
				// caractères sous le format qu'elle veut
				res = res+this.compte.toString();
			}
		else { res += " pas de compte associé"; }
		return res;
	}
}

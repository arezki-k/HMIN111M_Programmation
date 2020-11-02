package Cours3NotesExpress;

// 
// Dans ce cours, nous étudions une association de type 1-1
// où un objet d'une classe est connecté avec au plus un objet
// d'une autre classe.
// Ici, un compte bancaire est associé à une personne qui joue le rôle de client
// tandis qu'une personne peut avoir un compte bancaire (au plus un pour simplifier)
// Cela se représente par le schéma UML qui suit.
//
//  -------------------                          --------------------
// | CompteBancaire    |0..1                  1 |   Personne         |
// | ------------------|------------------------|--------------------|
// | - numero : String |compte            client| - nom :String      |
// | - solde : double  |                        | - adresse : String |
//  -------------------                          --------------------
//
// Dans les parties structurelles des classes (attributs), cela va faire apparaître
// deux attributs qui représentent les deux rôles de l'association.
// Dans les parties comportementales (les méthodes), cela va nous faire 
// réfléchir à la distribution du calcul entre les deux classes
// Reportez-vous aux classes CompteBancaire et Personne pour ces aspects.
//
// Dans le main ci-dessous, on voit les créations d'objets et les appels
// de méthodes correspondants

public class MainCompteBancaireEtClient {
	
	public static void main(String[] args) {
		
		// On crée tout d'abord une personne (sans compte bancaire)
		
		Personne p = new Personne("Hajer", "Cork, Irlande");
		
		// On peut créer un compte associé à la personne
		
		CompteBancaire cbh = new CompteBancaire("2013rst", p, 4000);
		
		// cela nous donne la configuration suivante
		// avec les deux objets connectés
		
// 		 ___	|----------------|cbh.client       |---------------|p.compte   __        
// 	cbh	|  |    |                | <<-------------------           |          |  |
//      | .---->|      -------------------------->>|               |<-----------.| p
// 		|__|	|----------------|                 |---------------|          |__|
// 				|  "2013rst"     |cbh.numero       |   "Hajer"     |p.nom      
// 				|----------------|                 |---------------|
// 				|      4000      |cbh.solde        |"Cork, Irlande"|p.adresse 
// 				|----------------|                 |---------------|
	
		System.out.println(p);
		System.out.println(p.toStringV1());
		
		// Test des méthodes pour comprendre le passage par valeur
		
		double v = 100;
		System.out.println(v);
		cbh.augmenteDe10pourCents(v);
		System.out.println(v); // v est inchangé
		
		Personne p2 = new Personne("Zeina","Nice, France");
		CompteBancaire cbz = new CompteBancaire("2010soa", p2, 4000);
		System.out.println(p);	
		System.out.println(p2);	
		p2.getCompte().virement(1000, p.getCompte());
		System.out.println(p);	
		System.out.println(p2); // les soldes des comptes sont changés
		// un schéma complet de la situation est présenté en cours
	}
}

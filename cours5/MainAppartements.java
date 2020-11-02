/*
 * Partie 3
 */

package Cours5NotesExpress;

import java.util.Scanner;

public class MainAppartements {

	public static void main(String[] args) {
		/*
		 * Nous commençons par la création d'un appartement de luxe
		 * Les constructeurs sont exécutés dans cet ordre :
		 * - celui de Object (la super-classe implicite de toute classe !)
		 * - celui de Appartement
		 * - celui de ApptLuxe
		 */
		
		ApptLuxe a1 = new ApptLuxe("Montpellier",100,5,"internet piscine");
		
		/*
		 * On observe dans la structure de l'instance tous les attributs.
		 */
//		 ___	   
//	a1	|  |    |-------------------|  
//      | .---->| "Montpellier"     | a1.adresse     Attribut hérité
//		|__|	|-------------------| 
//				|  100              | a1.superficie  Attribut hérité
//				|-------------------| 
//				|  5                | a1.nbPieces    Attribut hérité
//	            |-------------------|
//              |"internet piscine" | a1.services    Attribut propre
//				|-------------------| 

		/* 
		 * On peut utiliser le type Appartement 
		 * pour créer une instance de la classe ApptLuxe.
		 * Ceci s'appelle une affectation polymorphe
		 */
		
		Appartement a2 = new ApptLuxe("Paris",50,2,"conciergerie");
		
		/*
		 * Appartement est le type STATIQUE de a2 (type de la variable).
		 * ApptLuxe est le type DYNAMIQUE de a2 (type de l'instance).
		 * 
		 * Le type de la variable doit être une super-classe du type
		 * de l'instance.
		 */
		
//		 ___	   
//	a2	|  |    |-------------------|  
//      | .---->| "Paris"           | a2.adresse     Attribut hérité
//		|__|	|-------------------| 
//				|  50               | a2.superficie  Attribut hérité
//				|-------------------| 
//				|  2                | a2.nbPieces    Attribut hérité
//	            |-------------------|
//              |"conciergerie"     | a2.services    Attribut propre
//				|-------------------| 

		Scanner clav = new Scanner(System.in);
		
		/* 
		 * Pour l'expression qui suit :
		 * - le type statique est utilisé pour vérifier que la méthode
		 * saisie existe pour les appartements
		 * au moment de la compilation (analyse du code source)
		 * - le type dynamique est utilisé par la machine virtuelle
		 * qui exécute le programme pour choisir la méthode
		 * la plus adaptée, ici ce sera celle des appartements de luxe.
		 * 
		 */
		
		a2.saisie(clav);
		
		/*
		 * Et si ... on change l'instance désignée par la variable.
		 * On peut observer qu'il n'y a pas les mêmes attributs.
		 */
		
		a2 = new Appartement("Nantes",150,4);
		
//		 ___	   
//	a2	|  |    |-------------------|  
//      | .---->| "Nantes"          | a2.adresse     Attribut propre
//		|__|	|-------------------| 
//				|  150              | a2.superficie  Attribut propre
//				|-------------------| 
//				|  4                | a2.nbPieces    Attribut propre
//	            |-------------------|

		/* 
		 * Pour l'expression qui suit :
		 * - le type statique est utilisé pour vérifier que la méthode
		 * saisie existe pour les appartements
		 * au moment de la compilation (analyse du code source)
		 * - le type dynamique est utilisé pour choisir la méthode
		 * la plus adaptée, ici ce sera celle des appartements.
		 * 
		 */

		a2.saisie(clav);		
	}
}

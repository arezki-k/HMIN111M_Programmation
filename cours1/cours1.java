/* 1- INTRODUCTION
 * 
 * Objectifs du module
 * - comprendre et appliquer les principes de base de la POO
 * - leur combinaison avec d'autres styles de programmation (impératif, fonctionnel)
 * - langage : Java (répandu, possédant du typage statique et l'un des plus accessibles)
 * 
 * Pourquoi étudier et utiliser la POO ?
 * - un mode de pensée et de conception qui s'est étendu à de multiples domaines
 * (BD, logiciel, prog. système, prog. IHM,  ...)
 * - en se combinant avec d'autres paradigmes : par ex. impératif, fonctionnel, événementiel, logique, distribué
 * - des parentés avec des approches de représentation des connaissances (en particulier les ontologies)
 * - par sa capacité à monter en abstraction (la programmation s'est nourrie au travers du temps
 * de différentes montées en abstraction)
 * 
 * Avantages attendus en termes de construction de logiciel
 * - stabilité des artefacts construits 
 *   (données "abstraites", plus stables que les fonctions)
 * - compréhensibilité des programmes
 *   (représentation des entités d'un domaine)
 * - structuration modulaire favorisant la maintenabilité 
 * - extensibilité des programmes
 * - économie de développement par la réutilisation
 * 
 * Objectifs du premier cours
 * - avant de présenter l'approche par objets (à partir du 2e cours)
 * - organisation des programmes en Java
 * - principes de traduction des algorithmes simples composés de :
 * -- variables, types
 * -- instructions simples
 * -- séquences d'instructions
 */

/* 2 - STRUCTURE GENERALE D'UN PROGRAMME JAVA
 * 
 * Nota : Seuls quelques premiers éléments sont donnés à ce premier cours.
 * 
 * Le fichier se place dans un répertoire dont le nom figure derrière la directive "package".
 * Vous pouvez assimiler dans un premier temps : répertoire = package.
 * les répertoires peuvent contenir des sous-répertoires, sans limitation de niveau d'imbrication.
 * 
 * Dans un texte de programme, on peut placer des commentaires :
 * - ceux que vous observez, entre / * et * / font plusieurs lignes
 * - s'ils ne font qu'une ligne, on peut les introduire par // 
 * 
 */

 // exemple de commentaire sur une seule ligne

package Cours1NotesExpress;

/*
 * Des ressources extérieures pourront être nécessaires
 * dans ce cas on les importe grâce à une directive 
 * qui, dans cet exemple, importe une classe Scanner (représentation du flux d'entrée)
 * que nous utiliserons plus loin.
 * La classe Scanner est rangée dans le répertoire (package) "java" et son sous-répertoire "util"
 * d'où l'écriture "java.util"
 * 
 */

import java.util.Scanner;

/*
 * Le fichier porte le nom d'une structure de haut-niveau appelée une classe
 * ici le fichier s'appelle cours1.java, et la classe aussi.
 * 
 * Les accolades { .. } sont des éléments de structuration 
 * et peuvent se lire 
 *  { = début
 *  } = fin
 * 
 */

public class cours1 {

	/*
	 * Dans ce premier cours, la classe principale contient un premier algorithme 
	 * (appelé méthode dans le langage Java)
	 * appelé "main". 
	 * C'est à la première instruction que commencera l'exécution du programme 
	 * quand on le lancera.
	 * 
	 * Nous reviendrons sur l'entête mais voici brièvement quelques notions :
	 * - "public" indique que la méthode est visible depuis d'autres programmes 
	 *   y compris dans d'autres packages
	 * - "static" sera la marque de certaines méthodes, dites "statiques"
	 * - "void" indique qu'il s'agit d'une procédure (rien n'est retourné)
	 * - "main" est le nom de la méthode (de l'algorithme)
	 * - entre les parenthèse se trouvent les paramètres, il n'y en a qu'un ici
	 *   il est de type "tableau de chaînes (suites) de caractères" et s'appelle "args
	 *   il sert à récupérer des informations qui seraient données lors du lancement du 
	 *   programme (nous n'utiliserons pas cette possibilité au début)
	 * 
	 */
	
	public static void main(String[] args) {

		/*
		 * Dans cet espace on peut mettre les instructions, par exemple,
		 * nous affichons sur la console la suite de caractères "Bonjour"
		 * 
		 * - "System.out" est le nom d'un objet qui représente la console
		 * - "println" est un algorithme qui écrit sur la console
		 * - "("Bonjour")" est sa liste d'arguments
		 * 
		 */
		
		System.out.println("Bonjour"); // affiche Bonjour
		
		/* 3- TYPES 
		 * 
		 * Comme en algorithmique, les programmes Java manipulent des valeurs
		 * qui appartiennent à des types.
		 * 
		 * De manière simplifiée un type est en informatique :
		 * - un ensemble de valeurs (appelées aussi littéraux, valeurs littérales)
		 * - un ensemble d'opérations admises sur ces valeurs
		 * 
		 * En Java, on trouvera des types :
		 * - primitifs, simples
		 * - construits : tableaux, énumérations, classes
		 * 
		 */
		
		/* 3-a QUELQUES TYPES PRIMITIFS POUR COMMENCER
		 * 
		 */
		
		// Entier : int
		// Ecriture des valeurs littérales : 2    3    12    -2    -3    -12
		// Principales opérations : + - * / % < <= > >= == !=
		// Quelques expressions
		
		System.out.println(2); // affiche 2
		System.out.println(-2); // affiche -2
		System.out.println(2+4); // affiche 6
		System.out.println(2 == 4);	// affiche false (voir ci-dessous !)
		
		// Booléen : boolean
		// Ecriture des valeurs littérales : true false
		// Principales opérations : ! && & | ||  == != 
		// Utilisez plutôt && (et) et || (ou) - elles n'évaluent que ce qu'il faut pour conclure
		// Quelques expressions
				
		System.out.println(true); // affiche true
		System.out.println(!true); // affiche false
		System.out.println(false && true); // affiche false
		System.out.println(false || true); // affiche true
		System.out.println(2 >=4 && 2 >= 1); // affiche false

		// Réel : double
		// Ecriture des valeurs littérales : 2   -2    2.01   2.01E-3  -2.01E+3
		// Principales opérations : + - * / < <= > >= == !=
		// Quelques expressions

		System.out.println(2.01); // affiche 2.01
		System.out.println(2.01E-3); // affiche 0.00201
		System.out.println(-2.01E+3); // affiche -2010.0

		// Caractère : char
		// Ecriture des valeurs littérales : 'a' 'z' '\t'  '\n'
		// Principales opérations : + < <= > >= == !=
		// Quelques expressions : 

		System.out.println('a'); // affiche 
		System.out.println('2'); // affiche 
		System.out.println(""+'a'+'2'); // affiche a2
		System.out.println('a'+'2'); // affiche 147 (code ascii de 'a' + code ascii de '2')
		System.out.println('a'<'2'); // affiche false (rang dans les codes ascii)
		System.out.println('A'<'a'); // affiche true (rang dans les codes ascii)

		/* 3-b LE TYPE CONSTRUIT "chaîne de caractères"
		 * 
		 * Chaîne de caractères : String
		 * Ecriture des valeurs littérales : "abricot" "orange" "Ligne1 \n Ligne2"
		 * Principales opérations : + equals compareTo charAt
		 * Quelques expressions, pour certaines la syntaxe sera clarifiée lorsque
		 * nous développerons la programmation par objets en Java
		 * 
		 */
		
		System.out.println("abricot"); // affiche abricot
		System.out.println("abricot"+"ier"); // affiche abricotier	
		System.out.println("abricot"+'s'); // affiche abricots
		System.out.println("Ligne1 \n Ligne2"); // affiche 	
		//                                              Ligne1 
		//                                               Ligne2
		System.out.println("\tLigne décalée"); // affiche 	
		//                                               			Ligne décalée	
		System.out.println("abricot".compareTo("Abricot")>0); // affiche true
		System.out.println("abricot".compareTo("orange")>0); // affiche false
		System.out.println("abricot".equals("abricot")); // affiche	true
		
		// 5- DECLARER UNE VARIABLE
		// <Type> <nomVariable>;
		// comprenez pour le moment une variable comme une petite boîte
		// dont le nom est le nom de la variable
		// son format est proportionné au format du type de la variable
		
		int i;
		double d;
		String s;
		
		// 6- AFFECTER UNE VALEUR A UNE VARIABLE
		// on utilise le symbole =
		// attention aux étourderies consistant à le confondre avec la comparaison ==
		
		// comprendre que i est une petite boîte dans laquelle on peut mettre un entier
		
		i = 4;
		
		// mais pas un booléen	
		// i= true; --- provoque une erreur
		
		d = 3.7E+1;		
		s = "fraises";
		
		// on peut combiner ce que l'on a vu
		
		i = i+2 ; // utilise le contenu de i (4), lui ajoute 2 et remet le tout dans i
		// i vaut 6 maintenant
		System.out.print("i = "+i);
		
		// 7- AFFICHAGE D'UNE EXPRESSION
		
		// Sans passer à la ligne
		
		System.out.print(s+" à la chantilly - ");
		
		// En passant à la ligne
		
		System.out.println("charlotte aux "+s);	
		
		/* 8- SAISIE D'UNE VALEUR
		* Elle va nous demander plus d'efforts et l'ajout d'un nouvel objet représentant
		* le "clavier" ou plus exactement le flux d'entrée du programme
		*/
		
		// On se rappelle que l'on a importé cette ressource tout en haut de notre programme !
		// On développera les détails plus tard
		
		Scanner clavier = new Scanner(System.in);
		
		// on veut saisir une valeur et la mettre dans la boîte (variable) i
		
		i = clavier.nextInt(); // En TP vous verrez la variété des opérations de type "next"
		
		// quand on a fini, on "ferme" la connexion avec le clavier 
		
		// clavier.close(); -- on le met plus tard car on va encore l'utiliser
		
		/* 9- FAIRE UNE AUTRE METHODE (appel dans le main)
		 * 
		 * Dans cette partie, nous appelons une autre méthode, qui a été réalisée
		 * en-dehors du main (voir plus bas).
		 * Ce procédé, que vous avez vu en algorithmique, consistant à séparer en plusieurs
		 * algorithmes les calculs complexes, permet de structurer le programme
		 * et de réutiliser du code.
		 * Pour cela, les méthodes doivent réaliser des algorithmes bien délimités.
		 * 
		 */
		
		System.out.println("Entrer un montant à payer");
		double montantAPayer = clavier.nextDouble();
		
		System.out.println("Entrer un montant de taxe entre 0 et 100");
		double montantTaxe = clavier.nextDouble();
		
		System.out.println("Montant incluant la taxe = " 
				+ calculMontantTTC(montantAPayer,montantTaxe));
		
		// comme on a terminé, on ferme la connexion vers le clavier
		
		clavier.close();
	}
	
	/* 11- FAIRE UNE AUTRE METHODE (réalisation de la méthode)
	 * 
	 * 
	 */
	
	/* METHODE calculMontantTTC
	 * 
	* Méthode (sous-programme) qui va retourner, pour un montant hors taxe (HT) à payer 
	* et un montant de taxe (en pourcentage entre 0 et 100), le montant total à payer (TTC)
	* Entrée : un nombre réel représentant un montant HT (mHT) 
	*          un nombre réel représentant une taxe (tax)
	* Résultat : le montant incluant la taxe
	* Méthode : calculer la formule mHT * (1 + tax/100)
	* 
	*/


	public static double calculMontantTTC(double mHT, double tax) {
		return mHT * (1 + tax/100);
	}

}



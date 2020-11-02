package tp1_2019;

import java.util.Scanner;

public class MainTP1 {


	/********************** Partie méthodes *************************/

		/* méthode réalisant une conversion degrés Celsius vers degrés Farenheit
		 Entrée : un nombre réel tempC passé en paramètre
		 tempC représente une temperature exprimée en degrés Celsius
		 Résultat : un nombre réel résultat de la conversion en degrés Farenheit
		 Méthode : calcul de tempC * 1,8 + 32.  */
	
		public static double celsius2Farenheit(double tempC) {
			return tempC * 1.8 + 32;	
		}
	
	
	
	
		/* méthode réalisant la conversion d'une durée en secondes en une chaîne
		 de caractères sous la forme ..H ..Mn ..Sec
		 Entrée : un nombre entier sec passé en paramètre
		 sec représente un nombre de secondes
		 Résultat : une chaîne de caractères sous la forme ..H ..Mn ..Sec
		 Méthode : (... à compléter ...) */
	
		
		public static String secondes2ChaineHMnSec(int sec) {
		int HH, MN,r, s;
		HH=sec/3600;
		r=sec%3600;
		MN=r/60;
		s=r%60;
			return HH + "h"+ MN + "mn" + s +"secondes"; // instruction à modifier
		}
	

	/* Ci-dessous écrivez le code des autres méthodes dont la signature vous est donnée */
	
	
		//moyenne(double n1, double n2, double n3) : double
	public static double moyenne(double n1, double n2, double n3){
		return (n1+n2+n3)/3;
	}
	
	
		//moyennePonderee(double n1, double n2, double n3, double c1, double c2, double c3) : double
	public static double moyennePonderee(double n1, double n2, double n3,double c1,double c2,double c3) {
		return (n1*c1+n2*c2+n3*c3)/(c1+c2+c3);
	}
	
	
		//carteVermeil(int a, char g) : boolean
	public static boolean carteVermeil (int a, char g){
		return a>59 && g=='F' || a >64 && g=='M';
	}
	
	
	
		//conjugueFuturPremierGroupe(String inf) : String
	public static String FuturPremierGroupe(String inf) {
		return "je "+ inf +"ai    " + "tu "+ inf +"as     " +"il/elle "+ inf + "a    " + "nous "+ inf +"ons     "+ "vous "+ inf +"ez     "+ "ils/elles  "+ inf+"ont";
				
	}
	
	
	
		
	
	/************************Partie Main ************************/
	
	/* Cette méthode main est la méthode principale
	Le programme commence à s'exécuter à partir de là
	et appelle des sous-programmes */
	
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* Test de la conversion Celsius vers Farenheit */
		 
		 	System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 	// Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 	System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 	// Cas 2 : sur le même modèle, donner le code permettant de calculer la température d'ébullition de l'eau
		 	System.out.println("la température d'ébulition de l'eau vaut "+
					 celsius2Farenheit(100)+" en degrés Farenheit");
			 
		 
		 /* Ci-dessous vous appelerez la méthode durée avec les valeurs suivantes :*/
		 	
		 	 System.out.println("\n**** Test de la conversion Secondes vers ..H ..Mn ..Sec ****");
			 
			 // Cas 1 : valeur de 7384
			 
		 	System.out.println("la valeur de 7384 secondes en HH:MN:SS est de " + secondes2ChaineHMnSec(7384));
			 // Cas 2 : valeur de 0
			 System.out.println("la valeur de 0 secondes en HH:MN:SS est de " + secondes2ChaineHMnSec(0));
		
			 // Cas 3 : valeur de 7200
			 System.out.println("la valeur de 7200 secondes en HH:MN:SS est de " + secondes2ChaineHMnSec(7200));
		
			 // Cas 4 : valeur de 180
			 System.out.println("la valeur de 180 secondes en HH:MN:SS est de " + secondes2ChaineHMnSec(180));
		
			 // Cas 5 : valeur de 4
		 
			 System.out.println("la valeur de 4 secondes en HH:MN:SS est de " +secondes2ChaineHMnSec(4));
			 // Cas 6 : valeur de -128
			 System.out.println("la valeur de -128 secondes en HH:MN:SS est de " + secondes2ChaineHMnSec(-128));
			
		
		 	
		 
		 /* Ci-dessous vous appelerez la méthode moyenne avec les valeurs suivantes :*/
		 	 

		 	 System.out.println("**** Test de la moyenne ****");
				
		 	 // cas 1 : moyenne de 0, 0, 0
		 	System.out.println("la moyenne de (0;0;0) est de" +moyenne(0,0,0));

		 	 // cas 2 : moyenne de 10, 10, 10
		 	System.out.println("la moyenne de (10;10;10) est de" +moyenne(10,10,10));

		 	 // cas 3 : moyenne de 20, 20, 20
		 	System.out.println("la moyenne de (20;20;20) est de" +moyenne(20,20,20));

		 	 // cas 4 : moyenne de 12, 14, 16
		 	System.out.println("la moyenne de (12;14;16) est de" +moyenne(12,14,16));

		 	 // cas 5 : moyenne de 7, 12, 8
		 	System.out.println("la moyenne de (7;12;8) est de" +moyenne(7,12,8));
		 	 
		 	 
 
		 /* Ci-dessous vous appelerez la méthode moyennePonderee avec les valeurs suivantes :*/
		 	
		 	 System.out.println("**** Test de la moyenne ponderee ****");
			
		 	 // cas 1 : moyenne de 0, 0, 0 avec 20, 20, 60
		 	System.out.println("la moyenne ponderee est de " + moyennePonderee(0,0,0,20,20,60));


		 	 // cas 2 : moyenne de 10, 10, 10 avec 20, 20, 60
		 	System.out.println("la moyenne ponderee est de " + moyennePonderee(10,10,10,20,20,60));


		 	 // cas 3 : moyenne de 20, 20, 20 avec 20, 20, 60

		 	System.out.println("la moyenne ponderee est de " + moyennePonderee(20,20,20,20,20,60));

		 	 // cas 4 : moyenne de 12, 14, 16 avec 20, 20, 60

		 	System.out.println("la moyenne ponderee est de " + moyennePonderee(12,14,16,20,20,60));

		 	 // cas 5 : moyenne de 12, 14, 16 avec 30, 30, 20

		 	System.out.println("la moyenne ponderee est de " + moyennePonderee(12,14,16,30,30,20));

		 	 // cas 6 : moyenne de 7, 12, 8 avec 20, 20, 60
		 	System.out.println("la moyenne ponderee est de " + moyennePonderee(7,12,8,20,20,60));

		 	 
 
		 /* Ci-dessous vous appelerez la méthode carteVermeil avec les valeurs suivantes :*/
		 	 
		 	System.out.println("**** Test de la carte Vermeil ****");

			// Cas 1 : femme de 40 ans
			System.out.println("vos droit à la carte vermeil: "+ carteVermeil(40, 'F'));
		 	
		 	
			// Cas 2 : homme de 40 ans
			System.out.println("vos droit à la carte vermeil: "+ carteVermeil(40, 'M'));
		 	
		 	
			// Cas 3 : femme de 60 ans
			System.out.println("vos droit à la carte vermeil: "+ carteVermeil(60, 'F'));

		 	
			// Cas 4 : homme de 60 ans	
			System.out.println("vos droit à la carte vermeil: "+ carteVermeil(60, 'M'));

		 	
			// Cas 5 : femme de 66 ans
			System.out.println("vos droit à la carte vermeil: "+ carteVermeil(66, 'F'));

		 	
			// Cas 6 : homme de 66 ans
			System.out.println("vos droit à la carte vermeil: "+ carteVermeil(66, 'M'));
		 
		 
		 	
		/* Ci-dessous vous appelerez la méthode conjugueFuturPremierGroupe avec les valeurs suivantes :*/
		 	System.out.println("**** Test de conjugueFuturPremierGroupe ****");	
			
			// Cas 1 : chanter
			
		 	System.out.println("la conjugaison du verbe chanter au future simple est: "+ FuturPremierGroupe("chanter"));
		 
		 	
		 	
			// Cas 2 : travailler
		 	System.out.println("la conjugaison du verbe travailler au future simple est: "+ FuturPremierGroupe("travailler"));

		 	
		
	
	
	
	/************************ Utilisation du scanner pour entrer les valeurs ************************/ 
	 
	 
	/* On crée un Scanner pour tout le programme. Il représente le flux de ce qui est saisi au clavier 
	Instruction à décommenter pour pouvoir l'utiliser */
	
	 Scanner sc = new Scanner(System.in);
		 	
	// test de la complétion sémantique à faire ci-dessous
		 	
		 	
 
	/* Test des précédentes méthodes en demandant à l'utilisateur de saisir une valeur au clavier */
	 
	//Conversion Celsius2Farenheit (Instructions ci-dessous à décommenter pour exemple)
	 System.out.println("**** Test TempC en TempF ****");
	 System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius");
	 
	 double tempCelsius = sc.nextDouble();
	 
	 System.out.println(tempCelsius+" degrés celsius valent "+ celsius2Farenheit(tempCelsius)+" en degrés Farenheit");

	 //secondes2ChaineHMSec (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	 System.out.println("**** Test Secondes2HH:MN:Sec ****");
	 System.out.println("Veuillez entrer un nombre entier représentant le temps en secondes");
	 
	 int TempsSec = sc.nextInt();
	 System.out.println(TempsSec+" secondes valent  "+ secondes2ChaineHMnSec(TempsSec) +" en HH:MN:Se");
	 System.out.println("merci");

	 
	 // Moyenne (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	 System.out.println("**** Test de la moyenne ****");
	 System.out.println("Veuillez entrer vos trois notes SVP ");
	 double note1 = sc.nextDouble ();
	 double note2 = sc.nextDouble ();
	 double note3 = sc.nextDouble ();
	 System.out.println("votre moyenne est de "+ moyenne(note1,note2,note3));
	 
	 System.out.println("**** Test de la moyenne ponderee ****");	
	// Moyenne pondérée (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	 System.out.println("Veuillez entrer vos trois notes SVP ");
	 double not1 = sc.nextDouble ();
	 double not2 = sc.nextDouble ();
	 double not3 = sc.nextDouble ();
	 System.out.println("Veuillez entrer vos coefficients SVP ");
	 double cof1 = sc.nextDouble ();
	 double cof2 = sc.nextDouble ();
	 double cof3 = sc.nextDouble ();
	 System.out.println("votre moyenne est de "+ moyennePonderee(not1,not2,not3,cof1,cof2,cof3));
	 
	 
	
	// Carte Vermeil (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	 System.out.println("**** Test de la carte Vermeil ****");
	 System.out.println("veuillez entrez votre age");
	 int age = sc.nextInt ();
	 System.out.println("veuillez entrez votre sexe: M pour masculin et F pour feminin SVP");
	 char sexe = sc.next().charAt(0);
	 System.out.println("vos droit à la carte vermeil: "+ carteVermeil(age, sexe));
	 
			 
	
	// Conjugaison (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	 System.out.println("**** Test de la conjugaison futur simple ****");
	 System.out.println("veuillez entrez un verbe du premier groupe svp");
	 String v = sc.next();
	 System.out.println("la conjugaison du verbe"+v+" au future simple est: "+ FuturPremierGroupe(v));
	 System.out.println("merci");
	}
	
	
}	
	

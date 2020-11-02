package tp1_2019;


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
			// partie à remplir
			return ""; // instruction à modifier
		}
	

	/* Ci-dessous écrivez le code des autres méthodes dont la signature vous est donnée */
	
	
		//moyenne(double n1, double n2, double n3) : double
	
	
	
		//moyennePonderee(double n1, double n2, double n3, double c1, double c2, double c3) : double
	
	
	
		//carteVermeil(int a, char g) : boolean
	
	
	
	
		//conjugueFuturPremierGroupe(String inf) : String
	
	
	
	
		
	
	/************************Partie Main ************************/
	
	/* Cette méthode main est la méthode principale
	Le programme commence à s'exécuter à partir de là
	et appelle des sous-programmes */
	
	
	public static void main(String[] args) {

		/* Test de la conversion Celsius vers Farenheit */
		 
		 	System.out.println("**** Test de la conversion Celsius vers Farenheit ****");
		 
		 	// Cas 1 : valeur de température ordinaire en été à Montpellier
		 
		 	System.out.println("En été à Montpellier : 35 degrés celsius valent "+
				 celsius2Farenheit(35)+" en degrés Farenheit");
		
		 	// Cas 2 : sur le même modèle, donner le code permettant de calculer la température d'ébullition de l'eau
		 
			 
		 
		 /* Ci-dessous vous appelerez la méthode durée avec les valeurs suivantes :*/
		 	
		 	 System.out.println("\n**** Test de la conversion Secondes vers ..H ..Mn ..Sec ****");
			 
			 // Cas 1 : valeur de 7384
			 
			
			 // Cas 2 : valeur de 0
			 
		
			 // Cas 3 : valeur de 7200
			 
		
			 // Cas 4 : valeur de 180
			 
		
			 // Cas 5 : valeur de 4
		 
			 
			 // Cas 6 : valeur de -128
			 
			
		
		 	
		 
		 /* Ci-dessous vous appelerez la méthode moyenne avec les valeurs suivantes :*/
		 	 

		 	 System.out.println("**** Test de la moyenne ****");
				
		 	 // cas 1 : moyenne de 0, 0, 0


		 	 // cas 2 : moyenne de 10, 10, 10


		 	 // cas 3 : moyenne de 20, 20, 20


		 	 // cas 4 : moyenne de 12, 14, 16


		 	 // cas 5 : moyenne de 7, 12, 8

		 	 
		 	 
 
		 /* Ci-dessous vous appelerez la méthode moyennePonderee avec les valeurs suivantes :*/
		 	
		 	 System.out.println("**** Test de la moyenne ponderee ****");
			
		 	 // cas 1 : moyenne de 0, 0, 0 avec 20, 20, 60



		 	 // cas 2 : moyenne de 10, 10, 10 avec 20, 20, 60



		 	 // cas 3 : moyenne de 20, 20, 20 avec 20, 20, 60



		 	 // cas 4 : moyenne de 12, 14, 16 avec 20, 20, 60



		 	 // cas 5 : moyenne de 12, 14, 16 avec 30, 30, 20



		 	 // cas 6 : moyenne de 7, 12, 8 avec 20, 20, 60
			

		 	 
 
		 /* Ci-dessous vous appelerez la méthode carteVermeil avec les valeurs suivantes :*/
		 	 
		 	System.out.println("**** Test de la carte Vermeil ****");

			// Cas 1 : femme de 40 ans
			
		 	
		 	
			// Cas 2 : homme de 40 ans
			
		 	
		 	
			// Cas 3 : femme de 60 ans
		

		 	
			// Cas 4 : homme de 60 ans	
		

		 	
			// Cas 5 : femme de 66 ans
			

		 	
			// Cas 6 : homme de 66 ans
			
		 
		 
		 	
		/* Ci-dessous vous appelerez la méthode conjugueFuturPremierGroupe avec les valeurs suivantes :*/
		 	System.out.println("**** Test de conjugueFuturPremierGroupe ****");	
			
			// Cas 1 : chanter
			

		 	
			// Cas 2 : travailler
			

		 	
		
	
	
	
	/************************ Utilisation du scanner pour entrer les valeurs ************************/ 
	 
	 
	/* On crée un Scanner pour tout le programme. Il représente le flux de ce qui est saisi au clavier 
	Instruction à décommenter pour pouvoir l'utiliser */
	
	 //Scanner sc = new Scanner(System.in);
		 	
	// test de la complétion sémantique à faire ci-dessous
		 	
		 	
		 	
 
	/* Test des précédentes méthodes en demandant à l'utilisateur de saisir une valeur au clavier */
	 
	 // Conversion Celsius2Farenheit (Instructions ci-dessous à décommenter pour exemple)
	 //System.out.println("Veuillez entrer un nombre réel représentant une température en degrés Celsius");
	 
	 //double tempCelsius = sc.nextDouble();
	 
	 //System.out.println(tempCelsius+" degrés celsius valent "+ celsius2Farenheit(tempCelsius)+" en degrés Farenheit");

	 
	 
	 // secondes2ChaineHMSec (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	

	 
	 // Moyenne (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
		
		
	// Moyenne pondérée (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	
	
	// Carte Vermeil (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
		
	
	// Conjugaison (Ecrire le code source ci-dessous en vous inspirant de ce qui a été fait pour la conversion de Celsius a Farenheit)
	
	
	
	}
	
	
}	
	

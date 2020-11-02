package tp2_2019;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class MainEtudiant {

	public static void main(String[] args) throws IOException {
		 
		 /***********************Constructeurs *******************************************/
		
			//Création d'un nouvel étudiant dont le nom est paul  
			Etudiant etud1 = new Etudiant("Paul");
		
			//En vous inspirant de l'exemple, écrire ci-dessous le code pour créer les autres étudiants  
			Etudiant etud2 = new Etudiant("jean", 24,1,2);
			Etudiant etud3 = new Etudiant("Abdoulkhader", 23,2,2);
			Etudiant etud4 = new Etudiant("astrid", 26,1,3);
			Etudiant etud5 = new Etudiant("Poalo", 27,1,3);
			Etudiant etud6 = new Etudiant ("Zoe", 26, 12, 14, 17,1,1);
			
			
		
			
		
		/***********************************Accesseurs*****************************************/
		
		/* Affichage des informations grâce à l'accesseur get */
		
			//Affichage du nom de etud1
			System.out.println("Le nom de l'étudiant1 est: " +etud1.getNom());
			
			
			//Ecrire ci-dessous les informations des autres étudiants (toutes les informations connues par étudiant)
			System.out.println("Le nom de l'étudiant2 est: " +etud2.getNom());
			System.out.println("L'age de l'étudiant2 est: " +etud2.getAge());
			System.out.println("Le nom de l'étudiant3 est: " +etud3.getNom());
			System.out.println("L'age de l'étudiant3 est: " +etud3.getAge());
			System.out.println("Le nom de l'étudiant4 est: " +etud4.getNom());
			System.out.println("L'age de l'étudiant4 est: " +etud4.getAge());
			System.out.println("Le nom de l'étudiant5 est: " +etud5.getNom());
			System.out.println("L'age de l'étudiant5 est: " +etud5.getAge());
			System.out.println("Le nom de l'étudiant6 est: " +etud6.getNom());
			System.out.println("L'age de l'étudiant6 est: " +etud6.getAge());
			System.out.println("Les notes de l'Etudiant 6 sont " +etud6.getNoteProg()+" en Programmation, "+etud6.getNoteSyst()+" en Systemes et de  "+ etud6.getNoteStage()+ " en satge");
		
		
		
		/* Modification d'information grâce à l'accesseur set */
		
			// Modification du nom de etud1 
			etud1.setNom("Paul-Henri");
			etud1.setAge(24);
			System.out.println("Le nouveau nom de l'étudiant 1 est: "+etud1.getNom());
			
			
			// Ecrire ci-dessous le code pour modifier l'âge de Jean
			
			etud2.setAge(27);
			System.out.println("Le nouvel age de l'étudiant 2 est: "+etud2.getAge());
			
			
			//Ecrire ci-dessous le code pour modifier la note de programmation de Zoe
	
			etud6.setNoteProg(15);
			etud6.setNoteSyst(14);
			etud6.setNoteStage(17);
			//Verification:
			System.out.println("la nouvelle note de Zoé en Programmation est de: "+etud6.getNoteProg());
			
			
			
			// Ecrire ci-dessous le code pour ajouter les notes des autres étudiants
			//notes de Paul-Henri
			etud1.setNoteProg(16);
			etud1.setNoteSyst(15);
			etud1.setNoteStage(14);
			System.out.println("les notes de Paul-Henri sont: "+etud1.getNoteProg()+" en Programmation, de "+etud1.getNoteSyst()+" en systemes et de "+etud1.getNoteStage()+" en stage");
			
			//Verification:
			
			
			//notes de jean
			etud2.setNoteProg(8);
			etud2.setNoteSyst(7);
			etud2.setNoteStage(11);
			//Verification:
			System.out.println("les notes de Jean sont: "+etud2.getNoteProg()+" en Programmation, de "+etud2.getNoteSyst()+" en systemes et de "+etud2.getNoteStage()+" en stage");
			
			//Notes de abdelkhader
			etud3.setNoteProg(10);
			etud3.setNoteSyst(14);
			etud3.setNoteStage(11);
			//Verification:
			System.out.println("les notes d'Abdelkhader sont: "+etud3.getNoteProg()+" en Programmation, de "+etud3.getNoteSyst()+" en systemes et de "+etud3.getNoteStage()+" en stage");
			
			
			//Notes de Astrid
			etud4.setNoteProg(12);
			etud4.setNoteSyst(5);
			etud4.setNoteStage(18);
			//Verification:
			System.out.println("les notes de Astrid sont: "+etud4.getNoteProg()+" en Programmation, de "+etud4.getNoteSyst()+" en systemes et de "+etud4.getNoteStage()+" en stage");
			
			//Notes de Paolo
			etud5.setNoteProg(2);
			etud5.setNoteSyst(10);
			etud5.setNoteStage(11);
			
			etud6.setNoteProg(15);
			//Verification:
			System.out.println("les notes de Zoe sont: "+etud6.getNoteProg()+" en Programmation, de "+etud6.getNoteSyst()+" en systemes et de "+etud6.getNoteStage()+" en stage");
			
			

		/* Verification que les modifications ont bien été prises en compte */
		
			//Pour chaque étudiant modifié, écrire ci-dessous le code permettant d'afficher les nouvelles informations, grâce à l'accesseur get
		
		
			
		
		
		/*************************** Les méthodes ************************************/
		
		
		/* Utilisation de la méthode toString  */
			
			//Utilisation de la méthode toString pour afficher l'étudiant etud1
		
			System.out.println("Informations concernant l'étudiant 1: " + etud1);
			
			//Faire la même chose pour tous les étudiants et vérifier que les données sont correctes
			System.out.println("Informations concernant l'étudiant 2: " + etud2);
			System.out.println("Informations concernant l'étudiant 3: " + etud3);
			System.out.println("Informations concernant l'étudiant 4: " + etud4);
			System.out.println("Informations concernant l'étudiant 5: " + etud5);
			System.out.println("Informations concernant l'étudiant 6: " + etud6);
		
			// Créer un nouvel étudiant etud8 grace au constructeur Inscription	
			Etudiant etud8=new Etudiant("Pierre",24,1,2);		
			System.out.println(etud8.toString());
		
		/* Utilisation de la méthode saisie */
			Scanner sc = new Scanner(System.in);
			
			// Créer un nouvel étudiant etud7 grace au constructeur vide
		Etudiant etud7= new Etudiant();
	//creer nouvel etudiant avec inscription et saisie
		Etudiant etud9=new Etudiant();
	
			
		
			//Utiliser la méthode saisie définie dans la classe Etudiant sur l'étudiant etud7 (vous choisissez les valeurs)
		
		//etud7.saisie(sc);
		//etud9.saisie(sc);
	
			//Vérifier grâce à la méthode toString que les informations concernant etud7 ont bien été initialisées
		System.out.println("informations concernant l'étudiant 7:"+etud7);
		System.out.println("informations concernant l'étudiant 9:"+etud9);
			
			
		
		/* Utilisation de la méthode moyenne */
			
			// Calcul et affichage de la moyenne de Paul-Henri. A décommenter pour exemple
			
				System.out.println("la moyenne de Paul-Henri est: " + etud1.moyenne());
			
			
			//Ecrire ci dessous le code pour calculer et afficher la moyenne des autres étudiants
				System.out.println("la moyenne de Jean est: " + etud2.moyenne());
				System.out.println("la moyenne de Abdelekhader est: " + etud3.moyenne());
				System.out.println("la moyenne de Astrid est: " + etud4.moyenne());
				System.out.println("la moyenne de Paolo est: " + etud5.moyenne());
				System.out.println("la moyenne de Zoe est: " + etud6.moyenne());
				System.out.println("la moyenne de "+etud7.getNom()+" est: " + etud7.moyenne());
				System.out.println("la moyenne de "+etud8.getNom()+" est: " + etud8.moyenne());
				System.out.println("la moyenne de "+etud9.getNom()+" est: " + etud9.moyenne());
			
			
			
		/* Utilisation de la méthode mention pour chaque étudiant. Code à écrire ci-dessous */	
				System.out.println("la mention de Paul-Henri est: " + etud1.mention());
				System.out.println("la mention de Jean est: " + etud2.mention());
				System.out.println("la mention de Abdelekhader est: " + etud3.mention());
				System.out.println("la mention de Astrid est : " + etud4.mention());
				System.out.println("la mention de Paolo est: " + etud5.mention());
				System.out.println("la mention de Zoe est: " + etud6.mention());
				System.out.println("la mention de "+etud7.getNom()+ " est: " + etud7.mention());
				System.out.println("la mention de "+etud8.getNom()+ " est: " + etud8.mention());
				System.out.println("la mention de "+etud9.getNom()+ " est: " + etud9.mention());
			
		
		
		/* Utilisation de la méthode ligneResultat pour chaque étudiant. Code à écrire ci-dessous */
				System.out.println(etud1.ligneResultat());
				System.out.println(etud2.ligneResultat());
				System.out.println(etud3.ligneResultat());
				System.out.println(etud4.ligneResultat());
				System.out.println(etud5.ligneResultat());
				System.out.println(etud6.ligneResultat());
				System.out.println(etud7.ligneResultat());
				System.out.println(etud8.ligneResultat());
				System.out.println(etud9.ligneResultat());
				
				
				
		/*teste de creation etudiant avec code insc et code pays erronés*/
				/*teste de creation etudiant avec code insc et code pays erronés*/
			/*	Etudiant etud11=new Etudiant("moouhou",27,22.0,16.0,18.0,1,4);
				System.out.println(etud11);	
				Etudiant etud10=new Etudiant("sof",27,15.0,16.0,18.0,4,4);
				System.out.println(etud10);	
				*/
				
		/*test méthodes sur promotion*/		
		promotion promo1=new promotion(2019);	
				
		promo1.inscrire(etud1);
		promo1.inscrire(etud2);
		promo1.inscrire(etud3);
		promo1.inscrire(etud4);
		promo1.inscrire(etud5);
		promo1.inscrire(etud6);
		//mise en commentaire des etudiants dependants de la saisie
		//promo1.inscrire(etud7);
		//promo1.inscrire(etud8);
		//promo1.inscrire(etud9);
		//System.out.println("la liste des etudiant de la promotion est:\n "+promo1.afficheEtudiants());
		//System.out.println("le nombre d'étudiants dans la promotion est de : "+promo1.nbEtudiants());
		//System.out.println("l'etudiant recherché est: \n"+promo1.getEtudiant2(3));
		//System.out.println("la moyenne générale de la promotion est: \n"+promo1.moyenneGenerale());
		//promo1.afficheResultats();
		//System.out.println("les résultats des étudiants de la promotion sont:\n"+promo1.afficheResultats());
		System.out.println("la recherche"+promo1.recherche("astrid"));

	}

}

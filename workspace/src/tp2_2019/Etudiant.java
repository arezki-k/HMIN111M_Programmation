package tp2_2019;

import java.util.Scanner;




/*********************************TP 2.1***********************************************/

public class Etudiant {

	
	/****************** Partie attributs ****************************************/
	
	//L'attribut nom de l'étudiant
	private String nom;
	
	// Vous devez insérer ci-dessous les autres attributs (l'age et les 3 notes)
	
	private int age;
	private double noteProg, noteSyst, noteStage;
	private Inscription inscription;
	
	
	
	
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
	public Etudiant(String name, int old){
		this.nom = name;
		this.age = old;
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tout sauf l'age de l'étudiant
	public Etudiant(String name, double noteProg,double noteSyst,double noteStage){
		this.nom = name;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
	}
	
	//Vous devez ci-dessous définir le constructeur qui initialise tous les attributs
	public Etudiant(String name, int old, double noteProg,double noteSyst,double noteStage){
		this.nom = name;
		this.age = old;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
	}
	//nouveau constructeur avec inscription
	public Etudiant(String name, int old, int codeInscription, int codePays){
		this.nom=name;
		this.age=old;
		this.inscription= new Inscription(codeInscription, codePays);
	}
	//nouveau constructeur qui prend en compte tous les attributs
	public Etudiant(String name, int old, double noteProg, double noteSyst, double noteStage,int codeInscription, int codePays){
		this.nom = name;
		this.age = old;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
		/*Inscription inscriptionSet=new Inscription();
		inscriptionSet.setcodeInscription(codeInscription);
		inscriptionSet.setcodePays(codePays);*/
		this.inscription= new Inscription(codeInscription,codePays);
	}
		
	//nouveau constructeur qui prend l'attribut Inscritpion sans code pays et code ins
	public Etudiant(String name, int old, double noteProg, double noteSyst, double noteStage,Inscription inscription){
		this.nom = name;
		this.age = old;
		this.setNoteProg(noteProg);
		this.setNoteSyst(noteSyst);
		this.setNoteStage(noteStage);
		this.inscription=inscription;
		
	}
		
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
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int old){
		this.age = old;
	}
	
	//Accesseurs des notes
	//get()
	
	public double getNoteProg() {
		return this.noteProg;
	}
	public double getNoteSyst() {
		return this.noteSyst;
	}
	public double getNoteStage() {
		return this.noteStage;
	}
	public Inscription getinscription(){
		return this.inscription;
	}
	
	//set()
	Scanner lectureClavier = new Scanner(System.in);
	public void setNoteProg(double noteProg) {
		if (noteProg<0){
			System.out.println("veuillez saisir une valeure positive svp");
			this.setNoteProg(lectureClavier.nextDouble());
		}
		else if(noteProg>20){
			System.out.print("veuillez saisir une valeure inferieur a 20");
			this.setNoteProg(lectureClavier.nextDouble());
		}
		else{
			this.noteProg=noteProg;
		}
	}
	public void setNoteSyst(double noteSyst) {
		if (noteSyst<0){
			System.out.println("veuillez saisir une valeure positive svp");	
			this.setNoteSyst(lectureClavier.nextDouble());
		}
		else if (noteSyst>20)
		{
			System.out.print("veuillez saisir une valeure inferieur a 20");
			this.setNoteSyst(lectureClavier.nextDouble());
		}
		else {
			this.noteSyst = noteSyst;
		}
	}
	
	
	public void setNoteStage(double noteStage) {
		if (noteStage<0){
			System.out.println("veuillez saisir une valeure positive svp");
			this.setNoteStage(lectureClavier.nextDouble());
		}
		else if (noteStage>20){
			System.out.print("veuillez saisir une valeure inferieur a 20");
			this.setNoteStage(lectureClavier.nextDouble());
		}
		else {
			this.noteStage = noteStage;
		}
	}
	public void setinscription(Inscription inscription){
		this.inscription=inscription;
	}
	


	
	
	
	
	
	
	
	
/***********************************************************************************/
	
	
	
	
	
/****************************** Partie méthodes ***************************************/	
	
	
	/* Méthode toString() qui permet d'afficher des informations concernant un étudiant. 
	Méthode à décommenter et à modifier ci-dessous */
		
	
		public String toString() {
			return "le nom de l'etudiant est "+this.getNom()+". l'age de l'etudiant est "+this.getAge()+" ans. Les notes de L'etudiant sont: "+this.getNoteProg()+" en Programmation, "+this.getNoteSyst()+" en Systemes, et "+ this.getNoteStage()+" en stage."+"\n"+"Informations concernant l'inscription: "+this.getinscription();
		}
	
	
	
	
	/* Méthode saisie qui permet à l'utilisateur de saisir les informations des étudiants et de les initialiser. 
	 Méthode à écricodeInscriptionre intégralement en vous inspirant du TP1  */
		
		
		/*methode de saisie*/

		public void saisie(Scanner sc){
			//de mander à l'utilisateur de saisir successivement la valeurs des attributs
			//saisir la valeur
			//mettre la valeur dans l'attribut
			System.out.println("veuillez saisir le nom de l'etudiant svp ");
			this.setNom(sc.next());
			
			System.out.println("veuillez saisir l'age de l'etudiant svp ");
			this.setAge(sc.nextInt());
			System.out.println("veuillez saisir la note en programmation de l'etudiant svp ");
			this.setNoteProg(sc.nextDouble());
			System.out.println("veuillez saisir la note en Systemes de l'etudiant svp ");
			this.setNoteSyst(sc.nextDouble());
			System.out.println("veuillez saisir la note en stage de l'etudiant svp ");
			this.setNoteStage(sc.nextDouble());
			/*
			 *méthode intermidiaire avant de changer les constructeurs avec les set; 
			 *System.out.println("veuillez saisir les informations d'inscrption de l'étudiant svp");
			System.out.println("veuillez saisir le code d'inscription SVP");
			Inscription inscriptionSaisie=new Inscription();
			int codeInscription=sc.nextInt();
			inscriptionSaisie.setcodeInscription(codeInscription);
			System.out.println("veuillez saisir le code Pays svp");
			int codePays=sc.nextInt();
			inscriptionSaisie.setcodePays(codePays);*/
			System.out.println("veuillez saisir les informations d'inscrption de l'étudiant svp");
			System.out.println("veuillez saisir le code d'inscription SVP");
			int codeInscription=sc.nextInt();
			System.out.println("veuillez saisir le code Pays svp");
			int codePays=sc.nextInt();
			Inscription inscription = new Inscription(codeInscription, codePays);
			
			
		}
		
	
	
	
	/* Méthode moyenne à décommenter et à remplir */
	
	
		 public double moyenne(){
		 	return ((this.noteProg+this.noteSyst+this.noteStage)/3);
		 }
	
	
	
	/* Méthode mention à écrire ci-dessous. 
	 Cette méthode utilise la méthode moyenne définie précédemment 
	 et retourne une chaine de caractère qui correspond à la mention de l'étudiant dont les valeurs possibles sont :
	 Ajourné, passable, AB, Bien, TB */
	
		public String mention(){
		double moyenne = this.moyenne();
		String mention;
		mention="non calculé";
		if(moyenne<10.0) {
						mention="ajournée";
		}
		else if(moyenne<=12.0){
						mention="passable";
		}
		else if(moyenne<15.0){
						mention="assez bien";
		}
		else if(moyenne<18.0){
						mention="bien";
		
		}
		else if(moyenne>=18.0){
						mention="excellent";
		}
		return mention;}
		
	
	
	
	
	/* Methode ligneResultat à écrire ci-dessous 
	 * Cette méthode utilise le résultat de moyenne et de mention
	 * et retourne une chaine de caractère précisant :
	 * le nom, la moyenne, la mention, et si l'étudiant est ajourné, la liste des modules obtenus
	 */
	public String ligneResultat(){
		double moyenne;
		String mention,module,programmation,systemes,stage;
		moyenne=this.moyenne();
		mention=this.mention();
		module="année validée";
		programmation=" ";
		systemes=" ";
		stage="  ";
		if (mention=="ajournée"){ 
			module=("la liste des modules validés par "+this.getNom()+" sont:");
				if(this.getNoteProg()>=10){
				programmation=("'Module de Programmation validée'");
				}
				if(this.getNoteSyst()>=10){
					systemes=("'Module de Systemes validée'");
					}
				if(this.getNoteStage()>=10){
					stage=("'Module de Stage validée'");
					}
		}
		return this.getNom()+" a obtenu la moyenne de "+moyenne+", la mention de '"+mention+"', "+module+" "+programmation+" "+systemes+" "+stage;
		}
}
		


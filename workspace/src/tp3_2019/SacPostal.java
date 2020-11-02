package tp3_2019;

import java.util.ArrayList;

public class SacPostal {
	
	/*attributs*/
	private ArrayList<ObjetPostal> liste;
	private final double capacity;
	/*la capacité prend sa valeur une seuele fois ici dans le constructeurs
	 * */
	
	
	/*constructeurs*/
	public SacPostal(){
		this.liste=new ArrayList<>();
		this.capacity=0.5;
	}

	public SacPostal(Double capacity){
		this.liste=new ArrayList<>();
		/*pourquoi ne pas utiliser un accesseurs setCapacity:
		contexte particulier: car un sac une fois crée ne changera plus de capacité
		 de plus si on definit setCapacity() et qu'on l'apelle sur un sac contenant 
		 deja des objets on risque d'avoir des situations incohérentes
		  */
		
		//this.setCapacity(capacity);
		if(capacity>0){
			this.capacity = capacity;
		}
		else{
			System.err.println("capacité non valable, la capacité par defaut sera affecté");
			this.capacity=0.5;
		}
	}
	
	
	/*accesseurs*/
	
	//Get
	public ArrayList<ObjetPostal> getListeObjet(){
		return this.liste;
	}
	public Double getCapacity() {
		return capacity;
	}
	//Set on évite de le créer pour ne pas avoir des situations incohérentes
	
	/*public void setListe(ArrayList<ObjetPostal> liste) {
		this.liste = liste;
	}
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
		
	}*/
	
	/*methodes*/
	public void ajoutObjet(ObjetPostal objet){
		if (this.liste.contains(objet)){
			System.out.println("l'objet est déja contenu dans la sac");
		}
		else if (objet.getVolume()>this.getCapacity()){
			System.out.print("L'objet postal depasse le volume du sac postal");	
		}
		else{
			this.liste.add(objet);
		}
	}
	
	//méthode volume de sac
	public double volumeSac(){
		Double volume = 0.005 ;
		if (this.liste.size()==0){
			System.out.println("la sac est vide");
			return volume;
		}
		else{
			for (ObjetPostal objet: liste){
				volume+=objet.getVolume();
				//volume=volume+objet.getVolume();
			}
			System.out.println("le volume du sac est: ");
		return volume;
		}
		
		//variante avec une autre boucle for
		/*
		 * for (int i=0, i<listeObj().size, i++)
		 * { vol+= listeObj.get(i).getVolume();*/
		//variante avec while:
		/*
		 * int i=0
		 * while(i<listeObj.size()){
		 * vol+=listeObj.get(i);getVolume();
		 * i++;}*/
		
	}
	//méthohde de rembourseement:
	public double remboursementSac(){
		double remboursement=0;
		if (liste.size()==0){
			remboursement = 0;
			System.out.println("le sac est vide, non elilgible au remboursement.");
			return remboursement;
		}
		else{
			for(ObjetPostal objet: liste){
				remboursement+=objet.tarifRemboursement();
			}
			System.out.println("la valeur de remboursement du sac est: ");
			return remboursement;
		}
	}
	//méthode contenu du sac
	public ArrayList<ObjetPostal> contenuSac(){
		System.out.println("la liste des objets postaux contenus dans ce sac sont:");
		
		return this.liste;
		
	}
	//recherche objet postal (premier trouvé) qui z un certain code postal
	public ObjetPostal rechercheCP(int cp){
		for(ObjetPostal objet:liste){
			if (objet.getCodepostal()==cp){
				return objet;
			}
		}
		return null;
	}
	
	
	//retourner une liste d'onj postaux ayant le meme code postale
	public ArrayList<ObjetPostal> memeCP(int cp){
		ArrayList<ObjetPostal> resultat = new ArrayList<ObjetPostal>();
		for (ObjetPostal objet: liste){
			if(objet.getCodepostal()==cp){
				resultat.add(objet);
			}
		}
		return resultat;
		
	}
	//variantes: question du tp: retourner un sac:
	public void ajoute(ObjetPostal objet){
		/*si le volume de o + le volume occupé par les objets dja present dans le sac est inferieur a la capacité 
		 * alors ajouter objet sinon ne pas ajouter objet et signaler une erreur  */
		/*SacPostal sacP = new SacPostal(this.volume());
		 * for (ObjetPostal o:liste){
		 * if(o.getcodePostal.equals(cp){
		 * sacP.ajouteObjet(o);
		 * listeObj.remove(o);
		 * }
		 * }
		 * return sacP;
		 * */
		
	}
	
	
	
	
	
	
	
	
	
	

}

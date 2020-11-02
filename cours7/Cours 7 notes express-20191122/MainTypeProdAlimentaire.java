package Cours7NotesExpress;

public class MainTypeProdAlimentaire {
public static void main(String[] arg) {
	/*
	 * Un attribut static se manipule par une méthode statique
	 * appelée non pas sur un objet mais sur la classe
	 */
	
	TypeProdAlimentaire.setTauxTVA(20.5);
	
	ChariotAlimentaire chariot = new ChariotAlimentaire();
	chariot.getContenu().add(new TypeProdAlimentaire());
	
	// provoque une erreur d'exécution
	//chariot.getContenuI().add(new TypeProdAlimentaire());

	/*
	 * Manipulation de l'énumération
	 */
	
	TypeProdAlimentaire t = new TypeProdAlimentaire();
	System.out.println(t.getFamille());
	t.setFamille(FamilleAliment.valueOf("laitages"));
	System.out.println(t.getFamille());
}
}

package Cours4NotesExpress;

public class MainAgenceImmobiiere {

	public static void main(String[] args) {
		Appartement a1 = new Appartement("Paris", 12, 1, 1975, Classification.studio); 
		Appartement a2 = new Appartement("Montpellier", 50, 2, 1900, Classification.duplex); 
		AgenceImmobiliere ag = new AgenceImmobiliere("Belles-maisons");
		ag.ajoute(a1);
		ag.ajoute(a2);		
		ag.afficheAdresses();
		ag.afficheAdresses0();
		ag.afficheAdresses2();
		ag.afficheAdresses3();
	}

}

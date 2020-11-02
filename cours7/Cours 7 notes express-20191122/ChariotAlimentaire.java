package Cours7NotesExpress;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Dans cette partie, nous nous demandons si un objet peut être constant ?
 */

public class ChariotAlimentaire {
	
	/*
	 * Attributs
	 */
	
	// le chariot appartient à un magasin
	// on pourra changer les attributs du magasin, mais 
	// pas mettre un autre magasin
	
	private final Magasin magasin = new Magasin();
	
	public void pourTester() {
		// ne peut fonctionner
		// magasin = new Magasin();
		
		// mais fonctionne 
		magasin.setNom("Biocoop");
	}

	/*
	 * On peut créer des objets immutables par des techniques
	 * de classe déclarée final et de clonage, nous ne les aborderons pas
	 * Il existe des objets immuables en Java comme les String.
	 */
	
	/*
	 * Et enfin, on peut transformer les ArrayList en immuables
	 * cela nous permettra d'écrire des méthodes get sans risque
	 */

	private ArrayList<TypeProdAlimentaire> contenu = new ArrayList<>();



	// A eviter car on ne contrôlera rien de ce qui sera mis dedans
	
	public ArrayList<TypeProdAlimentaire> getContenu() {
		return contenu;
	}
	
	// A préférer 
	
	public ArrayList<TypeProdAlimentaire> getContenuI() {
		return (ArrayList<TypeProdAlimentaire>) Collections.unmodifiableList(contenu);
	}
}

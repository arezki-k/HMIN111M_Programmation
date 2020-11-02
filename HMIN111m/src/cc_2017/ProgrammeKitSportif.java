package cc_2017;
import java.util.*;

public class ProgrammeKitSportif {
	public static void main(String []args){
		MaterielSport m1 = new MaterielSport("tapis de yoga", 0.2);
		System.out.println(m1);
		MaterielSportEnfant m2 = new MaterielSportEnfant("lunette", 0.1, true , 2, 6);
		System.out.println(m2);
		
		Scanner sc = new Scanner(System.in);
		m2.saisie(sc);
		System.out.println(m2);
		MaterielSportEnfant m3 = new MaterielSportEnfant("lunette2", 0.1, true , 2, 6);
		MaterielSportEnfant m4 = new MaterielSportEnfant("lunette3", 0.14, true , 2, 6);
		MaterielSportEnfant m5 = new MaterielSportEnfant("lunette4", 0.156, true , 2, 6);
		KitSport kit1 = new KitSport("lunette");
		kit1.ajoutMatos(m1);
		kit1.ajoutMatos(m2);
		kit1.ajoutMatos(m3);
		kit1.ajoutMatos(m4);
		kit1.ajoutMatos(m5);
		System.out.println(kit1.calculPoids());
		System.out.println(kit1.poidsInferieur(0.1));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

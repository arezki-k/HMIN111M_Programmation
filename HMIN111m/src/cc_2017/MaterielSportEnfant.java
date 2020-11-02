package cc_2017;
import java.util.*;

public class MaterielSportEnfant extends MaterielSport {
	
	/*partie attributs*/
	private boolean gut;
	private double ageMin;
	private double ageMax;
	private static double poidsMaximum=0.5;
	
	
	public MaterielSportEnfant(String description, double poids, boolean gut, double ageMin, double ageMax) {
		super(description, poids);
		this.gut = gut;
		this.ageMin = ageMin;
		this.ageMax = ageMax;
	}


	public MaterielSportEnfant() {
		// TODO Auto-generated constructor stub
	}


	public boolean isGut() {
		return gut;
	}


	public void setGut(boolean gut) {
		this.gut = gut;
	}


	public double getAgeMin() {
		return ageMin;
	}


	public void setAgeMin(double ageMin) {
		this.ageMin = ageMin;
	}


	public double getAgeMax() {
		return ageMax;
	}


	public void setAgeMax(double ageMax) {
		this.ageMax = ageMax;
	}


	public static double getPoidsMaximum() {
		return poidsMaximum;
	}


	public static void setPoidsMaximum(double poidsMaximum) {
		MaterielSportEnfant.poidsMaximum = poidsMaximum;
	}
	
	/* (non-Javadoc)
	 * @see cc_2017.MaterielSport#setPoids(double)
	 */
	@Override
	
	public void setPoids(double poids){
		if (poids>poidsMaximum){
			System.out.println("poids supérieur au poids max, la valeur par"
					+ "par défaut sera appliqué");
			super.setPoids(poidsMaximum);
		}
		else{
			super.setPoids(poids);
		}
	}
	
	
	//méthode de saisie:
	/* (non-Javadoc)
	 * @see cc_2017.MaterielSport#saisie(java.util.Scanner)
	 */
	@Override
	public void saisie(Scanner Sc){
		super.saisie(Sc);
		System.out.println("veuiller saisir une valeur booleenne pour le gut");
		this.setGut(sc.nextBoolean());
		System.out.println("veuillez saisir un age min");
		this.setAgeMin(sc.nextDouble());
		System.out.println("veuillez saisir un age max");
		this.setAgeMax(sc.nextDouble());
		
	}


	/* (non-Javadoc)
	 * @see cc_2017.MaterielSport#toString()
	 */
	@Override
	
	public String toString() {
		return super.toString() + "MaterielSportEnfant [gut=" + gut + ", ageMin=" + ageMin
				+ ", ageMax=" + ageMax + "]";
	}
	
	
	
	
	
	
	
	
	
	

}

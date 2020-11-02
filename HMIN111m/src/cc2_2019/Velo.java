package cc2_2019;
import java.util.*;
public class Velo {
	private String nom="";
	private double tailleRoue;
	private final double tailleRoueMin=407;
	private final double tailleRoueMaxEnfant=609;
	private final double tailleRoueMax=709;
	
	public Velo(String nom, double tailleRoue) {
		this.setNom(nom);
		this.setTailleRoue(tailleRoue);
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getTailleRoue() {
		return tailleRoue;
	}
	public void setTailleRoue(double tailleRoue) {
		if(tailleRoue>=this.tailleRoueMin && tailleRoue <=this.tailleRoueMax){
		this.tailleRoue = tailleRoue;}
		else{
			System.err.println("taille de roue non valable, "
					+ "la taille max sera appliqué");
			this.tailleRoue=this.getTailleRoueMax();
		}
	}
	
	public double getTailleRoueMin() {
		return tailleRoueMin;
	}
	public double getTailleRoueMaxEnfant() {
		return tailleRoueMaxEnfant;
	}
	public double getTailleRoueMax() {
		return tailleRoueMax;
	}
	public double diametre(){
		return this.getTailleRoue()/Math.PI;
	}



	@Override
	public String toString() {
		return "Velo [nom=" + nom + ", tailleRoue=" + tailleRoue
				+ ", tailleRoueMin=" + tailleRoueMin + ", tailleRoueMaxEnfant="
				+ tailleRoueMaxEnfant + ", tailleRoueMax=" + tailleRoueMax
				+ ", diametre()=" + this.diametre() + "]";
	}
	



	
	
	
	
	
	
	
	
	
	
	
	

}

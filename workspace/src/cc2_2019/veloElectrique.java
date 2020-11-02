package cc2_2019;
import java.util.*;

public class veloElectrique extends Velo {
	private  TypeMoteur TypeMoteur;
	
	
	
public veloElectrique(String nom, double tailleRoue, TypeMoteur tr) {
		super(nom, tailleRoue);
		this.setTypeMoteur(tr);
		// TODO Auto-generated constructor stub
	}
public TypeMoteur getTypeMoteur() {
	return TypeMoteur;
}


public void setTypeMoteur(cc2_2019.TypeMoteur tr) {
	// TODO Auto-generated method stub
	if (tr.equals(TypeMoteur.electrique)){
		this.TypeMoteur=tr;
	}
	else{System.err.println("vélo non electrique");}
	
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"type de moteur: "+this.getTypeMoteur();
}










}

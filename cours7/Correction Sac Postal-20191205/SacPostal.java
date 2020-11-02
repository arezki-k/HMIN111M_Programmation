package tp5_2019;
import java.util.ArrayList;

public class SacPostal {

	private ArrayList<ObjetPostal> contenu = new ArrayList<>();
	private double capaciteMaximale = 0.5;
	
	public SacPostal() {
	}
	
	public SacPostal(double capaciteMaximale) {
		this.capaciteMaximale = capaciteMaximale;
	}
	
	public double getCapaciteMaximale() {
		return capaciteMaximale;
	}
	public void setCapaciteMaximale(double capaciteMaximale) {
		this.capaciteMaximale = capaciteMaximale;
	}
	
	public double volume(){
		double v=0; 
		for (ObjetPostal o:contenu) v+=o.getVolume();
		return v;
	}
	
	public void ajoute(ObjetPostal o){
		if ((!contenu.contains(o)) && 
			(o.getVolume()+this.volume() <= this.getCapaciteMaximale())) 
		contenu.add(o);
	}
	
	public double tarifRemboursement(){
		double tr=0; 
		for (ObjetPostal o:contenu) tr+=o.tarifRemboursement();
		return tr;
	}
		
	public SacPostal remplit(String cp)
	{
		SacPostal nouveau = new SacPostal(this.getCapaciteMaximale());
		for (ObjetPostal o:contenu) 
			if (o.getCodePostal().equals(cp))
				nouveau.ajoute(o);  
		return nouveau;
	}
	
	public String toString()
	{
		String s="[";
		for (ObjetPostal o:contenu) 
			s+=o.toString()+"\n";
		return s+"]";
	}
}

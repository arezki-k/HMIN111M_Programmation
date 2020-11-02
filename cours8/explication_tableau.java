
public double tarifAffranchissement(){
    double tarif= this.tarifBase();
    if(this.getTaux_rec==1){
        tarif+=0.5;
    }
    else if(this.getTaux_rec==2){
        tarif+=1.5;
    }   
    return tarif;
}
public abstract class ObjetPostal{
    private TauxRec TauxRec;
}

public class Lettre Extends ObjetPostal(){
    private boolean urgente;
    private static double tarifBase=0.5;

}
public double tarifBase(){
    return Lettre.tarifBase;
}
public double tarifAffranchissement(){
    double tarif=super.tarifAffranchissement()
    if(this.urgente){
        tarif+=0.3;
    }
    return tarif;
}
abstract public double tarifRemboursement();
public double tarifRemboursement(){
    if(this.getTaux_rec==1){
        return 1.5;
    }
    else if(this.getTaux_rec==2){
        return 15;
    }
    else{
        return 0;
    }
}
//TauxRec.java
public enum TauxRec{
    faible, moyen, fort
}
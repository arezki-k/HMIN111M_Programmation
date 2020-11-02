package cc1_2019;

import java.util.Scanner;

public class Point {
	/*partie attributs*/
	private double x;
	private double y;
	/*partie constructeurs*/
	
	public Point(){
		
	}
	public Point(double x, double y){
		this.x=x;
		this.y=y;
		
	}
	/*accesseurs*/
	/*get*/
	public double getx(){
		return this.x;
	}
	public double gety(){
		return this.y;
	}
	/*set*/
	public void setx(double x){
		this.x=x;
		
	}
	public void sety(double y){
		this.y=y;
	}
	/*partie methode*/
	//methode toString:
	public String toString(){
		return"information sur le point: \nl'abscisse du point est: "+this.getx()+"\n l'ordonnee du point est: "+this.gety();
	}
//methode distance:
	public double distance(Point p1, Point p2){
		return Math.sqrt(((p2.getx()-p1.getx())*(p2.getx()-p1.getx())+(p2.gety()-p1.gety())*(p2.gety()-p1.gety())));
	}
	//methode saisie:
	Scanner sc= new Scanner(System.in);
	public void saisie(Scanner sc){
		System.out.println("veuillez saisir l'abscisse du point svp");
		this.setx(sc.nextDouble());
		System.out.println("veuillez saisir l'ordonnée du point svp");
		this.sety(sc.nextDouble());
		
	}
	
	
	
}

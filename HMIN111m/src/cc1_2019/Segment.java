package cc1_2019;

import java.util.Scanner;

public class Segment {
	private double longueur=-1;
	private Point p1;
	private Point p2;
	/*partie constructeurs*/
	
	public Segment(){
		
	}
	public Segment(Point p1, Point p2){
		this.p1=p1;
		this.p2=p2;
		
	}
	public Segment(double longueur, Point p1, Point p2){
		this.longueur=longueur;
		this.p1=p1;
		this.p2=p2;
		
	}
	/*partie accesseurs*/
	//get
	public double getLongeur(){
		return this.longueur;
	}
	public Point getP1(){
		return this.p1;
	}
	public Point getp2(){
		return this.p2;
	}
	//set
	public void setLongueur(double longueur){
		this.longueur=longueur;
	}
	public void setP1(double x, double y){
		this.setP1(x, y);
	}
	public void setP2(double x, double y){
		this.setP2(x, y);
	}
	/*partie méthode*/
	//méthoide calculLongueur
	/*public double calculLongueur(Point p1, Point p2){
		double longueur;
		longueur= ;
		return longueur;
		
	}*/
	//return Math.sqrt(((p2.getx()-p1.getx())*(p2.getx()-p1.getx())+(p2.gety()-p1.gety())*(p2.gety()-p1.gety())));
	
	//méthode toString:
	public String toString(){
		return "le segment constitué des points "+this.getP1()+"  "+this.getp2()+" a pour longueur: "+this.longueur;
	}
	//methode milieu segement
	public Point milieuSegment(){
		Point pointmilieu;
		pointmilieu=new Point();
		return pointmilieu;
		
	}
	//méthode de saisie
	Scanner sc = new Scanner(System.in);
	public void Saisie(Scanner sc){
		System.out.println("veuillez saisir l'abscisse du premier point");
		double x=sc.nextDouble();
		System.out.println("veuillez saisir l'ordonnée du premier point");
		double y=sc.nextDouble();
		this.setP1(x, y);
		System.out.println("veuillez saisir l'abscisse du deuxième point");
		double a=sc.nextDouble();
		System.out.println("veuillez saisir l'ordonnée du deuxième point");
		double b=sc.nextDouble();
		this.setP2(a, b);
		
	}
	//méthode longueurEgales
	/*public boolean longueurRgales(double l1, double l2){
		boolean egal;
		return egal;
		
	}
	public String compareSegments(Segment AB, Segment CD){
		return "";
		
	}*/
	
	

}

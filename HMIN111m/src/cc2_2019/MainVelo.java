package cc2_2019;

import java.io.*;
import java.util.*;

public class MainVelo {
	public static void main(String[] args)throws IOException{
		Velo velo1= new Velo("Cannondale", 700);
		System.out.println(velo1);
		Velo velo2=new veloElectrique("moustache", 200, TypeMoteur.electrique);
		System.out.println(velo2);
		Velo velo3=new veloElectrique("Giant xtc4", 700, TypeMoteur.electrique);
		Velo velo4=new veloElectrique("Specialized", 650, TypeMoteur.electrique);
		
		MagasinVelo Decathlon = new MagasinVelo("decathlon");
		Decathlon.vend(velo1);
		Decathlon.vend(velo2);
		Decathlon.vend(velo3);
		Decathlon.vend(velo4);
		System.out.println(Decathlon.veloTailleRoueEntre(500, 650));
		
		
		
		
	}

}

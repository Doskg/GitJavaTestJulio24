package PrimeroPasosJavaJulio;
import java.math.*;
import java.util.*;

import javax.swing.JOptionPane;
public class PP3 {

	public static void main(String[] args) {
		//Calculos numericos. Video #9
		
//		double raiz= Math.sqrt(3.0);
//		double raiz2= Math.pow(2,3);
//		double seno= Math.sin(raiz2);
//		
//		System.out.println("Raiz: "+raiz);
//		System.out.println("Potencia: "+raiz2);
//		System.out.println("Seno: "+ seno);
		
		
		String baseStr=JOptionPane.showInputDialog(null, "Ingresa la base de una potencia");
		Double base= Double.parseDouble(baseStr);
		String expoStr=JOptionPane.showInputDialog(null, "Ingresa el exponente para una Potencia");;
		Double expo= Double.parseDouble(expoStr);
	  
		int res =(int)Math.pow(base, expo);
		
		JOptionPane.showMessageDialog(null, "La potencia de "+base+ " elevado a "+expo+ ": "+res);

>>>>>>> 9308e4be1a0300ba6b09d97491abd066d9fe74ad
		
		
		


	}

}

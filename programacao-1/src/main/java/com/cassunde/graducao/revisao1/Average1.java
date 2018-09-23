package com.cassunde.graducao.revisao1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average1{
    
	public static void main( String[] args ){
    	
		try {
			
			Scanner read = new Scanner(System.in);
		     
	        double a;
	        double b;
	        
	        double weightA = 3.5;
	        double weightB = 7.5;
	        
	        System.out.printf("Informe o número para a:\n");
	        a = read.nextDouble();
	        
	        System.out.printf("Informe o número para b:\n");
	        b = read.nextDouble();
	        
	        double sumWeight = weightA + weightB;
	        double sum = (a * weightA ) + ( b * weightB ) ;
	        double average = sum / sumWeight;
	        
	        DecimalFormat decimal = new DecimalFormat( "0.00000" );
	        
	        System.out.println("MÉDIA = "+ decimal.format(average) );
	        
	        read.close();
			
		} catch (Exception e) {
			
			System.err.println("Informe um valor válido: ");
		}
    }
}

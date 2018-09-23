package com.cassunde.graducao.revisao1;

import java.util.Scanner;

public class PositiveNumbers{
    
	public static void main( String[] args ){
    	
		try {
			
			int a;
			int[] numbers = new int[6];
			int totalPositive = 0;
			
			Scanner read = new Scanner(System.in);
	        
			for( int i = 0; i <= 5; i++ ) {

				System.out.printf("Informe o número para a:\n");
		        a = read.nextInt();
		        
		        numbers[i] = a;
			}
			
			for( int i = 0; i <= ( numbers.length -1); i++ ) {
				
				if( numbers[i] > 0 ) {
				
					totalPositive ++;
				}
			}
			
			System.out.println(totalPositive +" Valores Positivos ");
			
	        read.close();
		} catch (Exception e) {
			
			System.err.println("Problema Encontrado: " + e.getMessage() );
		}
    }
}

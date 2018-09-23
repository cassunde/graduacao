package com.cassunde.graducao.revisao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleSum{
    
	public static void main( String[] args ){
    	
        try {
        	
        	   Scanner ler = new Scanner(System.in);
        	     
               int a, b;
               
               System.out.printf("Informe o número para a:\n");
               a = ler.nextInt();
               
               System.out.printf("Informe o número para b:\n");
               b = ler.nextInt();
               
               int soma = a + b;
               
               System.out.println("SOMA = "+ soma+"\n");
               
               ler.close();
			
		} catch (InputMismatchException e) {
			System.err.println( "Informe de inteiro válido e tente novamente!" );
		}
    }
}

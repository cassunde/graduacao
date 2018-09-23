package com.cassunde.graduacao.revisao1.simplesum;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
		Scanner ler = new Scanner(System.in);
	     
        int a, b;
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        int soma = a + b;
        
        System.out.println("SOMA = "+ soma);
    }
}

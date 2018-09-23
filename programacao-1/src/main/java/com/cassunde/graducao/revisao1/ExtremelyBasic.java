package com.cassunde.graducao.revisao1;

import java.util.Scanner;

public class ExtremelyBasic{
    
	public static void main( String[] args ){
    	
        Scanner ler = new Scanner(System.in);
     
        int a, b;
     
        System.out.printf("Informe o número para a:\n");
        a = ler.nextInt();
        
        System.out.printf("Informe o número para b:\n");
        b = ler.nextInt();
        
        int x = a + b;
        
        System.out.printf("X = "+ x);
        
        ler.close();
    }
}

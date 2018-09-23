package com.cassunde.graduacao.revisao1.extremelybasic;

import java.util.Scanner;

public class Main{
    
	public static void main( String[] args ){
    	
        Scanner scan = new Scanner(System.in);
     
        int a, b;
     
        a = scan.nextInt();
        
        b = scan.nextInt();
        
        int x = a + b;
        
        System.out.println("X = " + x);
    }
}

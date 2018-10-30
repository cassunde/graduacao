package com.cassunde.graduacao.estrutura;

public class Main {
	
	public static void main(String args[]){
	
		//Algorítmo Bubble Sort
		int[] numbers = {1,234,21,34,21,345,56,6};
		
		for( int j = 0; j <= ( numbers.length -1 ); j++ ) {
			
			for( int i = 0; i < ( numbers.length -1 ); i++ ) {
				
				int actualValue = numbers[i];
				int nextValue = numbers[i+1];
				
				if( actualValue > nextValue ) {
					
					int temp = nextValue;
					numbers[i+1] = actualValue;
					numbers[i]   = temp;
				}
			}		
		}				
		
		//ordenados
		for( int i = 0; i <= ( numbers.length -1 ); i++ ) {
			
			System.out.println(numbers[i]);
		}
		
		//Pesquisa binária
		System.out.println("=====================================");		
		int inicio  = 0;
		int fim     = numbers.length;
		int posicao = 0;
		boolean deveContinuar = true;
		int busca = 800;
		while(deveContinuar) {
			
			posicao = (inicio + fim) / 2;
			
			if( posicao <= ( numbers.length -1 ) ) {
				
				int valorEncontrado = numbers[posicao];
				
				if( valorEncontrado != busca ) {
					
					if( valorEncontrado > busca ) {
						
						fim = posicao - 1;
					}else {
						
						inicio = posicao + 1;
					}
				}else {
					
					deveContinuar = false;
					System.out.println("encontrei na posicao: "+ posicao);
				}				
			}else {
				
				deveContinuar = false;
				System.out.println("nao encontrei nada");
			}
		}
    }
}

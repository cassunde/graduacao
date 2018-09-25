#include <iostream> /* biblioteca iostream*/
#include <stdlib.h>
using namespace std;

int ini = 0;
int fim = 0;
int topo = 3;
int fila[3];

int enfileira(int n){ 


	fila[fim] = n;
	fim ++;
	
	cout << "Enfileirado \n";
}

int desenfileira(int n){ 

	cout << "Desenfileirando \n";

	for( int i = 0; i <= fim; i++ ){
	
		if( fila[i] % 5 == 0 ){
			cout << fila[i] << endl ; 		
		}

		fila[i] = 0;
		fim--;
	}	
}

int main(){

    int opcao = 1;
    
    while(opcao != 2){
	
	    cout << "MENU\n\n";
	
	    cout << "0 - Enfileira \n";
	    cout << "1 - Desenfileira \n";
	    cout << "2 - Fim \n";
	    cout << "\n";
	    cout << "Opcao:";
	    cin >> opcao;
	
	    if (opcao == 2){ 
	       cout << "Fim do cadastro";
	    }
	    if (opcao == 0){ 
		    int numero = 0;

		    cout << "Digite um número para enfileirar:";
		    cin >> numero;

	       enfileira(numero);
	    }
	    if (opcao == 1){ 
	       desenfileira(1);
	    }	    
	    if (opcao > 4){ 
	       cout <<"Opçao Invalida";
	    }
	}
    return 0;
}

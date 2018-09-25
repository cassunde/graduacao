#include<iostream>
using std::cout;
using std::cin;
using std::endl;

#include<string>
using std::string;
using std::getline;

int main(){
   
	char texto[] = { 'c', 'a', 's','a'};	
	char fila[3];
	char p[3];
	
	//dados da fila
	int ini = 0;
	int fim = 0;
	int topo = 3;

	//enfileirando	
	for ( int i = 0; i < sizeof(texto); i++){
		if( i <= topo ){

			fim = i;
			fila[fim] = texto[i];			
		}else{

			cout << "Fila cheia, verique o texto" << endl;	
		}		

	}

	for( int i = 0; i <= topo; i++ ){		
		p[i] = toupper(fila[i]); //empilha
		fim--;//desenfileira
	}

	//desempilha
	for( int i = topo; 0 <= i; i-- ){		
		p[i] = ' ';
	}

	cout << "Pilha:" << endl;	
	cout << p << endl;	

	fim = 0;

	return 0;
}

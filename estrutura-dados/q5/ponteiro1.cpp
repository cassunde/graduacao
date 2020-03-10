#include <iostream>
using namespace std;

/**
*
* Trocando endereços de memória
*
*/
int main(int argc, char** argv) {

	int a;
	int b;
	
	// criando ponteiros
	int *pa, *pb;

	cin >> a;	
	cin >> b;	

	//atribuindo os endereços de memórias nos ponteiros criados
	pa = &b;
	pb = &a;	

	cout << *pa;
	cout << "\n";
	cout << *pb;
	cout << "\n";
	
	return 0;
}

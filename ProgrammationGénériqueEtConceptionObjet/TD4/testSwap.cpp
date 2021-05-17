//============================================================================
// Name        : tp4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

// Utilizando el apuntador

#include <iostream>
#include "swap.h"
using namespace std;

//void swap (int *a, int *b){//funcion que no regresa argumentos. Evitar imprimir aqui.Variables locales
//	//pasaje por valor, la a y b es cualquier varible no necesarimanete debe tener el mismo nombre
//	int c;
//	c = *a;
//	*a = *b;
//	*b = c;
//}


int main() {
	
	int a;
	int b;
	
	cout<<"Valor de A : "<<endl;
	cin >> a;
	
	cout<<"Valor de B : "<<endl;
	cin >> b;
	
	cout << "Avant le swap " << "A : "<< a<<" et B : "<<b<<endl;
	
	//int *a = &a; No es necesario hacer la declaracion
	//int *b = &b;
	swap(&a,&b);//llamada a la funcion
		
	cout << "Après le swap " << "A : "<< a<<" et B : "<<b<<endl;
	return 0;
}

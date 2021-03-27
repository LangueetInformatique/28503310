#include <iostream>

using namespace std; // para imprimir

void swap (int *a, int *b){//funcion que no regresa argumentos. Evitar imprimir aqui.Variables locales
	//pasaje por valor, la a y b es cualquier varible no necesarimanete debe tener el mismo nombre
	int c;
	c = *a;
	*a = *b;
	*b = c;
}



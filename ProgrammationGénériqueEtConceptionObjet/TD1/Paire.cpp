//============================================================================
// Name        : tp1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
#include "Parite.h"
#include <iostream>
using namespace std;

int main() {
	
	short n=0;
	cout << "Entrez un entier " << endl;
	cin >> n; // lecture de la variable n
	
	if (Parite(n)==true){

		cout << "L'entier est par" << endl;
	}
	else{
		 cout << "L'entier est impar" << endl;
	}
	return 0;
}


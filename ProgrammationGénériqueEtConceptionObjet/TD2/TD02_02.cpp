//============================================================================
// Name        : TD02_02.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
using namespace std;

int main() {
	
	ofstream fichier;
	fichier.open("tp2.bin", ofstream::out|ofstream::binary);
	
	short tab[5];
	
	if (fichier.fail())
		cerr << "Impossible d'ecrire dans le fichier\n";
	else {
		for (int i = 0;i < 5;i++) {
			cout << "Tapez chaque entier" << endl;
			cin >> tab[i];
			fichier.write((char*) &tab[i], sizeof(tab[i])); // aqui puedo visualizar un numero
			// usando el tab[i] y la talla sizeof(tab[i]) puedo en particular o modificarlo
		}
	}
	fichier.close();
	return 0;
}
//============================================================================
// Name        : devoir01_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int CompterMots(string);

int main() {
	
	//char s[1000];
	
	ifstream fichero;
	string contenu;
	fichero.open("Adélaide.txt",ios::in);

	if (fichero.fail()){
			cerr << "Erreur ouverture"; // para mostrar un error y para el programa
		}
		else {
			getline(fichero, contenu);
		
			cout<<"\nTotal des mots :  "<<CompterMots(contenu)<<"  mots.\n\n";
		}
	return 0;
}
     
int CompterMots(string cad){
	int mots = 0;
	for(int i=1; cad[i]!='\0';++i)
		if(cad[i-1]==' '&& isalpha(cad[i]))
			++mots;
	if(isalpha(cad[0])) ++mots;
	return mots;
 } 

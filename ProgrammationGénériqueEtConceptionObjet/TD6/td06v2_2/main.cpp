#include <map>
#include <string>
#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ifstream fichier("test.txt");
    string mot;
    map<string, int> occurrences;
    while(fichier >> mot)   //On lit le fichier mot par mot
    {
         ++occurrences[mot]; //On incrémente le compteur pour le mot lu
    }

    cout << "---------------" << endl;

    for (auto & clave : occurrences)
    {
        cout << clave.first << " "; // orden alfabetico
        cout << clave.second << endl;

    }

    //cout << "Le mot 'many' existe " << occurrences["many"] << " fois dans le fichier" << endl;

    return 0;
}

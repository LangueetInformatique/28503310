#include <iostream>
#include <vector>
#include <string>
// podemos agregar, eliminar y visualizar
using namespace std;

int main()
{
    //vector <int> v;solo declaramos e vector
    vector <int> v(5);//tama~no del vector
    //vector <int> v(5,4); //tama~no y valor

    v[0] = 10; //Llenamos cada uno de los valores
    v[1] = 30; //Llenamos cada uno de los valores
    v[2] = 20;
    v[3] = 60;
    v[4] = 40;

    cout << "Premier element : " << v.front() << endl; //Ver el primer elemento
    cout << "Dernier element : " << v.back() << endl; //Ver el ultimo elemento
    v.pop_back() ; //eliminar el ultimo elemento

    cout << "----------" << endl; //Ver el primer elemento

    for (int elt: v){
        cout << elt << endl;
    }

    v.push_back(80); // pour ajouter un element à la fin
    v.erase(v.begin()+2); //Para eliminar el elemento en la posicion 2

    cout << "---------" << endl;

    //for (int i = 0; i< v.size(); i++){
    //    cout << v[i] << endl;
    //}

    for (int elt: v){
        cout << elt << endl;
    }

    return 0;
}

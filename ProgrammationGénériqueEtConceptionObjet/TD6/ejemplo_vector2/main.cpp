#include <iostream>
#include <vector>
#include <string>

using namespace std;

void ajouter (vector <int> &v){ //valor por referencia, misma casilla de valor de variable

    v.push_back(30);
    v.push_back(40);
    v.push_back(50);

}

int main()
{
        //vector <int> v;solo declaramos e vector
    vector <int> v;//tama~no del vector. Variable local
    //vector <int> v2(2);//tama~no del vector
    //vector <int> v(5,4); //tama~no y valor

    v.push_back(10); //Llenamos cada uno de los valores
    v.push_back(20); //Llenamos cada uno de los valores
    //v.push_back(5); //Llenamos cada uno de los valores

    for (int elt: v){
        cout << elt << endl;
    }

    cout << "---------" << endl;

    ajouter(v);

    for (int elt: v){
        cout << elt << endl;
    }

    return 0;
}

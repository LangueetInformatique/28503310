#include <iostream>
//En utilisant les primitives standard de la pile, proposer un algorithme qui inverse le contenu d'une pile
using namespace std;
#include <stack>

int main()
{
    stack<int> i;  //pile d'entiers

    int elt = 1;
    i.push(2);
    i.push(elt);
    i.push(3);

    cout << "Le nombre d'éléments de la pile est : " << i.size() << endl;

    for (int i=0; i < i.size(); i++)
    //for (int compteur(0) ; compteur < 10 ; compteur++)
    {
        cout << i << endl;
    }

    return 0;
}

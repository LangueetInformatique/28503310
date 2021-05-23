#include <stack>
#include <iostream>
using namespace std;
// Pila
int main()
{
    stack<int> pile;    //Une pile vide
    pile.push(3);       //On ajoute le nombre 3 à la pile
    pile.push(4);
    pile.push(5);

    cout << "Dernier element : " << pile.top() << endl; //On consulte le sommet de la pile (le nombre 5)

    pile.pop();        //On supprime le dernier élément ajouté (le nombre 5)

    cout << "Dernier element : " << pile.top() << endl; //On consulte le sommet de la pile (le nombre 4)

    return 0;
}

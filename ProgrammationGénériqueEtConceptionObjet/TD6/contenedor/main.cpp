#include <iostream>
#include <list>

using namespace std;

typedef list<int> li;

void print(li &l)
{
    li::iterator i = l.begin();
    while (i != l.end())
    {
        cout << *i << " " ;
        ++i;
    }
    cout << endl;
}

int main(void)
{
    // Initialise une liste avec trois éléments valant 5 :
    li l1(3, 5);
    print(l1);
    // Initialise une autre liste à partir de la première
    // (en fait on devrait appeler le constructeur de copie) :
    li l2(l1.begin(), l1.end());
    print(l2);
    // Affecte 4 éléments valant 2 à l1 :
    l1.assign(4, 2);
    print(l1);
    // Affecte l1 à l2 (de même, on devrait normalement
    // utiliser l'opérateur d'affectation) :
    l2.assign(l1.begin(), l1.end());
    print(l2);
    return 0;
}

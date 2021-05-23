#include <queue>
#include <iostream>
using namespace std;

int main()
{
    queue<int> file;    //Une file vide
    file.push(3);       //On ajoute le nombre 3 à la file
    file.push(4);
    file.push(5);

    cout << file.front() << endl; //On consulte le 3

    file.pop();        //On supprime le premier élément ajouté (le nombre 3)

    cout << "---------------" << endl;

    cout << file.front() << endl; //On consulte le sommet de la file (le nombre 4)

    return 0;
}

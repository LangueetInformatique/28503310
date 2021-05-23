#include <queue> //Attention ! queue et priority_queue sont définies dans le même fichier
#include <iostream>
using namespace std;

int main()
{
    priority_queue<int> file;
    file.push(5);
    file.push(8);
    file.push(3);
    file.push(10);

    cout << file.top() << endl;  //Affiche le plus grand des éléments insérés (le nombre 8)

    return 0;
}

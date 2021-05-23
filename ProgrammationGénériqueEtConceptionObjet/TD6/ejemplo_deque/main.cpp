#include <iostream>
#include <deque>
using namespace std;

// significa double ended

int main() {
	deque<int> d(4,5); // de tamano 4 y de valor 5, cada elemento

	d.push_front(2);// agregamos el numero 2 al inicio
	d.push_back(8); // garegamos el numero 8 al final

    for (int elt: d){
        cout << elt << endl;
    }
    return 0;
}

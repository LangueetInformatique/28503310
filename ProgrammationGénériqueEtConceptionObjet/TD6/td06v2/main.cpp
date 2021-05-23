#include <map>
#include <string>
#include <iostream>
using namespace std;

int main()
{
    map<string, string> contenedor;
    contenedor["Ana"] = "ARMENTA"; //La case "salut" de la map vaut maintenant 3
    contenedor["Manuel"] = "ORTIZ";
    cout << contenedor["Manuel"] << endl;
    cout << contenedor["ORTIZ"] << endl;
    return 0;
}

#include <iostream>
#include <string>

using namespace std;

const char Par[6]="02468";
const char Non[6]="13579";

bool analizarNumero(char *cadena){
    char carEntrada;
    int edoActual = 0;
    int i = 0;
    bool band=false;
    while(i < (int)strlen(cadena) && !band){
        switch(edoActual){
        case 0:{
            carEntrada = cadena[i++];
            if(strchr(Par,carEntrada))
                edoActual = 1;
            else if(strchr(Non,carEntrada))
                edoActual = 2;
        }break;
        case 1:{
            carEntrada = cadena[i++];
            if(strchr(Par,carEntrada))
                edoActual = 1;
            else if(strchr(Non,carEntrada))
                edoActual = 2;
            else{ // otro caracter
                // fin de la cadena o expresion
                edoActual = 3;
                i--; // representa el * o retroceso
            }
        }break;
        case 2:{
            carEntrada = cadena[i++];
            if(strchr(Par,carEntrada))
                edoActual = 1;
            else if(strchr(Non,carEntrada))
                edoActual = 2;
        }break;
        case 3:{ // fin de la expresion
            cout<<"---> Numero PAR <---"<<endl;
            band = true;
        }break;
        }// fin swich
    }// fin while
    return band;
}

int main()
{

    char opc;
    string cadena = "140";
    cout << "Determinar Numeros Pares en una CADENA "<<endl;
    do{
        cout<<"Teclea un numero: ";
        getline(cin,cadena,'\n');
        cadena+=";";
        cout<<"Tu numero = "<<cadena;
        char *cad = new char[cadena.length()];
        strcpy(cad,cadena.c_str());
        if(!analizarNumero(cad)){
            cout<<"---> Numero Non <---"<<endl;
        }

        cout<<"Analizar otro numero (s/n): ";
        opc = cin.get();
        cin.get(); // para eliminar el enter
    }while(strchr("Ss",opc));
    return 0;
}

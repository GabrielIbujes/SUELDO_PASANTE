#include<iostream>
using namespace std;
int main(){
	
	float Sueldo,horas=0;
	int valor;
	
	cout<<"Ingrese horas trabajdas: ";
	cin>>horas;
	cout<<"Ingrese el valor monetario por hora: ";
	cin>>valor;
	
	if(horas>60){
			sueldo = horas*valor;
            }
	else{
			cout<<"Por favor, ingrese una categoria valida "<<endl;
	}	
	
	cout<<"las horas a pagar al pasante son: "<<sueldo<<"$"<<endl;

	return 0;	
}

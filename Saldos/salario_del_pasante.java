package sueldo_pasante;

import java.util.Scanner;

public class ClsSueldo {
    
public static void main(String[] args) {
    float sueldo = 0,horas=0;
    int valor;
    Scanner s =new Scanner(System.in);
    System.out.println("Ingrese el numero de horas trabajadas: ");
    horas=s.nextInt();
    System.out.println("Ingrese el valor monetario por hora: ");
    valor=s.nextInt();
    
    if(horas>60){
        sueldo=horas*valor;
    }
    else {
        System.out.println("Por favor, ingrese una categoria valida");
    }

    
    System.out.println("Las horas a pagar al pasante son: $ "+sueldo);

  }
    
}

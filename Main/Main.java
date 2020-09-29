package Main;

import java.util.Scanner;
import Metodo.Metodo;

public class Main {
public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
    
String Nombre[] = {"Acevedo Campos Ariagna","Ambrocio Pérez Michael Haziel","Ambrosio Hernandez Vianey Celerina"
    ,"Campos Casasanero Juan Pablo","Díaz de Jesus Mariana Dazzling","Díaz Rosales Alexis Efren"
    ,"Dominguez Cazales Jennifer Irlanda","Eligio Ramos Monserrat","Flores Maldonado Liliana"
    ,"Gomez Aragon Edgar Omar","Gutierrez Valle Samara","Juarez Ramos Alexis Manuel"
    ,"Leyva Silva Rogelio Jesus","Martinez De Los Santos Isabel","Martinez Rayo Iris Madai"
};
    
int NoControl[] = {18680056,19680091,19680092,19680113,19680133,17680136,18680108,19680957,19680144,19680156,19680162,19680958,19680177,
18680163,18680165
};

double Calificacion[] = new double[Nombre.length];
for(int i = 0; i < Calificacion.length; i++){
    do{
    System.out.println("["+(i + 1)+"]No.Control: "+NoControl[i]+Nombre[i]+"\nCalificación: "+Calificacion[i]);
    Calificacion[i] = leer.nextDouble();
        
}while(Calificacion[i] < 0 || Calificacion [i]>100);
    
}

Metodo metodo = new Metodo();
int opc, opc2;
do {
opc2 = 1;
    System.out.println("Bienvenido\n"
    +"¿Que datos desea obtener?\n"
    +"[1]Promedio general\n"
    +"[2]Primeros 5 promedios\n"
    +"[3]Últimos 5 promedios\n"
    +"[4]Salir");
opc = leer.nextInt();
switch(opc){
    case 1:
        System.out.println("Calificación grupal"+metodo.Promedio(Calificacion));
    break;
    
    case 2:
        metodo.PrimNum(Nombre, NoControl, Calificacion);
    break;
    
    case 3:
        metodo.UltNum(Nombre, NoControl, Calificacion);
    break;
    
    case 4:
        System.out.println("Entendido, vuelva pronto 0w0");
    break;
}
if (opc!=4) {
    System.out.println("Desea continuar: "
            + "[0]Si"
            + "[1]No");
    
    opc2 = leer.nextInt();
}
} while (opc2 != 1);
}
}

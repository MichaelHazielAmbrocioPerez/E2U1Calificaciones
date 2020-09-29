package Metodo;

public class Metodo {
    
public double Promedio(double [] Calificacion){
 double numero = 0;
 for (int i = 0; i <Calificacion.length; i++){
     numero = numero + Calificacion[i];
 }
 
 numero = numero/Calificacion.length;
 return numero;
}

public void PrimNum(String[]Nombre,int[]NoControl,double[]Calificacion){
double numero = 0;
 for (int i = 0; i < 5; i++){
    System.out.println("["+(i + 1)+"]No.Control: "+NoControl[i]+Nombre[i]+"\nCalificación: "+Calificacion[i]);
 numero = numero + Calificacion[i];   
    System.out.println("");
 }
 numero = numero/5;
    System.out.println("Calificaciones de los 5 primeros estudiantes: "+numero);
}

public void UltNum(String[] Nombre, int[] NoControl, double[] Calificacion) {
double numero = 0;
 for (int i = Calificacion.length - 1; i > 10; i--){
    System.out.println("["+(i + 1)+"]No.Control: "+NoControl[i]+Nombre[i]+"\nCalificación: "+Calificacion[i]);
 numero = numero + Calificacion[i];
    System.out.println("");
    }
 numero = numero/5;
    System.out.println("Calificación de los 5 últimos estudiantes"+numero);
}
}

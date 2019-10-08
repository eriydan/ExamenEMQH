package ExamenEjercicios;

import java.util.Scanner;


public class Examen1_EMQH{

   public static void main(String[] args) {
 
        Scanner entrada = new Scanner (System.in);
        double prom;
        System.out.println("Primera nota: ");
        int n1=entrada.nextInt();
        System.out.println("Segundo nota: ");
        int n2=entrada.nextInt();
        System.out.println("Tercero nota: ");
        int n3=entrada.nextInt();
        System.out.println("Cuarto nota: ");
        int n4=entrada.nextInt();
        System.out.println("Quinto nota: ");
        int n5=entrada.nextInt();
        
        int menor=n1;
        
        if(menor>n1);{
            menor=n1;}
        if(menor>n2);{
            menor=n2;}
        if(menor>n3);{
            menor=n3;}
        if(menor>n4){
            menor=n4;}
        if(menor>n5){
            menor=n5;}
        else{
        prom=(n1+n2+n3+n4+n5-menor)/4;
        System.out.println("El promedio de las 4 máximas notas es: "+prom);
    }
}
}

/*
En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%,
25% y 30%. Para cada estudiante se informa el código y las 4 notas. Hacer un 
programa que calcule la nota definitiva de cada estudiante, el promedio de notas 
definitivas del curso y el porcentaje de perdedores. Sugerencia: Asuma que el 
curso está compuesto por N estudiantes, usted es libre de asignar el valor de N, 
50 o 10 por ejemplo
 */
package p1p12;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class P1p12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant,contPerdedores=0,opc,i=0,codigo,k;
        //    double ev1, ev2, ev3, ev4, notaFinal;
        double[] ev1, ev2, ev3, ev4,notaFinal;
        double promedio=0,perdedores;
        
        Scanner lector = new Scanner(System.in);
        
        /*System.out.print("Digite el numero de estudiantes "); 
        cant = lector.nextInt();        
        System.out.println("El numero de estudiantes es: "+cant);*/
        
        ev1 = new double [40];
        ev2 = new double [40];
        ev3 = new double [40];
        ev4 = new double [40];
        notaFinal = new double [40];
        int [] codigos = new int[40];
        
        do {
            System.out.println("Digite la opcion");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("0. Salir");
            opc = lector.nextInt();
            switch (opc) {
                case 1: System.out.println("Digite codigo del estudiante");
                        codigos[i]=lector.nextInt();
                        System.out.println("Digite las cuatro notas del estudiante ");
                        ev1[i] = lector.nextDouble();
                        ev2[i] = lector.nextDouble();
                        ev3[i] = lector.nextDouble();
                        ev4[i] = lector.nextDouble();     
                        notaFinal[i] = ev1[i]*0.25 + ev2[i]*0.20 + ev3[i]*0.25 + ev4[i]*0.30;
                        System.out.println("La nota definitiva es: "+notaFinal[i]);
                        if (notaFinal[i]<3)
                            contPerdedores++;
                        promedio += notaFinal[i] ;
                        i++;
                    break;
                case 2: System.out.println("Digite codigo del estudiante");
                        codigo = lector.nextInt();
                        for (int j=0; j<i ; j++){
                            if (codigo == codigos[j]){
                                for (k=j; k<i;k++){
                                    ev1[k]=ev1[k+1];
                                    ev2[k]=ev2[k+1];
                                    ev3[k]=ev3[k+1];
                                    ev4[k]=ev4[k+1];
                                    codigos[k]=codigos[k+1];
                                }
                                i--;
                            }
                        }                        
                    break;
            }
        
        }while (opc!=0);
    /*    int j=1;
        for(int i=0;i<cant;i++){
            System.out.println("Digite las cuatro notas del estudiante "+j);
            ev1[i] = lector.nextDouble();
            ev2[i] = lector.nextDouble();
            ev3[i] = lector.nextDouble();
            ev4[i] = lector.nextDouble();     
            notaFinal[i] = ev1[i]*0.25 + ev2[i]*0.20 + ev3[i]*0.25 + ev4[i]*0.30;
            System.out.println("La nota definitiva es: "+notaFinal[i]);
            if (notaFinal[i]<3)
                contPerdedores++;
            promedio += notaFinal[i] ;
            j++;
        }*/
        promedio /= i;
        System.out.println("El promedio de la nota es: "+promedio);
        perdedores = contPerdedores * 100 / i;
        System.out.println("La cantidad de perdedores es: "+perdedores+" %");
        
    /*  Un solo estudiante
        System.out.println("Digite las cuatro evaluaciones");
        ev1 = lector.nextDouble();
        ev2 = lector.nextDouble();
        ev3 = lector.nextDouble();
        ev4 = lector.nextDouble();
        notaFinal = ev1*0.25 + ev2*0.20 + ev3*0.25 + ev4*0.30;
        System.out.println("La nota final es: "+notaFinal);*/
    }
}


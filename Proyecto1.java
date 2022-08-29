

package com.progra2.proyecto1;
import java.util.Scanner;

public class Proyecto1 {
    
    public static void main(String[] args) {
        int matriz [][]= new int[8][4];
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Llene la tabla");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Tabla["+i+"]["+j+"]:");
                
                matriz [i][j]= entrada.nextInt();
                
    
            }
        }
         System.out.println("tabla");
         for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 4; j++) {
                 System.out.print(matriz[i][j]);
               
             }
             System.out.println(" ");
        }   
         
         int f1c1 = matriz[0][0],f1c2 = matriz[1][0],f1c3 = matriz[2][0],f1c4 = matriz[3][0],f1c5 = matriz[4][0],f1c6 = matriz[5][0],f1c7 = matriz[6][0],f1c8 = matriz[7][0];
         int totalMesEnero = f1c1+f1c2+f1c3+f1c4+f1c5+f1c6+f1c7+f1c8;
         System.out.println(" ");

        System.out.println("Resultados del mes de enero");
        System.out.println("El total de ventas: " +totalMesEnero);
        System.out.println(" ");
       
         int f2c1 = matriz[0][1],f2c2 = matriz[1][1],f2c3 = matriz[2][1],f2c4 = matriz[3][1],f2c5 = matriz[4][1],f2c6 = matriz[5][1],f2c7 = matriz[6][1],f2c8 = matriz[7][1];
         int totalMesFebrero = f2c1+f2c2+f2c3+f2c4+f2c5+f2c6+f2c7+f2c8;
         System.out.println(" ");
         
        System.out.println("Resultados del mes de febrero");
        System.out.println("El total de ventas: " +totalMesFebrero);
        System.out.println(" ");

         int f3c1 = matriz[0][2],f3c2 = matriz[1][2],f3c3 = matriz[2][2],f3c4 = matriz[3][2],f3c5 = matriz[4][2],f3c6 = matriz[5][2],f3c7 = matriz[6][2],f3c8 = matriz[7][2];
         int totalMesMarzo = f3c1+f3c2+f3c3+f3c4+f3c5+f3c6+f3c7+f3c8;
         System.out.println(" ");
         
        System.out.println("Resultados del mes de marzo");
        System.out.println("El total de ventas: " +totalMesMarzo);
        System.out.println(" ");
        
         int f4c1 = matriz[0][3],f4c2 = matriz[1][3],f4c3 = matriz[2][3],f4c4 = matriz[3][3],f4c5 = matriz[4][3],f4c6 = matriz[5][3],f4c7 = matriz[6][3],f4c8 = matriz[7][3];
         int totalMesAbril = f4c1+f4c2+f4c3+f4c4+f3c5+f3c6+f3c7+f3c8;
         System.out.println(" ");
         
         System.out.println("Resultados del mes de abril");
         System.out.println("El total de ventas es:"+totalMesAbril);
         
         System.out.println(" ");
         
         int totalMeses = totalMesEnero+totalMesFebrero+totalMesMarzo+totalMesAbril ; 
         
         System.out.println("Resultado del total de todos los meses:"+totalMeses);
         
}         

}
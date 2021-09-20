/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.punto1;

/**
 *
 * @author Marco Contreras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long ini, fin, dif = 0;
        int tamaño = 1000;
        int[][] matriz1 = new int[tamaño][tamaño];
        int [][] matriz2 = new int[tamaño][tamaño];
        int [][] resultado = new int [tamaño][tamaño];
        Matrix matrizR = new Matrix();
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matriz1 = matrix1.fuelMatix(matriz1);
        matriz2 = matrix2.fuelMatix(matriz2);
        
        ini = System.currentTimeMillis();
        resultado = matrizR.multiply(matriz1, matriz2);
        fin = System.currentTimeMillis();
        
        dif = (fin - ini);
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                 System.out.print(resultado[i][j] + " ");
            }
            System.out.println(" ");
        } 
        System.out.println("Tiempo: " + (dif/1000f));
    }
    
}

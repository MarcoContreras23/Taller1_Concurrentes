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
        
        int[][] matriz1 = new int[100][100];
        int [][] matriz2 = new int[100][100];
        int [][] resultado = new int [100][100];
        Matrix matrizR = new Matrix();
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matriz1 = matrix1.fuelMatix(matriz1);
        matriz2 = matrix2.fuelMatix(matriz2);
        
        resultado = matrizR.multiply(matriz1, matriz2);
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                 System.out.println("resultado: " +resultado[i][j]);
            }
        }
        
    }
    
}

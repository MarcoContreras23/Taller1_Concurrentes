/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.punto1;

import java.util.ArrayList;

/**
 *
 * @author Marco Contreras
 */
public class Matrix {
    
    
    
    //Metodo encargado en llenar la matriz
    public int[][] fuelMatix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*100+1);
            }
        }
        return matrix;
    }
    
    //Metodo encargado de la multiplicación de las matrices
    public int[][] multiply(int[][] matriz1, int[][] matriz2) {
    int[][] result = new int[matriz1.length][matriz2[0].length];
    // Comprobación si las matrices se pueden multiplicar
    if (matriz1[0].length == matriz2.length) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    }
    //Si no se cumple la condición se retorna una matriz vacía
    return result;
    }
    
    
}

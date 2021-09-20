package taller1.punto1;

/**
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
        if (matriz1[0].length == matriz2.length) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        result[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
        }
        return result;
    }
    
    //Metodo encargado de recorrer la matriz por cuadrantes
    
    public int[][] wayMatriz(int [][] matriz1, int tamaño){
        int cantidad = tamaño /4;
        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.println("");
            }
        }
        
        
        return matriz1;
    }
}

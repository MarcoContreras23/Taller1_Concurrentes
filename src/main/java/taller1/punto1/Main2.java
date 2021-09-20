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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        MyThread task = new MyThread(0,null);
        long totalTimelapse = 0;
        final int MAX_TASKS = 4;
        
        for (int i = 0; i < MAX_TASKS; i++) {
            task.run();
            totalTimelapse += task.getTheTimeLapse();
        }
        
        System.out.println("TimeLapse: " + (totalTimelapse/1000f));*/
         int numero  = 8;
        int [][] matriz1 = new int [numero][numero];
        int [][] matriz2 = new int [numero][numero];
        int [][] resultado = new int [numero][numero];
        int [][] matriz1r = new int [numero][numero];
        int [][] matriz2r = new int [numero][numero];
        int [][] resultador = new int [numero][numero];

        Matrix matrix = new Matrix();
        int residuo = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()*10+1);
            }
        }
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random()*10+1);
            }
        }
        resultado = matrix.multiply(matriz1, matriz2);
        
        System.out.println("------------matriz 1---------------");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                 System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        } 
        
        System.out.println("------------matriz 2---------------");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                 System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("------------Resultado---------------");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                 System.out.print(resultado[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        
        residuo = numero/2;
        
        for (int i = 0; i < residuo; i++) {
            for (int j = 0; j < residuo; j++) {
                 matriz1r[i][j] = matriz1[i][j] ;
            }
        }
        for (int i = 0; i < residuo; i++) {
            for (int j = 0; j < residuo; j++) {
                 matriz2r[i][j] = matriz2[i][j] ;
            }
        }
        for (int i = 0; i < matriz1r.length; i++) {
                for (int j = 0; j < matriz2r[0].length; j++) {
                    for (int k = 0; k < matriz1r[0].length; k++) {
                        resultador[i][j] += matriz1r[i][k] * matriz2r[k][j];
                }
            }
        }
  
        System.out.println("------------Resultado residuo---------------");
         
        for (int i = 0; i < residuo; i++) {
            for (int j = 0; j < residuo; j++) {
                 System.out.print(resultador[i][j] + " ");
            }
            System.out.println(" ");
        }
          
        /*
        for (int i = 0; i < residuo; i++) {
            cont1 += 1;
        }
        System.out.println("el residuo 1 es:" + cont1);
        for (int i = residuo; i <(residuo*2); i++) {
            cont2 += 1;
        }
        System.out.println("el residuo 2 es:" + cont2);
        for (int i = (residuo*2); i < (residuo*3); i++) {
            cont3 += 1;
        }
        System.out.println("el residuo 3 es:" + cont3);
        for (int i = (residuo*3); i < (residuo*4); i++) {
            cont4 += 1;
        }
        System.out.println("el residuo 4 es:" + cont4);
        System.out.println("La suma total de residuos es: " + (cont1+cont2+cont3+cont4));*/
    }
    
}

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
public class MyThread implements Runnable{
    private Thread theThread = null;
    private int theID = 0;
    private MyThread.OnChange theDelegate = null;
    private long theTimeLapse = -1;
    
    
    public MyThread(int newID, MyThread.OnChange newDelegate){
        theID = newID;
        theDelegate = newDelegate;
        
    }
    
    public Thread start(){
        if (getTheThread() == null) {
            theThread = new Thread(this);
            getTheThread().start();
        }
        return getTheThread();
    }
    
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

    @Override
    public void run() {
        long ini,fin,dif = 0;
        int [][] matriz1 = new int [100][100];
        int [][] matriz2 = new int [100][100];
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matriz1 = matrix1.fuelMatix(matriz1);
        matriz2 = matrix2.fuelMatix(matriz2);
        
        ini = System.currentTimeMillis();
        multiply(null,null);
        fin = System.currentTimeMillis();
        
        dif = (fin - ini);
        theTimeLapse = dif;
        /*if (theDelegate != null) {
            
        }*/
    }
     public interface OnChange{
        public abstract void show(int id, int value);
    }
     
    
   
    /**
     * @return the theID
     */
    public int getTheID() {
        return theID;
    }
    /**
     * @return the theTimeLapse
     */
    public long getTheTimeLapse() {
        return theTimeLapse;
    }

    /**
     * @return the theThread
     */
    public Thread getTheThread() {
        return theThread;
    }
    
    
}

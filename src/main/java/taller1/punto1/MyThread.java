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
    private int theCounter = 0;
    private int theID = 0;
    private OnChange theDelegate = null;
    private int theIniValue = 0;
    private int theEndValue = 0;
    
    public MyThread(int newID, OnChange newDelegate){
        theID = newID;
        theDelegate = newDelegate;
        theThread = new Thread(this);
    }
    public Thread start(int newIniValue, int newFinValue){
        theIniValue = newIniValue;
        theEndValue = newFinValue;
        theThread.start();
      
      return theThread;
    }
    
    @Override
    public void run(){
        
        long ini = 0;
        long fin = 0;
        
        ini = System.currentTimeMillis();
        
        for (int i = theIniValue; i <= theEndValue; i++) {
            theCounter ++;
            if (theDelegate != null) {
                
                theDelegate.show(theID,i);
            }
        }
        fin = System.currentTimeMillis();
        
        System.out.println("Total: " + ((fin - ini) / 1000f) + "sec");
    }
    
    public interface OnChange{
        public abstract void show(int id, int value);
    }
    
}

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package taller1.punto2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco Contreras
 */
public class MyThread implements Runnable {
    
    long ini,fin, dif = 0;
    private int counterA, counterB, counterC, counterD, counterE,counterF = 0;
    private Thread theThread = null;
    private String nameA = "A";
    private String nameB = "B";
    private String nameC = "C";
    private String nameD = "D";
    private String nameE = "E";
    private String nameF = "F";
    private boolean yaEntreA = true;
    private int theID = 0;
    private OnChange theDelegate = null;
    
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
    
    @Override
    public void run() {
        
        if (nameA == "A" && yaEntreA == true) {
            
            for (int i = 0; i < 60; i++) {
                counterA++;
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            yaEntreA = false;
            System.out.println("El tiempo total de espera " + nameA + " " +(1*counterA));
        }
        if (nameB == "B") {
            
            for (int i = 0; i < 30; i++) {
                counterB++;
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            System.out.println("El tiempo total de espera " + nameB + " " + (2*counterB));
        }
        if (nameC == "C") {
            for (int i = 0; i < 20; i++) {
                counterC++;
                try {
                    sleep(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("El tiempo total de espera " + nameC + " " +(3*counterC));
        }
        if (nameD == "D") {
            for (int i = 0; i < 15; i++) {
                counterD++;
                try {
                    sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("El tiempo total de espera " + nameD + " " +(4*counterD));
        }
        if (nameE == "E") {
            for (int i = 0; i < 12; i++) {
                counterE++;
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("El tiempo total de espera " + nameE + " " +(5*counterE));
        }
        if (nameF == "F") {
            for (int i = 0; i < 10; i++) {
                counterF++;
                try {
                    sleep(6000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("El tiempo total de espera " + nameF + " " +(6*counterF));
        }
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
     * @return the theThread
     */
    public Thread getTheThread() {
        return theThread;
    }
}

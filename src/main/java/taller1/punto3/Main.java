/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.punto3;

/**
 *
 * @author Marco Contreras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyThread t1,t2,t3,t4 = null;
        
        t1 = new MyThread(1, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t1.start();
        t2 = new MyThread(2, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t2.start();
        t3 = new MyThread(3, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t3.start();
        t4 = new MyThread(4, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t4.start();
        
    }
    
}

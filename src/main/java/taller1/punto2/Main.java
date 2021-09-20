/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.punto2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco Contreras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread t1 = null;
        MyThread t2,t3,t4,t5,t6 = null;
       
       
        t1 = new MyThread(1, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        
        
        t2 = new MyThread(2, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t3 = new MyThread(3, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t4 = new MyThread(4, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t5 = new MyThread(5, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        t6 = new MyThread(6, (id,value) -> {
            System.out.println("Task: " + id + " = " + value);
        });
        
        System.out.println("Start 1");
        t1.start();
        System.out.println("Start 2");
        t2.start();
        System.out.println("Start 3");
        t3.start();
        System.out.println("Start 4");
        t4.start();
        System.out.println("Start 5");
        t5.start();
        System.out.println("Start 6");
        t6.start();
    }
    
}

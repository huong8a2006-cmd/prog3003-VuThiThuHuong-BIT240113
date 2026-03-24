/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public class MainThread {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        Thread t2 = new Thread(new WorkerRunnable());

        t1.start();
        t2.start();
    }
}


package dario.java.avanzado.clase1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicio Aplicación");

        MiHilo hilo1 = new MiHilo();
        hilo1.start();
        
        MiRunnable runnable1 = new MiRunnable(hilo1);
        Thread hilo2 = new Thread(runnable1);
        hilo2.start();         
        
        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Soy un runnable anónimo");
            }            
        });
        hilo3.start();
        
     
        Thread hilo4 = new Thread(() -> {
            try {
                hilo3.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Soy un runnable lamda");            
        });
        hilo4.start();
                       
        System.out.println("Fin Aplicación");
    }    

}

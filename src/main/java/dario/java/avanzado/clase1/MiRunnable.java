package dario.java.avanzado.clase1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MiRunnable implements Runnable {

    private Thread t;
    
    public MiRunnable(Thread t) {
        this.t = t;
    }
    
    @Override
    public void run() {
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MiRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Soy un runnable");
    }
        
}

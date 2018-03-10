package dario.java.avanzado.clase1;

public class MiHilo extends Thread {

    @Override
    public void run() {
        for (int i=0; i< 10; i++)
            System.out.println("Soy un hilo:"+i);
    }
       
}

package practica_presencial;

import static java.lang.Thread.sleep;

public class incremento2 extends Thread {
    private agregar c;
    private int seg;
    private int min;
    
     public incremento2(agregar c){
        this.c=c;
        seg = c.getSeg();
        min = c.getMin();    
    }
    
   @Override
    public void run() {
        for (; ;){
            if (seg!=59){
                seg=c.aumentSeg();
            }else{
                 seg=0;
                 c.resetSeg();
                if(min!=59){            
                    min=c.aumentMin();
                }          
            }
             try {
                sleep(999);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            if(!c.isContinuar()){
                try {
                    synchronized(this){
                       this.wait(); 
                    } 
                } catch (InterruptedException ex) {
                    System.err.println(ex.getMessage());
                }
            }    
        }       
    }    
    public void seguir(){
        synchronized(this){
            notifyAll();
        }
    }
}

public class Bevitore  extends Thread{
    private BotteVino risorsa;
    private boolean running;

    public Bevitore(String name, BotteVino ris){
        super(name);
        this.risorsa = ris;
        this.running = true;
    }

    @Override
    public void run() {
        synchronized (risorsa){
            risorsa.richiediBevuta(this);
        }  

        if(running){
            System.out.println(getName()+" ha bevuto");
        }

        synchronized(risorsa){
            risorsa.esci();
        }

    }

    
    public void arresta(){
        this.running = false;
    }
    
}

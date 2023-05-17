public class BotteVino{
    private int litriRimanenti;
    private int rubinettiLiberi;

    public BotteVino(){
        this.litriRimanenti = 100;
        this.rubinettiLiberi = 3;
    }

    public synchronized void richiediBevuta(Bevitore b){
        String name = b.getName();


        while (rubinettiLiberi == 0){
            System.out.println(name+" è in attesa");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        
        rubinettiLiberi--;

        System.out.println(name+" giunge al rubinetto");

        try {
            Thread.sleep((int)(Math.random()*3000 +1));
        } catch (Exception e) {
            
        }

        if(litriRimanenti >= 1){
            litriRimanenti--;

        }else{
            System.out.println(name+ " ha trovato la botte vuota");
            b.arresta();
        }

    }

    public synchronized void esci(){
        rubinettiLiberi++;
 
        notifyAll();
    }
}
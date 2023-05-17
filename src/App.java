

public class App {
    public static void main(String[] args) throws Exception {

        BotteVino botte = new BotteVino();

        Bevitore b1 = new Bevitore("Bevitore 1", botte);
        Bevitore b2 = new Bevitore("Bevitore 2", botte);
        Bevitore b3 = new Bevitore("Bevitore 3", botte);
        Bevitore b4 = new Bevitore("Bevitore 4", botte);
        Bevitore b5 = new Bevitore("Bevitore 5", botte);
        Bevitore b6 = new Bevitore("Bevitore 6", botte);
        Bevitore b7 = new Bevitore("Bevitore 7", botte);
        Bevitore b8 = new Bevitore("Bevitore 8", botte);
        Bevitore b9 = new Bevitore("Bevitore 9", botte);
        Bevitore b10 = new Bevitore("Bevitore 10", botte);
    
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
        b6.start();
        b7.start();
        b8.start();
        b9.start();
        b10.start();
        
    
    }
}

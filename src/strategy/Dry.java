package strategy;

public class Dry implements WashingMachineModes {

    @Override
    public void action() {
        System.out.println("Drying clothes...");
    }
    
}

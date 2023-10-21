package strategy;

public class ToWash implements WashingMachineModes {

    @Override
    public void action() {
        System.out.println("Washing clothes...");
    }
    
}

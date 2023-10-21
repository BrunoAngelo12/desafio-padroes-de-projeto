package strategy;

public class StandBy implements BlenderModes {

    @Override
    public void action() {
        System.out.println("Waiting for operation...");
    }
    
}

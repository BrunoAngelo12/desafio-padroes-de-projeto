package facade;

import singleton.WashingMachineSingleton;
import strategy.WashingMachineModes;

public class WashingMachineFacade {
    private WashingMachineSingleton wMachine;

    public WashingMachineFacade(){
        wMachine = WashingMachineSingleton.getInstance();
    }

    public void addingWater(){
        System.out.println("Adding water...");
    }

    public void changeAction(WashingMachineModes action){
        wMachine.setBlenderModes(action);
        System.out.println("Changed operating mode !");
    }

    public void turnOnMachine(){
        wMachine.turnOn();
    }
}

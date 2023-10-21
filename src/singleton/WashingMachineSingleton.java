package singleton;

import strategy.WashingMachineModes;

public class WashingMachineSingleton{
    private static WashingMachineSingleton instancia;
    private WashingMachineModes washingMachineModes;

    private WashingMachineSingleton(){
    }

    public static WashingMachineSingleton getInstance(){
        if(instancia == null){
            instancia = new WashingMachineSingleton();
        }
        return instancia;
    }

    public void setBlenderModes(WashingMachineModes washingMachineModes) {
        this.washingMachineModes = washingMachineModes;
    }

    public void turnOn(){
        washingMachineModes.action();
    }

}
package singleton;

import strategy.BlenderModes;

public class BlenderSingleton{
    private static BlenderSingleton instancia;
    private BlenderModes blenderModes;

    private BlenderSingleton(){
    }

    public static BlenderSingleton getInstance(){
        if(instancia == null){
            instancia = new BlenderSingleton();
        }
        return instancia;
    }

    public void setBlenderModes(BlenderModes blenderModes) {
        this.blenderModes = blenderModes;
    }

    public void turnOn(){
        blenderModes.action();
    }

}
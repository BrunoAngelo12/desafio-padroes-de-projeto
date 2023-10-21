package singleton;

import strategy.BlenderModes;
import strategy.StandBy;

public class Blender{
    private static Blender instancia;
    private BlenderModes blenderModes;

    private Blender(){
        blenderModes = new StandBy();
    }

    public static Blender getInstance(){
        if(instancia == null){
            instancia = new Blender();
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
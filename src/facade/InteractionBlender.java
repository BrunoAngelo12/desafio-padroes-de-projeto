package facade;

import singleton.Blender;
import strategy.BlenderModes;

public class InteractionBlender {
    private Blender blender;

    public InteractionBlender(){
        blender = Blender.getInstance();
    }

    public void addingIngredients(){
        System.out.println("Adding ingredients...");
    }

    public void changeAction(BlenderModes action){
        blender.setBlenderModes(action);
        System.out.println("Changed operating mode !");
    }

    public void turnOnBlender(){
        blender.turnOn();
    }
}

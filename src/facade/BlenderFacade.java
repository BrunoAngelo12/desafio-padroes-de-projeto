package facade;

import singleton.BlenderSingleton;
import strategy.BlenderModes;

public class BlenderFacade {
    private BlenderSingleton blender;

    public BlenderFacade(){
        blender = BlenderSingleton.getInstance();
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

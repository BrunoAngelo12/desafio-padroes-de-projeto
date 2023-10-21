package singleton;

public class Blender{
    private static Blender instancia;

    private Blender(){
    }

    public static Blender getInstance(){
        if(instancia == null){
            instancia = new Blender();
        }
        return instancia;
    }
}
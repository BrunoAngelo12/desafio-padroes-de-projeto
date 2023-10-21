import singleton.Blender;

public class App {
    public static void main(String[] args) throws Exception {
        Blender blender = Blender.getInstance();
        System.out.println(blender);
        blender = Blender.getInstance();
        System.out.println(blender);
    }
}

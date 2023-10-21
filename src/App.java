import facade.BlenderFacade;
import strategy.Grind;
import strategy.Mix;
public class App {
    public static void main(String[] args) throws Exception {
        BlenderFacade blenderInteraction = new BlenderFacade();
        blenderInteraction.addingIngredients();
        blenderInteraction.changeAction(new Grind());
        blenderInteraction.turnOnBlender();
        blenderInteraction.changeAction(new Mix());
        blenderInteraction.turnOnBlender();
    }
}

import facade.InteractionBlender;
import strategy.Grind;
public class App {
    public static void main(String[] args) throws Exception {
        InteractionBlender blenderInteraction = new InteractionBlender();
        blenderInteraction.addingIngredients();
        blenderInteraction.turnOnBlender();
        blenderInteraction.changeAction(new Grind());
        blenderInteraction.turnOnBlender();
    }
}

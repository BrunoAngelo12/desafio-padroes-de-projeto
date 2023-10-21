import facade.WashingMachineFacade;
import strategy.ToWash;
import strategy.Dry;
public class App {
    public static void main(String[] args) throws Exception {
        WashingMachineFacade wMachine = new WashingMachineFacade();
        wMachine.addingWater();
        wMachine.changeAction(new ToWash());
        wMachine.turnOnMachine();
        wMachine.changeAction(new Dry());
        wMachine.turnOnMachine();
    }
}

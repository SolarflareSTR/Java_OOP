import Classes.PromotionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("President", 1);
        iActorBehaviour client4 = new PromotionClient("Adilzhan", "Black Friday", 1);
        //iReturnOrder client5 = new SpecialClient("Egor", 2);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(new TaxService());

        market.update();
    }
}
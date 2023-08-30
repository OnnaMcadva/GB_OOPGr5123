package org.example;
import org.example.Classes.Actor;
import org.example.Classes.Market;
import org.example.Classes.OrdinaryClient;
import org.example.Classes.SpecialClient;
import org.example.Classes.TaxInspector;
import org.example.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();
    }
}
package org.example;
import org.example.Classes.Actor;
import org.example.Classes.Market;
import org.example.Classes.OrdinaryClient;
import org.example.Classes.SpecialClient;
import org.example.Classes.TaxInspector;
import org.example.Interfaces.iActorBehaviour;
import org.example.Classes.ActionClient;

public class App {
    public static void main(String[] args) throws Exception {
        Market tesco = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Петя");
        iActorBehaviour client2 = new SpecialClient("Петрович", 1);
        iActorBehaviour client3 = new TaxInspector();
        ActionClient.nameOfAction = "Кто возьмет билетов пачку";
        ActionClient.numberOfParticipants = 13;
        iActorBehaviour client4 = new ActionClient("Счастливчик", 666);
        iActorBehaviour client5 = new ActionClient("Cartoon Head", 13);

        tesco.acceptToMarket(client1);
        tesco.acceptToMarket(client1);
        tesco.acceptToMarket(client2);
        tesco.acceptToMarket(client3);
        tesco.acceptToMarket(client4);
        tesco.acceptToMarket(client5);


        tesco.update();

    }
}
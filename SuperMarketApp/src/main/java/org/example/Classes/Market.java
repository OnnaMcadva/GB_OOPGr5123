package org.example.Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;


import org.example.Interfaces.iActorBehaviour;
import org.example.Interfaces.iMarketBehaviour;
import org.example.Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        String strAcceptToMarket = actor.getActor().getName() + " пришел в магазин";
        System.out.println(strAcceptToMarket);
        logActions(strAcceptToMarket);
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        String strTakeInQueue = actor.getActor().getName() + " встал в очередь";
        System.out.println(strTakeInQueue);
        logActions(strTakeInQueue);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            String strReleaseFromMarket = actor.getName() + " ушел из магазина";
            System.out.println(strReleaseFromMarket);
            logActions(strReleaseFromMarket);
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                String strTakeOrder = actor.getActor().getName() + " сделал заказ";
                System.out.println(strTakeOrder);
                logActions(strTakeOrder);
            }
        }

    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                String strGiveOrder = actor.getActor().getName() + " получил свой заказ";
                System.out.println(strGiveOrder);
                logActions(strGiveOrder);
            }
        }

    }

    //@Override
    public void returnOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isReturnOrder()) {
                actor.setReturnOrder(true);
                String strReturnOrder = actor.getActor().getName() + " вернул свой заказ";
                System.out.println(strReturnOrder);
                logActions(strReturnOrder);
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                String strReleaseFromQueue = actor.getActor().getName() + " ушел из очереди";
                System.out.println(strReleaseFromQueue);
                logActions(strReleaseFromQueue);
            }
        }
        releaseFromMarket(releaseActors);
    }


    /**
     * @apiNote Метод записывает действия класса в файл log.txt
     * @param note текст действия
     */
    public void logActions(String note) {
        String fileName = "log.txt";
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedTime = currentTime.format(formatter);
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(formattedTime + " " + note + "\n");
            //System.out.println("!");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
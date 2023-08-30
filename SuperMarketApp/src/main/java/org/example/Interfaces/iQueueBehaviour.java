package org.example.Interfaces;

import org.example.Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
package org.example.Interfaces;

import org.example.Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public boolean isReturnOrder();
    public void setTakeOrder(boolean take);
    public void setMakeOrder(boolean make);
    public void setReturnOrder(boolean returnOrder);
    Actor getActor();
}
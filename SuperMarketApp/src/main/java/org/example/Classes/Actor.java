package org.example.Classes;

import org.example.Interfaces.iActorBehaviour;
import org.example.Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected boolean isReturnOrder;
    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);
    abstract public String getName();

}
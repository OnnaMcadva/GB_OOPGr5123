package org.example.Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    public boolean isTakeOrder() { return super.isTakeOrder; }
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
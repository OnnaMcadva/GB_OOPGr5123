package org.example.Classes;

import org.example.Interfaces.iReturnOrder;

/**
 * Вспомогательный класс... Пока не разобралась в задании - пусть будет здесь...
 */

public abstract class MarketOrder implements iReturnOrder{
    int orderId;
    String nameOrder;
    double priceOrder;

    public MarketOrder(int orderId, String nameOrder, double priceOrder) {
        this.orderId = orderId;
        this.nameOrder = nameOrder;
        this.priceOrder = priceOrder;
    }
    public String returnOrder(int orderId, int numberOfReturnedItems, String reasonForReturn, double returnAmount) {
        return "Товар успешно возвращен";
    }
    public String getReasonForReturn() {
        return "Не пригодилллось:)";
    }

    public int getNumberOfReturnedItems() {
        return 13;
    }

    public double getTotalAmount() {
        return 130;
    }
}

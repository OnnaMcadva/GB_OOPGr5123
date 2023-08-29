package org.example;
import java.util.ArrayList;
import java.util.List;

import org.example.Domen.Bottle;
import org.example.Domen.HotDrink;
import org.example.Domen.Product;
import org.example.Services.CoinDispenser;
import org.example.Services.Holder;
import org.example.Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Peanut", 50);
        Product item3 = new Bottle("Mineral water", 101, 1.5);
        Product item4 = new HotDrink("Coffee", 77, 70);
        Product item5 = new HotDrink("Fresh ginger tea", 83, 66);
        Product item6 = new HotDrink("Hot chocolate", 80, 60);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold = new Holder(10, 10);

        VendingMachine venMach = new VendingMachine(hold, assort);

        for(Product prod: venMach.getProductList())
        {
            System.out.println(prod);
        }

//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize();
    }
}
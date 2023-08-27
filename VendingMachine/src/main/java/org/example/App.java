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
        List<Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("cola", 50);
        Product item3 = new Bottle("Mineral water", 101, 1.5);
        Product item4 = new HotDrink("Coffee", 77, 70);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser disp = new CoinDispenser(120);

        VendingMachine venMach1 = new VendingMachine(hold1, disp, assort);

        for(Product prod: venMach1.getProductList())
        {
            System.out.println(prod);
        }
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
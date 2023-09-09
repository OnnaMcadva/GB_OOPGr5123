package org.example.Services;

import java.util.List;

import org.example.Domain.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> productList;

    public VendingMachine(Holder holder, List<Product> productList) {
        this.holder = holder;
        dispenser = new CoinDispenser();
        this.productList = productList;
    }

    public Product buyProduct(int index) {
        return productList.get(index);
    }

    public void release() {

    }

    public List<Product> getProductList() {
        return productList;
    }
}
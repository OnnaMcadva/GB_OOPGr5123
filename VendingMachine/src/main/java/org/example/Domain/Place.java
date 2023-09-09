package org.example.Domain;

public class Place {
    private int row;
    private int col;
    private Product content;

    public Place(int row, int col) {
        this.row = row;
        this.col = col;
        content = null;
    }


    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isEmpty(){
        return content == null;
    }
    public void loadProduct(Product product) {
        content = product;
    }
    public Product unLoadPlace() {
        Product product = content;
        content = null;
        return product;
    }
}
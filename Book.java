package com.company;

public class Book {
    private String name;
    private double price;
    private int qty;
    private Author[] authors;


    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.price = price;
        this.qty = 0;
        this.authors = authors;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }



    public String getAuthorNames(){
        String result= "";
        for (int i = 0; i < authors.length-1; i++){
            result+= authors[i].name+",";
        }
        return result += authors[authors.length-1];

    }


}
class Author{
     public String name;
     public String email;
     public char gender;

}

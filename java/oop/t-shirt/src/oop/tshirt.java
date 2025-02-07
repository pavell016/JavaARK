package oop;

public class tshirt {
    private int shirtID;
    private String description;
    private char size;
    private double price;
    private int quantityInStock;
    public tshirt(int id, String desc, char size, double pr, int qtt){
        this.shirtID = id;
        this.description = desc;
        this.size = size;
        this.price = pr;
        this.quantityInStock = qtt;
    }
    public void displayInformation(){
        System.out.println("T-Shirt{shirtID="+shirtID+", description="+description+
                                   ", size="+size+", price="+price+", quantityInStock="+quantityInStock+"}");
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void addStock(int newStock){
        this.quantityInStock += newStock;
    }
}

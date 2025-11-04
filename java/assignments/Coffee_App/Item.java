public class Item{

    private String name;
    private double price;


    public Item(String n, double p){
        this.name = n;
        this.price = p; 
    }


    // Getter
    public String getname(){
        return this.name;
    }
    // setter 
    public void changeName(String name){
        this.name = name;
    } 

    // Getter
    public double getPrice(){
        return this.price;
    }

    // setter 
    public void changePrice(double price){
        this.price = price;
    }





}
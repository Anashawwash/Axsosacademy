public class Item{
    static int max_Acu= 0;
    private String name;
    private double price;
    private int id;


    public Item(String name, double price){
        max_Acu++;
        this.id = max_Acu;
        this.name = name;
        this.price = price; 
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
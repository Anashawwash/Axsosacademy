import java.util.ArrayList;
public class Order{

    // public var _______
    public double total;

    // private var ______
    private String name ;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }


    public Order(String Name){
        this.name = Name;
        this.items = new ArrayList<Item>();
    }


    // getter 
    public String getName(){
        return this.name;
    }

    // Settet
    public void changeName(String name){
        this.name = name;
    }


    //getter 
    public boolean getOrderStatus(){
        return this.ready;
    }

    // Setter
    public void setOrderStatus(boolean ready){
        this.ready = ready;
    }


    // Getter
    public ArrayList getItems(){
        return this.items;
    }

    // Setter 
    public void changeItems(ArrayList<Item> items){
        this.items = items;
    }



    // starting with real methods now______


    // ___Add Item to the Order
    public void addItem(Item item){
        this.items.add(item);
        this.total += item.getPrice();
    }

    // get Order Status 
    public String getStatusMassage(){
        if (this.ready == false)
            return "Thank you for waiting , your order will be ready soon";
        else
            return "Your Order is ready";
    }



    // get the total of the order 
    public double getOrderTotal(){

        for(Item item : this.items){
            this.total += item.getPrice();
        }
        return this.total;
    }



    // Display the order 
    public void displayOrder(){
        System.out.println(this.name);
        for (Item item : this.items){
            System.out.println(item.getname()+"-$"+item.getPrice());
        }
        System.out.println("The Total is : $" + this.total);
    }

}
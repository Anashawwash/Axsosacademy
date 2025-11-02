import java.util.ArrayList;
import java.util.Scanner;



public class CoffeeKiosk{
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String name , double price){
        int index = 0;
        Item new_item  = new Item(name, price);
        this.menu.add(new_item);
    }

    public void displayMenu(){
        for (int i = 0 ; i < menu.size();i++){
            System.out.println(i+ " " + menu.get(i).getname()+" --$" + menu.get(i).getPrice());

        }
    }



    public void newOrder() {
        Scanner scanner = new Scanner(System.in);
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = scanner.nextLine();
    
        // Your code:
        Order newOrder = new Order(name);
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
            String number = scanner.nextLine();
        
        // Write a while loop to collect all user's order items

        while(!number.equals("q")) {
            newOrder.addItem(menu.get(Integer.parseInt(number)));
            System.out.println("Please enter a menu item index or q to quit:");
            number = scanner.nextLine();
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        System.out.println("Order Name : " + name);
        newOrder.displayOrder();
        // After you have collected their order, print the order details 
    }
}
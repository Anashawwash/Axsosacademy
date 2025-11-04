public class Test{

    public static void main(String[] args){

        Order order1 = new Order();
        Order order2 = new Order();        
        Order order3 = new Order("Anas");
        Order order4 = new Order("Omar");


        // Item item1 = new Item("mocha",1);
        // Item item2 = new Item("latte",2);
        // Item item3 = new Item("drip coffee",3);
        // Item item4 = new Item("cappuccino",4);

        // order3.addItem(item1);
        // order3.addItem(item3);

        // order3.getStatusMassage();
        // order3.getOrderTotal();
        // order3.displayOrder();

        CoffeeKiosk mycoffe = new CoffeeKiosk();
        mycoffe.addMenuItem("mocha",1);
        mycoffe.addMenuItem("latte",2);
        mycoffe.addMenuItem("drip coffee",3);
        mycoffe.addMenuItem("cappuccino",4);

        mycoffe.newOrder();




    }
}
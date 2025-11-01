import java.util.ArrayList;
public class Test{

    public static void main(String[] args){

        Item item1 = new Item("mocha",1);
        Item item2 = new Item("latte",2);
        Item item3 = new Item("drip coffee",3);
        Item item4 = new Item("cappuccino",4);




        Order order1 = new Order();
        order1.name =  "Rami";
        order1.items = new ArrayList<Item>();


        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items = new ArrayList<Item>();


        Order order3 = new Order();
        order3.name = "Noah";
        order3.items = new ArrayList<Item>();

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items = new ArrayList<Item>();
        

        order2.items.add(item1);
        order2.total += item1.price;


        order3.items.add(item4);           
        order3.total += item4.price;


        order4.items.add(item2);           
        order4.total += item2.price;
        System.out.println(order4.total);


        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.println(order4.total);



        order2.ready = true;




    }

}
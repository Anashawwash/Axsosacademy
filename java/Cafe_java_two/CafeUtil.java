import java.util.Arrays;
import java.util.ArrayList;

public class CafeUtil{

    public int getStreakGoal(int numWeek){
        int sum = 0;
        for (int i  = 1 ; i <= numWeek ; i++){
            sum += i;
        }
        return sum;
    } 

    public int getOrderTotal(double[] lineItems){
        int sum =0;
        for (int i = 0; i < lineItems.length;i ++){
            sum += lineItems[i];

        }

        return sum;
    }

    public void displayMenu(ArrayList<String>menu){
        for (int i = 0 ; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String>customers){
        System.out.println("Enter your name please");
        String username = System.console().readLine();
        System.out.println("Hello " + username + "! there are" + customers.size() + "people in front of you .");
        customers.add(username);

    }

}
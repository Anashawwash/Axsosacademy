public class CafeJava {


    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = "your order will be ready shortly";
        String readyMessage = "your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double dripCoffe = 10.5;
        double latte = 12;
        double cappuccino = 10.1;

        // Customer name variables (add yours below)
        String customer1 = "Ahmad";
        String customer2 = "sali";
        String customer3 = "Adam";


        // Order completions (add yours below)

        boolean orderStatus1 = false;
        boolean orderStatus2 = true;
        boolean orderStatus3 = true;


        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer1);
        System.out.println(generalGreeting + customer2);
        System.out.println(generalGreeting + customer3);

        if (orderStatus2) {
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }
        if (orderStatus1) {
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }
        System.out.println("Sali ordered 2 lattes "+ displayTotalMessage +(latte + latte));
        if (orderStatus2) {
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }
        System.out.println(displayTotalMessage + (latte + dripCoffe) + " What he owes " + (latte - dripCoffe));
        if (orderStatus3) {
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }

    }
}

 
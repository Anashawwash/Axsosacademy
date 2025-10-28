import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int x = indexof("Alexis")
        if (x != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that"
        }
        int y = indexof("Alfred")
        else if ( y != -1){
            return "At your service. As you wish, naturally."
        }
        else{

            return "Right. And with that I shall retire."
        }
    }
    
}
import java.util.ArrayList;
public class List{

    public static void main(String[] args){
        ArrayList<Object> mylist = new ArrayList<Object>();
        mylist.add("13");
        mylist.add("Hello world");
        mylist.add(48);
        mylist.add("Goodbay world");
        for (int i = 0 ; i < mylist.size();i ++){
            try{
                Integer Num = (Integer) mylist.get(i);
                System.out.println(Num);
                } catch (ClassCastException e){
                    System.out.println("Error");
                }
        }
    }
}
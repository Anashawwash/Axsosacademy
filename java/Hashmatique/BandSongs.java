import java.util.HashMap;
import java.util.Set;


public class BandSongs{

public static void main(String[] args){

    HashMap<String , String> Songs = new HashMap<String , String>();

    Songs.put("song1" ,"this is song1" );
    Songs.put("song2","this is song 2");
    Songs.put("song3","this is song3");
    Songs.put("song4","this is song4");

    
    String song = Songs.get("song1");
    System.out.println(song);


    Set<String> keys = Songs.keySet();
    for (String key: keys )
    {
        System.out.println("Key : " + key + " ,value :"+ Songs.get(key));


    }




}




}
import java.util.Random;


public class Puzzle{
    Random ran = new Random();

    public  int[] getTenRolls(int size,int endpoint){
        int[] array = new int[size];
        for (int i = 0 ; i < size ; i++){
            int nanNum = ran.nextInt(endpoint + 1);
            array[i] = nanNum;
        }
        return array;
    }

    public char getRandomLetter(){
        String all = "abcdefghijklmnopqrstuvwxyz";
        int namNum = ran.nextInt(26); 
        char me = all.charAt(namNum);
        return me;
    }

    public char[] generatePassword(){
        String all = "abcdefghijklmnopqrstuvwxyz0123456789@#$%*_!";
        char[] pass = new char[8];
        for ( int i = 0 ; i < 8 ; i++){
            int num = ran.nextInt(all.length());
            pass[i]= all.charAt(num);

        }
        return pass;
    }

    public String[] getNewPasswordSet(int length){
        String[] set = new String[length];
        for (int i = 0 ; i < length ; i ++){
            set[i] = new String(generatePassword());
        }
        return set;
    }

    public String[] shuffle(String[] mylist){
        for(int i = 0 ; i < 5 ; i ++){
            int randomOne = ran.nextInt(mylist.length);
            int randomTwo = ran.nextInt(mylist.length);
            String temp = mylist[randomOne];
            mylist[randomOne] = mylist[randomTwo];
            mylist[randomTwo] = temp;
        }
    return mylist;
    }

}
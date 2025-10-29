import java.util.Random;


public class Puzzle{

    Random ran = new Random();
    public  int[] getTenRolls(){
        int[] array = new int[10];
        for (int i = 0 ; i < 10 ; i++){
            int nanNum = ran.nextInt(20);
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
        String all = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] pass = new char[8];
        for ( int i = 0 ; i < 8 ; i++){
            int num = ran.nextInt(38);
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


}
public class Main{

    public static void main(String[] args){

        Puzzle me = new Puzzle();
        int size = 10;
        int endpoint = 20;
        System.out.println(me.getTenRolls(size,endpoint));
        System.out.println(me.getRandomLetter());
        System.out.println(me.generatePassword());
        me.getNewPasswordSet(10);


        
    }


    

}
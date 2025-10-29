public class Main{

    public static void main(String[] args){

        Puzzle me = new Puzzle();
        System.out.println(me.getTenRolls());
        System.out.println(me.getRandomLetter());
        System.out.println(me.generatePassword());
        me.getNewPasswordSet(10);


        
    }


    

}
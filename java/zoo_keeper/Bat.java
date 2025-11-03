public class Bat extends Mammls{
    String name;

    public Bat(String name){
        super(300);
        this.name = name;
    }

    public void fly(){
        this.energy-=50;
        System.out.println("the Bat now is airborn");
    }

    public void eatHumans(){
        this.energy += 25;
        System.out.println("hmmmmmmmm this was good ");
    }

    public void attackTown(){
        this.energy -= 100;
        System.out.println("is was cool and good");

    }

}
public class Gorilla extends Mammls{
    String name;

    public Gorilla(String name){
        super(100);
        this.name = name;
    }

    public void throwSomething(){
        this.energy -= 5;
        System.out.println("the Gorilla throw something");
    }

    public void eatBananas(){
        this.energy += 10;
        System.out.println("hmmmmmmmmm");
    }

    public void climb(){
        this.energy -=10;
        System.out.println("the gorilla has climbed a tree ");
    }

}
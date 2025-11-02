public  class Phone extends Device {

    public Phone(){
        super();
    }

public makeCall(){
    this.battery -= 5;
    System.out.println("make A Call");
    System.out.println("the battery Life is :" + this.battery);
}

public playGame(){
    this.battery -= 20;
    System.out.println("play a Game");
    System.out.println("the battery Life is :" + this.battery);
}
public Charge(){
    if (this.battery > 50){
        this.battery = 100;
    }
    this.battery += 50;
    System.out.println("Charging");
    System.out.println("the battery Life is :" + this.battery);
}

}
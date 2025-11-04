public Device{
    int battery ; 


    public Device(){
        this.battery = 100;
    }

   // showing the battery life for each device
    public void remainingBatteryLife(){
        System.out.println(this.battery);
    }

}
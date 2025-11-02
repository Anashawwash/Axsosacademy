public class Bank{
    // MEMBER VARIABLES
    public String firstName;
    private double checkingBalance;
    private double savingsBalance;
 
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances
    private static int accounts = 0;
 
    // CONSTRUCTOR
    public Bank(String firstName , double checkingBalance , double savingsBalance){
        this.firstName = firstName;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts ++;
        totalMoney += (checkingBalance + savingsBalance);
    }
 
    // GETTERS
    public static int getAccountes(){
        return accounts;
    }
 
    public double getTotalMony(){
        return totalMoney;
    }
 
    // getter
    public double getSavingBalance(){
        return this.savingsBalance;
    }
    // getter
    public double getchekingBalance(){
        return this.checkingBalance;
    }
 
    // for checking, savings, accounts, and totalMoney
 
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double value , String type){
        if (type.equals("checkingBalance")){
            this.checkingBalance += value;
            totalMoney += value;
        }
        else{
            this.savingsBalance += value;
            totalMoney += value;
 
        }
    }
 
 
    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double value , String type){
        if (type.equals("checkingBalance") && this.checkingBalance >= value){
            this.checkingBalance -= value;
            System.out.println("your Balance is "+ checkingBalance);
            totalMoney -= value;
 
        }
        if(type.equals("savingBalance") && this.savingsBalance >= value)
        {
            this.savingsBalance -= value ;
            System.out.println("your Balance is " + savingsBalance);
            totalMoney -= value;
        }
        else
        {
            System.out.println("your balnace is not enough");
        }
    }
    // getBalance
    public double getBalance(){
        return (this.checkingBalance + this.savingsBalance);
    }
 
 
    // display total balance for checking and savings of a particular bank account
        public void  displayGetBalance(){
            double y = this.checkingBalance + this.savingsBalance;
        System.out.println("you Total balance : "+y);
        }
 
}
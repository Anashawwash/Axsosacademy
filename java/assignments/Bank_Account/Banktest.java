public class Banktest {
    public static void main(String[] args){
        // Create 3 bank accounts
        Bank c1 = new Bank("anas",100,200);
        Bank c2 = new Bank("sam",1000,2000);
        Bank c3 = new Bank("khaled",2,32);
 
 
 
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        System.out.println(c1.getSavingBalance());
        c1.deposit(200 , "savingBalance");
        System.out.println(c1.getSavingBalance());
        // - each deposit should increase the amount of totalMoney
 
        // Withdrawal Test
        c1.withdraw(200, "savingBalance");
 

        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
       System.out.println(c1.getSavingBalance());

       
        // - each withdrawal should decrease the amount of totalMoney
 
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(Bank.getAccountes());
    }
}
 
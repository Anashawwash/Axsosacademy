class BankAccount():
    def __init__(self,Fname,Lname):
        self.Fname = Fname
        self.Lname = Lname
        self.balance = 0
        self.intresst = 1.01
            
    def Deposit(self,mony):
        self.balance += mony
        return self
        
    def withdrawal(self,mony):
        if (mony > self.balance):
            self.balance -= 5
            print("Insufficient funds: Charging a $5 fee and deduct $5")
            return self
        else:
            self.balance -= mony
            return self
    
    def display_user_balance(self):
        print(self.balance)
        
    def yield_interest(self):
        self.balance *= self.intresst
        return self
        
        
        
Anas = BankAccount("Anas","Hawwash")

Omar = BankAccount("Omar", "Hawwash")


Anas.Deposit(100).Deposit(110).Deposit(150).withdrawal(200).yield_interest().display_user_balance()


Omar.Deposit(100).Deposit(110).withdrawal(20).withdrawal(20).withdrawal(1).withdrawal(3).yield_interest().display_user_balance()
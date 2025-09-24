from BankUser import BankAccount
class User:
    def __init__(self ,Fname,Lname):
        self.Fname = Fname
        self.Lname = Lname
        self.accaount = BankAccount(Fname,Lname)
        self.accaount.balance
        
        
    
    def make_withdrawal(self, amount):
        self.accaount.balance -= amount
    
    def Deposit(self,mony):
        self.accaount.balance += mony
        return self
        
    def display_user_balance(self):
        print(self.accaount.balance)
        
        
Anas = User("Anas","Hawwash")
Anas.accaount.Deposit(100).Deposit(110).Deposit(150).withdrawal(200).yield_interest().display_user_balance()

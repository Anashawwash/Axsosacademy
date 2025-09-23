class User:
    def __init__(self ,name):
        self.name = name
        self.balance = 0
        
    
    def make_withdrawal(self, amount):
        self.balance += amount
        
    def display_user_balance(self):
        print(self.balance)
        
        
        
        

anas = User("Anas")




anas.display_user_balance()
anas.make_withdrawal(100)








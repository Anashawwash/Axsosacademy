class User:
    def __init__(self ,name):
        self.name = name
        self.balance = 0
        
    
    def make_withdrawal(self, amount):
        self.balance += amount
        return self
        
    def display_user_balance(self):
        print(self.balance)
        return self
        
        
        
        

anas = User("Anas")





anas.make_withdrawal(100).make_withdrawal(100).make_withdrawal(100).display_user_balance()










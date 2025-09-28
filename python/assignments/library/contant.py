class Contant_Library:
    def __init__(self, name , author, availability = True ):
        self.name = name
        self.author = author
        self.availability = availability
        
        
        
        
        
        
    def Borrowing(self):
        if (self.availability == False):
            print("this Book is not availabil rn")
        else:
            self.availability = False
            print("Have fun")
            
    def Returning(self):
        if (self.availability == True):
            print("We alrady have the Book")
        else:
            self.availability = True
            print("Thank you, Have a good day")
            
            
    def Check(self):
        print(self.availability)
        
        
        

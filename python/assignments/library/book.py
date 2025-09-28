from contant import Contant_Library
class Book(Contant_Library):
    def __init__(self,name, author ,description):
        self.description = description
        super().__init__(name , author, availability = True )
        
    def Borrowing(self):
        if (self.availability == False):
            print("this Book is not availability")
        else:
            self.availability = False
            print("Have Fun")




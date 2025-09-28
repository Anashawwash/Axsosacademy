from book import Book
class Library:
    def __init__(self,name):
        self.name = name
        
        
    def Add_Book(self ,name, author ,availability ,description ):
        
        Book(name , author , description)
        
        
               
    def Add_DVD(self ,name, author ,availability ,description ):
        Book(name , author , availability , description)
        
        
        
    def Add_Magazine(self ,name, author ,availability ,description ):
        Book(name , author , availability , description)
        
        
        
main = Library("One")

main.Add_Book("live","anas", True,"aboutUs")


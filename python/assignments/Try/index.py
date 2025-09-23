class users:
    def __init__(self):
        self.name= "binladin"
        self.gmail = "anas@gmail.com"
        self.mony = 0
        
    def addmony(self,dolar):
        self.mony += dolar

anas = users()
omar = users()

anas.name = "hawwash"

omar.name = "BigNigga"


print(anas.mony)
anas.addmony(100)
print(anas.mony)
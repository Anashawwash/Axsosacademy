class Zoo:
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name
        
        
        
    def add_lion(self, name,age , health, happiness_level):
        self.animals.append( Lion(name,age , health, happiness_level) )
        
        
    def add_tiger(self, name,age , health, happiness_level):
        self.animals.append(Tiger(name,age , health, happiness_level) )
        
    def add_Monky(self, name,age , health, happiness_level):
        self.animals.append(Monky(name,age , health, happiness_level) )
        
    def print_all_info(self):
        print("-" * 30, self.name, "-" * 30)
        for animal in self.animals:
            animal.print_all_info()
            
            
             





class Animal:
    def __init__(self, name , age , health,happiness_level):
        self.name = name
        self.age = age
        self.health = health
        self.happiness_level = happiness_level
        
        
    def print_all_info(self):
        print("-"*30, self.name, self.health , self.happiness_level, "-"*30)


    def feeding(self):
        raise NotImplementedError


class Lion(Animal):
    def __init__(self, name, age , health, happiness_level):
        self.dis = "Big_cat"
        self.dis2 = "Sad_Animal"
        super().__init__(name,age, health,happiness_level)

    def feeding(self):
        self.health += 2
        self.happiness_level += 2
        print("num num num this is good ")
        print("the health and happiness is increased by 2")
        
        
        
        
        
class Tiger(Animal):
    def __init__(self , name , age ,health,happiness_level ):
        self.discreption = "Love food so mucth"
        super().__init__(name , age , health, happiness_level)
        
    def feeding(self):
        self.health += 10
        self.happiness_level += 10
        print("raaaaaaaaaaaaaaaaaaaaaaaaaaaaaar")
        print("the health and happiness is increased by 10")
        
        
class Monky(Animal):
    def __init__(self , name , age ,health,happiness_level ):
        self.discreption = "Love food so mucth"
        self.discreption = "love banana"
        super().__init__(name , age , health, happiness_level)
        
    def feeding(self):
        self.health += 20
        self.happiness_level += 20
        print("more banana banaaaaaaaanaaaaaaaaa")
        print("the health and happiness is increased by 20")
        




  

zoo1 = Zoo("John's Zoo") 
zoo1.add_lion("Nala",5,0,20)
zoo1.add_lion("Simba", 2,30,0)
zoo1.add_tiger("Rajah",8,30,10)
zoo1.add_Monky("banna1",10,20,30)
zoo1.add_Monky("banna2", 20, 50, 1)
zoo1.add_tiger("Shere Khan" ,9 ,30,50)

zoo1.print_all_info()
# zoo1.animals[1].feeding()
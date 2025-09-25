class Zoo:
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name
        
        
        
    def add_lion(self, name):
        self.animals.append( Lion(name) )
        
        
    def add_tiger(self, name):
        self.animals.append( Tiger(name) )
        
        
    def print_all_info(self):
        print("-"*30, self.name, "-"*30)
        
        
        for animal in self.animals:
            animal.display_info()
             
zoo1 = Zoo("John's Zoo") 
Zoo.add_lion("Nala")
Zoo.add_lion("Simba")
Zoo.add_tiger("Rajah")
Zoo.add_tiger("Shere Khan")
Zoo.print_all_info()
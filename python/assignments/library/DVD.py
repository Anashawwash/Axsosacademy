from library import Library
class DVD(Library):
    def __init__(self,name,author , availability):
        self.name = name
        self.author = author
        self.availability = True
        
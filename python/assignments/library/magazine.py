
from library import Library
class Magazine(Library):
    def __init__(self,name,author , availability):
        self.name = name
        self.author = author
        self.availability = True
        
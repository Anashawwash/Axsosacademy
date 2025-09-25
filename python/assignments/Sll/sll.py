class Node:
    def __init__(self,val):
        self.val = val
        self.next = None


   
class Sll:
    def __init__(self):
        self.head = None
        self.length = 0
        
    def Add_At_Head(self,val):
        New_Node = Node(val)
        New_Node.next = self.head
        self.head = New_Node
        self.length += 1
    
    def Add_At_Tail(self,val):
        New_Node = Node(val)
        if (self.head == None):
            self.head=New_Node
            return self
        current = self.head
        while current.next:
            current = current.next
        current.next = New_Node
        self.length += 1
        
    def get(self, index):
        if (index > self.length):
            return -1
        current = self.head
        for i in range (index):
            current = current.next  
        return current.val
    
    
    
    def Add_At_Index(self,index,val):
        if (index > self.length):
            return -1
        New_Node = Node(val)
        current = self.head
        for i in range(index - 1):
            current = current.next
        New_Node.next = current.next
        current.next = New_Node
        

    def Delet_At_Index(self,index):
        if (index > self.length and index + 1 > self.length ):
            return
        current = self.head
        for i in range (index -1):
            current = current.next
        current.next = current.next.next
            
        


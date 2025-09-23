students = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]


for dictionary in students:
    print(f"first_name -{dictionary['first_name']}, last_name -{dictionary['last_name']}")
    




    
def iterateDictionary2(key_name, some_list):
    for dictionary in students:
        print(f"{dictionary[key_name]}")




iterateDictionary2("first_name","students")




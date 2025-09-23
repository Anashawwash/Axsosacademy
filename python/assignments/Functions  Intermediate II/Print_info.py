dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}








####. print info function 


def printInfo(dictionary):
    for key in dictionary:
        print(f"{len(dictionary[key])} {key}")
        for item in dictionary[key]:
            print(item)            
            
    
printInfo(dojo)
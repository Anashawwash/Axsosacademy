import random
def randInt(min=0,max= 0 ):
    if (min == 0 and max == 0):
        return round(random.random()*100)
    elif (max > 0 and min == 0):
         return round(random.random()*50)
    elif (max == 0 and min > 0):
         return round(random.random()*50 + 50)
    else:
         return round(random.random()*max + min)


print(randInt())             # should print a random integer between 0 to 100
print(randInt(max=50))         # should print a random integer between 0 to 50
print(randInt(min=50))         # should print a random integer between 50 to 100
print(randInt(min=50, max=500))    # should print a random integer between 50 and 500
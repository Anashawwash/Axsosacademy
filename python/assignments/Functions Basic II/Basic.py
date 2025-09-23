#Count Down
def Count_down(x):
    for i in range (x,0,-1):
        print(i)

Count_down(5)











#Print and Return
def Print_Retrun(x,y):
    print(x)
    return(y)
Print_Retrun(2,4)









#First Plus length
def List_Length(Anas_list):
    sum1 = len(Anas_list) + Anas_list[0]
    print(sum1)


My_List = [10,20,30,5,7]
List_Length(My_List)












#Values Greater than Second 
def Greater_valuse(Numbers):
    Bigger_Numbers = []
    for i in range (len(Numbers)):
        if (Numbers[1] <  Numbers[i]):
            Bigger_Numbers.append(Numbers[i])

    if (len(Bigger_Numbers) > 2):
        print(len(Bigger_Numbers))
        return Bigger_Numbers

    else:
        return False

Numbers = [5,2,3,2,1,4]
Greater_valuse(Numbers)











#This Length That Value
def Length_Value(Length,Value):
    array = []
    for i in range (0 ,Length,1):
        array.append(Value)
    return array


array = Length_Value(4,7)
print(array)

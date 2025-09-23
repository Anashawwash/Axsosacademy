#1 Bigger size

# def Bigger(Main_List):
#     for i in range (len(Main_List)):
#         if ( Main_List[i] > 0):
#             Main_List[i] = "big"
    
#     return Main_List
# List = [-1,3,5,-5]
# Last_List = Bigger(List)
# print(List)









#2 Count Positives

# def Count(List):
#     Positive = 0
#     for i in range (len(List)):
#         if (List[i] > 0):
#             Positive += 1
#     List[len(List) -1 ] = Positive
#     return list


# List = [-1,1,1,1]
# Count(List)
# print(List)








#3 Sum Total

# def Sum_Total(List): 
#     sum1 = 0
#     for i in range(len(List)):
#         sum1 += List[i]
#     return sum1

# List = [2,2,3,4]
# sum1 = Sum_Total(List)
# print(sum1)








#4 Avarege

# def Avarege(List): 
#     sum1 = 0
#     for i in range(len(List)):
#         sum1 += List[i]
#     sum1 = sum1 / len(List)
#     return sum1

# List = [1,2,3,4]
# print(Avarege(List))








#5 length

# def length(List):
#     return len(List)



#6. Minimum

# def Minimum(List):
#     Min_value = List[0]
#     for i in range(len(List)):
#         if (Min_value > List[i]):
#             Min_value = List[i]
    
#     return Min_value




#7. Maximum

def Minimum(List):
    Max_value = List[0]
    for i in range(len(List)):
        if (Max_value < List[i]):
            Max_value = List[i]
    return Max_value










#8 Ultimate Analysis 


# def Ultimate(List):
#     sum1 = 0
#     Min_value = List[0]
#     Max_value = List[0]
#     for i in range(len(List)):
#         sum1 += List[i]
#         if (Min_value > List[i]):
#             Min_value = List[i]
#         if ( Max_value < List[i]):
#             Max_value = List[i]
            
#     sum_all = sum1 / len(List)
#     Last  = {'sumTotal': sum1, 'average': sum_all, 'minimum': Min_value, 'maximum': Max_value, 'length': len(List) }     
#     return Last
    
    
    
    
    
    
#9 Reverse List 


def Reverse_List(List):
    length = len(List) 
    length = length //2 
    print(length)
    for i in range(length):
        List[i], List[length - i - 1] = List[length - i - 1], List[i]
    return List


def Reverse_List(List):
    length = len(List)
    for i in range(length // 2):
        List[i], List[length - i - 1] = List[length - i - 1], List[i]
    return List

List = [37 ,2,1,-9]
print(Reverse_List(List))

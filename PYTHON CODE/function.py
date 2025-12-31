def calculateGmean(a, b):
    mean = (a*b)/(a+b)
    print(mean)

def isgreater(a, b):
    if (a > b):
        print("First is Greater")
    else:
        print("Second is greater or equal to first ")

a, b = 10, 20
calculateGmean(a, b)
isgreater(a, b)

c, d = 42, 7
calculateGmean(c, d)
isgreater(c, d)



# Average the number program

def average(*numbers):
    print(type(numbers))
    sum = 0
    for i in numbers:
        sum += i
    print("Average is : ", sum/len(numbers))
e = average(3,5,9,18)

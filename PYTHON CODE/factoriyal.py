# factorial(n) = n*factorial(n-1)

def factorial(n):
    if(n==0 or n==1):
        return 1
    else:
        return n*factorial(n-1)
    

print("Factorial of 5 is :",factorial(5))
print("Factorial of 8 is :",factorial(8))


# Fibonacci Series

# f(0)=0
# f(1)=1
# f(2)=f(0)+f(1)
# f(n) = f(n-1)+f(n-2)

num = int(input("Enter no. you want to get value : "))
n1, n2 = 0, 1
print("Fibonacci Series : ",n1,n2, end=" ")

for i in range(2, num):
    n3 = n1 + n2
    n1 = n2
    n2 = n3
    print(n3, end=" ")

print()
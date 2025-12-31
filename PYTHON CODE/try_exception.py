a = input("Enter no : ")
try:
    for i in range(1,11):
        c = int(a)*i
        # print((a)+"x"+str(i)+"="+str(c))
        print(f"{int(a)} X {i} = {c}")
except Exception as e:
     print(e)
     print("End of program")

finally:
    print("This is the end.")



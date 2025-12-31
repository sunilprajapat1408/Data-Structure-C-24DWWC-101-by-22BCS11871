s = {2,4,2,6,8}
print(s)    # does not maintain order 

info = {"sunil",20,True,7.14,20}
print(info)
print("\n")

# for making empty set 
empty_set = set()
print(type(empty_set))

for value in info:
    print(value)
print("\n")

s1 = {1,2,5,6}
s2 = {3,5,7}
print("Union of two sets is : ",s1.union(s2))
print("Intersection of two sets is : ",s1.intersection(s2))
s1.update(s2)
print(s1, s2)
print("Symmetric Difference : ",s1.symmetric_difference(s2)) #s1-s2
print("Isdisjoint : ",s1.isdisjoint(s2)) #check item are present in another set (kuch bhi same nahi hona chahiye)
print("Issuperset : ",s1.issuperset(s2)) #check item are present in another set (sare same hona chahiye)
print("Issubset : ",s1.issubset(s2)) #opposite of issuperset

s3 = {4,5,6,7,8}
s3.add(3)
print("Add the value : ",s3)
s4 = {1,2}
s5 = {3,4,5,6}
s4.update(s5)
print("Update : ",s4)

s5.remove(3)
print("Remove or discard : ",s5)

item = s5.pop()
print("Poped Item : ",item)  # bahar nikal dega koi bhi value
print("After Poping : ",s5)

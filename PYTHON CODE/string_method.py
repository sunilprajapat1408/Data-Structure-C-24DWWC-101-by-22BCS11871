
# stings are immutable
a = "Sunil"
print(a)
print(len(a))
print(a.upper())
print(a.lower())

b = "!!!Sunil!!!!!!!!!"
print(b.rstrip("!"))   #not remove the starting 

print(a.replace('Sunil','Ram'))  #replace the name 

heading = "inTroDucTion tO python" 
print(heading.capitalize())

c = "Sunil Sunil Sunil"
print("Count how many times :",c.count("Sunil"))

str1 = 'Welcome to the Console!!!'
print(len(str1))
print(len(str1.center(50)))
print((str1.center(50)))

print(str1.endswith("!!!"))  #to check end with !!! or not
print(str1.find("the"))   #at 11 no.
print(str1.find("toh"))   #at -1 bcoz is not available

str2 = "WelcomeToTheConsole0012"
print(str2.isdigit())     #False   check all character in string are digit or not
print(str2.isalnum())     #True    check isalnum() A-Z, a-z, 0-9 is present or not
print(str2.isalpha())     #False   check isalnum() A-Z, a-z, is present or not
print(str2.islower())     #False    not all in lower

str3 = "     "
print("Space check :",str3.isspace()) 

sentence = "Python is an interpreted, high-level programming language."
sentence2 = "World Health Organization"
print(sentence.istitle())       # False  to check each word is capatial
print(sentence2.istitle())      #True
print(sentence2.swapcase())      #convert uper to lower
print(sentence.title())      #capital each word


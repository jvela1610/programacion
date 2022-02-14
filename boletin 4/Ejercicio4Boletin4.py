#Design a function called numberInString that 
# has a string of characters as parameter, 
# the method should return how many of those 
# characters are numbers.

def numberInString(cadena):
    contador=0
    numeros=["1","2","3","4","5","6","7","8","9"]
    for i in range(len(cadena)):
        if cadena[i] in numeros:
            contador+=1
    return contador

print(numberInString("vela3254156, juan34567"))

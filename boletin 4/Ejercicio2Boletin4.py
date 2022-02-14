#Design a function called lowCaseInString 
# that has a string of characters as parameter, 
# the method should return how many of those 
# characters are lowcase letters
def minuscula(caracter):
    if ord(caracter)>=97 and ord(caracter)<=122:
        return True
    else:
        return False


def lowcaseinstring(cadena):
    numminusculas=0
    for i in range(len(cadena)):
        if ord(cadena[i])>=97 and ord(cadena[i])<=122:
            numminusculas+=1
    return numminusculas

print(lowcaseinstring("Juan"))
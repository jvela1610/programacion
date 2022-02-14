#Design a function called upperCaseInString that 
# has a string of characters as parameter, 
# the method should return how many of those 
# characters are upper case letters.

def mayusculas(caracter):
    if ord(caracter)>=65 and ord(caracter)<=90:
        return True
    else:
        return False


def uppercaseinstring(cadena):
    nummayusculas=0

    for i in range(len(cadena)):
         if ord(cadena[i])>=65 and ord(cadena[i])<=90:
             nummayusculas+=1
    return nummayusculas

print(uppercaseinstring("Juan"))

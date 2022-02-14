#Design a function called charactersInString 
# that has a character string and a character as 
# input parameters and returns how many times 
# that character appears in the string. 
# It should do if the string and character are  
# lower case or upper case characters.

def minuscula(caracter):
    if ord(caracter)>=97 and ord(caracter)<=122:
        return True
    else:
        return False

def charactersInString(cadena,caracter):
    numapariciones=0
    if minuscula(caracter):
        suma = -32
    else:
        suma = 32

    for i in range(len(cadena)):
        if ord(cadena[i]) == ord(caracter) or ord(cadena[i]) == ord(caracter)+suma:
            numapariciones+=1

    return numapariciones

print(charactersInString("juan vela","a"))

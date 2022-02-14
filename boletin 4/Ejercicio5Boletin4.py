#Design a function called palindrome that 
# has a string of characters as parameter, 
# and return true if it is a palindrome or false 
# in other case. A word is a palindrome, 
# if it is reads the same from left to right as 
# from right to left, ignoring whites,. 
# For example: "anilina" or "el abad le dio arroz 
# al zorro" To simplify the problem, you can 
# assume that simple characters are used, that is, 
# without tildes or diresis.

def quitarespacio(espacio):
    resultado=''
    for i in espacio:
        if i != ' ':
            resultado+=1
    return resultado


def palindromo(cadena):
    if str(cadena) == str(cadena)[::-1]:
        return True
    else:
        return False
print(palindromo("Dábale arroz a la zorra el abad"))
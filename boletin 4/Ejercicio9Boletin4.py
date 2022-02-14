#Crear una función que, tomando una 
# cadena de texto como entrada, construya y devuelva otra cadena formada de la siguiente manera: 
# el método debe colocar todas las consonantes al principio y todas las vocales al final de la misma, 
# eliminando los blancos.Por ejemplo, pasándole la cadena "curso de programacion", una posible solución 
# sería "crsdprgrmcnuoeoaaio"

def ordenarletras(palabra):
    vocales=[c for c in palabra if c in "aeiouAEIOU"]
    consonantes=[c for c in palabra if c not in "aeiouAEIOU"]
    

    return''.join(consonantes) + ''.join(vocales)
print(ordenarletras("curso de programacion"))
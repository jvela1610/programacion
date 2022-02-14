#Diseñar una función que reciba como parámetro 
# tres cadenas, la primera será una frase 
# y deberá buscar si existe la palabra que recibe 
# como segundo parámetro y reemplazarla por la 
# tercera.

def remplazarcadenas(cadena1, cadena2, cadena3):
    resultado=[]
    palabra=""
    for i in cadena1:
        if i == " ":
            resultado.append(palabra)
            palabra=""
        else:
            palabra+=i
    resultado.append(palabra)
    palabra=""
    for j in resultado:
            if j == cadena2:
                palabra+=cadena3
            else:
                palabra+=j

    return palabra
    
print(str(remplazarcadenas("el perro es grande" , "perro", "gato")))
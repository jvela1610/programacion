#Diseñar una función que reciba como parámetro 
# tres cadenas, la primera será una frase y 
# deberá buscar si existe la palabra que recibe 
# como segundo parámetro y reemplazarla por la 
# tercera.

def encontrar(cadena, escondida):
#recorrer cada una de las letras de escondida

    for i in escondida:
        #para cada una de las letras de escondidas intento quitarla de cadena
        #si la puedo quitar es que está, por lo que paso a la siguiente
        #si no la puedo quitar, no está, con lo cual me salgo y devuelve false

        #función que me devuelve la cadena que recibe como argumento
        #sin la primera ocurrencia que se encuentre de i
        cadenaAux = buscarLetra(cadena,i)
        if cadenaAux == cadena:
            return False
        else:
            cadena = cadenaAux
    return True

def buscarLetra(cadena,i):
    bandera = False
    nueva=""
    for j in cadena:
        if j == i and bandera ==False:
            bandera
            nueva +=j
    return nueva

#print(buscarLetra("juan","j"))
#print(buscarLetra("juan","u"))
#print(buscarLetra("juan","a"))
#print(buscarLetra("juan","n"))


assert(encontrar("shybaoxlna", "hola")==True)
assert(encontrar("shybaoxlna", "holo")==False)
assert(encontrar("shybaoxlna", "holla")==False)
assert(encontrar("slhybaoxlna", "holla")==True)
assert(encontrar("", "hola")==False)
assert(encontrar("shybaoxlna", "")==True)




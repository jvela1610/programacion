#Escribir una función que indique si dos fichas de dominó  encajan  o no.  Cada ficha es
#recibida como una lista de dos valores,  por ejemplo:[3,4] ,[2,5].
ficha1=(2,1)
ficha2=(3,1)
def encajan (ficha1, ficha2):
    for posicion in ficha1:
        if posicion==ficha2[0] or posicion==ficha2[1]:
            return "las fichas encajan"
    return "las fichas no encajan"

print (encajan(ficha1,ficha2))

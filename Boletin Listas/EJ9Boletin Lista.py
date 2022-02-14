#Escribir una función que reciba una lista de números enteros y un entero k, escribir tresfunciones, 
# una que devuelva una lista con  los menores  de k, otra  función devuelva  los mayores y otra los iguales a k. 
# Por último otra función que devuelva una lista con aquellosque son múltiplos de k.

lista=['1','2','3']
numK=['5']

def listamenores(lista,numK):
    listamenor = []
    for i in range(len(lista)):
        if lista [i] < numK:
            listamenor.append(lista[i])
    return (listamenor)


def listamayores(lista,numK):
    listamayor = []
    for i in range(len(lista)):
        if lista [i] > numK:
            listamayor.append(lista[i])
    return (listamayor)

def listaIguales(lista,numK):
    listaigual = []
    for i in range (len(lista)):
        if lista [i] == numK:
            listaigual.append(lista[i])
    return (listaigual)

def listaMultiplos (lista,numK):
    listaMulti = []
    for i in range (len(lista)):
        if lista[i] % numK == 0:
            listaMulti.append(lista[i])
    return (listaMulti)

def comparacionK (lista, numK):
    print(listamenores(lista,numK))
    print(listamayores(lista,numK))
    print(listaIguales(lista,numK))
    print(listaMultiplos(lista,numK))
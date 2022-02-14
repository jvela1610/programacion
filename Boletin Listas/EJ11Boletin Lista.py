#Escribe una función que reciba dos listas y devuelva una lista con los elementos comunes a ambas, 
# sin repetir ninguno.

lista=['1','2','3','4']
lista2=['4','5','3']
comun=[]
def elementosComunes(lista,lista2):
    for i in lista:
        if (i not in comun) and (i in lista2):
            comun.append(i)
    return comun

print(elementosComunes(lista,lista2))
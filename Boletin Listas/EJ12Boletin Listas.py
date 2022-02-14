#Escribe una función que reciba dos listas y devuelva los elementos que pertenecen a una o a otra, 
# pero sin repetir ninguno (unión de conjuntos).

lista=['1','2','3','4']
lista2=['4','5','6','7']
for i in range(len(lista2)):
    if lista2[i] not in lista:
        lista.append(lista2[i])
print(lista)






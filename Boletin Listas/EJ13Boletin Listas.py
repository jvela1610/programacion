#Escribe una función que, dada una lista de nombres y una letra, devuelva una lista con todos los nombres 
# que empiezan por dicha letra

lista=['juan','ana','javier']
letra='j'
nombres=[]
for i in range(len(lista)):
    if lista[i]:
        nombres.append(lista[i])
print(nombres)
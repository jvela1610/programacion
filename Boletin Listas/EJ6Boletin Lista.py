#Realizar una función que reciba una lista y devuelva si está ordenada o no. Llamar a dicha
#función.

lista=[1,2,4,9,5,6,7]
print(lista)
r=True
for i in range(len(lista)-1):
    if lista[i]>lista[i+1]:
        r=False
if r:
    print("lista ordenada")
else:
    print("lista desordenada")
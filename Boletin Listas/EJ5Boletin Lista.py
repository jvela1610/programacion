#Realizar un función que reciba una lista y devuelva una nueva lista cuyo contenido sea igual
#a la original pero invertida. Así, dada la lista [‘Di’, ‘buen’, ‘día’, ‘a’, ‘papa’], deberá
#devolver [‘papa’, ‘a’, ‘día’, ‘buen’, ‘Di’]. Llamar a dicha función

def reverse(lista):
    array=[]
    posicion=len(lista)-1
    for i in range(len(lista)):
        array.append(lista[posicion])
        posicion=-1
    return array

lista = ["papa", "a", "dia", "buen", "dia", "di"]
print(reverse(lista))
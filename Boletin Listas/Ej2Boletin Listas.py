#Realiza  un  programa  que   lea  10  números,   debe  imprimir   los   10  número  y  después desplazarlos 
# una posición, de tal forma que el último pase a la primera posición, el primero ala segunda, el segundo a 
# la tercera, y así sucesivamente
def desplaza(array):
    longitud=len(array)
    ultimo=longitud
    while longitud>=0:
        array(longitud)== array[longitud-1]
        longitud -=1
    array[0]==ultimo
    return array

listanumeros=[]
i=0

while i<10:
    numeros=int(input("introduzca un numero" + str(i+1) + ': '))
    listanumeros.append = numeros
    i+=1
print(listanumeros)
print("la lista es", desplaza(listanumeros))

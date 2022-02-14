#Lee por teclado números y guárdalos en una lista, el proceso finaliza cuando metamos un
#número negativo. Al finalizar el programa se debe mostrar el máximo de los números
#guardado en la lista y los números pares que formen parte de la lista.

for i in range(5):
    numero=int(input("dame un numero"))

listaNumeros=[]
listaPar=[]

while numero>=0:
    listaNumeros.append(numero)
    if numero%2==0:
        listaPar.append(numero)
    
print("el listado total de numeros es ", listaNumeros)
print("el listado de numeros par es ", listaPar)


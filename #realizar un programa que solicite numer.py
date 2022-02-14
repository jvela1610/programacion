#realizar un programa que solicite numeros enteros al usuario
#el programa debe terminar cuando el usuario introduzca -1
#al final del programa se nos informara de la suma de todos
#los numeros introducidos por el usuario menos -1 que nos
#servirá para salir y de si hay algún numero par o no entre
#los introduciodos por el usuario.
numfinal=0
par=0
impar=0
num = int(input("dame un numero"))
while (num >-1):
    numfinal= num + numfinal
    if num%2==0:
    par=par+1
    num=int(input("introduce numero, -1 para salir"))
    
    


if num%2!=0:
    impar=impar+1

if num==-1:
    print("el programa ha terminado")
    int(input("dame otro numero"))

print("la suma es" + numfinal)
print("hay estos numeros pares" + par)
print("hay estos numeros impares" + impar)






    


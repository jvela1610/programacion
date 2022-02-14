#1.Crea un programa que genere 1OO 
# números de forma aleatoria y 
# que posteriormente ofrezcaal 
# usuario la posibilidad de:

from random import uniform
cadena=[]

for i in range(100):
        numerorandom=int(uniform(1, 1000))
        cadena.append(numerorandom)
print(cadena)

#Conocer el mayor de los números
def numeromayor(cadena):
    mayor=max(cadena)
    return mayor
print("el numero mayor es"+ ' ' + str(numeromayor(cadena)))

#conocer el menor de los numeros

def numeromenor(cadena):
    menor=min(cadena)
    return menor
print("el numero menor es"+ ' ' + str(numeromenor(cadena)))

#obtener la suma de los numeros

def sumaDeNumeros(cadena):
    suma=sum(cadena)
    return suma
print("la suma es " + str(sumaDeNumeros(cadena)))

#obtener la media de los numeros

def mediaDeNumeros(cadena):
    media=sum(cadena)/len(cadena)
    return media
print("la media es " + str(mediaDeNumeros(cadena)))





    


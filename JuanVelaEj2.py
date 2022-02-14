#Ejercicio 2
#primero definimos las variables
from typing import Container


menores30=0
entre31_49=0
mayores50=0
#despues aplicamos un bucle for junto a las condiciones
for i in range(5):
    mes =int(input("dime tu mes de nacimiento "))
    if mes<0:
        print ("error")
        break
    año =int(input("año de nacimiento "))
    edad = año/2021
    
    if edad<30:
        menores30+1
    if edad>31 and edad<=49:
        entre31_49+1
    if edad>=50:
        mayores50+1

    

#y imprimimos los resultados

print(f"estos son los resultados, menores de 30 {menores30}")
print(f"entre 31 y 49 {entre31_49}")
print(f"50 o mayores {mayores50}")


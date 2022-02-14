#Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

import math

lado1 = float(input("dame un numero"))
lado2 = float(input("dame otro numero"))

print("la hipotenusa es igual a: " + str(math.sqrt(lado1 * lado1)+ (lado2 * lado2) ))

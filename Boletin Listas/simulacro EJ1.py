#ejercicio 1

edad=int(input("dime la edad"))
regalo=20
resultado=0
for i in range(edad):
    if edad > 0:
        resultado=(regalo + 15) * edad
print (resultado)


#ejercicio 1 modificado
from random import uniform
edad=int(uniform(1,100))
regalo=int(uniform(1,1000))
resultado=0
for i in range(edad):
    if edad > 0:
        resultado=(regalo + 15) * edad
print (resultado)


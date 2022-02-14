#Realizar un programa que pida números positivos y negativos hasta que se introduzca un 0. 
# Una vez tenemos todos los números se debe llamar a una función que debe devolver una lista de 
# unos o menos uno, segun el número sea mayor que el siguiente (un 1) o un menor (un -1)

#lista=['23','-3','25','26','13']
#resultado=[]
#for i in range(len(lista)):
    #if lista[i] < lista[1]:
        #resultado.append['-1']
    #elif lista[i] > lista[1]:
        #resultado.append['1']
#print(resultado)



#ejercicio 1

edad=int(input("dime la edad"))
regalo=20
resultado=0
for i in range(edad):
    if edad > 0:
        resultado=(regalo + 15) * edad
print (resultado)

#programa 1 modificado

from random import uniform
edad=int(uniform(1,100))
regalo=int(uniform(1,1000))
resultado=0
for i in range(edad):
    if edad > 0:
        resultado=(regalo + 15) * edad
print (resultado)


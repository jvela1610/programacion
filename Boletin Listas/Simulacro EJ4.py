#Realizar un programa que pida números positivos y negativos hasta que se introduzca un 0. 
# Una vez tenemos todos los números se debe llamar a una función que debe devolver una lista de 
# unos o menos uno, segun el número sea mayor que el siguiente (un 1) o un menor (un -1)

lista=['23','-3','25','26','13']
resultado=[]
for i in range(len(lista)):
    if lista[i] < lista[1]:
        resultado.append['-1']
    elif lista[i] > lista[1]:
        resultado.append['1']
print(resultado)

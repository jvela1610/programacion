#pedir 3 numeros entre 10 - 100
#sacar la media de esos 3 numeros
#si el numero no esta entre 10 y 100, volver a pedir numeros
acum=0
for i in range(3):
    num=int(input("introduce numero entre 10 y 100"))
    while num<10 or num>100:
        num=int(input("introduce numero entre 10 y 100"))
    acum+=num

print("la media es " + str(acum/3))



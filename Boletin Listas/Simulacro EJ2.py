#Ejercicio 2

peso=int(input("dame un peso"))
altura=str(input("dame una altura"))
edad=int(input("dame una edad"))
imc = peso/(altura**2)

if imc > 30 and imc<40:
    print ("usted se encuentra en el grupo de peso insuficiente")
elif imc > 18.5 and imc < 25:
    print ("usted se encuentra en el grupo de normopeso")
elif imc >25 and imc<30:
    print("usted se encuentra en el grupo de sobrepeso")
elif imc > 30 and imc<40:
    print ("usted se encuentra en el grupo de obesidad")
elif imc > 40:
    print ("usted se encuentra en el grupo de obesidad mórbida")
if imc > 25 and imc < 30 and edad > 45:
    print("usted se encuentra en el grupo de sobrepeso")
    print("debido a su peso y imc deberia cuidarse su salud cardiovascular")
elif imc > 30 and imc < 40 and edad > 30:
    print("usted se encuentra en el grupo de obesidad")
    print("debido a su peso y imc deberia cuidarse su salud cardiovascular")
else:
    peso < 0 and altura < 0 and edad <0
    print("error")


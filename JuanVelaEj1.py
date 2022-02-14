#Ejercicio 1
#Empezamos piddiendo al usuario los datos
edad=int(input("Dime tu edad"))
pasado=input("¿has pasado el covid?")
vacuna=input("¿que vacuna te han puesto?")
#Usamos if y else para definir las condiciones que
#queremos para el programa
if vacuna=="astrazeneca":
    print("debe volver a vacunarse")
if edad>60 and vacuna=="moderna" and pasado=="no":
    print("debe volver a vacunarse")
else:
    edad>60 and vacuna=="moderna" and pasado=="si"
    print("no debe volver a vacunarse")

if vacuna=="pfizer" and pasado=="no":
    print("no debe volver a vacunarse")
else:
    vacuna=="pfizer" and pasado=="si" and edad>70
    print("debe volver a vacunarse")

#utlizamos un bucle while para la ultima condicion
#del ejercicio

while vacuna!="moderna,pfizer,astrazeneca" or pasado!="si,no" or edad<0:
        print("error")
        print("introduce los datos correctos")
        input("Dime tu edad")
        input("¿has pasado el covid?")
        input("¿que vacuna te han puesto?")
        if vacuna=="moderna,pfizer,astrazeneca" and pasado=="si,no" and edad<0:
            break
        
    


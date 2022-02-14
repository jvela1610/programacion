#ejercicio3
#definimos las variables
numeroclaves=int(input("cuantas claves quieres"))
resultado=0
#Usamos el bucle for y definimos los condicionales
for i in range(numeroclaves):
    clave=int(input("dime un numero"))
    if clave%5==0:
        clave!=+1

    if clave%5==1:
        clave+1
#imprimimos los resultados
print(f"el resultado de la clave es {resultado}")



#Calcular la media de tres números pedidos por teclado

a=int(input("dame un numero"))
b=int(input("dame un numero"))
c=int(input("dame un numero"))

menor=min(a,b,c)
mayor=max(a,b,c)
media=(a+b+c) - menor - mayor

print(media)



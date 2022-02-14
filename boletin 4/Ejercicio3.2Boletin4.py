def cadenaEnMayusculas(cadena):
    array=''
    for i in range(len(cadena)):
        if ord(cadena[i])>=97 and ord(cadena[i])<=122:
            suma=ord(cadena[i])-32
            array=array+(chr(suma))
        else:
            array=array+cadena[i]
    return array
print(cadenaEnMayusculas("juan vela"))
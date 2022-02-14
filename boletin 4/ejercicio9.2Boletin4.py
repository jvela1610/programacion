def consonantesVocales(cadena):

    listaordenada=''

    for i in range(len(cadena)):
        if ord(cadena[i]) != 32 and ord(cadena[i]) != 97 and ord(cadena[i]) != 101 and ord(cadena[i]) != 105 and ord(cadena[i]) != 111 and ord(cadena[i]) != 117:
            listaordenada+=cadena[i]

    for j in range(len(cadena)):
        if ord(cadena[j]) == 97 or ord(cadena[j]) == 101 or ord(cadena[j]) == 105 or ord(cadena[j]) == 111 or ord(cadena[j]) == 117:
            listaordenada+=cadena[j]
    for c in range(len(cadena)):
        if ord(cadena[j]) == 65 or ord(cadena[j]) == 69 or ord(cadena[j]) == 73 or ord(cadena[j]) == 79 or ord(cadena[j]) == 85:
            listaordenada+=cadena[c]
    return listaordenada
print(consonantesVocales("Curso de programacion"))
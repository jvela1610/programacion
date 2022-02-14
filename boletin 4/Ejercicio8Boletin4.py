# Diseñar una función que determine la cantidad de
# vocales diferentes, que tiene una palabra o frase 
# introducida por teclado. Por ejemplo, la cadena 
# “Abaco”, devolvería 2.

def contar_vocales(cad):
    voc=0
    for i in range(len(cad)):
        if cad[i]=='a' or cad[i]=='e'or cad[i]=='i' or cad[i]=='o' or cad[i]=='u' or cad[i]=='A'or cad[i]=='E' or cad[i]=='I' or cad[i]=='O'or cad[i]=='U':
            voc=voc+1
    return voc

print(contar_vocales("Abaco"))
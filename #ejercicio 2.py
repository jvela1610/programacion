#ejercicio 2

año = int(input("dime un año"))

def es_bisiesto(año):
    if año % 400 == 0:
        return 1

    elif año % 100 == 0:
        return -1

    elif año % 4 == 0:
        return 1

    else:
        return -1
    
    


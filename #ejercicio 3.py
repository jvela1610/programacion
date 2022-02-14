#ejercicio 3

def daysinmonth(mes, año):
    if mes < 1 or mes > 12 or año <=0:
        numerodias = -1
        
    elif mes == 4 or mes == 6 or mes == 9 or mes == 11:
        numerodias = 30
    elif mes == 2 and leapyear(año) == 1:
        numerodias = 29
    elif mes == 2:
        numerodias = 28
    else:
        numerodias = 31
        
    return numerodias
    
   
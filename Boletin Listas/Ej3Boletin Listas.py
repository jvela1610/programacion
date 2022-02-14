#Realizar un programa que solicite la fecha como tres datos numéricos (día, mes y año).
# Deberá mostrar la fecha en formato largo
dia=int(input("introduce un dia"))
while dia>0 and dia<32:
    mes=int(input("introduce un mes"))
    año=int(input("introduce un año"))
    break
if dia<0 or dia>=32:
    print("fecha erronea")
else:
    mesesAños=["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
    mes=mesesAños[mes-1]
print("la fecha larga es ", dia, "de", mes, "de", año)





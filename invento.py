def validarPeso(peso):
	bandera=True
	while peso<50 or peso>500:
		if peso<50 or peso >500:
			peso=float(input("ingrese el peso nuevamente: "))
			bandera=False
		else:
			bandera=True
			print("sfgh")
	return bandera
		
def clasificar_pieza(peso):
	contP=0
	contL=0
	contE=0
	if peso<200:
		print("ligera ")
		contL=contL+1
	elif peso>=200 and peso <=400:
		print("estandar")
		contE=contE+1
	else:
		print("pesada")
		contP=contP+1
	return contP, contL, contE
	
def calcula_prom(ptotal,cant):
	if cant==0:
		return 0
	return ptotal/cant
pesototal=0.0
p=0.0
cantidad=int(input("Ingrese la cantidad de piezas: "))
for i in range(1,cantidad+1,1):
	# ~ while p>=50 or p<=500:
	p=float(input("ingrese el peso: "))
	vp=validarPeso(p)
		
	if vp==False:
		print("error de lectura ")
	else:
		print("peso correcto")
		clasificar_pieza(p)
		pesototal=pesototal+p
		promedio=calcula_prom(pesototal,cantidad)
		print(f"Promedio: {promedio} peso total: {pesototal}" )
	

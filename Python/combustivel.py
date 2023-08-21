codigo = int(input("Informe um código (1, 2, 3) ou 4 para parar: "))

alcool = 0
gasolina = 0
diesel = 0
while codigo != 4:
    if codigo == 1:
        alcool += 1
    elif codigo == 2:
        gasolina += 1
    elif codigo == 3:
        diesel += 1
    codigo = int(input("Informe um código (1, 2, 3) ou 4 para parar: "))

print("MUITO OBRIGADO")
print(f"Álcool: {alcool}")
print(f"Gasolina: {gasolina}")
print(f"Diesel: {diesel}")

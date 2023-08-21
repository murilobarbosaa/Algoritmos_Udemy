minutos = int(input("Digite a quantidade de minutos: "))

if minutos < 100:
    pagar = 50
else:
    pagar = 50 + ((minutos - 100) * 2)

print(f"Valor a pagar: R$ {pagar:.2f}")

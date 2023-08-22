casos = int(input("Quantos numeros voce vai digitar? "))

fora = 0
dentro = 0
for i in range(0, casos):
    numeros = int(input("Digite um número: "))
    if numeros < 10 or numeros > 20:
        fora += 1
    else:
        dentro += 1

print(f"{dentro} DENTRO")
print(f"{fora} FORA")

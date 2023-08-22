casos = int(input("Quantos casos você vai digitar? "))

for i in range(0, casos):
    numerador = int(input("Entre com o numerador: "))
    denominador = int(input("Entre com o denominador: "))

    if denominador == 0:
        print("DIVISÂO IMPOSSÍVEL")
    else:
        divisao = numerador / denominador
        print(f"DIVISAO = {divisao:.2f}")

casos = int(input("Quantos números você vai digitar? "))

for i in range(0, casos):
    numero = int(input("Digite um número: "))

    if numero == 0:
        print("NULO")
    elif numero % 2 == 1:
        if numero < 0:
            print("IMPAR NEGATIVO")
        else:
            print("IMPAR POSITIVO")
    else:
        if numero < 0:
            print("PAR NEGATIVO")
        else:
            print("PAR POSITIVO")

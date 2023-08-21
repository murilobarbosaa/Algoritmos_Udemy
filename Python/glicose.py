glicose = float(input("Digite a medida da glicose: "))

if glicose <= 100:
    print("Classificação: normal")
elif glicose <= 140:
    print("Classificaçã: elevado")
else:
    print("Classificação: diabetes")

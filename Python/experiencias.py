casos = int(input("Quantos casos de teste serão digitados? "))

coelhos = 0.0; ratos = 0.0; sapos = 0.0; percentualC = 0.0; percentualR = 0.0; percentualS = 0.0; total = 0.0
for i in range(0, casos):
    quantidade = int(input("Quantidade de cobaias: "))
    tipo = input("Tipo de cobaia: ")

    if tipo == "C":
        coelhos += quantidade
    elif tipo == "R":
        ratos += quantidade
    elif tipo == "S":
        sapos += quantidade

    total += quantidade
    percentualC = (coelhos / total) * 100
    percentualR = (ratos / total) * 100
    percentualS = (sapos / total) * 100

print("RELATORIO FINAL: ")
print(f"Total: {total:.0f}")
print(f"Total de coelhos: {coelhos:.0f}")
print(f"Total de ratos: {ratos:.0f}")
print(f"Total de sapos: {sapos:.0f}")
print(f"Percentual de coelhos: {percentualC:.2f}")
print(f"Percentual de ratos: {percentualR:.2f}")
print(f"Percentual de sapos: {percentualS:.2f}")

preco = float(input("Preço unitário do produto: "))
quantidade = int(input("Quantidade comprada: "))
dinheiro = float(input("Dinheiro recebido: "))

total = preco * quantidade
troco = dinheiro - total

if dinheiro < total:
    print(f"DINHEIRO INSUFICIENTE. FALTAM {troco * -1:.2f} REAIS")
else:
    print(f"TROCO = {troco:.2f}")

preco = float(input("Preço unitário do produto: "))
quantidade = float(input("Quantidade comprada: "))
dinheiro = float(input("Dinheiro recebido: "))

troco = dinheiro - preco * quantidade
print(f"TROCO = {troco:.2f}")
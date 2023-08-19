largura = float(input("Digite a largura do terreno: "))
comprimento = float(input("Digite o comprimento do terreno: "))
preco = float(input("Digite o valor do metro quadrado: "))

area = largura * comprimento
valor = area * preco

print(f"Área do terreno: {area:.2f}"), print(f"Preço do terreno: {valor:.2f}")
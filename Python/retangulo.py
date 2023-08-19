import math

base = float(input("Digite a largura do terreno: "))
altura = float(input("Digite o comprimento do terreno: "))

area = base * altura
perimetro = base * 2 + altura * 2
diagonal = math.sqrt(base * base + altura * altura)

print(f"Area = {area:.4f}")
print(f"Perimetro = {perimetro:.4f}")
print(f"Diagonal = {diagonal:.4f}")
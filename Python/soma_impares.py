print("Digite dois numeros: ")
x = int(input())
y = int(input())

troca = 0
soma = 0

if x > y:
    troca = x
    x = y
    y = troca

for i in range(x + 1, y):
    if i % 2 != 0:
        soma += i

print(f"SOMA DOS IMPARES: {soma}")
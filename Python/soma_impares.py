x = int(input("Digite dois números:\n"))
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

print(f"Soma dos ímpares = {soma}")

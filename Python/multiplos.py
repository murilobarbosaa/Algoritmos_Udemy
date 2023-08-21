print("Digite dois números inteiros: ")
x = int(input())
y = int(input())

if x % y == 0 or y % x == 0:
    print("São multiplos")
else:
    print("Não são múltiplos")

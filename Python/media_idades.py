print("Digite as idades: ")
x = int(input())

total = 0
cont = 0

if x < 0:
    print("IMPOSSIVEL CALCULAR")
else:
    while x > 0:
        total += x
        cont += 1
        x = int(input())

    media = total / cont
    print(f"MEDIA = {media:.2f}")

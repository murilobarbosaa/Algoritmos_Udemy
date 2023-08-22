casos = int(input("Quantos casos você vai digitar: "))

for i in range(0, casos):
    print("Digite três números: ")
    x = float(input())
    y = float(input())
    z = float(input())

    media = (x * 2 + y * 3 + z * 5) / 10
    print(f"MEDIA = {media:.1f}")

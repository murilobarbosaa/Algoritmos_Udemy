print("Digite dois numeros: ")
x = int(input())
y = int(input())

while x != y:
    if x < y:
        print("CRESCENTE!")
    else:
        print("DECESCENTE")

    print("Digite outros dois números: ")
    x = int(input())
    y = int(input())
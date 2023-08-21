print("Digite dois números: ")

x = int(input())
y = int(input())

while x != y:
    if x > y:
        print("DECRESCENTE!")
    else:
        print("CRESCENTE!")
    print("Digite outros dois números: ")
    x = int(input())
    y = int(input())

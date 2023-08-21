x = float(input("Digite o valor de x: "))
y = float(input("Digite o valor de y: "))

if x == 0 or y == 0:
    print("Origem\n")
elif x == 0:
    print("Eixo Y")
elif y == 0:
    print("Eixo X")
elif x > 0 and y > 0:
    print("Q1\n")
elif x < 0 < y:
    print("Q2\n")
elif x < 0 and y < 0:
    print("Q3\n")
else:
    print("Q4\n")


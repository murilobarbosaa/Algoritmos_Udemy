print("Digite os valores das coordenadas X e Y: ")
x = float(input())
y = float(input())

while x and y != 0:
    if x > 0 and y > 0:
        print("QUADRANTE 1")
    elif x < 0 < y:
        print("QUADRANTE 2")
    elif x < 0 and y < 0:
        print("QUADRANTE 3")
    elif x > 0 > y:
        print("QUADRANTE 4")
    else:
        print("Origem")

    print("Digite os valores das coordenadas X e Y: ")
    x = float(input())
    y = float(input())

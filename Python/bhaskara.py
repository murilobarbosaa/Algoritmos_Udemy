from math import sqrt

a = float(input("Coeficiente a: "))
b = float(input("Coeficiente b: "))
c = float(input("Coeficiente c: "))

delta = (b * b) - 4 * a * c

if delta < 0:
    print("Esta equação não possui raízes reais")
else:
    x1 = (-b + sqrt(delta)) / (2 * a)
    x2 = (-b - sqrt(delta)) / (2 * a)
    print(f"X1 = {x1:.2f}")
    print(f"X2 = {x2:.2f}")

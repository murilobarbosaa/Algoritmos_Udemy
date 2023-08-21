print("Digite as três distâncias: ")
x = float(input())
y = float(input())
z = float(input())

if x > y and x > z:
    maior = x
elif y > x and y > z:
    maior = y
else:
    maior = z

print(f"MAIOR DISTÂNCIA = {maior:.2f}")

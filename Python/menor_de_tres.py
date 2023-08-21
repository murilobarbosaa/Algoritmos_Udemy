x = int(input("Primeiro valor: "))
y = int(input("Segundo valor: "))
z = int(input("Terceiro valor: "))

if x < y and x < z:
    menor = x
elif y < x and y < z:
    menor = y
elif z < x and z < y:
    menor = z

print(f"MENOR = {menor}")

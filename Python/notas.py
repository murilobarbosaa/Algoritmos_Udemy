nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))

media = (nota1 + nota2)
if media < 60:
    print(f"NOTA FINAL = {media:.1f}")
    print("REPROVADO")
else:
    print(f"NOTA FINAL = {media:.1f}")

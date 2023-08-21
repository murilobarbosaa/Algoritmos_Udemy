salario = float(input("Digite o salário da pessoa: "))

if salario <= 1000:
    porcentagem = 0.2
elif salario <= 3000:
    porcentagem = 0.15
elif salario <= 8000:
    porcentagem = 0.1
else:
    porcentagem = 0.05

novoSalario = salario + salario * porcentagem
aumento = salario * porcentagem

print(f"Novo salário = R$ {novoSalario:.2f}")
print(f"Aumento = R$ {aumento:.2f}")
print(f"Porcentagem = {porcentagem * 100:.0f}%")

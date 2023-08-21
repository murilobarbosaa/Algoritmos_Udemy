senha = 2002
tentativa = int(input("Digite a senha: "))

while tentativa != senha:
    tentativa = int(input("Senha Invalida! Tente novamente: "))

print("Acesso permitido!")

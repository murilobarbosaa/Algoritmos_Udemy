total = float(input("Digite a duração em segundos: "))

horas = total / 3600
resto = total % 60
minutos = (total % 3600) / 60
segundos = resto % 60

print(f"{horas:.0f}:{minutos:.0f}:{segundos:.0f}")
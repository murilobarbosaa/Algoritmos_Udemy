horaI = int(input("Hora inicial: "))
horaF = int(input("Hora final: "))

if horaF == horaI:
    duracao = 24
elif horaI < horaF:
    duracao = horaF - horaI
else:
    duracao = 24 - horaI + horaF

print(f"O JOGO DUROU {duracao} HORA(S)")

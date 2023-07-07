print('*' * 70)
print('Faça um programa que peça dois números e imprima o maior'.center(70))
print('*' * 70)


while True:
    num1 = int(input("Digite o primeiro número: "))
    num2 = int(input("Digite o segundo número: "))
    if (num1 == num2):
        print('Os números são iguais')
    elif (num1 > num2):
        print(f'O maior número é: {num1}')
    else:
        print(f'O maior número é: {num2}')
    
    resp = ' '
    while resp not in 'SN':
        print()
        resp = str(input('Deseja continuar? [S/N]: ')).strip().upper()[0]
        print()
    if resp == 'N':
          print()
          print('''Fim do Programa!!!  
Volte Sempre!!!''')
          break
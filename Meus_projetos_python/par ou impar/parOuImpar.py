from random import randint
cont = 0
print('-=' * 15)
print('VAMOS JOGAR PAR OU IMPAR')
print('-=' * 15)
while True:
    num = int(input('Digite um número: '))
    comp = randint(0 ,10)
    tot = num + comp
    parImpar = ' '
    while parImpar not in 'PI':
        parImpar = str(input('Par ou Impar? [P/I]: ')).strip().upper()[0]
    print(f'Você jogou {num} e o computador {comp}. O total é {tot}. ')
    if parImpar == 'P':
        if tot % 2 == 0:
            print('Você VENCEU!!!')
            print('O NÚMERO É PAR')
            cont += 1
        else:
            print('Você PERDEU!!!')
            print('O NÚMERO É IMPAR')
            break
    elif parImpar == 'I':
        if tot % 2 == 1:
            print('Você VENCEU!!!')
            print('O NÚMERO É IMPAR')
            cont += 1
        else:
            print('Você PERDEU!!!')
            print('O NÚMERO É PAR')
            break
    print('Vamos Jogar novamente...')
print(f'GAME OVER!!!. Você venceu {cont} vezes.')
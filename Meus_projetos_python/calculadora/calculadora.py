print('*' * 25)
print('Calculadora Simples'.center(25))
print('*' * 25)

print()


while True:
    
    n1 = int(input('Entre com o valor 1:  '))
    n2 = int(input('Entre com o valor 2:  '))

    print()

    operador = input("""
Digite:

(+)  Para somar
(-)  Para subtrair
(*)  Para multiplicar
(/)  Para dividir 
""")
    print()
    try:
        if operador == '+':
            print(f'{n1} + {n2} = {n1 + n2}')
        elif operador == '-':
            print(f'{n1} - {n2} = {n1 - n2}')
        elif operador == '*':
            print(f'{n1} * {n2} = {n1 * n2}')
        elif operador == '/':
            print(f'{n1} / {n2} = {n1 / n2}')
        else:
            print('Favor digitar um operador válido!!!')
    except (ZeroDivisionError):
        print('ERRO.. Não é permitido dividir um número por zero!!!')

    resp = ' '
    while resp not in 'SN':
        print()
        resp = str(input('Deseja continuar calculando? [S/N]: ')).strip().upper()[0]
        print()
    if resp == 'N':
          print()
          print('''Fim do Programa!!!  
Volte Sempre!!!''')
          break

'''
Faça um programa para uma loja de tintas.

O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura de tinta é de 1 litro para cada 3 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.

Informe ao usuário a(s) quantidade(s) de latas de tinta a serem compradas e
o preço total
'''
 
print('*' * 25)
print('Loja de tintas'.center(25))
print('*' * 25)   
print()  
while True:
    area = int(input("Digite a área a ser pintada: "))
    
    litros = area//3
    if area % 3 > 0:
        litros +=1 
        
    latas = litros//18
    if litros % 18 > 0:
        latas +=1 
        
    print (f'Você precisará de {latas} lata(s) e pagará R$: {latas*80:.2f} reais') 
    
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
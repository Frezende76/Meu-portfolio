from random import choice
palavras = ['padeiro', 'dinossauro', 'heliporto', 'tubarao']
letras_corretas = []
letras_incorretas = []
tentativas = 6
acertos = 0
jogo_terminado = False


def escolher_palavra(lista_palavras):
    palavra_escolhida = choice(lista_palavras)
    letras_unicas = len(set(palavra_escolhida))
    
    return palavra_escolhida, letras_unicas



def pedir_letra():
    letra_escolhida = ''
    e_valida = False
    abecedario = 'abcdefghijklmnopqrstuvwxyz'
    
    while not e_valida:
        letra_escolhida = input("Digite uma letra: ").lower()
        if letra_escolhida in abecedario and len(letra_escolhida) == 1:
            e_valida = True
        else:
            print('Não foi escolhida uma letra correta')
            
    return letra_escolhida


def mostrar_novo_quadro(palavra_escolhida):
    
    lista_oculta = []
    
    for l in palavra_escolhida:
        if l in letras_corretas:
            lista_oculta.append(l)
        else:
            lista_oculta.append('-')
    print(' '.join(lista_oculta))
    
    
    
def checar_letra(letra_escolhida, palavra_oculta, vidas, coincidencias):
    fim = False
    
    if letra_escolhida in palavra_oculta and letra_escolhida not in letras_corretas:
        letras_corretas.append(letra_escolhida)
        coincidencias += 1
    elif letra_escolhida in palavra_oculta and letra_escolhida in letras_corretas:
        print("Letra já digitada. Digite outra diferente")
    else:
        letras_incorretas.append(letra_escolhida)
        vidas -= 1
        
    if vidas == 0:
        fim = perder()
    elif coincidencias == letras_unicas:        
        fim = ganhar(palavra_oculta)
        
    return vidas, fim, coincidencias


def perder():
    print('Acabaram as vidas restantes')
    print("A palavra oculta era " + palavra)
    
    return True



def ganhar(palavra_descoberta):
    mostrar_novo_quadro(palavra_descoberta)
    print("Parabéns, encontrou a palavra!")
    
    return True


palavra, letras_unicas = escolher_palavra(palavras)

while not jogo_terminado:
    print('\n' + '*' * 20 + '\n')
    mostrar_novo_quadro(palavra)
    print('\n')
    print('Letras incorretas: ' + '-'.join(letras_incorretas))
    print(f'Vidas: {tentativas}')
    print('\n' + '*' * 20 + '\n')
    letra = pedir_letra()
    
    tentativas, terminado, acertos = checar_letra(letra, palavra, tentativas, acertos)
    
    jogo_terminado = terminado
    
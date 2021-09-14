from ArvoreBinaria import ArvoreBinaria

if __name__ == '__main__':
  
  arvore = ArvoreBinaria()

  arvore.inserir(30)
  arvore.inserir(14)
  arvore.inserir(39)
  arvore.inserir(9)
  arvore.inserir(89)
  
  print(f'Ligações: {str(arvore.ligacoes)[1:-1]}')
  print(f'Grau: {arvore.grau(39)}')

  # no_pesquisa = int(input('Pesquisa: '))
  # if(arvore.pesquisar(no_pesquisa) != None):
  #   print(f'Nó {no_pesquisa} encontrado.')
  
  # print(arvore.noFolha(arvore.raiz))
  # arvore.inserir(53)
  # arvore.inserir(30)
  # arvore.inserir(14)
  # arvore.inserir(39)
  # arvore.inserir(9)
  # arvore.inserir(23)
  # arvore.inserir(34)
  # arvore.inserir(49)
  # arvore.inserir(72)
  # arvore.inserir(61)
  # arvore.inserir(84)
  # arvore.inserir(79)
  # arvore.inserir(89)

  # print(arvore.ligacoes)

  # print()

  # print(f'Nó raiz principal: {arvore.raiz.valor}')
  # print(f'Nó raiz esquerdo: {arvore.raiz.esquerda.valor}')
  # print(f'Nó raiz direito: {arvore.raiz.direita.valor}')
  # print('#' * 25)
  # print(f'Altura: {arvore.altura()}')
  # print(f'Grau: {arvore.grau(arvore.raiz)}')
  # print(f'Nivel: {arvore.nivel() + 1}')
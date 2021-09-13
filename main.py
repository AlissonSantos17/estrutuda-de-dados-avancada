from ArvoreBinaria import ArvoreBinaria

if __name__ == '__main__':
  arvore = ArvoreBinaria()

  arvore.inserir(53)
  arvore.inserir(30)
  arvore.inserir(14)
  arvore.inserir(39)
  arvore.inserir(9)
  arvore.inserir(23)
  arvore.inserir(34)
  arvore.inserir(49)
  arvore.inserir(72)
  arvore.inserir(61)
  arvore.inserir(84)
  arvore.inserir(79)
  arvore.inserir(89)

  print()
  print(arvore.ligacoes)
  print()
  print(f'Nó raiz principal: {arvore.raiz.valor}')
  print(f'Nó raiz esquerdo: {arvore.raiz.esquerda.valor}')
  print(f'Nó raiz direito: {arvore.raiz.direita.valor}')
  print()
  print('#' * 25)
  print(f'Altura: {arvore.altura()}')

  # arvore.pesquisar(89)
  # if arvore.pesquisar(89) is None:
  #   print('Elemento não localizado.')
  # else:
  #   print('Elemento localizado.')
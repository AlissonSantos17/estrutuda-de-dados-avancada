from GenericTree import GenericTree


def build_tree():
    # RAIZ
    root = GenericTree(100)

    # SETA OS NÓS
    noA = GenericTree(17)
    noB = GenericTree(2)
    noC = GenericTree(68)
    noD = GenericTree(42)
    noE = GenericTree(25)
    noF = GenericTree(13)
    noG = GenericTree(75)

    # ADD OS FILHOS
    noA.add_child(noB)
    noC.add_child(noA)
    noC.add_child(noD)
    noF.add_child(noE)
    noF.add_child(noG)

    root.add_child(noC)
    root.add_child(noF)

    # RECUPERA AS FOLHAS
    print(f'\nRAIZ -> {root.data}')

    # RECUPERA AS FOLHAS
    print(f'\nNÓS FOLHAS 🍃')
    root.get_leafs()

    # RECUPERA GRAU
    print(f'\nGRAU DE CADA NÓ °')
    print(f'Nó {root.data} - {root.get_degree()}')
    print(f'Nó {noA.data} - {noA.get_degree()}')
    print(f'Nó {noB.data} - {noB.get_degree()}')
    print(f'Nó {noC.data} - {noC.get_degree()}')
    print(f'Nó {noD.data} - {noD.get_degree()}')
    print(f'Nó {noE.data} - {noE.get_degree()}')
    print(f'Nó {noF.data} - {noF.get_degree()}')
    print(f'Nó {noG.data} - {noG.get_degree()}')

    # RECUPERA ALTURA
    print(f'\nALTURA DE CADA NÓ 📏')
    print(f'Nó {root.data} - {root.get_height()}')
    print(f'Nó {noA.data} - {noA.get_height()}')
    print(f'Nó {noB.data} - {noB.get_height()}')
    print(f'Nó {noC.data} - {noC.get_height()}')
    print(f'Nó {noD.data} - {noD.get_height()}')
    print(f'Nó {noE.data} - {noE.get_height()}')
    print(f'Nó {noF.data} - {noF.get_height()}')
    print(f'Nó {noG.data} - {noG.get_height()}')

    # RECUPERA A PROFUNDIDADE
    print(f'\nPROFUNDIDADE DE CADA NÓ')
    print(f'Nó {root.data} - {root.get_depth()}')
    print(f'Nó {noA.data} - {noA.get_depth()}')
    print(f'Nó {noB.data} - {noB.get_depth()}')
    print(f'Nó {noC.data} - {noC.get_depth()}')
    print(f'Nó {noD.data} - {noD.get_depth()}')
    print(f'Nó {noE.data} - {noE.get_depth()}')
    print(f'Nó {noF.data} - {noF.get_depth()}')
    print(f'Nó {noG.data} - {noG.get_depth()}')

    # RECUPERA O NIVEL
    print(f'\nNÍVEL DE CADA NÓ 🎚️')
    print(f'Nó {root.data} - {root.get_level()}')
    print(f'Nó {noA.data} - {noA.get_level()}')
    print(f'Nó {noB.data} - {noB.get_level()}')
    print(f'Nó {noC.data} - {noC.get_level()}')
    print(f'Nó {noD.data} - {noD.get_level()}')
    print(f'Nó {noE.data} - {noE.get_level()}')
    print(f'Nó {noF.data} - {noF.get_level()}')
    print(f'Nó {noG.data} - {noG.get_level()}')

    # RECUPERA AS SUBARVORES
    print(f'\nSUBARVORES DE CADA NÓ 🌳 -> 🌳:')
    print('Nó RAIZ')
    root.print_tree()
    print(f'\nSUBARVORE DO NÓ {noA.data}')
    noA.print_tree()
    print(f'\nSUBARVORE DO NÓ {noB.data}')
    noB.print_tree()
    print(f'\nSUBARVORE DO NÓ {noC.data}')
    noC.print_tree()
    print(f'\nSUBARVORE DO NÓ {noD.data}')
    noD.print_tree()
    print(f'\nSUBARVORE DO NÓ {noE.data}')
    noE.print_tree()
    print(f'\nSUBARVORE DO NÓ {noF.data}')
    noF.print_tree()
    print(f'\nSUBARVORE DO NÓ {noG.data}')
    noG.print_tree()


if __name__ == '__main__':
    build_tree()

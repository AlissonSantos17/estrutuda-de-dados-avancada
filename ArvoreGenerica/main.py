from GenericTree import GenericTree


def build_tree():
    root = GenericTree(50)

    no1 = GenericTree(1)
    no1.add_child(GenericTree(15))

    root.add_child(no1)

    root.print_tree()


if __name__ == '__main__':
    build_tree()

class GenericTree:
    def __init__(self, data):
        self.data = data
        self.children = []
        self.parent = None

    def add_child(self, child):
        self._add_child(child)

    def _add_child(self, child):
        child.parent = self
        self.children.append(child)

    def get_level(self):
        level = 0
        p = self.parent
        while p:
            level += 1
            p = p.parent

        return level

    def get_leafs(self):
        if(self.children):
            for children in self.children:
                children.get_leafs()
        else:
            print(self.data)

    def get_degree(self):
        return len(self.children)

    def get_height(self):
        h = 0
        anc = self.parent
        while (anc):
            h += 1
            anc = anc.parent
        return h

    def get_depth(self):
        p = 0
        anc = self.parent
        while(anc):
            p += 1
            anc = anc.parent
        return p

    def print_tree(self):
        spaces = ' ' * self.get_level() * 3
        prefix = spaces + "|__" if self.parent else ""
        print(prefix + str(self.data))
        if self.children:
            for child in self.children:
                child.print_tree()

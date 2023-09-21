class Node:
    def __init__(self, value):
        self.value = value
        self.child = []

    def addChild(self, child):
        self.child.append(child)


def makeTree(children, branch):
    parents = []
    loop = len(children) // branch
    print(loop)
    for i in range(loop):
        parent = Node(0)
        for j in range(branch):
            parent.addChild(children[(i * branch) + j])
        parents.append(parent)
    return parents




def main():
    turns = int(input("Number of turns")) #turns
    branch = int(input("Number of nodes")) #how many branches per parent
    depth = 2 * turns
    values = branch ** depth
    numbers = list(map(int, input().split()))
    pos = []
    for i in range(values):
        pos.append(Node(numbers[i]))
    while len(pos) != 1:
        pos = makeTree(pos, branch)
    root = pos[0]
    print()

if __name__ == '__main__':
    main()
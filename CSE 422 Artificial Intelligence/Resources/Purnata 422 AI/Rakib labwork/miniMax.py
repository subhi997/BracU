class Node:
    def __init__(self, value):
        self.value = value
        self.child = []
        self.gameOver=0

    def addChild(self, child):
        self.child.append(child)
        self.gameOver+=1

x=0
def makeTree(children, branch):
    parents = []
    loop = len(children) // branch
    #print(loop)
    for i in range(loop):
        parent = Node(0)
        for j in range(branch):
            parent.addChild(children[(i * branch) + j])
        parents.append(parent)
    return parents




def miniMax(root,depth,maximizgPlayer):

    if depth==0 or root.gameOver==0:
        return root.value
    if maximizgPlayer:
        maxEval=-1000
        for child in root.child:
            eval=miniMax(child,depth-1,False)
            root.gameOver-=1
            maxEval=max(eval,maxEval)
        return maxEval
    else:
        minEval=1000
        for child in root.child:
            eval=miniMax(child,depth-1,True)
            minEval=min(minEval,eval)
            root.gameOver-=1
        return minEval


def prunning(root, depth,alpha,beta, maximizgPlayer):
    global x
    if depth == 0 or root.gameOver == 0:
        return root.value
    if maximizgPlayer:
        maxEval = -1000
        for child in root.child:
            eval = prunning(child, depth - 1, alpha,beta,False)
            root.gameOver -= 1
            maxEval = max(eval, maxEval)
            alpha=max(alpha,eval)
            if beta <= alpha:
                x+=1
                break
        return maxEval
    else:
        minEval = 1000
        for child in root.child:
            eval = prunning(child, depth - 1, alpha,beta,True)
            root.gameOver -= 1
            minEval = min(minEval, eval)
            beta= min(beta,eval)
            if beta<=alpha:
                x+=1
                break

        return minEval

if __name__ == '__main__':
    turns=int(input("number of turns"))
    branch=int(input("number of notes"))
    depth=turns*2
    values=branch**(depth)#number of total child
    numbers=[]
    for i in range (values):
        numbers.append(int(input("give values")))
    alpha=1000
    beta=-1000
    pos = []
    pos1=[]
    for i in range(values):
        pos.append(Node(numbers[i]))
    while len(pos) != 1:
        pos = makeTree(pos, branch)
    root = pos[0]
    for i in range(values):
        pos1.append(Node(numbers[i]))
    while len(pos1) != 1:
        pos1 = makeTree(pos1, branch)
    root1 = pos1[0]



    store=miniMax(root,depth,True)
    store1=prunning(root1,depth,alpha,beta,True)
    print("Depth:"+str(depth))
    print("Branch:" + str(branch))
    print("Terminal states:" + str(values))
    print("Maximum amount "+str(store))
    print("comaprisons " + str(branch ** depth))
    print("comaprisons "+str((branch**depth)-x))













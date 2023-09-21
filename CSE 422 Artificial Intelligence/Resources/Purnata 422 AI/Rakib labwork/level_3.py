import bfs


def initialization():
    adj_list = {}
    position = int(input('Enter number of position:'))
    connections = int(input('Enter number of connections:'))
    for x in range(connections):
        a, b = map(int, input().split())
        if a not in adj_list:
            adj_list[a] = []
        if b not in adj_list:
             adj_list[b] = []
        adj_list[a].append(b)


    return adj_list


adj_list = initialization()
lina = int(input('Enter number of position of Lina:'))
k = int(input('Enter number of players:'))
list = []
for i in range(k):
    pos = int(input("Position of k{} participant: ".format(i + 1)))
    list.append(bfs.bfs(adj_list, pos, lina))
list.sort()
print(list[0])

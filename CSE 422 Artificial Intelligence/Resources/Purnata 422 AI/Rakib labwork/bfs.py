from queue import Queue


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
        adj_list[b].append(a)
    return adj_list


# print(adj_list)

def bfs(adj_list,initial, pos):
    visited = {}
    level = {}
    parent = {}
    bfs_output = []
    queue = Queue()
    for node in adj_list.keys():
        visited[node] = False
        parent[node] = None
        level[node] = -1
    visited[initial] = True
    level[initial] = 0
    queue.put(initial)

    while not queue.empty():
        u = queue.get()
        bfs_output.append(u)

        for v in adj_list[u]:
            if not visited[v]:
                visited[v] = True
                parent[v] = u
                level[v] = level[u] + 1
                queue.put(v)
    return level[pos]



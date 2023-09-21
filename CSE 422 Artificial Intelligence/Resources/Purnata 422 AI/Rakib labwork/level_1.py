
import bfs

adj_list = bfs.initialization()
pos = int(input('Enter number of position of Lina:'))
level = bfs.bfs(adj_list,0, pos)
print(level)

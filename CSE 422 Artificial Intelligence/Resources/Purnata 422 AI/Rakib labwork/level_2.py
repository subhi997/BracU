
import bfs

adj_list=bfs.initialization()
lina= int(input('Enter number of position of Lina:'))
nora = int(input('Enter number of position of nora:'))
lara = int(input('Enter number of position of lara:'))

lara_pos=bfs.bfs(adj_list , lara, lina)
nora_pos=bfs.bfs(adj_list,nora,lina )
if lara_pos>nora_pos:
    print("nora")
else:
    print("lara")


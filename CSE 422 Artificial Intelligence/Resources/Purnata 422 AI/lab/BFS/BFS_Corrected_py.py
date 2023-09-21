
# coding: utf-8

# In[10]:


import numpy as np
file =open('C:\\Task1.txt','r')
#reading first line for vertex count
line1=file.readline().strip()
vertexcount=int(line1[0])

#reading 2nd line for edge count
line2=file.readline().strip()
edgecount=int(line2)

#creat adjacent matrix
adjmatrix= np.zeros((vertexcount, vertexcount), dtype='int')
print(adjmatrix)

print(edgecount)


# In[11]:


for count in range(edgecount):
    line =file.readline().strip() 
    
    if not line:
        break
        
    vertices=line.split(" ")
    u= int(vertices[0])
    v= int(vertices[1])
    print(u)
    print(v)
  
    adjmatrix[u][v]+= 1


# In[12]:


line3=file.readline().strip()
enemy_vertex=int(line3)
print(enemy_vertex)


# In[13]:


for row in range(vertexcount):
    for col in range(vertexcount):
        print(adjmatrix[row][col], end=' ')
    print()


# In[27]:


color=np.empty((vertexcount), dtype="object")
color[:]= 'White'
parent=np.empty((vertexcount), dtype="object")
parent[:]=np.NaN
d=np.empty((vertexcount), dtype="int")
d[:]= 999999


# In[28]:


#queue using queue model
from queue import Queue
#initializing queue
myqueue= Queue(maxsize= vertexcount)


# In[29]:


#bfs function
def bfs(s):
    global color, parent, d
    color[s] = 'Gray'
    parent[s]= np.nan
    d[s]= 0
    myqueue.put(s)
    while not myqueue.empty():
        u=myqueue.get() #popping element
        #print(u)
        for v in range(1, vertexcount):
            if adjmatrix[u][v]==1:
                if color[v] == 'White':
                    color[v]='Gray'
                    d[v]=d[u] +1
                    parent[v]=u
                    myqueue.put(v)
        color[u]= 'Black'
        print(u, 'distance: ', d[u])
        
    return


# In[30]:


bfs(0)


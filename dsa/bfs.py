from collections import deque

def bfs(adj):
    v = [False] * len(adj)
    res = []

    src = 0
    q = deque() # aot
    v[src] = True
    q.append(src) # aot

    while q:
        curr = q.popleft() # aot
        res.append(curr)

        # visit neighbours
        for x in adj[curr]:
            if not v[x]:
                v[x] = True
                q.append(x)

    return res


# ------------------
# ----- copied -----
def addEdge(adj, u, v):
    adj[u].append(v)
    adj[v].append(u)
    
    
if __name__ == "__main__":
    V = 5
    adj = []
    
    # creating adjacency list
    for i in range(V):
        adj.append([])
        
    addEdge(adj, 1, 2)
    addEdge(adj, 1, 0)
    addEdge(adj, 2, 0)
    addEdge(adj, 2, 3)
    addEdge(adj, 2, 4)

    res = bfs(adj)

    for node in res:
        print("\n\n\n")
        print(node, end=" ")

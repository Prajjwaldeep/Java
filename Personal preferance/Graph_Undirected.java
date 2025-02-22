
public class Graph_Undirected {
	
	int adjGraph[][];
	int V;
	int E;
	
	public static void main(String[] args) {
		
		Graph_Undirected graph =new Graph_Undirected(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		
		System.out.println(graph);
		
	}
	
	public Graph_Undirected(int nodes)
	{
		this.adjGraph=new int[nodes][nodes];
		this.E=0;
		this.V=nodes;
	}
	
	public void addEdge(int u,int v)
	{
		adjGraph[u][v]=1;
		adjGraph[v][u]=1;
		E++;
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(V+" Vertices "+E+" Edges\n");
		for(int v=0;v<V;v++)
		{
			for(int i : adjGraph[v])
			{
				sb.append(i+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
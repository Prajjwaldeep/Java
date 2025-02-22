import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_With_List {
	
	LinkedList<Integer> mat[];
	int V;
	int E;
	
	public Graph_With_List(int nodes)
	{
		this.V=nodes;
		this.E=0;
		this.mat=new LinkedList[nodes];
		for(int i=0;i<nodes;i++)
		{
			this.mat[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int u,int v)
	{
		this.mat[u].add(v);
		this.mat[v].add(u);
		E++;
	}
	
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(V+" Vertices "+E+" Edges\n");
		for(int v=0;v<V;v++)
		{
			sb.append(v+" : ");
			for(int i : mat[v])
			{
				sb.append(i+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void BFS_Search(int s)
	{
		boolean visited[]=new boolean[V];
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(s);
		visited[s]=true;
		
		while(!queue.isEmpty())
		{
			int u=queue.poll();
			System.out.println(u+" ");
			for(int i : mat[u])
			{
				if(!visited[i])
				{
					queue.offer(i);
					visited[i]=true;
				}
			}
		}
	}
	
	public void DFS_Search(int s)
	{
		
		boolean visited[]=new boolean[V];
		Stack<Integer> stack=new Stack<>();
		
		stack.push(s);
		while(!stack.isEmpty())
		{
			int u=stack.pop();
			if(!visited[u])
			{
				visited[u]=true;
				System.out.println(u+" ");
				for(int i : mat[u])
				{
					if(!visited[i])
					{
						stack.push(i);
					}
				}
			}
		}
	}
	
	public void DFS_Recursive()
	{
		boolean visited[]=new boolean[V];
		for(int v=0;v<V;v++)
		{
			if(!visited[v])
			{
				DFS_Recursive(v,visited);
			}
		}
	}
	
	private void DFS_Recursive(int v, boolean[] visited)
	{
		visited[v]=true;
		System.out.println(v+" ");
		for(int i : mat[v])
		{
			if(!visited[i])
			{
				DFS_Recursive(i,visited);
			}
		}
	}

	public static void main(String[] args) {
		
		Graph_With_List graph=new Graph_With_List(5);
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 0);
		//graph.addEdge(2, 4);
		
		System.out.println(graph);
		
		System.out.println("BFS Traversal:");
		graph.BFS_Search(0);
		
		System.out.println("DFS Traversal Iterative:");
		graph.DFS_Search(0);
		
		System.out.println("DFS Traversal Recursion:");
		graph.DFS_Recursive();
	}

}

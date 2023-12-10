package merge;
import java.util.*;
public class DFS
{
	 private int V;
	private  LinkedList<Integer> adj[];
	@SuppressWarnings("Unchecked") DFS(int v)
	{
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList();
	}
	 void addEdge(int x,int y)
	{
		adj[x].add(y);
	}
	 void Dfsutil(int v,boolean visited[])
	{
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> i=adj[v].listIterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(!visited[n])
				Dfsutil(n,visited);
		}
	}
	 void DFS(int v)
	{
		boolean[] visited=new boolean[V];
		
		Dfsutil(v,visited);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of edges : ");
		int n=sc.nextInt();
		DFS g=new DFS(n);
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			g.addEdge(x,y);
		}
		System.out.println("Enter source vertex : ");
		int s=sc.nextInt();
		System.out.println ("DFS traversal : ");
	    g.DFS(s);
	}
}
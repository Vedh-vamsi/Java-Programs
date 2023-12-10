package merge;
import java.util.Arrays;
import java.util.Scanner;
class MyProgramme
{
	public static void main(String[] args)
	{
		int n,t=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int k=0,start=0,j;
		 int [] fr = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for( j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  { 
	                fr[i] = count;  
	                t++;
	        }
	        }
	        int b[]=new int[t];
	        int c[]=new int[t];
	        t=0;
	      for(int i=0;i<fr.length;i++)
	      {
	    	  if(fr[i]!=-1)
	    	  {
	    		  b[t]=fr[i];
	    		  c[t]=arr[i];
	    		  t++;
	    	  }
	      }
	      for(int i=0;i<b.length;i++)
	      {
	    	  int m=b[i];
	    	  for(j=i+1;j<b.length;j++)
	    	  {
	    		  if(m<b[j])
	    		  {
	    			  int temp=c[i];
	    			  c[i]=c[j];
	    			  c[j]=temp;
	    			  b[i]=b[j];
	    			  b[j]=m;
	    		  }
	    	  }
	    	  
	      }
	      for(int i=0;i<b.length;i++)
	      {
	    	  for( j=0;j<b[i];j++)
	    		  System.out.print(c[i]+" ");
	      }
	      System.out.println();
}
}
package merge;

public class Main1 {
	static int k1=0,k2=0;
	static boolean flag=true;
	public static int max_c=0;
	static int l='1';
    public static void main(String[] args)
    {
    	char ch[][]= {{'*','*','*','*'},{'V','*','*','*'},{'*','V','*','*'},{'*','*','V','*'}};
    	Met(ch);
    }
    public static void Met(char[][] ch)
    {
        char l='1';
        for(int i=0;i<ch.length;i++)
        {
           int c=0,p=0;
            for(int j=0;j<ch[i].length;j++)
            {
              if(ch[i][j]=='V')
                 c+=1;
                else if(j!=0&&(ch[i][j]=='*'&&ch[i][j-1]=='V'))
                {
                    if(c>p)
                      p=c;
                    c=0;
                }
            }
            if(c>p)
                p=c;
            if(max_c<p)
                max_c=p;
        }
       int s=ch[0].length;
        for(int j=0;j<s;j++)
        {
            int c=0,p=0;
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i][j]=='V')
                    c+=1;
                else if(i!=0&&(ch[i][j]=='*'&&ch[i-1][j]=='V'))
                {
                    if(c>p)
                      p=c;
                    c=0;
                
            }
            }
            if(c>p)
                p=c;
            if(max_c<p)
                max_c=p;           
            }
            int row=ch.length;
            int col=ch[0].length;
            for(int i=1;i<=(row+col-1);i++){
                int c=0,p=0;
                int st_col=max(0,i-row);
                int count=min(i,(col-st_col),row);
                for(int j=0;j<count;j++)
                {
                    if(ch[min(row,i)-j-1][st_col+j]=='V') {
                        c+=1;            
                    }
                    else if(ch[min(row,i)-j-1][st_col+j]=='*'&&l=='V')
                    {
                        if(c>p)
                            p=c;
                        c=0;
                    }
                   l=ch[min(row,i)-j-1][st_col+j]; 
                }
                 if(c>p)
                p=c;
            if(max_c<p)
                max_c=p;
            }
        l='1';
        for (int i = 0; i < col; ++i)
            {int c=0,p=0;
                for (int j = i; j >= 0 && i - j < row; --j)
                {
                    if(ch[i-j][j]=='V')
                        c+=1;
                    else if(ch[i-j][j]=='*'&&l=='V')
                    {
                        if(c>p)
                            p=c;
                        c=0;
                    }
                  l=ch[i-j][j];  
                }
            if(c>p)
                p=c;
            if(max_c<p)
                max_c=p;
            }
            l='1';
            for (int i = 1; i < row; ++i)
            {int c=0,p=0;
                for (int j = col - 1, k = i; 
                     j >= 0 && k < row; --j, k++)
                {
                    if(ch[k][j]=='V')
                      c+=1;
                     else if(ch[k][j]=='*'&&l=='V')
                    {
                        if(c>p)
                            p=c;
                        c=0;
                    }
                  l=ch[k][j];  
                }
                 if(c>p)
                p=c;
            if(max_c<p)
                max_c=p;
            }
            l='1';
            for(int g=0;g<ch.length;g++) {
            	int c=0,p=0;
            	for(int i=0,j=g;j<ch.length;i++,j++)
            	{
            		if(ch[i][j]=='V')
            			c+=1;
            		else if(ch[i][j]=='*'&&l=='V')
            		{
            			if(c>p)
            				p=c;
            			c=0;
            		}
            		l=ch[i][j];
            	}
            	  if(c>p)
                      p=c;
                  if(max_c<p)
                      max_c=p;
            }
            traverseMatrixdiagonal(ch,0,0,row,col);
        System.out.println(max_c);
    }
    static int min(int a,int b,int c)
    {
        return min(min(a,b),c);
    }
    static int max(int a,int b)
    {
        return(a>b)?a:b;
    }
    static int min(int a, int b) { 
        return (a < b) ? a : b; 
        }
    static boolean traverseMatrixdiagonal(char ch[][],int i,int j,int row,int col)
    {
    	int c=0,p=0;
    	if(i>=row||j>=col)
    	{
    		if(flag)
    		{
    			int a=k1;
    			k1=k2;
    			k2=a;
    			flag=!flag;
    			k1++;
    		}
    		else
    		{
    			int a=k1;
    			k1=k2;
    			k2=a;
    			flag=!flag;
    		}
    		return false;
    	}
    	if(ch[i][j]=='V')
    		c++;
    	else if(ch[i][j]=='*'&&l=='V') {
    		if(c>p)
    		{
    			p=c;
    		}
    		c=0;
    	}
    	 if(c>p)
             p=c;
         if(max_c<p)
             max_c=p;
         l=ch[i][j];
         if(traverseMatrixdiagonal(ch,i+1,j+1,row,col))
         {
        	 return true;
         }
         if(traverseMatrixdiagonal(ch,k1,k2,row,col))
        	 return true;
         return true;
    }
    
}

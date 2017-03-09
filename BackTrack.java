import java.io.*;
import java.lang.*;
import java.util.*;
class BackTrack
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter m*m of matrix");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter values in the matrix");
		//Initialize the array
		char[][] a=new char[n][n];
		char[][]sol=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				String s=br.readLine();
				a[i][j]=s.charAt(0);
				sol[i][j]='\0';
			}
		}
				System.out.println("Enter value to be found");
				String str=br.readLine();
				//finding the start
				
					char c=str.charAt(0);
					int l=str.length();
					int count=0;
					int x=findx(c,a,n);
					int y=findy(c,a,n);
					//Solving the Maze
					if(x!=-1&&y!=-1)
					solveMaze(a,sol,x,y,str,n,l,count);
					else
						System.out.println("NO");
					System.out.println("NO");
			
	}
	
	public static int solveMaze(char a[][],char sol[][], int x,int y, String str, int n,int l,int count)
	{
		 if(count==l)
		 {
			 System.out.println("YES");
			 System.exit(0);
		 }
		
		 char c=str.charAt(count);
		 if(isSafe(a,n,x,y,c)==1)
		 {
			 sol[x][y]=c;
			 count++;
			 if(solveMaze(a,sol,x+1,y,str,n,l,count)==1)
				 return 1;
			 if(solveMaze(a,sol,x,y+1,str,n,l,count)==1)
				 return 1;
			  if(solveMaze(a,sol,x-1,y,str,n,l,count)==1)
				 return 1;
			  if(solveMaze(a,sol,x,y-1,str,n,l,count)==1)
				 return 1;
			 sol[x][y]='\0';//backtracking
			 return -1;
			 
		 }
		return -1; 
	}
	public static int isSafe(char a[][], int n, int x, int y, char c)
	{
		if(x>=0&&x<n&&y>=0&&y<n&&a[x][y]==c)
			return 1;
		return -1;
			
	}
	public static int findx(char c, char a[][], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==c)
					return i;
			}
		}
	return -1;
	}
	public static int findy(char c, char a[][], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==c)
					return j;
			}
		}
	return -1;
	}
}
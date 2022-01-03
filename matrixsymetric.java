import java.util.Scanner;
class matrixsymetric
{
public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the order of Square matrix");
	int m = s.nextInt();
	int a[][] = new int[m][m];
	System.out.println("Enter the elements of matrix:\n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
			a[i][j] = s.nextInt();
			}
		}
			int f=0;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i][j]!=a[j][i])
					{
					f=1;
					break;
					}
				}
			}
		if(f==0)
		{
		System.out.println("Entered matrix is symetric");
		}
		else
		{
		System.out.println("Entered matrix is not symetric");
		}
	}
}	
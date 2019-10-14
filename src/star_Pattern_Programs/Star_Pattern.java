package star_Pattern_Programs;

import java.util.Scanner;

public class Star_Pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		System.out.println("*******************Type 1*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 2*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*******************Type 3*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 4*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*******************Type 5*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 6*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*******************Type 7*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 8*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 9*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("******************Type 10*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int l=rows-1; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("******************Type 11*********************************");	
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("******************Type 12*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<=i-1; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int l=rows-2; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("******************Type 13*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("******************Type 14*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if(i+j== (rows+1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("******************Type 15*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if((i+j== (rows+1))||(i==j))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("******************Type 16*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows; k>=i; k--)
			{
				if(k==rows)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=rows-1;l>=i; l--)
			{
				if(i==l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		System.out.println("******************Type 17*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				if(k==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=1; l<=i-1; l++)
			{
				if(i==(l+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("******************Type 18*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				if(k==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=1; l<=i-1; l++)
			{
				if(i==(l+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-1; k>=i; k--)
			{
				if(k==rows-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int l=rows-2; l>=i; l--)
			{
				if(i==l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		System.out.println("******************Type 19*********************************");
		for(int i=1; i<=rows; i++)
		{
			if((i == 1)||(i==rows))
			{
				for(int j=1; j<=rows; j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int k=1; k<=rows; k++)
				{
					if((k==1)||(k==rows))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		scan.close();
	}
}

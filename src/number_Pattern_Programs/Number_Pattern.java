package number_Pattern_Programs;

import java.util.Scanner;

public class Number_Pattern 
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
				System.out.print("1 ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 2*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 3*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 4*********************************");
		int count = 0;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 5*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 6*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			for(int k=i-1; k>=1; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 7*********************************");
		for(int i=1; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("*******************Type 8*********************************");
		for(int i=1; i<=rows; i++)
		{
			int temp = i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(temp + " ");
				temp = temp + rows - j;
			}
			System.out.println();
		}
		System.out.println("*******************Type 9*********************************");
		System.out.println("Enter the number of Columns");
		int columns = scan.nextInt();
		int counter = 0;
		for(int i=1; i<=rows; i++)
		{
			if(i % 2 !=0)
			{
				for(int j=1; j<=columns; j++)
				{
					counter++;
					System.out.print(counter + " ");
				}
			}
			else
			{
				int temp = counter + 1;
				for(int j=counter+3; j>=temp; j--)
				{
					counter++;
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		scan.close();	
	}
}

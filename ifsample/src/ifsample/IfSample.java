package ifsample;

import java.util.Scanner;

public class IfSample {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+i;
		}
			System.out.println("result :"+sum);
		}
	}


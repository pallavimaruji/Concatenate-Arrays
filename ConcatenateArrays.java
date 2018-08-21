import java.util.Scanner;
class ConcatenateArrays
{
	static public void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		System.out.println("enter 1st array length");
		int m=p.nextInt();
		System.out.println("enter 2nd array length");
		int n=p.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		int c[]=new int[m+n];
		System.out.println("Input of 1st array elements");		 
		for(int i=0;i<m;i++)
		{
			System.out.print("array element" +(i+1)+":");
			a[i]=p.nextInt();
		}
		System.out.println("Input of 2nd array elements");
		for(int j=0;j<n;j++)
		{
			System.out.print("array element" +(j+1)+":");
			b[j]=p.nextInt();
		}
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<m)			
		{	c[k]=a[i];
			k++;
			i++;
		}
		while(j<n)
		{	c[k]=b[j];
			k++;
			j++;
		}
		System.out.println("Resultant array is: ");
		for(int e:c)
			System.out.print(e+" ");
			
	}
}

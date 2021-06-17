package program;
import java.util.*;
public class sparse_array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[6][6];
		int sum,max=0;
		int brr[]=new int[16];
		int k=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=6/2;i++)
		{
			for(int j=0;j<=6/2;j++)
			{
				sum=0;
				for(int m=i;m<i+3;m++)
				{
					for(int n=j;n<j+3;n++)
					{
						if(m!=i+3/2)
						{
							sum+=arr[m][n];
						}
						else if(m==i+3/2&&n==j+3/2)
						{
							sum+=arr[m][n];
						}
					}
				}
				brr[k]=sum;
				k++;
			}
		}
		
          for(int i=0;i<16;i++)
          {
        	  if(max<brr[i])
        	  {
        		  max=brr[i];
        	  }
          }
          System.out.print(max);
	}

}
/*output ;-
sample input:
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
 
 implements as hour glass structure and sum the arr
 
 The 16 hourglass sums are:

-63, -34, -9, 12, 
-10,   0, 28, 23, 
-27, -11, -2, 10, 
  9,  17, 25, 18
  
  sample out :
  largest sum is: 28
  */

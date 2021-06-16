package program;
import java.util.*;

public class query_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int arr[]=new int[n];
         int brr[][]=new int[m][n];
         int max=0;
         for (int[] row: brr)
        	    Arrays.fill(row, 0);
        
         for(int i=0;i<m;i++)
         {
        	 int p=i+1;
        	 int a=sc.nextInt();
        	 int b=sc.nextInt();
        	 int k=sc.nextInt();
        	 int c=a-1;
        	 for(int j=c;j<b;j++)
        	 {
        		 brr[i][j]+=k;
        		 if(brr[i][j]>max)
        		 {
        			 max=brr[i][j];
        		 }
        	 }
        	 if(i<m-1)
        	 {
        	 for(int q=0;q<n;q++)
        	 {
        		 brr[p][q]=brr[i][q];
        	 }
        	 }
         }
         for(int i=0;i<m;i++)
         {
         for(int j=0;j<n;j++)
    	 {
    		 System.out.print(brr[i][j]+" ");
    	 }
    	 System.out.println();
         }
         System.out.println("maximum sum is: "+max);  
         
	}

}

/*OUTPUT :-
5 3
1 2 100
2 5 100
3 4 100
Sample Output

200

Explanation

After the first update the list is 100 100 0 0 0.
After the second update list is 100 200 100 100 100.
After the third update list is 100 200 200 200 100.
The maximum value is 200

EXAMPLE 2:
N=10 M=3
    a b k
    1 5 3
    4 8 7
    6 9 1
    IMPLEMENTATION
index->	 1 2 3  4  5 6 7 8 9 10
      	[0,0,0, 0, 0,0,0,0,0, 0]
      	[3,3,3, 3, 3,0,0,0,0, 0]
	      [3,3,3,10,10,7,7,7,0, 0]
	      [3,3,3,10,10,8,8,8,1, 0]

The largest value is 10
*/

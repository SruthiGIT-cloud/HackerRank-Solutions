// MERGE 2 ARRAYS WITHOUT USING EXTRA SPACE(NOT USING EXTRA TEMP ARRAY)
//MODIFY THE ARRAYSAS FULLYSORTED MERGED ARRAYS
package program;
import java.util.Arrays;
import java.util.Scanner;

public class merge_two_array_without_extraspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		   int arr[]=new int[n];
		   int brr[]=new int[m];
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	        	brr[i]=sc.nextInt();
	        }
	        int p=0,q=n-1,temp=0;
	        while(p<m&&q>=0)
	        {
	        	if(arr[q]>=brr[p])
	        	{
	        		temp=arr[q];
	        		arr[q]=brr[p];
	        		brr[p]=temp;
	        	}
	        	p++;
	        	q--;
	        }
	        Arrays.sort(arr);
	        Arrays.sort(brr);
	}

}

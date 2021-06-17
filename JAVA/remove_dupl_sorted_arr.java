package program;
import java.util.*;
public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
        	if(arr[i]!=arr[i+1])
        	{
        		arr[j]=arr[i];
        		j++;
        	}
        }
        arr[j]=arr[n-1];
        for(int i=0;i<=j;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}
/*
REMOVE DUPLICATES IN SORTED ARRAY
COMPLEXITY O(1)

NUMBER OF ARRAY ELEMENTS :8

1
8
2
5
1
2
5
3
OUTPUT:
1 2 3 5 8 
*/

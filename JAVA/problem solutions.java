import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb=new StringBuilder(A);
        sb.reverse();
        sb.toString();
        String rev=new String(sb);
        if(A.equals(rev))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}





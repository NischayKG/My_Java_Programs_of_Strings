//Program to find the possible subsets of the String 
import java.util.*;
class possible_subset_of_string
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string :");
        String str=new String(sc.nextLine());
        int len=str.length();
        String arr[]=new String[len*(len+1)/2];
        int temp=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                arr[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("All the Sub-strings are :");
        int l=len*(len+1)/2;
        for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }
    }
}



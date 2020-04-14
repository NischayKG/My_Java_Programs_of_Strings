//Program to Count the Occurence of a Substring in String 
import java.util.*;
class count_substring
{
    public static int check(String str,String str2)
    {
        int count=0;
        int l1=str.length();
        int l2=str2.length();
        int j=0;
        for(int i=0;i<l1;i++)
        {
            if(str.charAt(i)==str2.charAt(j))
            {
                j++;
                if(j==l2)
                {
                    count++;
                    j=0;
                }
            }
            else
            {
                j=0;
            }

        }
        return count;
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=new String(sc.nextLine());

        System.out.println("Enter the Substring");
        String str2=new String(sc.nextLine());

        int res=check(str,str2);
        System.out.println("The number of times substring occured in a string is = "+res);

    }
}
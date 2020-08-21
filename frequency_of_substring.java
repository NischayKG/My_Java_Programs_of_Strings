//Program to Find the Frequency of Substring in the given String 
import java.util.*;
class frequency_of_substring
{
    public static int count_substring(String str,String sbstr)
    {
        char ch1[]=str.toCharArray();
        char ch2[]=sbstr.toCharArray();
        int l2=ch2.length;
        int l1=ch1.length;
        int count=0,temp=0,j=0;
        for(int i=0;i<l1;i++)
        {
            if(ch1[i]==ch2[j]&&j<=l2)
            {
                temp++;
                j++;
                if(temp==l2)
                {
                    count++;
                    j=0;
                    temp=0;
                }
            }
            else
            {
                temp=0;
                j=0;
            }

        }
        return count;
    }
    public static void main(String att[])
    {
        System.out.println("Enter the string :");
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.nextLine());
        System.out.println("Enter the Sub-string :");
        String sbstr=new String(sc.nextLine());
        System.out.println("The number of times substring occured are :"+count_substring(str,sbstr));
             
    }
}
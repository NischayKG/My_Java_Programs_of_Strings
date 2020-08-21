//Program to Check whether a given Character is present in a String, Find Frequency & Position of Occurrence 
import java.util.*;
class finding_freq_and_position
{
    public static void count_freq(String str,char ch)
    {
        int l=str.length();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=0;
        }
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
                arr[i]=1;
            }
        }
        System.out.print("The positions at which "+ch+" had occured are : ");
        for(int i=0;i<l;i++)
        {
            if(arr[i]==1)
            {
                int po=i+1;
                System.out.print(po+" ");
            }
        }
        System.out.print("And the number of times it had occured are : "+count);

    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String str=new String(sc.nextLine());
        System.out.print("Enter the character :");
        char ch=sc.next().charAt(0);
        count_freq(str,ch);
    }
}
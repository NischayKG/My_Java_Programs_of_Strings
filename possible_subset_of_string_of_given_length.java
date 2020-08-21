//40.Program to Find All Possible Subsets of given Length in String 
import java.util.*;
class possibe_subset_of_string_of_given_length
{
    public static void find_substring(String str,int n)
    {
        int l=str.length();
        String nwords[]=new String[l*(l+1)/2];
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                nwords[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        int len=l*(l+1)/2;
        System.out.println("Substring you want to have are :");
        for(int k=0;k<len;k++)
        {
            if(nwords[k].length()==n)
            {
                System.out.println(nwords[k]);
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=new String(sc.nextLine());
        System.out.println("Enter the length of substring you want to have :");
        int n=sc.nextInt();
        find_substring(str,n);    
    }
}
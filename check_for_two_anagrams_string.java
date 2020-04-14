//16.Program to Check whether two Strings are Anagrams
import java.util.*;
class check_for_two_anagrams_string
{
   public  static boolean anagram(char[] s1,char[] s2)
    {
        int l1=s1.length;
        int l2=s2.length;

        if(l1!=l2)
            return false;
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<l1;i++)
        {
            if(s1[i]!=s2[i])
                return false;
        }

        return true;

    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st character array :");

        char str1[]=sc.next().toCharArray();      //Input in a single line...
        for (int i = 0; i < str1.length; i++) 
            System.out.print(str1[i]);

        System.out.println("\n");
        System.out.print("Enter the 2nd character array :");
        
       char str2[]=sc.next().toCharArray();         //Input in a single line...
       for (int i = 0; i < str2.length; i++) 
            System.out.print(str2[i]);
        
        System.out.println("\n");
        if(anagram(str1,str2))
        {
            System.out.println("The two strings are Anagram");
        }
        else
        {
            System.out.println("The two strings are NOT Anagram");
        }



    }
}
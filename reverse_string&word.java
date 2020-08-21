//Program to Reverse every Word along with the String.
import java.util.*;
public class reverse_word 
{
    public static String palat(String str)
    {
        char chr[]=str.toCharArray();
        int l=0,r=0;
        for(int i=0;i<chr.length;i++)
        {
            l=i;
            r=i;
            while(r<chr.length && chr[i]!=' ')
            {
                r++;
            }
            i=r;
            r--;
            int x=l,y=r;
            while(l<r)
            {
                char temp=chr[l];
                chr[l]=chr[r];
                chr[r]=temp;
                l++;
                r--;
            }

           
        }
        return new String(chr);
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=new String(sc.nextLine());
        System.out.println("The reversed word string is :"+ palat(str));
        
    }

}
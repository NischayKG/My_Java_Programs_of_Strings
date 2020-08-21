//Program to Implement strpbrk() Function 
import java.util.*;
class strp_brk_implementation
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  String :");
        char str[]=sc.next().toCharArray();
        System.out.println("Enter the 2nd string :");
        char ch=sc.next().charAt(0);
        int i=0,flg=0;
        for(;i<str.length;i++)
        {
            if(ch==str[i])
            {
                flg=1;
                break;
            }
        }
        if(flg!=0)
        {
            for(;i<str.length;i++)
            {
                System.out.print(str[i]);
            }
        }
        else
        {
            System.out.println("False");
        }


    }
}
//Program to Replace all the Characters by Lowercase
import java.util.*;
class string_to_lowercase
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        char chr[]=sc.next().toCharArray();
        for(int i=0;i<chr.length;i++)
        {
            char ch=chr[i];
            if(ch>='A'&&ch<='Z')
            {
                System.out.println(ch);
                ch=Character.toLowerCase(ch);
                System.out.println(ch);
                chr[i]=ch;
                System.out.println(chr[i]);
            }
        }
        System.out.println("The String is :");
        for(int i=0;i<chr.length;i++)
        {
            System.out.print(chr[i]);
        }
    }
}
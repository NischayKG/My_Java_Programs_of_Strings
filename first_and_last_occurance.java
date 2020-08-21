//38.Program to find First and Last Occurrence of given Character in a String 
import java.util.*;
class first_and_last_character
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the string :");
        String str=new String(sc.nextLine());
        System.out.println("ENter the character :");
        char ch=sc.next().charAt(0);
        int s=0,e=0;
        for(int i=0;i<str.length();i++)
        {
            if(s==0&&e==0)
            {
                if(str.charAt(i)==ch)
                {
                    s=i;
                    s++;
                }
            }
            else
            {
                if(str.charAt(i)==ch)
                {
                    e=i;
                    e++;
                }

            }
        }
        System.out.println("The First and last occurance of character "+ch+" is "+s+" and "+e+" resprctively");

        
    }
}
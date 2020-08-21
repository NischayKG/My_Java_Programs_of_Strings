//5.C Program to Check if the Substring is present in the given String 
import java.util.*;
class substring
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the String ");
        StringBuffer str=new StringBuffer(sc.nextLine());
        //System.out.println(str);
        System.out.println("\nEnter the Substring you want to find");
        StringBuffer s=new StringBuffer(sc.nextLine());
        int l=s.length();
        int count=0;
        int j=0;
        int ok=0;
        for(int i=0;i<str.length();i++)
        {
            if(ok==1)
            {
                break;
            }
            if(str.charAt(i)==s.charAt(j))
            {
                count++;
                j++;
                if(count==l)
                {
                    System.out.println("Substring is present");
                    ok=1;
                    break;
                }
            }
            else
            {
                count=0;
                j=0;
            }
            
        }
        if(ok==0)
        {
            System.out.println("Substriong is NOT present");
        }
        
    }
}
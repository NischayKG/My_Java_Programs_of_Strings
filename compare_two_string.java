import java.util.*;

class compare_2_string
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer str=new StringBuffer(sc.nextLine());
        String s1=str.toString();
        StringBuffer str2=new StringBuffer(sc.nextLine());
        String s2=str2.toString();
        if(s1.equals(s2))
        {
            System.out.println("Both are Equal");
        }
        else
        {
            System.out.println("Both are NOT Equal");
        }
    }
}
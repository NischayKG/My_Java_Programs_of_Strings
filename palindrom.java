import java.util.*;
class palindrom
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string -:");
        StringBuffer sb=new StringBuffer(sc.nextLine());
        String sb2=sb.toString();
        sb.reverse();
        String sb3=sb.toString();
   //     System.out.println(sb);
   //     System.out.println(sb2);
       if(sb3.equals(sb2))
        {
            System.out.println("It is palindrom");
        }
        else
        {
            System.out.println("It is NOT palindrom");
        }
      
    }
}
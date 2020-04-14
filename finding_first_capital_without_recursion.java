import java.util.*;
class finding_first_capital_without_recursion
 {
    public static void main(String arr[])
    {
     Scanner sc=new Scanner(System.in);
     String str=new String(sc.nextLine());
        char ch;
        int ok=0;
        for(int i=0;i<str.length();i++)
        {
         ch=str.charAt(i);
         if((ch>='A'&&ch<='Z')&&ok==0)
            {
                ok++;
                System.out.println("The First capital is : "+ch);
            }
        }
        if(ok==0)
        {
            System.out.println("No Capital character is present in the string");
        }
    }

}





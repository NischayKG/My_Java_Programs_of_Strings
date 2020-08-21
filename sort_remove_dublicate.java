//Program to Sort the String and Repeated Characters should be present only Once
import java.util.*;
class sort_remove_dublicate
{
    public static String givemeback(String str)
    {
        char chr[]=str.toCharArray();
        int arr[]=new int[26];
        for(int i=-0;i<26;i++)
        {
            arr[i]=0;
        }
        int indx=0;
        for(int i=0;i<chr.length;i++)
        {
            indx=chr[i]-97;
            if(arr[indx]==0)
            {
                arr[indx]++;
            }
        }
        String nstr="";
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                char ch=(char)(i+97);
                String s=String.valueOf(ch);
                nstr=nstr+s;
            }
        }


        return nstr;
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the string");
        String str=new String(sc.nextLine());
        System.out.println("The new sorted and unique string is :"+givemeback(str));
    }
}
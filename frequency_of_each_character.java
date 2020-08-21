//53.Program to Count the Number of Occurrence of each Character Ignoring the Case of Alphabets Display them 
import java.util.*;
class frequency_of_each_character
{
    public static void count_freq(String str)
    {
        int arr[]=new int[256];
        for(int i=0;i<256;i++)
        {
            arr[i]=0;
        }
        char chr[]=str.toCharArray();
        int l=chr.length;
        for(int i=0;i<l;i++)
        {
            char ch=chr[i];
            int n=(int)ch;
            arr[n]++;
        }
        System.out.println("The character and it's frequency are :");
        for(int i=0;i<256;i++)
        {
            if(arr[i]!=0)
            {
                int n=arr[i];
                char ch=(char)i;
                System.out.println(ch+"  =  "+n+ " times");

            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String str=new String(sc.nextLine());
        count_freq(str);
    }
}
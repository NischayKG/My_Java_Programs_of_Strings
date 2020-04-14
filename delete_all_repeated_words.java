//Program to Delete All Repeated Words in String 
import java.util.*;
class delete_all_repeated_words
{
    public static String no_dublicate(String str)
    {
        String words[]=str.split(" ");
        int arr[]=new int[words.length];
        for(int i=0;i<words.length;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<words.length;i++)
        {
            
            if(arr[i]==0)
            {
                for(int j=i+1;j<words.length;j++)
                {

                    if(words[i].compareTo(words[j])==0)
                    {
                        arr[j]=1;                    
                    }
                }
            }
        }
        int len=0;
        for(int i=0;i<words.length;i++)
        {
            if(arr[i]==0)
            {
                len++;
            }
        }
        String nword[]=new String[len];
        int j=0;
        for(int i=0;i<words.length;i++)
        {
            if(arr[i]==0)
            {
                nword[j]=words[i];
                j++;
                //System.out.println(words[i]);
            }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<nword.length;i++)
        {
            sb.append(nword[i]);
            sb.append(" ");
        }
        String nstr=sb.toString();
        return nstr;
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=new String(sc.nextLine());
        System.out.println("The String without dublicate is :"+no_dublicate(str));
    }
}
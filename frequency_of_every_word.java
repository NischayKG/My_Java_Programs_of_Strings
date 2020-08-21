//44.C Program to Find the Frequency of Every Word in a given String 
import java.util.*;
class frequency_of_every_word
{
    public static void count_freq(String str)
    {
        String words[]=str.split(" ");
        int l=words.length;
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=1;
        }
        int count=1;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(words[i].compareTo(words[j])==0)
                {
                    count++;
                    arr[j]=-1;
                    words[j]=words[j].replaceAll(words[j], "");
                }
            }
            if(arr[i]!=-1)
            {System.out.println("The Frequency of word : "+words[i]+" = "+count);
            count=1;}
        }
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=new String(sc.nextLine());
        count_freq(str);
    }
}
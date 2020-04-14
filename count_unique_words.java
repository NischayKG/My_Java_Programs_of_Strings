//35.Program to Count the Number of Unique Words 
import java.util.*;
class count_unique_words
{
    public static int find_unique(String str)
    {
        int count=0;
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
                count++;
                for(int j=i+1;j<words.length;j++)
                {
                    if(words[i].compareTo(words[j])==0)
                    {
                        arr[j]=1;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=new String(sc.nextLine());
        System.out.println("The no. of unique substrings are :"+find_unique(str));

    }
}
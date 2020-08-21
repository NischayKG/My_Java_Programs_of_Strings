//Program to Reverse every Word of given String.
import java.util.*;
class reverse_words_of_string
{
    public static String palat(String str)
    {
    String words[]=str.split(" ");
    String revstr="";
    for(int i=0;i<words.length;i++)
    {   
        String word=words[i];
        String revword="";
        for(int j=word.length()-1;j>=0;j--)
        {
            revword=revword+word.charAt(j);
            
        }
        revstr=revstr+revword+" ";
    }
        return revstr;
    }

    public static void main(String arr[])
    {
        System.out.println("Enter the string :");
        Scanner sc= new Scanner (System.in);
        String str=new String(sc.nextLine());
        System.out.println("The reversed String of words are :"+palat(str));
    }
}
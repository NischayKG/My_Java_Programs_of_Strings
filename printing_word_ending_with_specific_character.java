//Program to Print the Words Ending with Letter S 
import java.util.*;
class printing_word_ending_with_specific_character
{
    public static String specific_word(String str,char ch)
    {
        String words[]=str.split(" ");
        String spwords="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            int j=word.length()-1;
            if(word.charAt(j)==ch)
            {
                spwords=spwords+word+" ";
            }

        }

        return spwords;
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=new String(sc.nextLine());
        System.out.println("Enter the last character :");
        char ch=sc.next().charAt(0);
        System.out.println("The words ending with character "+ch+" are : "+specific_word(str,ch));
    }
}

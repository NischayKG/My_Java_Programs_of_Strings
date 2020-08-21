//37. Program to Search a Word & Replace it with the Specified Word 
import java.util.*;
class replacing_word_from_given_word
{
    public static String exchange(String str,String purana,String naya)
    {
        if(str.contains(purana))
        {
            str=str.replaceAll(purana,naya);
            return str;
        }
        else
        {
            return ("Enter valid old string and try again");
        }

        
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=new String(sc.nextLine());
        System.out.println("Enter the word you want to replace :");
        String purana=new String(sc.nextLine());
        System.out.println("Enter the replacment word :");
        String naya=new String(sc.nextLine());
        System.out.println("The new string is : "+exchange(str,purana,naya));
    }

}
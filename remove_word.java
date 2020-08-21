//Program to Remove given Word from a String 
import java.util.*;
class remove_word
{   public static StringBuffer remove(StringBuffer str,StringBuffer str2)
    {
        
        int l1=str.length();
        int l2=str2.length();
        int high=0,low=0;
        int j=0;
        for(int i=0;i<l1;i++)
        {
            if(j>=l2)
            {
                break;
            }
            if(str.charAt(i)==str2.charAt(j))
            {   
                j++;
                if(j==l2)
                {
                    high=i;
                    high++;
                }
            }
            else
            {
                j=0;
            }
        }
        low=high-l2;
        str.delete(low,high);
       // System.out.println("String after del is"+str);
        return str;

    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        StringBuffer str=new StringBuffer(sc.nextLine());
        System.out.println("Enter the word you want to remove :");
        StringBuffer str2=new StringBuffer(sc.nextLine());
        StringBuffer str3=new StringBuffer();
        str3=remove(str,str2);
        System.out.println("The String after removing the word is :"+str3);
    }

}
//Geeks for Geeks method
/*

public class GFG { 
    public static String removeWord(String string, String word) 
    { 
  
        
        if (string.contains(word)) 
        { 
            String tempWord = word + " "; 
            string = string.replaceAll(tempWord, ""); 
            tempWord = " " + word; 
            string = string.replaceAll(tempWord, ""); 
        } 
        return string; 
    } 
  
    public static void main(String args[]) 
    { 
        String string1 = "Geeks for Geeks."; 
        String word1 = "for"; 
        System.out.println("String: " + string1 + "\nWord: " + word1+ "\nResult String: "+ removeWord(string1, word1)); 
    }
} */
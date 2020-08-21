//45.Program to Sort Word in String 
import java.util.*;
class sort_word_in_string
{
    public static String word_sort(String str)
    {
        String words[]=str.split(" ");
        int l=words.length;
        for(int i=0;i<l;i++)
        {   
            char chr[]=words[i].toCharArray();
            Arrays.sort(chr);
            words[i]=String.valueOf(chr);
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<l;i++)
        {
            sb.append(words[i]);
            sb.append(" ");
        }
        String nstr=sb.toString();
        
        return nstr;

    }
    public static void main(String aty[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=new String(sc.nextLine());
        System.out.println("The sorted word array is : "+word_sort(str));
    }
}
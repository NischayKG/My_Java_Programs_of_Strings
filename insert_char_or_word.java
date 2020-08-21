//29.Program to Insert Character/Word in any Desired Location in a String 
import java.util.*;
public class insert_char_or_word
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        char chr1[]=sc.next().toCharArray();
        System.out.println("Enter the word/character you want to insert :");
        char chr2[]=sc.next().toCharArray();
        System.out.println("Enter the position in which you want to insert");
        int pos=sc.nextInt();
        pos-=2;
        char chr3[]=new char[chr1.length+chr2.length];
        int i=0,j=0;
        for(;i<=pos;i++)
        {
            chr3[j]=chr1[i];
            j++;
        }
        for(int k=0;k<chr2.length;k++)
        {
            chr3[j]=chr2[k];
            j++;
        }
        for(;i<chr1.length;i++)
        {
            chr3[j]=chr1[i];
            j++;
        }
        
        System.out.println("Enter the new string is :");
        for(int l=0;l<chr3.length;l++)
        {
            System.out.print(chr3[l]);
        }
    }

}
//19. Program to Find Highest Frequency Character in a String. 
import java.util.*;
class highest_frequency_character
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        char str[]=sc.next().toCharArray();
        int fre[]=new int[26];
        for(int i=0;i<26;i++)
        {
            fre[i]=0;
        }
        int indx=0;
        for(int i=0;i<str.length;i++)
        {
            indx=str[i]-97;
            fre[indx]++;
        }
        int max=-1;
        int hold=0;
        for(int i=0;i<26;i++)
        {
            if(max<fre[i])
            {
                max=fre[i];
                hold=i;
            }
        }
        hold=hold+97;
        char ch=(char)(hold);
        System.out.println("The Highest Frequency Character is : "+ch);

    }
}
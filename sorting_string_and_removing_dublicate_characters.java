//48.C Program to Sort String Ignoring Whitespaces and Repeating Characters Only Once 
import java.util.*;
class sorting_string_and_removing_dublicate_characters
{
    public static void remove_dub(String str)
    {
        char chr[]=str.toCharArray();
        int l=chr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(chr[i]==chr[j])
                {
                    chr[j]='#';
                }
            }

        }
        for(int i=0;i<l;i++)
        {
            if(chr[i]!='#')
            {
                System.out.print(chr[i]);
            }
        }


    }
    public static void main(String arr[])
    {
        System.out.print("Enter the String :");
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.nextLine());
        remove_dub(str);
    }
}
//39.Program to Display the Characters in Prime Position a given String 
import java.util.*;
class printing_prime_character
{
    public static void main(String ard[])
    {
        Scanner sc=new Scanner(System.in);
        char chr[]=sc.next().toCharArray();
        int l=chr.length;
        if(l>=2)
        {
            System.out.println(chr[1]);
        }
        int count=1,div=0;
        if(l>=3)
        {
            for(int i=2;i<l;i++)
            {   
                div=i+1;
                for(int k=2;k<=div/2;k++)
                {
                    if(div%k==0)
                    {
                        count=0;
                    }
                }
                if(count==1)
                {
                    System.out.println(chr[i]);
                }
                count=1;
            }
        }
    }
}
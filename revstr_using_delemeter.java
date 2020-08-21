import java.util.*;
public class revstr_using_delemeter
{
public static void palat(int t)
    {
        Scanner scn=new Scanner(System.in);
        for(int j=0;j<t;j++)
        {
            String str=new String();
		    str=scn.nextLine();
            String words[]=str.split("[.]",0);
            String revstr="";
            int l=words.length;
            for(int i=l-1;i>=0;i--)
            {
                //System.out.println("=fun=");
                String temp=words[i];
                 
                if(i>0)
                {
                    revstr=revstr+temp+".";
                
                }
                else
                {
                    revstr=revstr+temp;
                }
            
            }
            System.out.println(revstr);
        }
    }
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		palat(t);
	}
}

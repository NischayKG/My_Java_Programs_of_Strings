import java.util.*;
import java.lang.*;
import java.io.*;

public class hard_word_easy_word
{
    static boolean isVowel(char ch) 
	{ 
	return ( ch == 'a' || ch == 'e' || 
				ch == 'i' || ch == 'o' || 
				ch == 'u'); 
	} 
	
	// Method to calculate difficulty 
	static int calcDiff(String str) 
	{ 
      String words[]=str.split(" ");
      int lws=words.length;
      int res=0,hw=0,ew=0,count=0;
      String wd="";
      for(int i=0;i<lws;i++)
      {
        wd=wd+words[i];
        //int count=0;
        for(int j=0;j<wd.length();j++)
        {
          char ch=wd.charAt(j);
        //  ch=ch.toLowerCase();
          
          if(!isVowel(ch))
          {
            count++;
          }
          
          if(count>=4||count>wd.length()/2)
          {
            hw++;
          }
          
        }
        if(count<4||count<wd.length()/2)
        {
            ew++;
        }
        
        count=0;
        wd="";
        
        } 
        return 5*hw + 3*ew;
	}
    
    
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		    String data = sc.nextLine();
            System.out.println(calcDiff(data));      
	}
  

}
import java.util.*;
class first_non_repeating_character
{
    public static char fnrc(char str[])
    {
        System.out.println("The Lenth of string in function after passing is "+str.length);
        int alp[]=new int[256];
        char res='a';
        for(int i=0;i<256;i++)
        {
            alp[i]=0;
        }
        int indx=0;
        for(int i=0;i<str.length;i++)
        {
            indx=(int)str[i];
            alp[indx]++;
        }
        
        for(int i=0;i<256;i++)
        {
            if(alp[i]!=0)
            {
                char c=(char)i;
                System.out.println(alp[i]+" times "+c);
                
            }
        }
        for(int i=0;i<str.length;i++)
        {
            indx=(int)str[i];  
            if(alp[indx]==1)
            {
              System.out.println(indx);
              res=(char)indx;
        
              break;
            }
        }
          return res;
    }
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String st=new String(sc.nextLine());
        char str[]=st.toCharArray();
        //char str[]=sc.next().toCharArray();
        System.out.println("The Lenth of string in main is "+str.length);
        char res=fnrc(str);
        System.out.println("The 1st non-repeating character is : "+res);
    }
}
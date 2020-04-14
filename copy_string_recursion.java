import java.util.*;
class copy_string_recursion
{  
    private static String palat(String str,String str2,int l,int h) {
        
        if(l<=h){
           // char ch=str.charAt(l);
            String s=String.valueOf(str.charAt(l));
            str2+=s;
            l++;
            
        }
        if(l>h)
        {
            return str2;
        }

        return palat(str,str2,l,h);
        
    }
    
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.nextLine());
        String str2=new String();
        System.out.println("String 1 is "+str);
        int h=str.length();
        str2=palat(str,str2,0,h-1);
        System.out.println("String 2 is "+str2);
    }

    
}
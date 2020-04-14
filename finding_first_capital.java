import java.util.*;
class finding_first_Capital
{
private static char find(String str,int l,int h) {
        
    if(l<=h){
        char ch=str.charAt(l);
        if(ch>='A'&&ch<='Z')
        {
            return ch;
        }
        l++;
        }
    return find(str,l,h);
    
}

public static void main(String arr[])
{
    Scanner sc=new Scanner(System.in);
    String str=new String(sc.nextLine());
    System.out.println("String  is "+str);
    int h=str.length();
    char res=find(str,0,h-1);
    System.out.println("First capital alphabed is "+res);
}

}


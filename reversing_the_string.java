import java.util.*;
class reverse_the_string
{
    private static void palat(StringBuffer str,int l) {
        
        if(l>=0){
            System.out.print(str.charAt(l));
            l--;
            palat(str,l);
        }
    }
    
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer str=new StringBuffer(sc.nextLine());
        int l=str.length();
        palat(str,l-1);
    }

    
}
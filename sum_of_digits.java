//Program to Read a String and find the Sum of all Digits in the String 
import java.util.*;
class sum_of_digits
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer str=new StringBuffer(sc.nextLine());
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
            {
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("The sum of digits are ="+sum);
    }
}



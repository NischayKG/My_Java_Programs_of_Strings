//25.Program to Find the Sum of ASCII values of All Characters in a given String 

import java.util.*;
class ascii_sum
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        char str[]=sc.next().toCharArray();
        int sum=0;
        for(int i=0;i<str.length;i++)
        {
            sum=sum+str[i];
        }
        System.out.println("Sum is :"+sum);
    }
}
import java.util.*;
import java.util.concurrent.TimeUnit;
class Hopper
{
    public static void main(String[] args)
    {
        System.out.println("Starting The Machine...");
        System.out.println("========================");
        
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("Try Again...");
        }

        System.out.println("Press 1, if Hopper is full");
        System.out.println("Press 2, if Hopper is not full");
        Scanner sc=new Scanner(System.in);
        int status=sc.nextInt();
        System.out.println("========================");
       

        if(status==2)
        {
            System.out.println("Normal Dumping...");
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println("Restart The Machine...");
            }
            System.out.println("Back to the PayLoad");
            System.out.println("========================");
        }

        else if(status==1)
        {   
            System.out.println("Enter the status of G.R.D...");

            System.out.println("Press 1, if GRD has reached...");
            System.out.println("Press 2, if GRD has not reached...");
            int status2=sc.nextInt();
            System.out.println("========================");
            if(status2==1)
            {
                System.out.println("In process of complition...");
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Restart The Machine...");
                }
                System.out.println("Ignition off");
            }
            else if(status2==2)
            {
                System.out.println("Divert it to Stockyard...");
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Restart The Machine...");
                }
                System.out.println("Back to the PayLoad");
            }

            else
            {
                System.out.println("Please select the valid operations and Restart the Machine again...");

                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Restart The Machine...");
                }
                System.out.println("Ignition off");
            }
        }
        else
        {
            System.out.println("Please select the valid operations and Restart the Machine again...");

            try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Restart The Machine...");
                }
            System.out.println("Ignition off");
        }

    }
}
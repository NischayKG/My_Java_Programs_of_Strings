import java.util.*;
import java.util.io;
import java.util.concurrent.TimeUnit;
class RD_Machine
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

        System.out.println("Press 1, if Face Preparation is required");
        System.out.println("Press 2, if Face Preparation is NOT required");
        Scanner sc=new Scanner(System.in);
        int status=sc.nextInt();
        System.out.println("========================");

        if(status==2)
        {
            System.out.println("Switching off...");
            try
            {
                Thread.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println("Restart The Machine...");
            }
            System.out.println("Machine Back to Normal State");
            System.out.println("========================");
        }
        else if(status==1)
        {   
            System.out.println("Show Shovel Unavailable...");

            try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Restart The Machine...");
                }

            System.out.println("Press 1, if RD is in Proximity Zone...");
            System.out.println("Press 2, if RD is NOT in Proximity Zone...");
            int status2=sc.nextInt();
            System.out.println("========================");
            if(status2==2)
            {
                System.out.println("Divert the RD's...");
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
            else if(status2==1)
            {
                System.out.println("RD is Loading...");
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                {
                    System.out.println("Restart The Machine...");
                }

                System.out.println("Press 1, if RD Loading  Succeed...");
                System.out.println("Press 2, if RD Loading Fails...");
                int status3=sc.nextInt();
                if(status3==1)
                {
                    System.out.println("Capture the waiting time...");
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Restart The Machine...");
                    }
                    System.out.println("Divert the RD's...");
                    System.out.println("Ignition off");

                }
                else if(status3==2)
                {
                    System.out.println("Show Shovel Out And Count A Trip...");
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
}

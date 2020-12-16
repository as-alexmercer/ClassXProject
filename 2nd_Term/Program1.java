import java.util.*;
class Program1
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int roll[] = new int[n];
        String name[] = new String[n];
        int m1[] = new int[n];
        int m2[] = new int[n];
        int m3[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Name");
            name[i]=sc.nextLine();
            System.out.println("Enter the Roll no.");
            roll[i]=sc.nextInt();
            System.out.println("Enter the Marks 1");
            m1[i]=sc.nextInt();
            System.out.println("Enter the Marks 2");
            m2[i]=sc.nextInt();
            System.out.println("Enter the Marks 3");
            m3[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            double avg = (m1[i]+m2[i]+m3[i])/3.0;
            if (avg > 99 && avg <= 85)
            {

            }
        }
    }
}
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
        System.out.println("Enter the Name, Roll. No., Marks in 3 Subjects");
        for(int i=0;i<n;i++)
        {
            name[i]=sc.nextLine();
            roll[i]=sc.nextInt();
            m1[i]=sc.nextInt();
            m2[i]=sc.nextInt();
            m3[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            double avg = (m1[i]+m2[i]+m3[i])/3;
            
        }
    }
}
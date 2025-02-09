import java.util.*;
class UpperandLower{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int hash[]=new int[256];

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hash[ch]++;
        }
        System.out.println("Enter the number of test case");
        int q=sc.nextInt();
        while(q-->0)
        {
            System.out.println("Enter the character ");
             char ch=sc.next().charAt(0);
             System.out.println("Frequency-->"+hash[ch]);
        }
        
    }
}

import java.util.*;
class Hashing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the data in the array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int hash[]=new int[10];

        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }
        System.out.println("Enter the number of  test cases");
        int q=sc.nextInt();
        while(q-->0)
        {
            System.out.println("Enter the number ");
            int number=sc.nextInt();
            System.out.println("Frequency-->"+hash[number]);
        }
    }
}
import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();

        System.out.print("Enter number to count: ");
        int x = s.nextInt();

        int c = 0;
        for(int i=0;i<n;i++)
            if(a[i] == x)
                c++;

        System.out.println("Repeated count: " + c);
    }
}


